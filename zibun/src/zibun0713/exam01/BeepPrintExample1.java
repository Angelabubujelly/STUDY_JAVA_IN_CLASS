package zibun0713.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);
		} catch(Exception e) {}
	}
		for(int i=0; i<5; i++) {
			System.out.println("응 애기 코딩중 ");
			try { Thread.sleep(500); 
		} catch(Exception e) {
			
		}
		}
}
}