package fivePractice;

interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
public class Circle implements Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	@Override
	public double getArea() {
		return radius * radius * PI;
	}
	public static void main(String args[]) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
