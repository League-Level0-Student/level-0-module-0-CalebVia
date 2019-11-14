package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Graffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot rob=new Robot("mini");
		rob.setSpeed(100);
		rob.penDown();
		rob.turn(-90);
		rob.move(45);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(45);

	}

}
