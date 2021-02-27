package cleancode;

import cleancode.models.MilitaryType;
import cleancode.planes.ExperimentalPlane;
import cleancode.planes.MilitaryPlane;
import cleancode.planes.PassengerPlane;
import cleancode.planes.Plane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Airport {
    private final List<? extends Plane> planes;
    public List<PassengerPlane> getPassengerPlane() {
        return this.planes.stream().filter(p -> p instanceof PassengerPlane).map(p -> (PassengerPlane) p).collect(Collectors.toList());
    }

    public List<MilitaryPlane> getMilitaryPlane() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (!(plane instanceof MilitaryPlane)) {
                continue;
            }
            militaryPlanes.add((MilitaryPlane) plane);
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlane() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlane();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getTypeOfMilitaryPlane() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlane() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlane();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getTypeOfMilitaryPlane() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlane() {
        List<ExperimentalPlane> ExperimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                ExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return ExperimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        planes.sort((Comparator<Plane>) (o1, o2) -> o1.getMaxFlightDistance() - o2.getMaxFlightDistance());
        return this;
    }

    public Airport sortByMaxSpeed() {
        planes.sort((Comparator<Plane>) (o1, o2) -> o1.getMaxSpeed() - o2.getMaxSpeed());
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes.sort((Comparator<Plane>) (o1, o2) -> o1.getMinLoadCapacity() - o2.getMinLoadCapacity());
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "CleanCode.CleanCode.Planes=" + planes.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }
}