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
