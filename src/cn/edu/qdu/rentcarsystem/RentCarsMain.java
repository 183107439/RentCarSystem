package cn.edu.qdu.rentcarsystem;

public class RentCarsMain {
	public static void main(String[] args) {
		//���пɹ����޵�����
		Cars[] cars=new Cars[3];
		cars[0]=new Cars("����","�������",600,"B111");
		cars[1]=new Cars("����","����550i",500,"B222");
		cars[2]=new Cars("����","���������",300,"B333");
		//���пɹ����޵Ŀͳ�
		Coaches[] coaches=new Coaches[2];
		coaches[0]=new Coaches("С�ͳ�",16,800,"C111");
		coaches[1]=new Coaches("��ͳ�",42,1500,"C222");
		
		Consumer consumer=new Consumer();
		//�⳵ϵͳ��ҳ
		Vehicles.askChoice();
		int choice=0;
		int choice1=0;
		int choice2=0;
		do{		
			choice=consumer.choose();	//ѡ�����⳵��
			switch (choice) {
			case 1:
				//��ʾ��˾��������
				System.out.println("�ɹ����޵������У�");
				System.out.println("����\t"+"Ʒ��\t\t"+"�����"+"\t�Ƿ����");
				for (int i = 0; i < cars.length; i++) {
					System.out.print((i+1)+".");
					cars[i].showVehicleType();
				}
				System.out.println("��ѡ������");
//				int choice1=0;			
				choice1=consumer.choose();//�û�ѡ��
				while(choice1>3 || choice1<1)
				{				
					System.out.println("�����������������..");
					choice1=consumer.choose();
				}
				
				cars[choice1-1].setRented(true);//�ó���״̬��Ϊ�����
				
				Vehicles.askDays();//ѯ�ʿͻ��⳵����
				int days1=consumer.choose();
				//��ʾ�ͻ����⳵����Ϣ
				cars[choice1-1].rentedVehicle(days1);
				//��Կ�׸��ͻ�
				consumer.setCarKey(cars[choice1-1].getLicensePlateNumber());
				
				break;
				
			case 2:
				//��ʾ��˾���пͳ�
				System.out.println("�ɹ����޵Ŀͳ��У�");
				System.out.println("����\t"+"��λ��\t"+"�����"+"\t�Ƿ����");
				for (int i = 0; i < coaches.length; i++) {
					System.out.print((i+1)+".");
					coaches[i].showVehicleType();
				}
				System.out.println("��ѡ������");
//				int choice2=0;
				choice2=consumer.choose();//�û�ѡ��
				while(choice2>2 || choice2<1)
				{				
					System.out.println("�����������������..");
					choice2=consumer.choose();
				}
				
				coaches[choice2-1].setRented(true);//�ó���״̬��Ϊ�����
				
				Vehicles.askDays();//ѯ�ʿͻ��⳵����
				int days2=consumer.choose();
				//��ʾ�ͻ����⳵����Ϣ
				coaches[choice2-1].rentedVehicle(days2);
				//��Կ�׸��ͻ�
				consumer.setCarKey(coaches[choice2-1].getLicensePlateNumber());
						
				break;

			default:
				System.out.println("�����������������..");
				break;
			}
		}while(choice>2 || choice<1);
		
		//�ᳵ
		consumer.pickUpVehicle();
		//����
		boolean isRented=consumer.returnVehicle();
		if(choice==1){
			cars[choice1-1].setRented(!isRented);
			System.out.println("�ɹ����޵������У�");
			System.out.println("����\t"+"Ʒ��\t\t"+"�����"+"\t�Ƿ����");
			for (int i = 0; i < cars.length; i++) {
				System.out.print((i+1)+".");
				cars[i].showVehicleType();
			}
		}
		else{
			coaches[choice2-1].setRented(!isRented);
			System.out.println("�ɹ����޵Ŀͳ��У�");
			System.out.println("����\t"+"��λ��\t"+"�����"+"\t�Ƿ����");
			for (int i = 0; i < coaches.length; i++) {
				System.out.print((i+1)+".");
				coaches[i].showVehicleType();
			}
		}
		
	}
	
}
