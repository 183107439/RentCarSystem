package cn.edu.qdu.rentcarsystem;

public abstract class  Vehicles {
	//����
	private String vehicleType;  //����
	private int dayRates;	//�����
	private String licensePlateNumber;	//���ƺ�
	private boolean isRented=false; 	//�Ƿ��ѱ�����
	//static��
	//��ʼ����
	//���췽��
	//����
	public abstract void showVehicleType(); //�ṩ�ĳ���
	public abstract String rentedVehicle(int days);	//���⳵��
	
	public static void askChoice(){
		System.out.println("******************");
		System.out.println("***��������ϵͳ***");
		System.out.println("******************");
		System.out.println("�����������������ǿͳ���");
		System.out.println("1.����");
		System.out.println("2.�ͳ�");
	}

	public static void askDays(){
		System.out.println("��ѡ������");
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
