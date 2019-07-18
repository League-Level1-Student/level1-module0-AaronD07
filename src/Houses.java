import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args)  {
	String height = JOptionPane.showInputDialog("How tall do you want the house to be?");
}
void robot() {
	Robot rob = new Robot();
	rob.setSpeed(100);
	rob.penDown();
	
rob.setX(0);
rob.setY(500);
rob.turn(90);
rob.move(20);
rob.turn(-90);
rob.move(200);
rob.turn(90);
rob.move(50);
rob.turn(90);
rob.move(200);
rob.turn(-90);
rob.setPenColor(0, 100, 0);
rob.setPenWidth(10);
rob.move(50);
rob.setPenColor(0, 0, 0);
}

}
}

