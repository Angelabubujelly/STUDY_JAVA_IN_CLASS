package inheritance06;

public class Tv extends Product{

	Tv() {
	super(200); //TV는 무조건 100만원인겨
		
	}
@Override
	public String toString() {
		return "TV";
	}


}
