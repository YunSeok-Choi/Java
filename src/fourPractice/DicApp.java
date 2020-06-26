package fourPractice;

import java.util.Scanner;

class Dictionary{
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "babby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		for(int i = 0 ; i < kor.length; i++) {
			if(word.equals(kor[i]))
				return word + "�� " + eng[i];
		}
		return word + "�� ���� ������ �����ϴ�.";
	}
}
public class DicApp {
	public static void main(String args[]) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc = new Scanner(System.in);
		String word;
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			word = sc.next();
			if(word.equals("�׸�"))
				break;
			String eng = Dictionary.kor2Eng(word);
			System.out.println(eng);
		}
		sc.close();
	}
}
