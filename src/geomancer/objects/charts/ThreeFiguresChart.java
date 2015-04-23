/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geomancer.objects.charts;

import geomancer.objects.Figure;
import java.util.LinkedHashMap;

/**
 *
 * @author Akenu
 */
public class ThreeFiguresChart extends BasicChart {

    public ThreeFiguresChart(Figure past, Figure present, Figure future) {
        this.setFigures(new LinkedHashMap<>());
        
        this.getFigures().put("Past", past);
        this.getFigures().put("Present", present);
        this.getFigures().put("Future", future);
    }
    
}
