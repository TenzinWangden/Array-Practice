package Circle;

public class Circle {
	int diameter;
//	int center;
//	public int diameter() {}
	public static void draw(int radius) {
		int diameter = radius * 2; // store in a sep method 
//		diameter(){}
		int center = radius; // store in a sep method
		for (int i = 0; i <= diameter; i++) {
			for (int j = 0; j <= diameter; j++) {
				int distance = (int) Math.sqrt((i - center) * (i - center) + (j - center) * (j - center));
				if (distance == radius) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
//	int diameter = radius * 2; // store in a sep method 
//	int center = radius; // store in a sep method
}
