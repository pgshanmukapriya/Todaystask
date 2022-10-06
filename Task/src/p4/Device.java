package p4;

public  abstract class Device {
	private String deviceName;
	private String modelNumber;
	private int cost;
	private int avgRating;
	private String brandName;
	private int power;
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	abstract public int doWork(int charging);

	public Device(String deviceName, String modelNumber, int cost, int avgRating, String brandName) {
		super();
		this.deviceName = deviceName;
		this.modelNumber = modelNumber;
		this.cost = cost;
		this.avgRating = avgRating;
		this.brandName = brandName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public  void printdeviceDetails(){
		System.out.println(deviceName+"-"+power);
		
	}

}
