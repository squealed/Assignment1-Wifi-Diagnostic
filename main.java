import java.util.Scanner;

public class main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("If you have a problem with your internet connectivity, this Wifi Diagnossi might work.\n");
			System.out.println("First step: reboot your computer");
			System.out.println("Are you able to connect with internet? (yes or no)");
			String computer = sc.nextLine();
			if(computer.equals("no")) {
				System.out.println("Second step: reboot your router");
				System.out.println("Now are you able to connect with internet? (yes or no)");
				String router= sc.nextLine();
				if(router.equals("no")) {
					System.out.println("Third step: make sure the cables to your router are pluigged in firmly and your router is getting power");
					System.out.println("Now are you able to connect with internet? (yes or no)");
					String cables = sc.nextLine();
					if(cables.equals("no")) {
						System.out.println("Fourth Step: move your computer closer to your router");
						System.out.println("Now are you able to connect with internet? (yes or no)");
						String closer = sc.nextLine();
						if(closer.equals("no")) {
							System.out.println("Fifth step: contact your ISP");
							System.out.println("Make sure your ISP is hooked up with your router");
						}else {
							System.out.println("Moving closer to the router seemed to work");
						}
					}else {
						System.out.println("Checking the router's cables seemed to work");
					}
					
				}else {
					System.out.println("Rebooting your router seemed to work");
				}
			}else {
				System.out.println("Rebooting your computer seemed to work");
			}
			
		}
		
	}
