package min.calendar2;
import java.util.Scanner;

public class Calendar2 {
	public static void main(String[] args) {
		System.out.println("일 월  화  수  목  금  토   ");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28"); 

		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력해주세요");
		int month = scan.nextInt();
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("%d월%d일까지 있습니다.\n", month,maxDays[month-1]);
		
		scan.close();
		
	}
		
}

