package geomancer.objects.charts;

import geomancer.objects.Figure;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Akenu
 */
public abstract class BasicChart {
    private Map<String, Figure> figures;

    public Map<String, Figure> getFigures() {
        return figures;
    }

    public void setFigures(Map<String, Figure> figures) {
        this.figures = figures;
    }

    public BasicChart(Map<String, Figure> figures) {
        this.figures = figures;
    }

    public BasicChart() {
    }
    
    

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(String key : figures.keySet()) {
            sb.append(key).append("\n").append(figures.get(key).toString()).append("\n\n");
        }
        
        return sb.toString();
    }
    
    
}
