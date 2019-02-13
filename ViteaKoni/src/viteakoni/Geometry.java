package viteakoni;

/**
 * This is a class contains geometry operations.
 *
 * @author Kristev
 */
public class Geometry {

    public void calculateSquarePerimeter(int sideLength) {
        int perimeterSquare = sideLength * 4;
        System.out.println("Perimeter" + " " + perimeterSquare);
    }

    public void calculateSquareSurface(int sideLength) {
        int surfaceSquare = sideLength * 2;
        System.out.println("Surface:" + " " + surfaceSquare);
        
   }    
}