package Praktikum14;

import java.util.TreeSet;

public class TreeSerDemo07 {
    public static void main(String[] args) {

        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Pisang");

        System.out.println("Isi TreeSet:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nFirst : " + fruits.first());
        System.out.println("Last : " + fruits.last());

        fruits.remove("Mangga");

        System.out.println("\nSetelah remove:");
        System.out.println(fruits);

        System.out.println("\nPoll First : "
                + fruits.pollFirst());

        System.out.println("Poll Last : "
                + fruits.pollLast());

        System.out.println(fruits);
    }
}
