package cn.edu.qdu.rentcarsystem;

public class Coaches extends Vehicles {
	//属性
	
	private int seatNumber;  //座位数
	//static块
	//初始化块
	//构造方法
	public Coaches(String vehicleType,int seatNumber,int dayRates,String licensePlateNumber){
		this.setVehicleType(vehicleType);
		this.setDayRates(dayRates);
		this.setLicensePlateNumber(licensePlateNumber);
		this.seatNumber=seatNumber;
	}
	//方法
	//方法--显示所有客车
	@Override
	public void showVehicleType() {
		System.out.print(this.getVehicleType()+"\t");
		System.out.print(this.seatNumber+"\t");
		System.out.print(this.getDayRates()+"\t");
		System.out.println(this.isRented());
	}
	//方法--显示所租出客车信息
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
	
	public int getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
}
