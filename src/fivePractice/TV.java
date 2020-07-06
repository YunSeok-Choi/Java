package fivePractice;
public class TV{
	TV(String add, int size, int color){
		this.add = add;
		this.size = size;
		this.color = color;
	}
	private int size,color;
	private String add;
	
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
	protected int getColor() {return color;}
	protected String getAdd() {return add;}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printproperty();
	}
}
class ColorTV extends TV{
	ColorTV(String add, int size, int color){
		super(add, size,color);
	}
}
class IPTV extends ColorTV{
	IPTV(String add, int size, int color){
		super(add,size,color);
	}
	void printproperty(){
		String c = getAdd();
		int b = getColor();
		int a = getSize();
		System.out.println("나의 IPTV는" + c + "주소의 " + a + "인치 " + b + "컬러");
	}
	
}