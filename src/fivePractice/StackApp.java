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
		
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		StringStack string = new StringStack(sc.nextInt());
		while(true){
			System.out.print("���ڿ� �Է� >>");
			s= sc.next();
			boolean a = string.push(s);
			if(s.equals("�׸�")) {
				break;
			}
			if(a == false) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for(int i = 0 ; i < s.length()+1; i++) {
			String c = string.pop();
			System.out.print(c +" ");
		}
	}
}
