/*
 * Class: CMSC203 CRN 202120
 * Project #1
 * Description: Project 1 Wifi Diagnosis
 * Due Date: 9/13/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Neil Walter
*/

import java.util.Scanner;

public class WiFiDiagnosis {
		public static void main(String args[]) {
			// initilize a scanner
			Scanner sc = new Scanner(System.in);
			//prints program header
			System.out.println("If you have a problem with your internet connectivity, this Wifi Diagnosis might work.\n");
			//prints first prompt
			System.out.println("First step: reboot your computer");
			System.out.println("Are you able to connect with internet? (yes or no)");
			// takes user prompt to reboot computer
			String computer = sc.nextLine();
			//checks if the problem is solved
			if(computer.equals("no")) {
				//prints second prompt
				System.out.println("Second step: reboot your router");
				System.out.println("Now are you able to connect with internet? (yes or no)");
				// takes second input line
				String router = sc.nextLine();
				//checks if problem fixed
				if(router.equals("no")) {
					//third prompt 
					System.out.println("Third step: make sure the cables to your router are pluigged in firmly and your router is getting power");
					System.out.println("Now are you able to connect with internet? (yes or no)");
					//takes user input for 3rd prompt
					String cables = sc.nextLine();
					//checks if problem solved
					if(cables.equals("no")) {
						//asks 4th prompt
						System.out.println("Fourth Step: move your computer closer to your router");
						System.out.println("Now are you able to connect with internet? (yes or no)");
						//gets user input
						String closer = sc.nextLine();
						//checks if problem solved
						if(closer.equals("no")) {
							//contact isp last case
							System.out.println("Fifth step: contact your ISP");
							System.out.println("Make sure your ISP is hooked up with your router");
						}else {
							//fall case if moving closer worked
							System.out.println("Moving closer to the router seemed to work");
						}
					}else {
						//fall case if cables plugged in
						System.out.println("Checking the router's cables seemed to work");
					}
					
				}else {
					//fall case if rebooting router worked
					System.out.println("Rebooting your router seemed to work");
				}
			}else {
				//fall case if rebooting computer worked
				System.out.println("Rebooting your computer seemed to work");
			}
			System.out.println("Programmer Name: Neil Walter");
			
		}
		
	}
