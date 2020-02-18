package com.house.room;

public class Room {
    //class fields
    private Kitchen kitchenRoom;
    private Lounge loungeRoom;

    public Room(Kitchen kitchenRoom, Lounge loungeRoom) {
        this.kitchenRoom = kitchenRoom;
        this.loungeRoom = loungeRoom;
    }

    public Kitchen getKitchenRoom() {
        return kitchenRoom;
    }

    public Lounge getLoungeRoom() {
        return loungeRoom;
    }
}
