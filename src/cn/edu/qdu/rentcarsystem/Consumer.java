package cn.edu.qdu.rentcarsystem;

import java.util.Scanner;

public class Consumer {
	//属性
	private String carKey;  //车钥匙
	
	//static块
	//初始化块
	//构造方法
	
	//方法
	//方法--询问车型
	public void askVehicleType(){
		System.out.println("请问你这里有哪些车型可供租赁？");
	}
	//方法--用户选择
	public int choose(){
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		return choice;
	}
	//方法--提车
	public void pickUpVehicle(){
		
		System.out.println(">>客户车正在提车..");
		System.out.println("请选择车辆(输入车牌号)..");
		Scanner input=new Scanner(System.in);
		String licensePlateNumber=null;
		do{
			licensePlateNumber=input.next();
			System.out.println("请插入您的钥匙：");
			if(carKey.equals(licensePlateNumber))
				break;
			else
				System.out.println("钥匙不对！请重新确认您的车牌号：");
		}while(!carKey.equals(licensePlateNumber));
		System.out.println("客户将车提走..");
	}
	//方法--还车
	public boolean returnVehicle(){
		System.out.println(">>还车..");
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
