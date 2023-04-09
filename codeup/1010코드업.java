import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.scanner 클래스의 인스턴스 'scan'을 생성한다. - 
		//scanner : 키보드로 입력받기 위한 클래스
		//2. 'System.in'을 매개변수로 전달하여 사용자로부터 입력받는 기능 
		int n = scan.nextInt();
		//3.nextInt()메서드를 사용하여 사용자로부터 입력받은 정수값을 읽어봐
		//변수 'n'에 저장함.
		System.out.println(n);
		//4.System.out.printIn()메서드를 사용하여 변수 n에 저장된 값을 콘솔에 출력함.
		
	}

}
