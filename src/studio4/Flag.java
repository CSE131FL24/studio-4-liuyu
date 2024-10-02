package studio4;
import java.awt.Color;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
		Color green = new Color(40, 102, 65);
		StdDraw.setPenColor(green);
		StdDraw.filledRectangle(0.3, 0.5, 0.1,0.2);
		Color red = new Color(181, 62, 63);
		StdDraw.setPenColor(red);
		StdDraw.filledRectangle(0.7, 0.5, 0.1, 0.2);
		
	}
}