package fourPractice;

import java.util.Scanner;

class Dictionary{
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "babby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		for(int i = 0 ; i < kor.length; i++) {
			if(word.equals(kor[i]))
				return word + "은 " + eng[i];
		}
		return word + "는 저희 사전에 없습니다.";
	}
}
public class DicApp {
	public static void main(String args[]) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		String word;
		
		while(true) {
			System.out.print("한글 단어?");
			word = sc.next();
			if(word.equals("그만"))
				break;
			String eng = Dictionary.kor2Eng(word);
			System.out.println(eng);
		}
		sc.close();
	}
}
