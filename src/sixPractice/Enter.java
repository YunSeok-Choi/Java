package sixPractice;

import java.util.*;

public class Enter {
	public static void main(String args[]) {
		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int guitae, jaemun;
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter>키>>");
		sc.nextLine();
		int second = now.get(Calendar.SECOND);
		
		System.out.println("     현재 초 시간 = " + second);
		System.out.print("10초 예상 후 <Enter>키>>");
		sc.nextLine();
		int a = now.get(Calendar.SECOND);
		System.out.println("     현재 초 시간 = " + a);
		guitae = Math.abs(second) - Math.abs(a);
		
		System.out.print("이재문 시작 <Enter>키>>");
		sc.nextLine();
		second = now.get(Calendar.SECOND);
		
		System.out.println("     현재 초 시간 = " + second);
		System.out.print("10초 예상 후 <Enter>키>>");
		sc.nextLine();
		int b = now.get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + b);
		jaemun =  Math.abs(second) - Math.abs(b);
		
		System.out.print("황기태 결과 " + guitae + "이재문 결과 " + jaemun);
		
	}
}