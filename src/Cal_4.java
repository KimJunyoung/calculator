import java.util.Scanner;

public class Cal_4 {

	public static void main(String[] args) {
		System.out.println("숫자와 기호를 순차적으로 입력하시오");
		
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int answer = first;
		while(true) {
			
			
			
			System.out.println("사칙연산 기호 : ");
			String symbol = scanner.next();
			System.out.println(symbol);
			
			if(symbol.equals("quit")) {
				break;
			}
			System.out.println("두번째 입력값 : ");
			int second = scanner.nextInt();
			System.out.println(second);
		
			
			if(symbol.equals("+")) {
				 answer = (answer + second);
			}else if(symbol.equals("-")) {
				 answer = (answer - second);
			}else if(symbol.equals("*")) {
				 answer = (answer * second);
			}else if(symbol.equals("/")){
				 answer = (answer / second);
			}else {
				System.out.println("사칙연산 기호가 아닙니다.");
			}
		}
		
		System.out.println("결과값은 : " + answer);
	}
}
