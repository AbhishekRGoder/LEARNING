package Fa;

public class FanaAPP {
	public static void main(String[] args) {
		Fan f1=new Fan();
		Fan f2=new Fan();
		Fan f3=new Fan();
		
		f1.wings=3;
		f1.colour="red";
		f1.cost=3000;
		f1.brand="Usha";
		
		
		f2.wings=4;
		f2.colour="blue";
		f2.cost=3500;
		f2.brand="philips";
		
		f3.wings=5;
		f3.colour="white";
		f3.cost=4000;
		f3.brand="crompton";
		
		System.out.println(f1.brand+" brand fan has "+f1.wings+" wings,and it costs "+f1.cost+".its colour is "+f1.colour);
		f1.rotate();
		f1.blow();
		System.out.println(f2.brand+" brand fan has "+f2.wings+" wings,and it costs "+f2.cost+".its colour is "+f2.colour);
		f1.rotate();
		f1.blow();
		System.out.println(f3.brand+" brand fan has "+f3.wings+" wings,and it costs "+f3.cost+".its colour is "+f3.colour);
		f1.rotate();
		f1.blow();
	}

}
