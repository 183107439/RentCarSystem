package cn.edu.qdu.rentcarsystem;

public class Coaches extends Vehicles {
	//属性
	
	private int seatNumber;  //座位数
	//static块
	//初始化块
	//构造方法
	public Coaches(String vehicleType,int dayRates,String licensePlateNumber,int seatNumber){
		this.setVehicleType(vehicleType);
		this.setDayRates(dayRates);
		this.setLicensePlateNumber(licensePlateNumber);
		this.seatNumber=seatNumber;
	}
	//方法
	@Override
	public void showVehicleType() {
		System.out.print(this.getVehicleType());
		System.out.print(this.getDayRates());
		System.out.println(this.seatNumber);
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
