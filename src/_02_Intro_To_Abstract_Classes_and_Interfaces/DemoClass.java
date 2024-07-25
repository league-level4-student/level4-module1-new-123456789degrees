package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class DemoClass extends AbstractClassDemo implements InterfaceDemo, DemoInterface{

	@Override
	public void abstractDemo() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public int abstractNumDemo() {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public String faceDemo() {
		// TODO Auto-generated method stub
		return "facedemo";
	}

	@Override
	public double interDemo() {
		// TODO Auto-generated method stub
		return 4.2;
	}
	public static void main(String[] args) {
		DemoClass c = new DemoClass();
		c.demo();
		c.abstractDemo();
		System.out.println(c.abstractNumDemo());
		System.out.println(c.faceDemo());
		System.out.println(c.interDemo());
	}
}
