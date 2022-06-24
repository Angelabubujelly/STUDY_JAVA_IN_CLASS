package abstract02;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Hedgehog hh	= new Hedgehog();
		
//		Animal ani = new Animal(); 구현되지 않은 메소드가 있기 때문에
// 객체생성 할 수 없음.
		
		cat.breathe();
		cat.sound();
		dog.sound();
		hh.sound();
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		Animal animal = cat; // 자식은 부모타입으로 자동 타입 변환이 가능!
		animal.sound();
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		animal = dog; // 재정의된 자식 메소드가 호출되는 상속의 특징!0
		animal.sound(); //어떤 객체를 넣었느냐... 그에 따라 사운드가 나옴!
		//new animal은 안 됨!!!
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		animalSound(new Cat());
		animalSound(new Dog());
		animalSound(new Hedgehog());
	}
static void animalSound(Animal animal) { //클래스이름.메소드 <- 이렇게 안 해도 되는게 같은 패키지 안에있으니까???
	animal.sound();

}
}
