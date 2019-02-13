package viteakoni;

/**
 *
 * @author Kristev
 */
public class Triangle {
    
     public void calculateTrianglePerimetr (int sideA, int sideB, int sideC){
        int perimeterTriangle = sideA + sideB + sideC;
        System.out.println("Perimeter" + " " + perimeterTriangle);
    }
    
    public void calculateTriangleSurface (int sideA, int sideHT){
        int surfaceTriangle = (sideA * sideHT) / 2;
        System.out.println("Surface" + " " + surfaceTriangle);
       
    }
    
}
