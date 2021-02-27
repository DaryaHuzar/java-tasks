package classes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop green = new Shop("Green");
        green.addCustomerToShopList(new Customer("Максим", "Дроздов", "Михайлович", "Беларусь, г. Минск, ул. Пролетарская, 12", 11_22_33_44, 12345));
        green.addCustomerToShopList(new Customer("Андрей", "Хоменко", "Иванович", "Беларусь, г. Минск, ул. Веры Хоружей, 9", 22_33_44_55, 23456));
        green.addCustomerToShopList(new Customer("Богдан", "Титомир", "Франкович", "Беларусь, г. Минск, ул. Бельского, 23", 33_44_55_66, 34567));
        green.addCustomerToShopList(new Customer("Виктор", "Прускин", "Викторович", "Беларусь, г. Минск, ул. Зыбицкая, 3", 44_55_66_77, 45678));
        green.addCustomerToShopList(new Customer("Сергей", "Хохлов", "Николаевич", "Беларусь, г. Минск, ул. Почтовая, 6", 55_66_77_88, 56789));
        green.addCustomerToShopList(new Customer("Карина", "Дросова", "Алексеевна", "Беларусь, г. Минск, ул. Одоевского, 37", 66_77_88_99, 67890));
        green.addCustomerToShopList(new Customer("Оксана", "Ростинова", "Максимовна", "Беларусь, г. Минск, Голубева, 3", 77_88_99_00, 78901));
        green.addCustomerToShopList(new Customer("Степан", "Боруков", "Алексеевич", "Беларусь, г. Минск, Садовая, 17", 88_99_00_11, 89012));
        green.addCustomerToShopList(new Customer("Марина", "Ветлицкая", "Сергеевна", "Беларусь, г. Минск, Комсомольская, 49", 99_00_11_22, 90123));
        green.addCustomerToShopList(new Customer("Лолита", "Червякова", "Михайловна", "Беларусь, г. Минск, Ташкентская, 30", 10_12_23_34, 10234));

        System.out.println("\nsort customers by name:");
        List<Customer> listSortByName = green.getListByName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nsort customers by credit card:");
        List<Customer> listSortByDiapasonCreditCard = green.getListByDiapasonCreditCard(22_33_44_55, 66_77_88_99);
        for (Customer c : listSortByDiapasonCreditCard) {
            System.out.println(c);
        }


    }
}
