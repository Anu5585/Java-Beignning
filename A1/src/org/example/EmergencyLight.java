package org.example;

public class EmergencyLight extends HouseLight{
    public EmergencyLight(String roomName) {
        super(roomName);
    }

    @Override
    public String toString() {
        return "Adding EmergencyLight in hallway";
    }
}
