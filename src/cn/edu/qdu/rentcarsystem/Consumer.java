package cn.edu.qdu.rentcarsystem;

import java.util.Scanner;

public class Consumer {
	//����
	private String carKey;
	
	//static��
	//��ʼ����
	//���췽��
	
	//����
	public void askVehicleType(){
		System.out.println("��������������Щ���Ϳɹ����ޣ�");
	}
	
	public int choose(){
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		return choice;
	}
	
	public void pickUpVehicle(String lincensePlateNumber){
		System.out.println(">>�ͻ��������ᳵ..");
		System.out.println("���������Կ�ף�");
		do{
			System.out.println("Կ�ײ��ԣ������²�������Կ�ף�");
		}while(carKey.equals(lincensePlateNumber));
		System.out.println("�ͻ���������..");
	}
	
	public boolean returnVehicle(){
		System.out.println(">>����..");
		return true;
	}

	public String getCarKey() {
		return carKey;
	}

	public void setCarKey(String carKey) {
		this.carKey = carKey;
	}
	
}
