package com.house.room;

public class Kitchen {
    //Fields
    private int roomWindows;
    private String roomWindowType;
    private String roomDoorType;

    public Kitchen(int roomWindows, String roomWindowType, String roomDoorType) {
        this.roomWindows = roomWindows;
        this.roomWindowType = roomWindowType;
        this.roomDoorType = roomDoorType;
    }

    public void openKitchenDoor() {
        System.out.println("\nKitchen door opened. I see "
                + roomWindows
                + " windows. They are made from "
                + roomWindowType + " and the door is made from "
                + roomDoorType + ".");
    }
}
