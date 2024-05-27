package org.example;

public class TV extends HomeDevice implements Switchable{
    public TV(String roomName) {
        super(roomName);
    }

    @Override
    public String toString() {
        return "Adding TV in sitting room";
    }

    @Override
    public void SwitchOn() {
        System.out.println("Warming up TV in " + getRoomName());
    }

    @Override
    public void SwitchOff() {
        System.out.println("Switching off TV in " + getRoomName());
    }
}
