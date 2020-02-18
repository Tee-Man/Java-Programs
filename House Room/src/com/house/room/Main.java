package com.house.room;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n==*** Tee's Furnished Houses ***==");

        Room createHouse = new Room(
                new Kitchen(2,
                        "Aluminium",
                        "Mahongy"),

                new Lounge("Samsung",
                        60,
                        "leather",
                        "glass",
                        3));

        System.out.println("\n\n== Kitchen params ==");
        createHouse.getKitchenRoom().openKitchenDoor();

        System.out.println("\n\n== Lounge params ==");
        createHouse.getLoungeRoom().walkToLounge();
    }
}
