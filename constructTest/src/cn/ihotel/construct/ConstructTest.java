package cn.ihotel.construct;

public class ConstructTest {
/*
 * ���췽��:
 * 1.�����ڹ���֮ǰĬ�ϻ���ø���ķǿչ�����
 * 2.�������û��Ĭ�ϵĹ������ᱨ��
 * 3��super()��super(i)
*/
	public static void main(String[] args) {
		Dog dog = new Dog(1);
	}
}


class Animal{
	public Animal(int is){
		System.out.println("������Animal�Ĺ��췽��");
	}
	public Animal(){
		System.out.println("animail");
	}
}

class Dog extends Animal{
	public Dog(int i){
		super(i);
		System.out.print("������Dog�Ĺ��췽��");
	}
}