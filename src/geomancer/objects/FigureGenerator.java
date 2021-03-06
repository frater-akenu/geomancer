package geomancer.objects;

import geomancer.objects.charts.ShieldChart;
import geomancer.objects.charts.ThreeFiguresChart;
import geomancer.objects.charts.TwoFiguresChart;
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
    
    public ThreeFiguresChart generateThreeFiguresChart() {
        return new ThreeFiguresChart(generateFig(), generateFig(), generateFig());
    }
    
    public TwoFiguresChart generateTwoFiguresChart() {
        return new TwoFiguresChart(generateFig(), generateFig());
    }
    
    public ShieldChart generateShieldChart() {
        return new ShieldChart(generateFig(), generateFig(), generateFig(), generateFig());
    }
    
    
}
