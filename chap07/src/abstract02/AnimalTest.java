package abstract02;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Hedgehog hh	= new Hedgehog();
		
//		Animal ani = new Animal(); �������� ���� �޼ҵ尡 �ֱ� ������
// ��ü���� �� �� ����.
		
		cat.breathe();
		cat.sound();
		dog.sound();
		hh.sound();
		System.out.println("������������������������������������");
		
		Animal animal = cat; // �ڽ��� �θ�Ÿ������ �ڵ� Ÿ�� ��ȯ�� ����!
		animal.sound();
		System.out.println("������������������������������������");
		
		animal = dog; // �����ǵ� �ڽ� �޼ҵ尡 ȣ��Ǵ� ����� Ư¡!0
		animal.sound(); //� ��ü�� �־�����... �׿� ���� ���尡 ����!
		//new animal�� �� ��!!!
		System.out.println("������������������������������������");
		
		animalSound(new Cat());
		animalSound(new Dog());
		animalSound(new Hedgehog());
	}
static void animalSound(Animal animal) { //Ŭ�����̸�.�޼ҵ� <- �̷��� �� �ص� �Ǵ°� ���� ��Ű�� �ȿ������ϱ�???
	animal.sound();

}
}
