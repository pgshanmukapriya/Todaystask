package p4;

public class Mobile extends Device{

	public Mobile(String deviceName, String modelNumber, int cost, int avgRating, String brandName) {
		super(deviceName, modelNumber, cost, avgRating, brandName);
		// TODO Auto-generated constructor stub
	}

	@Override
		public int doWork(int charging) {
			// TODO Auto-generated method stub
			int currentmobilepower=super.getPower();
			currentmobilepower +=(charging*3);
			super.setPower(currentmobilepower);
			return currentmobilepower;
		}
		public void setLaptopDetails(String deviceName,String modelNumber,int cost,int avgRating,String brandName) {
			super.setDeviceName(deviceName);
			super.setModelNumber(modelNumber);
			super.setCost(cost);
			super.setAvgRating(avgRating);
			super.setBrandName(brandName);			
		}
		public void usedToplayGames() {
		
		int currentmobilePower = super.getPower();
		super.printdeviceDetails();

		if(currentmobilePower>10)
		{
			System.out.println("Mobile is used to playgames");
			currentmobilePower -=20;
			super.setPower(currentmobilePower);
		}
		else
		{
			System.out.println("Mobile "+super.getDeviceName()+" power is low ("+super.getPower()+") , the laptop should be charged");
	}

		}


		public void setMobileDetails(String string, String string2, int i, int j, String string3) {
			// TODO Auto-generated method stub
			
		}
		
}


