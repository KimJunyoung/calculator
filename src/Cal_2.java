import java.util.Scanner;

public class Cal_2 {

	public static void main(String[] args) {
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ� : ");
		Scanner input_1 = new Scanner(System.in);
		int first = input_1.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		Scanner input_2 = new Scanner(System.in);
		int second = input_2.nextInt();
		
		System.out.println("���� : " + (first + second));
		System.out.println("���� : " + (first - second));
		System.out.println("���� : " + (first * second));
		System.out.println("������ : " + (first / second));
	}
}
