package org.example;

import java.util.ArrayList;

public class HomeControlLauncher{
ArrayList<HomeDevice> Things = new ArrayList <HomeDevice>();
  	public void goToSleep () {
				for(HomeDevice h: Things){
					if(h instanceof Switchable) {
						((Switchable) h).SwitchOff();
					}
				}
	}

	public void wakeup () {
		  for(HomeDevice h1: Things){
			  if(h1 instanceof Switchable){
				  ((Switchable) h1).SwitchOn();
			  }
		  }
				
	}
	
	public void add (HomeDevice thing) {
	Things.add(thing);
		System.out.println(thing);
	}
  
  
  public static void main (String [] args) {
	  HomeControlLauncher hc = new HomeControlLauncher(); 
	  
	  hc.add (new RoomLight("bedroom"));
	  hc.add (new EmergencyLight("hallway"));
	  hc.add (new CDPlayer("bedroom"));
	  hc.add (new TV("sitting room"));
	  
	  hc.goToSleep ();
	  hc.wakeup ();
   }
   }


