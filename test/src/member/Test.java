package member;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] pitcher = new int[3];	//투수 숫자 3개의 값
		int[] hitter = new int[3];	//타자 숫자 3개의 값
		int strike = 0;	//스트라이크
		int ball = 0;	//볼

		System.out.println("Play Ball!");

		while(strike != 3) {	// 3스트라이크면 종료
			System.out.print("투수가 던질 번호를 입력하세요 : ");
			for(int i=0; i<pitcher.length; i++) {
				pitcher[i] = sc.nextInt();	//투수 배열에 값 3개 저장
			}
			System.out.print("타자가 칠 번호를 입력하세요 : ");
			for(int i=0; i<hitter.length; i++) {
				hitter[i] = sc.nextInt();	//타자 배열에 값 3개 저장
			}

			//스트라이크,볼 확인
			for(int i=0; i<3; i++) {
				if(pitcher[i] == hitter[i]) {	// 숫자와 인덱스가 똑같으면 스트라이크 카운트 +1
					strike++;
				}
				else if(pitcher[i] == hitter[0] || pitcher[i] == hitter[1] || pitcher[i] == hitter[2]) {	// 숫자는 같지만 인덱스가 틀리다면 볼 카운트 +1
					ball++;
				}
			}
			System.out.println(strike + "스트라이크");
			System.out.println(ball + "볼");
		}
		System.out.println("out!");
	}

}
