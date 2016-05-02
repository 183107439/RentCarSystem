package cn.edu.qdu.rentcarsystem;

public class RentCarsMain {
	public static void main(String[] args) {
		//所有可供租赁的汽车
		Cars[] cars=new Cars[3];
		cars[0]=new Cars("汽车","别克商务",600,"B111");
		cars[1]=new Cars("汽车","宝马550i",500,"B222");
		cars[2]=new Cars("汽车","别克林荫大道",300,"B333");
		//所有可供租赁的客车
		Coaches[] coaches=new Coaches[2];
		coaches[0]=new Coaches("小客车",16,800,"C111");
		coaches[1]=new Coaches("大客车",42,1500,"C222");
		
		Consumer consumer=new Consumer();
		//租车系统首页
		Vehicles.askChoice();
		int choice=0;
		int choice1=0;
		int choice2=0;
		do{		
			choice=consumer.choose();	//选择所租车型
			switch (choice) {
			case 1:
				//显示公司所有汽车
				System.out.println("可供租赁的汽车有：");
				System.out.println("车型\t"+"品牌\t\t"+"日租金"+"\t是否租出");
				for (int i = 0; i < cars.length; i++) {
					System.out.print((i+1)+".");
					cars[i].showVehicleType();
				}
				System.out.println("请选择车辆：");
//				int choice1=0;			
				choice1=consumer.choose();//用户选择
				while(choice1>3 || choice1<1)
				{				
					System.out.println("输入错误！请重新输入..");
					choice1=consumer.choose();
				}
				
				cars[choice1-1].setRented(true);//该车辆状态设为已租出
				
				Vehicles.askDays();//询问客户租车天数
				int days1=consumer.choose();
				//显示客户所租车辆信息
				cars[choice1-1].rentedVehicle(days1);
				//把钥匙给客户
				consumer.setCarKey(cars[choice1-1].getLicensePlateNumber());
				
				break;
				
			case 2:
				//显示公司所有客车
				System.out.println("可供租赁的客车有：");
				System.out.println("车型\t"+"座位数\t"+"日租金"+"\t是否租出");
				for (int i = 0; i < coaches.length; i++) {
					System.out.print((i+1)+".");
					coaches[i].showVehicleType();
				}
				System.out.println("请选择车辆：");
//				int choice2=0;
				choice2=consumer.choose();//用户选择
				while(choice2>2 || choice2<1)
				{				
					System.out.println("输入错误！请重新输入..");
					choice2=consumer.choose();
				}
				
				coaches[choice2-1].setRented(true);//该车辆状态设为已租出
				
				Vehicles.askDays();//询问客户租车天数
				int days2=consumer.choose();
				//显示客户所租车辆信息
				coaches[choice2-1].rentedVehicle(days2);
				//把钥匙给客户
				consumer.setCarKey(coaches[choice2-1].getLicensePlateNumber());
						
				break;

			default:
				System.out.println("输入错误！请重新输入..");
				break;
			}
		}while(choice>2 || choice<1);
		
		//提车
		consumer.pickUpVehicle();
		//还车
		boolean isRented=consumer.returnVehicle();
		if(choice==1){
			cars[choice1-1].setRented(!isRented);
			System.out.println("可供租赁的汽车有：");
			System.out.println("车型\t"+"品牌\t\t"+"日租金"+"\t是否租出");
			for (int i = 0; i < cars.length; i++) {
				System.out.print((i+1)+".");
				cars[i].showVehicleType();
			}
		}
		else{
			coaches[choice2-1].setRented(!isRented);
			System.out.println("可供租赁的客车有：");
			System.out.println("车型\t"+"座位数\t"+"日租金"+"\t是否租出");
			for (int i = 0; i < coaches.length; i++) {
				System.out.print((i+1)+".");
				coaches[i].showVehicleType();
			}
		}
		
	}
	
}
