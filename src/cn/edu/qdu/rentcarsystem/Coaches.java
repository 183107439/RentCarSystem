package cn.edu.qdu.rentcarsystem;

public class Coaches extends Vehicles {
	//����
	
	private int seatNumber;  //��λ��
	//static��
	//��ʼ����
	//���췽��
	public Coaches(String vehicleType,int dayRates,String licensePlateNumber,int seatNumber){
		this.setVehicleType(vehicleType);
		this.setDayRates(dayRates);
		this.setLicensePlateNumber(licensePlateNumber);
		this.seatNumber=seatNumber;
	}
	//����
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
		System.out.println("�����⳵����Ϣ���£�");
		this.showVehicleType();
		System.out.println("�⳵������"+days);
		System.out.println("�⳵���ã�"+(this.getDayRates()*days));
		this.setRented(true);
		return this.getLicensePlateNumber();
	}
}
