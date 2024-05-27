package org.example;

public abstract class HouseLight extends HomeDevice{

    public HouseLight(String roomName) {
        super(roomName);
    }

    @Override
    public String toString() {
        return "Adding Light in bedroom";
    }
}
