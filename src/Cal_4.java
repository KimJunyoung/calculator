import java.util.Scanner;

public class Cal_4 {

	public static void main(String[] args) {
		System.out.println("���ڿ� ��ȣ�� ���������� �Է��Ͻÿ�");
		
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int answer = first;
		while(true) {
			
			
			
			System.out.println("��Ģ���� ��ȣ : ");
			String symbol = scanner.next();
			System.out.println(symbol);
			
			if(symbol.equals("quit")) {
				break;
			}
			System.out.println("�ι�° �Է°� : ");
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
				System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�.");
			}
		}
		
		System.out.println("������� : " + answer);
	}
}
