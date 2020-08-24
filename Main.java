
import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    Robot fred = new Robot(12,12,East,9);
    World.setVisible(true);
		World.setSize(15, 15);
		World.setDelay(5);

		for(int i=0 i<5; i++)
		{
			fred.move();
			fred.putBeeper;
		}


		makeVertical(fred);

		turnRight(fred);

		for(int i=0; i<4; i++)
		{
			fres.move();
			fred.putBeeper();
		}
  

	public static void makeVertacal(Robot wilma)
	{
		fred.turnLeft();
		for (int i=0; i<4; i++)
		{
			fred.move();
			fred.putBeeper();
		}
	}

	public static void turnRight(Robot fred)
	{
		for(int i=0; i<3; i+=2)
		{
			turnLeft();
		}
  }
}