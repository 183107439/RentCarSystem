package cn.edu.qdu.rentcarsystem;

import java.util.Scanner;

public class Consumer {
	//属性
	private String carKey;
	
	//static块
	//初始化块
	//构造方法
	
	//方法
	public void askVehicleType(){
		System.out.println("请问你这里有哪些车型可供租赁？");
	}
	
	public int choose(){
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		return choice;
	}
	
	public void pickUpVehicle(String lincensePlateNumber){
		System.out.println(">>客户车正在提车..");
		System.out.println("请插入您的钥匙：");
		do{
			System.out.println("钥匙不对！请重新插入您的钥匙：");
		}while(carKey.equals(lincensePlateNumber));
		System.out.println("客户将车提走..");
	}
	
	public boolean returnVehicle(){
		System.out.println(">>还车..");
		return true;
	}

	public String getCarKey() {
		return carKey;
	}

	public void setCarKey(String carKey) {
		this.carKey = carKey;
	}
	
}
