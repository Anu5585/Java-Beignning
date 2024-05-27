package org.example;

public abstract class HomeDevice {
  private String roomName;

  public HomeDevice(String roomName) {
    this.roomName = roomName;
  }

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }
}
