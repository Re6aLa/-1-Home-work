package viteakoni;

/**
 *
 * @author Kristev
 */
public class Rhombus {
    
    public void calculateRhombusPerimeter(int sideLong){
        int perimeterRhombus = sideLong * 4;
        System.out.println("Perimeter" + " " + perimeterRhombus);
    }
    public void calculateRhombusSurface(int sideLong, int sideH ){
        int surfaceRhombus = sideLong * sideH;
        System.out.println("Surface" + " " + surfaceRhombus);
    }
}
