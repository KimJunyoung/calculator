import java.util.Scanner;

public class Cal_2 {

	public static void main(String[] args) {
		System.out.println("Ã¹¹øÂ° ¼ıÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		Scanner input_1 = new Scanner(System.in);
		int first = input_1.nextInt();
		
		System.out.println("µÎ¹øÂ° ¼ıÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		Scanner input_2 = new Scanner(System.in);
		int second = input_2.nextInt();
		
		System.out.println("µ¡¼À : " + (first + second));
		System.out.println("»¬¼À : " + (first - second));
		System.out.println("°ö¼À : " + (first * second));
		System.out.println("³ª´°¼À : " + (first / second));
	}
}
