package member;

public class Test1 {

	public static void main(String[] args) {

		for(int i=1; i<=100; i++) {	//숫자 범위 1~100까지
			String num = String.valueOf(i);		//문자열로 변환
			char[] num2 = num.toCharArray();	//숫자 1개씩 끊어서 배열에 저장
			String cnt = "";	//박수칠 문자열
			
			//배열에서 3,6,9 가 있으면 문자열에 "짝"추가
			for(int j=0; j<num2.length; j++) {
				if(num2[j] == '3' || num2[j] == '6' || num2[j] == '9') {
					cnt = cnt + "짝";
				}
			}
			System.out.println(i + " " + cnt);
		}
		
	}
	
}
