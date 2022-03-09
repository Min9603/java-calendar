package min.calendar2;
import java.util.Scanner;

public class Calendar2 {

	public static void main(String[] args) {
//		System.out.println(" ��" + "  " + "��" + "  " + "ȭ" + "  " + "��" + "  " + "��" + "  " + "��" + "  " + "��");
//		System.out.println("-------------------");
//		System.out.println("1 " + " " + "2 " + " " + "3 " + " " + "4 " + " " + "5 " + " " + "6 " + " " + "7 ");
//		System.out.println("8 " + " " + "9 " + " " + "10" + " " + "11" + " " + "12" + " " + "13" + " " + "14");
//		System.out.println("15" + " " + "16" + " " + "17" + " " + "18" + " " + "19" + " " + "20" + " " + "21");
//		System.out.println("22" + " " + "23" + " " + "24" + " " + "25" + " " + "26" + " " + "27" + " " + "28");
// ���������� �� ���Ѱž�
//		System.out.println("일 월  화  수  목  금  토   ");
//		System.out.println("--------------------");
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28"); 

		Scanner scan = new Scanner(System.in);
		System.out.println("궁금하신 달을 입력해주세요:");
		int month = scan.nextInt(); 
		
		if(month>0 && month<13) { 
		int [] Maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d월은 %d까지 입니다.",month,Maxdays[month-1]);
		}
		else {System.out.println("1~12를 입력해주세요");}
		
	}
		
}

