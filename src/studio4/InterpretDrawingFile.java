package studio4;

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
		
		String shape = in.next();  
		//System.out.print(shape);
		
		int red = in.nextInt(); 
		//System.out.print(red);
		
		int green = in.nextInt(); 
		//System.out.print(green);
		
		int blue = in.nextInt(); 
		//System.out.print(blue);
		
		boolean isFilled= in.nextBoolean(); 
		
		double x = in.nextDouble(); 
		double y = in.nextDouble(); 
		double halfW = in.nextDouble(); 
		double halfH = in.nextDouble(); 
		
		StdDraw.setPenColor(red, green, blue);
		if (shape.equals("ellipse")) {
			if (!isFilled)
			{
				StdDraw.ellipse( x,  y, halfW, halfH);
			}else {
				StdDraw.filledEllipse( x,  y, halfW, halfH);
			}
		}
		else if (shape.equals("rectangle")) {
			if (!isFilled)
			{
				StdDraw.rectangle( x,  y, halfW, halfH);
			}else {
				StdDraw.filledRectangle( x,  y, halfW, halfH);
			}
		}
		
		
		
		
		
		
	}
}
