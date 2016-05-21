package enumerations;

import java.util.EnumSet;

public class TestDirectionsEnum {

	enum Direction {
		NORTH, EAST, SOUTH, WEST;
	}

	public static void main(String[] args) {
		for (Direction d : EnumSet.range(Direction.EAST, Direction.WEST)) {
			System.out.print(d + " ");
		}

		// int index = 0;
		/*
		 * while(Direction.values()[index] >= Direction.EAST &&
		 * Direction.values()[index] <= Direction.WEST){
		 * 
		 * }
		 */

		for (int i = 0; i < Direction.values().length; i++) {
			if (Direction.values()[i].ordinal() >= Direction.EAST.ordinal()
					&& Direction.values()[i].ordinal() <= Direction.WEST.ordinal()) {
				System.out.print(Direction.values()[i] + " ");
			}
		}
	}

}
