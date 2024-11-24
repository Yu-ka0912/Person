package jp.co.diworks.action;

public class Test {
	public static void main(String[]args){
		//山田太郎２０歳
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		//木村次郎１８歳
		Person jirou=new Person();
		jirou.name="木村次郎";
		jirou.age=18;
		
		System.out.println(jirou.name);
		System.out.println(jirou.age);
		
		//鈴木花子１６歳
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		//自分の名前、年齢
		Person yuka=new Person();
		yuka.name="青山友香";
		yuka.age=24;
		
		System.out.println(yuka.name);
		System.out.println(yuka.age);
		
		//田中三郎１０歳,03-1234-5678,東京都
		Person saburou=new Person();
		saburou.name="田中三郎";
		saburou.age=10;
		saburou.phoneNumber="03-1234-5678";
		saburou.address="東京都";
		
		System.out.println(saburou.name);
		System.out.println(saburou.age);
		System.out.println(saburou.phoneNumber);
		System.out.println(saburou.address);
		
		//演習５、６
		taro.talk();
		taro.walk();
		taro.run();
		
		//演習７、８
		Robot aibo=new Robot();
		aibo.name="aibo";
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		
		Robot asimo=new Robot();
		asimo.name="asimo";
		
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper=new Robot();
		pepper.name="pepper";
		
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
