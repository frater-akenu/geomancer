/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geomancer.objects;

import java.util.Random;

/**
 *
 * @author Akenu
 */
public class FigureGenerator {
    private Random random;

    public Figure generateFig() {
        if(random == null) {
            random = new Random();
        }
        
        int[] values = {random.nextInt(2),random.nextInt(2),random.nextInt(2),random.nextInt(2)};
        Figure figure = new Figure(values[0],values[1],values[2],values[3]);
        
        return figure;
    }
    
    
}