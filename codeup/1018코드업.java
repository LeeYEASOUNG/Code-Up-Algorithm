import java.util.Scanner;

//시간 입력받아 그대로 출력하기 
//2번 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] t = sc.next().split(":");
		System.out.printf("%s:%s",t[0], t[1]);
		//%s문자열
		}
}

