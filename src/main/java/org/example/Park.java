package org.example;


public class Park {
    public static class Attraction {
        String name;
        String hours;
        double price;

        public Attraction(String name, String hours, double price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }



        public void printInfo() {
            System.out.println("Аттракцион: " + name + ", Время: " + hours + ", Цена: " + price + " Rub");
        }
    }
}