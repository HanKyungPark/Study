package Java.chap_02;

public class _Quiz_02 {
	public static void main(String[] args) {
		int x = 120;
		int a = 115;
		int b = 121;
		
		int max = (x > b) ? x : b; // 121
		int min = (x < a) ? x : a; // 115
		
		System.out.println("키가" + min + "cm 이므로 탑승 불가능합니다");
		
		System.out.println("키가" + max + "cm 이므로 탑승 가능합니다");
		
		
		/*
		 정답
		 삼항 연산자
		 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과)
		int height = 121;
		String result = ( height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다"
		System.out.println("키가 " + height + " cm 이므로 " + result);
		 */
	}
}
