package sixPractice;

import java.util.*;

public class Enter {
	public static void main(String args[]) {
		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int guitae, jaemun;
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ���� <Enter>Ű>>");
		sc.nextLine();
		int second = now.get(Calendar.SECOND);
		
		System.out.println("     ���� �� �ð� = " + second);
		System.out.print("10�� ���� �� <Enter>Ű>>");
		sc.nextLine();
		int a = now.get(Calendar.SECOND);
		System.out.println("     ���� �� �ð� = " + a);
		guitae = Math.abs(second) - Math.abs(a);
		
		System.out.print("���繮 ���� <Enter>Ű>>");
		sc.nextLine();
		second = now.get(Calendar.SECOND);
		
		System.out.println("     ���� �� �ð� = " + second);
		System.out.print("10�� ���� �� <Enter>Ű>>");
		sc.nextLine();
		int b = now.get(Calendar.SECOND);
		System.out.println("���� �� �ð� = " + b);
		jaemun =  Math.abs(second) - Math.abs(b);
		
		System.out.print("Ȳ���� ��� " + guitae + "���繮 ��� " + jaemun);
		
	}
}