package cn.edu.qdu.rentcarsystem;

public class Coaches extends Vehicles {
	//����
	
	private int seatNumber;  //��λ��
	//static��
	//��ʼ����
	//���췽��
	public Coaches(String vehicleType,int seatNumber,int dayRates,String licensePlateNumber){
		this.setVehicleType(vehicleType);
		this.setDayRates(dayRates);
		this.setLicensePlateNumber(licensePlateNumber);
		this.seatNumber=seatNumber;
	}
	//����
	//����--��ʾ���пͳ�
	@Override
	public void showVehicleType() {
		System.out.print(this.getVehicleType()+"\t");
		System.out.print(this.seatNumber+"\t");
		System.out.print(this.getDayRates()+"\t");
		System.out.println(this.isRented());
	}
	//����--��ʾ������ͳ���Ϣ
	@Override
	public String rentedVehicle(int days) {
		System.out.println(">>�⳵�ɹ�");
		System.out.println("�����⳵����Ϣ���£�");
		this.showVehicleType();
		System.out.println("�⳵������"+days);
		System.out.println("�⳵���ã�"+(this.getDayRates()*days));	
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
