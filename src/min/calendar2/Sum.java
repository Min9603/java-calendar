package min.calendar2;

import java.util.Scanner;

public class Sum {
	public static void main(String[]args) {
		System.out.println("두 수를 입력하세요.");

	Scanner scan = new Scanner(System.in);
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//	
//		System.out.println(number1+"+"+number2+":"+(number1+number2));
//		
	int a,b;
	Scanner scanner = new Scanner(System.in);
	String s1, s2;
	s1 = scanner.next();
	s2 = scanner.next();
	a = Integer.parseInt(s1);
	b = Integer.parseInt(s2);
	
	System.out.printf("%d와 %d의 합은 %d입니다",a,b, a+b);
	scanner.close();
	
	// s1,s2를 왜 String으로 만든걸까?  그냥 int s1 = scanner.nextint(); 하면 더 쉽지 않나?
	// 굳이 String으로 scanner값을 받고, 그걸 다시 Interger 하는 이유는 뭐지?
	// 
	
	
	}
}
