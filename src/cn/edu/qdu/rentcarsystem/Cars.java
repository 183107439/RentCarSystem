package cn.edu.qdu.rentcarsystem;

public class Cars extends Vehicles {	
	//属性
	private String brand;
	//static块
	//初始化块
	//构造方法
	public Cars(String vehicleType,String brand,int dayRates,String licensePlateNumber) {
		this.setVehicleType(vehicleType);
		this.brand=brand;
		this.setDayRates(dayRates);
		this.setLicensePlateNumber(licensePlateNumber);
	}
	//方法
	@Override
	public void showVehicleType() {	
		System.out.print(this.getVehicleType());
		System.out.println(this.brand);
		System.out.println(this.getDayRates());
	}
	
//	@Override
//	public void askChoice() {
//		// TODO Auto-generated method stub
//		super.askChoice();
//	}
	
	@Override
	public String rentVehicle(int days) {
		System.out.println("您所租车辆信息如下：");
		this.showVehicleType();
		System.out.println("租车天数："+days);
		System.out.println("租车费用："+(this.getDayRates()*days));
		this.setRented(true);
		return this.getLicensePlateNumber();
	}
	
}
