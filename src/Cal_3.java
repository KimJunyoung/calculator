import java.util.Scanner;

public class Cal_3 {
	
	public static void main(String[] args) {
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ� : ");
		Scanner input_1 = new Scanner(System.in);
		int first = input_1.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		Scanner input_2 = new Scanner(System.in);
		int second = input_2.nextInt();
		
		System.out.println("���ϴ� ��Ģ���긦 �Է��Ͻÿ� : ");
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
			System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�.");
		}
		
		
		System.out.println("������� : " + answer);
		
		
	}
}
