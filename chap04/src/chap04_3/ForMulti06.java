package chap04_3;

public class ForMulti06 {

	public static void main(String[] args) {
			for(int i = 0; i<3; i++ ){//i는 0 1 2
				for(int j=9; j>4; j--) {//위의 변수와 다르게 설정해야 함. 상위 for 문은 하위 for문안에서도 작동하기 ㄸㅐ문에.
			System.out.println("i=" + i + ", j =" + j); 
					//j의 for문이 거짓이 될 때까지 돌고 돈 다음 사라진 뒤 다시 상위 for문이 작동, 또 다시 하위for문 작동.
				}
				System.out.println(); //Enter생긴 이유는 하위 for 끝나고 출력 뒤 다시 상위 for부터 다시 작동됐기때문에...
				//안쪽의 for가 밖의 for보다 많이많이 돌아요오옹오오오오오오오옹옹
			}
	}

}
