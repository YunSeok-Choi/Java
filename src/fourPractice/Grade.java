package fourPractice;
import java.util.*;
public class Grade {
	int math, science, english;
	Grade(int m, int s, int e){
		math = m;
		science = s;
		english = e;
	}
	int average() {
		return (math + science + english) / 3;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� ���� ������ 3���� ���� �Է�>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("�����" + me.average());
		
		sc.close();
	}
}
