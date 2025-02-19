
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		String frmResult = String.format("%.2f", rc.getPerimeter());// จัดรูป
		System.out.println("Perimeter: " + frmResult);
		System.out.printf("Area: %.2f%n", rc.getArea());
		
		rc.resize(50);
		System.out.println("After resize(50%): " +rc.toString());
		System.out.println("Perimeter: " + frmResult);
		System.out.printf("Area: %.2f", rc.getArea());
	}

}
