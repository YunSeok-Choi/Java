package sixPractice;

public class Circle {
	int x, y, z;
	Circle(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "Circle(" + x + "," + y + ")������ " + z;
	}
	public boolean equals(Circle s) {
		if(s.x == x && s.y == y)
			return true;
		else
		return false;
	}
	public static void main(String args[]) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,50);
		System.out.println("��  a : " + a);
		System.out.println("��  b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
