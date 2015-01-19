package cn.ihotel.construct;

public class ConstructTest {
/*
 * 构造方法:
 * 1.子类在构造之前默认会调用父类的非空构造器
 * 2.如果父类没有默认的构造器会报错
 * 3，super()或super(i)
*/
	public static void main(String[] args) {
		Dog dog = new Dog(1);
	}
}


class Animal{
	public Animal(int is){
		System.out.println("这里是Animal的构造方法");
	}
	public Animal(){
		System.out.println("animail");
	}
}

class Dog extends Animal{
	public Dog(int i){
		super(i);
		System.out.print("这里是Dog的构造方法");
	}
}