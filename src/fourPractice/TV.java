package fourPractice;

public class TV {
	String name;
	int year, inch;
	TV(String name, int year, int inch){
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	void show(){
		System.out.println(name + "에서 만든" + year + "년형" + inch + "인치 TV");
	}
	public static void main(String args[]) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
