package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {
	public static void main(String[] args) {
		 World world = new World();
		 world.show();
		 Bug bug = new Bug();
		 bug.setColor(Color.blue);
		 bug.turn();
		 bug.turn();
		 for (int i=0;i< 10;i++) {
			 for (int z=0;z< 10;z++) {
				 Location location = new Location(i,z);
				 Flower flower = new Flower();
				 if(i%2==0) {
				 flower.setColor(Color.red);
				 }
				 else {
				 flower.setColor(Color.white);
				 }
				 world.add(location, flower);
			 }
		 }
		 Location location1 = new Location(4,4);
		 world.add(location1, bug);
		 
	}
}
