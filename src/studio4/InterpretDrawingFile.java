package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent= in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent=in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double halfWidth  = in.nextDouble();
		double halfHeight = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		
		Color purple = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(purple); 
		
		if (shapeType.equals("rectangle")){
			if (isFilled) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, halfWidth, halfHeight);
			} else {
				StdDraw.rectangle( parameterOne,  parameterTwo,  halfWidth,  halfHeight); 
			}
		}
		else if (shapeType.equals("ellipse")){
	    if (isFilled) {
	        StdDraw.filledEllipse(parameterOne,  parameterTwo,  halfWidth,  halfHeight);
	    } else {
	        StdDraw.ellipse(parameterOne,  parameterTwo,  halfWidth,  halfHeight);
	    }
		}
		else if (shapeType.equals("triangle")){
	    double[] x= {parameterOne,  halfWidth,  parameterThree  };
    	double[] y= {parameterTwo, halfHeight ,  parameterFour  };
	    if (isFilled) {
	    	
	        StdDraw.filledPolygon(x,y);
	    } else {
	        StdDraw.polygon(x,y);
	    }
	    
		} 
}
}
