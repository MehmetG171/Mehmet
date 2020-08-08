package PackageChapter03;

import java.util.Scanner;

public class C0334 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: point on line segment");
		System.out.println("Enter the x and y coordinates of point p0:");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		System.out.println("Enter the x and y coordinates of point p1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter the x and y coordinates of point p2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		if (((0 == position) && (x0 <= x2) && (x2 <= x1) && (y0 <= y2) && (y2 <= y1))
				|| ((0 == position) && (x0 <= x2) && (x2 <= x1) && (y1 <= y2) && (y2 <= y0))
				|| ((0 == position) && (x1 <= x2) && (x2 <= x0) && (y0 <= y2) && (y2 <= y1))
				|| ((0 == position) && (x1 <= x2) && (x2 <= x0) && (y1 <= y2) && (y2 <= y0))) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from " + "(" + x0 + ", " + y0 + ") to "
					+ "(" + x1 + ", " + y1 + ")");
		} else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from " + "(" + x0 + ", " + y0
					+ ") to " + "(" + x1 + ", " + y1 + ")");
		}

		input.close();
	}

}
