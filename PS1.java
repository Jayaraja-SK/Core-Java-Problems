import java.util.*;

class Box {
	private int l,b;

	public Box(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public void setL(int l) {
		this.l = l;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int area() {
		return l*b;
	}

}

class Box3d extends Box {
	private int h;

	public Box3d(int l, int b, int h) {
		super(l,b);

		this.h = h;
	}

	public void setL(int l) {
		super.setL(l);
	}

	public void setB(int b) {
		super.setB(b);
	}

	public void setH(int h) {
		this.h = h;
	}

	public int volume() {
		return super.area()*h;
	}
}


public class PS1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER L = ");
		int l = sc.nextInt();
		System.out.println();

		System.out.print("ENTER B = ");
		int b = sc.nextInt();
		System.out.println();

		System.out.print("ENTER H = ");
		int h = sc.nextInt();
		System.out.println();

		Box box = new Box(l,b);
		Box3d box3d = new Box3d(l,b,h);

		System.out.println("AREA = " + box.area());
		System.out.println("VOLUME = " + box3d.volume());

	}
}