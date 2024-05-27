package org.example;

public class CDPlayer extends HomeDevice{
    public CDPlayer(String roomName) {
        super(roomName);
    }

    @Override
    public String toString() {
        return "Adding CdPlayer in bedroom";
    }
}
