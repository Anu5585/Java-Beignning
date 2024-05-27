package org.example;

public class RoomLight extends HouseLight implements Switchable{
    public RoomLight(String roomName) {
        super(roomName);
    }

    @Override
    public void SwitchOn() {
        System.out.println("Switching on lights in " + getRoomName());
    }

    @Override
    public void SwitchOff() {
        System.out.println("Switching off lights in " + getRoomName());
    }
}
