package p4;

public class Laptop extends Device {

	public Laptop(String deviceName, String modelNumber, int cost, int avgRating, String brandName) {
		super(deviceName, modelNumber, cost, avgRating, brandName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int doWork(int charging) {
		// TODO Auto-generated method stub
		int currentLaptoppower=super.getPower();
		currentLaptoppower +=(charging*2);
		super.setPower(currentLaptoppower);
		return currentLaptoppower;
	}
	public void setLaptopDetails(String deviceName,String modelNumber,int cost,int avgRating,String brandName) {
		super.setDeviceName(deviceName);
		super.setModelNumber(modelNumber);
		super.setCost(cost);
		super.setAvgRating(avgRating);
		super.setBrandName(brandName);			
	}
	public void docoding() {
	
	int currentLaptopPower = super.getPower();
	super.printdeviceDetails();

	if(currentLaptopPower>20)
	{
		System.out.println("Laptop used for coding ");
		currentLaptopPower -= 15;
		super.setPower(currentLaptopPower);
	}
	else
	{
		System.out.println("Laptop "+super.getDeviceName()+" power is low ("+super.getPower()+") , the laptop should be charged");

	}



}
}

	


