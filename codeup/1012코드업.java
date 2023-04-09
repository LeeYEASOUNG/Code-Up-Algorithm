import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float i = scan.nextFloat(); //실수를 찍어준다.
		String num = String.format("%.6f", i); //i라는 변수를 (6f)소수점 6자리까지 출력한다.
		System.out.println(num);

	}
}

