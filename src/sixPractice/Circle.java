package sixPractice;

public class Circle {
	int x, y, z;
	Circle(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름 " + z;
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
		System.out.println("원  a : " + a);
		System.out.println("원  b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
