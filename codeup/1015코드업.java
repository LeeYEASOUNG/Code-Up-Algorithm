import java.util.Scanner;

//실수 입력받아 둘째 자리까지 출력하기 
public class Main {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		//1. scanner 클래스의 인스턴스 'scan'을 생성
		//2. 'System.in'을 매개변수로 전달하여 사용자로부터 입력받는 기능
		float i = scan.nextFloat();
		//3. nextFloat()메서드를 사용하여 사용자로부터 입력받은 실수값을 읽어와 
		//변수 i에 읽어옴.
		String num = String.format("%.2f",i);
		//i라는 변수를 (2f)소수점 2자리까지 반올림하여 출력한다고 변수 num에 저장
	
		System.out.println(num);
		
		//System.out.printf("출력 서식",출력할 내용);
		//printIn은 변수의 값을 그대로 출력하므로, 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
		//printf는 지시자를 통해 변수의 값을 여러 가지 형태로 변환하여 출력할 수 있다.
	}
}

