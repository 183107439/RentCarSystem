package cn.edu.qdu.rentcarsystem;

import java.util.Scanner;

public class Consumer {
	//����
	private String carKey;  //��Կ��
	
	//static��
	//��ʼ����
	//���췽��
	
	//����
	//����--ѯ�ʳ���
	public void askVehicleType(){
		System.out.println("��������������Щ���Ϳɹ����ޣ�");
	}
	//����--�û�ѡ��
	public int choose(){
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		return choice;
	}
	//����--�ᳵ
	public void pickUpVehicle(){
		
		System.out.println(">>�ͻ��������ᳵ..");
		System.out.println("��ѡ����(���복�ƺ�)..");
		Scanner input=new Scanner(System.in);
		String licensePlateNumber=null;
		do{
			licensePlateNumber=input.next();
			System.out.println("���������Կ�ף�");
			if(carKey.equals(licensePlateNumber))
				break;
			else
				System.out.println("Կ�ײ��ԣ�������ȷ�����ĳ��ƺţ�");
		}while(!carKey.equals(licensePlateNumber));
		System.out.println("�ͻ���������..");
	}
	//����--����
	public boolean returnVehicle(){
		System.out.println(">>����..");
		this.carKey=null;
		return true;
	}

	public String getCarKey() {
		return carKey;
	}

	public void setCarKey(String carKey) {
		this.carKey = carKey;
	}
	
}
