package viteakoni;

/**
 *
 * @author Kristev
 */
public class Rectangle {
    
    public void calculateRectangleSurface(int sideLengthL,int sideWidthL){
        int  surfaceRectangle = sideLengthL * sideWidthL;
        System.out.println("Surface" + " " + surfaceRectangle);
    }
    public void calculateRectanglePerimeter (int sideLengthL, int sideWidthL){
        int perimeterRectangle = (sideLengthL * sideWidthL)* 2;
        System.out.println("Perimeter" + " " + perimeterRectangle);
    }    
}
