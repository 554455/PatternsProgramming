package com.umaraliev.patterns.generatingPatterns.builder;

public class House {
    Integer windows;
    String roof;
    String doors;
    String garage;
    String walls;

    public void setWindows(Integer windows) {
        this.windows = windows;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", roof='" + roof + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                ", walls='" + walls + '\'' +
                '}';
    }
}
