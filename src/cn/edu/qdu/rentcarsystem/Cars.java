package cn.edu.qdu.rentcarsystem;

public class Cars extends Vehicles {	
	//����
	private String brand; //����Ʒ��
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
	//����--��ʾ��������
	@Override
	public void showVehicleType() {	
		System.out.print(this.getVehicleType()+"\t");
		System.out.print(this.brand+"\t\t");
		System.out.print(this.getDayRates()+"\t");
		System.out.println(this.isRented());
	}
	//����--��ʾ���������������Ϣ
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
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
