import java.util.Scanner;

public class Cal_3 {
	
	public static void main(String[] args) {
		System.out.println("첫번째 숫자를 입력하시오 : ");
		Scanner input_1 = new Scanner(System.in);
		int first = input_1.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오 : ");
		Scanner input_2 = new Scanner(System.in);
		int second = input_2.nextInt();
		
		System.out.println("원하는 사칙연산를 입력하시오 : ");
		Scanner input_3 = new Scanner(System.in);
		String third = input_3.next();
		
		int answer=0;
		
		if("+".equals(third)) {
			answer = (first + second);
		}else if("-".equals(third)) {
			answer = (first - second);
		}else if("x".equals(third)) {
			answer = (first * second);
		}else if("x".equals(third)){
			answer = (first / second);
		}else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
		
		
		System.out.println("결과값은 : " + answer);
		
		
	}
}
