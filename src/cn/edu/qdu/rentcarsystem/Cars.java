package cn.edu.qdu.rentcarsystem;

public class Cars extends Vehicles {	
	//属性
	private String brand; //汽车品牌
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
	//方法--显示所有汽车
	@Override
	public void showVehicleType() {	
		System.out.print(this.getVehicleType()+"\t");
		System.out.print(this.brand+"\t\t");
		System.out.print(this.getDayRates()+"\t");
		System.out.println(this.isRented());
	}
	//方法--显示所租出的汽车的信息
	@Override
	public String rentedVehicle(int days) {
		System.out.println(">>租车成功");	
		System.out.println("您所租车辆信息如下：");
		this.showVehicleType();
		System.out.println("租车天数："+days);
		System.out.println("租车费用："+(this.getDayRates()*days));	
		this.setRented(true);
		return this.getLicensePlateNumber();
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
