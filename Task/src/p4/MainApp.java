package p4;

import java.util.Scanner;

import p4.Laptop;



public class MainApp {
	
	
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	new MainApp().dowork();
}

public  void dowork() {

	
	while(true)
	{

		System.out.println("Choose Device ");
		System.out.println("1. Laptop");
		System.out.println("2. Mobile ");
		switch (sc.nextInt()) {
		 case 1:
			Laptop l=new Laptop(null, null, 0, 0, null);
			l.setLaptopDetails("Laptop","2001", 30000, 3,"Dell");
			doDeviceThings(l);
			case 2:
				Mobile m=new Mobile(null, null, 0, 0, null);
				m.setMobileDetails("Mobile", "3002", 40000, 4, "apple");
				doDeviceThings(m);
			
		default:
			System.out.println("Wrong Option");
			System.exit(0);
		}


	}

}

public  void doDeviceThings(Device d) {
	if(d instanceof Laptop)
	{
		Laptop l = (Laptop)d; // need of type casting
		// doing so , we save the previous state 
					// data related to a object
		doLaptopThings(l);
	}
	if(d instanceof Mobile)
	{
		Mobile m = (Mobile)d; // doing so , we save the previous state 
		// data related to a object
		doMobileThings(m);
	}
	
}
public  void doLaptopThings(Laptop l) {
	while(true)
	{
		System.out.println("(l)ap for coding ");
		System.out.println("(f)ind the errors and charge the lap");
		System.out.println("(c)hange device");



		switch (new Scanner(System.in).next()) {
		    case "l":
			case "L":
					l.docoding();
					break;
			case "f":
			case "F":
					System.out.println("enter the percentage of the laptop to charge  [1-3]");
					int quantity = sc.nextInt();
					if(quantity>=1 && quantity<=3)
					{
						l.docoding();
					}
					break;
			case "c":
			case "C":{
					return; // return from method and land on start game method
			}			

			default:
				break;
		}

	}//end while
} //end of doDogThings


public void doMobileThings(Mobile m){
	while(true)
	{
		System.out.println("(m)obile for playing games ");
		System.out.println("(u)se charger to charge Mobile");
		System.out.println("(c)hange device");



		switch (new Scanner(System.in).next()) {
		    case "m":
			case "M":
					m.usedToplayGames();
					break;
			case "u":
			case "U":
					System.out.println("enter the percentage of the laptop to charge  [1-3]");
					int quantity = sc.nextInt();
					if(quantity>=10 && quantity<=30)
					{
						m.usedToplayGames();
					}
					break;
			case "c":
			case "C":{
					return; // return from method and land on start game method
			}			

			default:
				break;
		}

	}//end while
}
}


	
