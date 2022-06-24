package arrays;

import java.util.Arrays;

public class Sort03 {

	public static void main(String[] args) {
		int[] num = {4, 7, 2, 9, 5, 1};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		String[] names = {"¹ãºíºñ", "¹üºíºñ","±è£O°æ", "¹æ¸ÁÀÌ"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		char[] ch = {'b', 'd', 'e', 'a'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		Member m1 = new Member("±èÇı¼ö");
		Member m2 = new Member("»ş¸¦¸®Áî");
		Member m3= new Member("¸ÆÄµÁö");
		Member m4 = new Member("ÄÉÀÌÆ®");
		Member[] mem = {m1, m2, m3, m4};
		Arrays.sort(mem);
		for(int i=0; i<mem.length; i++) {
			System.out.print(mem[i].name + ", "); //¤¡¤¤¤§ ¼øÀ¸·Î µå·ç¿Õ
		}
	}

}
