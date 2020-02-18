package com.house.room;

public class Lounge {

    private String roomTVBrandName;
    private int roomTVSize;
    private String roomCouchType;
    private String roomTableType;
    private int roomWallpapers;

    public Lounge(String roomTVBrandName, int roomTVSize, String roomCouchType,
                  String roomTableType,
                  int roomWallpapers) {
        this.roomTVBrandName = roomTVBrandName;
        this.roomTVSize = roomTVSize;
        this.roomCouchType = roomCouchType;
        this.roomTableType = roomTableType;
        this.roomWallpapers = roomWallpapers;
    }

    public void walkToLounge() {
        if (roomWallpapers <= 0) {
            System.out.println("\nI just walked into the lounge and I see a "
                    + roomTVSize
                    + " inch "
                    + roomTVBrandName + " tv set, "
                    + roomCouchType + " couches, a "
                    + roomTableType + " table"
                    + " and no portrait.");
        } else if (roomWallpapers == 1) {
            System.out.println("\nI just walked into the lounge and I see a "
                    + roomTVSize
                    + " inch "
                    + roomTVBrandName + "tv set, "
                    + roomCouchType + " couches, a "
                    + roomTableType + " table"
                    + " and "
                    + roomWallpapers + " portrait.");
        } else {
            System.out.println("\nI just walked into the lounge and I see a "
                    + roomTVSize
                    + " inch "
                    + roomTVBrandName + " tv set, "
                    + roomCouchType + " couches, a "
                    + roomTableType + " table"
                    + " and "
                    + roomWallpapers + " portraits.");
        }
    }
}
