package a.a1.aa3;
import chap06_1.B1;//다른패키지에 있는 넘을 쓸라믄 import해서 경로를 알려주는 것... (걍 이해하기 쉽게 이런거여 본래의 의미는 아님)
import java.util.Scanner; //java는 기본으로 올라오는 패키지..? 
import java.util.*; //java.util에 있는 모든 클래스 임포트하능거... 스캐너도 포함됐겠쥥
import method.Method01; 
import method.Method02;
import method.Method03;
import method.*; // method 패키지 안에 있는 모든 클래스 다 임포트하는거...
public class Aaaaa {

	public static void main(String[] args) {
		B1 b = new B1(); 
		Scanner sc = new Scanner(System.in);
		Method01 me1  = new Method01();
		Method02 me2  = new Method02();
		Method03 me3  = new Method03();
	
	
	}
}
