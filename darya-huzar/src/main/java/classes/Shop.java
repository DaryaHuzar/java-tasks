package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private String shopName;
    private ArrayList<Customer> customersList = new ArrayList<>();

    Shop(String shopName) {
        this.shopName = shopName;
    }

    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }

    List<Customer> getListByName() {
        List<Customer> list = new ArrayList<>(customersList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return list;
    }

    List<Customer> getListBySurname() {
        List<Customer> list = new ArrayList<>(customersList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareToIgnoreCase(o2.getSurname());
            }
        });
        return list;
    }

    List<Customer> getListByDiapasonCreditCard(int diapasonStart, int diapasonEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getCreditCardId() >= diapasonStart && c.getCreditCardId() <=diapasonEnd) {
                list.add(c);
            }
        }

        return list;
    }
}
