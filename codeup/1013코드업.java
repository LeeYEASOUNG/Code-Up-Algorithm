import java.util.Scanner;

//정수 2개를 입력받아 그대로 출력
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a= scan.nextInt();
		int b = scan.nextInt();
		System.out.printf("%d %d", a,b);
		//System.out.printf("출력 서식",출력할 내용);
		//printIn은 변수의 값을 그대로 출력하므로, 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
		//printf는 지시자를 통해 변수의 값을 여러 가지 형태로 변환하여 출력할 수 있다.
	}
}

