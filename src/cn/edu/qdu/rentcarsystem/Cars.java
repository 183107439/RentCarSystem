package cn.edu.qdu.rentcarsystem;

public class Cars extends Vehicles {	
	//����
	private String brand;
	//static��
	//��ʼ����
	//���췽��
	public Cars(String vehicleType,String brand,int dayRates,String licensePlateNumber) {
		this.setVehicleType(vehicleType);
		this.brand=brand;
		this.setDayRates(dayRates);
		this.setLicensePlateNumber(licensePlateNumber);
	}
	//����
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
		System.out.println("�����⳵����Ϣ���£�");
		this.showVehicleType();
		System.out.println("�⳵������"+days);
		System.out.println("�⳵���ã�"+(this.getDayRates()*days));
		this.setRented(true);
		return this.getLicensePlateNumber();
	}
	
}
