package inheritance06;

public class Computer extends Product{

	Computer() {
	super(100); //TV는 무조건 100만원인겨
		
	}
@Override
	public String toString() {
		return "Computer";
	}


}
