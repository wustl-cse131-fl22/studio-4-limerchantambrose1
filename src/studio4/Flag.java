package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
	
		
		double x1 = .25;
		double y1 = .125;
		double halfHeight = .125;
		double halfWidth = .25;
		
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle( x1,  y1, halfWidth, halfHeight);
		
		
		double x2 = .75;
		double y2 = .125;
		
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle( x2,  y2, halfWidth, halfHeight);
		
		
		double x3 = .25;
		double y3 = .375;
		
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle( x3,  y3, halfWidth, halfHeight);
		
		double x4 = .75;
		double y4 = .375;
		
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle( x4,  y4, halfWidth, halfHeight);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(.25, .375, .1);
		
		StdDraw.filledCircle(.75, .125, .1);

		
		
		
		
		StdDraw. setPenRadius(.025);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .25, .5, .25);
	
		
		
		
		
	}
}