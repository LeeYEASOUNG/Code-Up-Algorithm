import java.util.Scanner;


//문자 2개를 입력받아 순서 바꿔 출력하기 char타입과 scanner를 알아보자.
public class Main {
	public static void main(String[] args) {
		
		char x,y; // char 변수 선언;
		Scanner scan = new Scanner(System.in);
		
		x = scan.next().charAt(0); //scan.next()입력,charAt():String으로 저장된 문자열 한 글자만 선택해서 char타입으로 변환
		y = scan.next().charAt(0);
		
		System.out.println(y+" "+x);
		
		//System.out.printf("출력 서식",출력할 내용);
		//printIn은 변수의 값을 그대로 출력하므로, 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
		//printf는 지시자를 통해 변수의 값을 여러 가지 형태로 변환하여 출력할 수 있다.
	}
}

