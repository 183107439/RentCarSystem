package cn.edu.qdu.rentcarsystem;

public abstract class  Vehicles {
	//属性
	private String vehicleType;  //车型
	private int dayRates;	//日租费
	private String licensePlateNumber;	//车牌号
	private boolean isRented=false; 	//是否已被租走
	//static块
	//初始化块
	//构造方法
	//方法
	public abstract void showVehicleType(); //提供的车型
	public abstract String rentedVehicle(int days);	//出租车辆
	
	public static void askChoice(){
		System.out.println("******************");
		System.out.println("***车辆租赁系统***");
		System.out.println("******************");
		System.out.println("请问您想租汽车还是客车？");
		System.out.println("1.汽车");
		System.out.println("2.客车");
	}

	public static void askDays(){
		System.out.println("请选择天数");
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getDayRates() {
		return dayRates;
	}

	public void setDayRates(int dayRates) {
		this.dayRates = dayRates;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}
	
	public boolean isRented() {
		return isRented;
	}
	
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
}
