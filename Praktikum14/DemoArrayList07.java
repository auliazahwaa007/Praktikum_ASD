package Praktikum14;

import java.util.ArrayList;

public class DemoArrayList07 {
    public static void main(String[] args) {

        ArrayList<Customer07> customers = new ArrayList<>();
        Customer07 customer1 = new Customer07(1, "Zakia");
        Customer07 customer2 = new Customer07(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer07(4, "Cica"));

        customers.add(2, new Customer07(100, "Rosa"));

        System.out.println(customers.lastIndexOf(customer2));

        Customer07 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer07 cust : customers) {
            System.out.println(cust.toString());
        }
    }
}
