import java.util.Scanner;

//int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//1. scanner 클래스의 인스턴스 'scan'을 생성
		//2. 'System.in'을 매개변수로 전달하여 사용자로부터 입력받는 기능
		int a = scan.nextInt();
		
		System.out.printf("%d %d %d", a, a, a);
		
		//System.out.printf("출력 서식",출력할 내용);
		//printIn은 변수의 값을 그대로 출력하므로, 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
		//printf는 지시자를 통해 변수의 값을 여러 가지 형태로 변환하여 출력할 수 있다.
	}
}

