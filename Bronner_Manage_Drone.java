package bronner_Drone;
//Author Name: Devon Bronner
//Date: 8/26/2019
//Program Name: Bronner_Drone
//Purpose: Simulation using button, drone movement in x, y,z location

import java.util.Scanner;

public class Bronner_Manage_Drone {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Bronner_Drone drone1 = new Bronner_Drone();
		
		final int EXIT = 8;
		int choice;
		
		//display menu and get user input
		menu();
		choice = Integer.parseInt(input.nextLine());
		
		//WHILE(user input not exit)
		while(choice != EXIT) {
			switch(choice) {
			//move drone up
			case 1:
				drone1.moveZ_pos(1);
				System.out.println("You have moved up");
				break;
			//move drone down
			case 2:
				drone1.moveZ_pos(-1);
				System.out.println("You have moved down");
				break;
			//move drone forward
			case 3:
				drone1.moveX_pos(1);
				System.out.println("You have moved forward");
				break;
			//move drone backward
			case 4:
				drone1.moveX_pos(-1);
				System.out.println("You have moved backward");
				break;
			//turn drone left
			case 5:
				drone1.moveY_pos(-1);
				System.out.println("You have turned left");
				break;
			//turn drone right
			case 6:
				drone1.moveY_pos(1);
				System.out.println("You have turned right");
				break;
			//display drone coordinates
			case 7:
				System.out.println(drone1.toString());
			//exit
			case 8:
				choice = EXIT;
				break;
			//Message to choose valid option
			default:
				System.out.println("Invalid Choice, Please Choose an option from Menu above!");
			}
			
			//display menu and get user input
			menu();
			choice = Integer.parseInt(input.nextLine());
			
		}
		input.close();
		
	}
	
	public static void menu() {
		//Displays menu options
		System.out.println("Which direction would you like to move the drone?");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forward");
		System.out.println("4 - Move Backward");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Navigation");
	}
	

}
