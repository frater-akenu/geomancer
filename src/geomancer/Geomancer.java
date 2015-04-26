package geomancer;

import geomancer.objects.FigureGenerator;

/**
 *
 * @author Akenu
 */
public class Geomancer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FigureGenerator figureGenerator = new FigureGenerator();
        System.out.println(figureGenerator.generateShieldChart());
    }
    
}
