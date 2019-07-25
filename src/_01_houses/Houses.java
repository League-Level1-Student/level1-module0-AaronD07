package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public static void main(String[] args) {

		Houses house = new Houses();
		house.rob.setX(0);
		house.rob.setY(500);
		String height = JOptionPane.showInputDialog("How tall do you want the house to be?");
		String color = JOptionPane.showInputDialog("What color do you want the house to be?");
		for (int i = 0; i < 10; i++) {

			house.robot(height, color);

		}

	}

	void robot(String height, String color) {
		int x = 200;
		if (height.equals("Medium")) {
			x = 200;
		}
		if (height.equals("Small")) {
			x = 100;
		}
		if (height.equals("Large")) {
			x = 300;
		}
		if (color.equals("Blue")) {
			rob.setPenColor(Color.BLUE);
		}
		if (color.equals("Red")) {
			rob.setPenColor(Color.RED);
		}
		if (color.equals("Purple")) {
			rob.setPenColor(Color.MAGENTA);
		}
		rob.setSpeed(100);
		rob.penDown();

		rob.setPenWidth(10);
		rob.move(x);
		if (height.equals("Large")) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		rob.move(x);

		rob.turn(-90);
		rob.setPenColor(0, 100, 0);
		rob.move(50);
		rob.turn(-90);

	}

	void drawPointyRoof() {
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
	}

	void drawFlatRoof() {

		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
}
