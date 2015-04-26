package geomancer.objects.charts;

import geomancer.objects.Figure;
import java.util.LinkedHashMap;

/**
 *
 * @author Akenu
 */
public class TwoFiguresChart extends BasicChart {

    public TwoFiguresChart(Figure positive, Figure negative) {
        this.setFigures(new LinkedHashMap<>());
        
        this.getFigures().put("Negative aspect", negative);
        this.getFigures().put("Positive aspect", positive);
    }
    
    
    
    
    
}
