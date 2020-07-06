package fivePractice;

import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
class StringStack implements Stack{
	private String a[];
	private int k, s = 0, j = -1;
	
	StringStack(int k){
		this.k = k;
		this.a = new String[k];
	}
	public int length() {
		return s;
	}
	public int capacity() {
		return a.length;
	}
	public String pop() {
		j++;
		return a[j];
	}
	public boolean push(String val) {
		if(s < k) {
			a[s] = val;
			s++;
			return true;
		}
		return false;
	}
}
public class StackApp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		StringStack string = new StringStack(sc.nextInt());
		while(true){
			System.out.print("문자열 입력 >>");
			s= sc.next();
			boolean a = string.push(s);
			if(s.equals("그만")) {
				break;
			}
			if(a == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i = 0 ; i < s.length()+1; i++) {
			String c = string.pop();
			System.out.print(c +" ");
		}
	}
}
