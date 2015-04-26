package geomancer.objects.charts;

import geomancer.objects.Figure;
import java.util.LinkedHashMap;

/**
 *
 * @author Akenu
 */
public class ShieldChart extends BasicChart {

    public ShieldChart(Figure mother1, Figure mother2, Figure mother3, Figure mother4) {
        if(this.getFigures() == null) {
            this.setFigures(new LinkedHashMap<>());
        }
        
        
        //Storing mothers
        this.getFigures().put("Mother 1", mother1);
        this.getFigures().put("Mother 2", mother2);
        this.getFigures().put("Mother 3", mother3);
        this.getFigures().put("Mother 4", mother4);
        
        //calculating daughters
        Figure daughter1 = new Figure(mother1.getHead(), mother2.getHead(), mother3.getHead(), mother4.getHead());
        Figure daughter2 = new Figure(mother1.getNeck(), mother2.getNeck(), mother3.getNeck(), mother4.getNeck());
        Figure daughter3 = new Figure(mother1.getBody(), mother2.getBody(), mother3.getBody(), mother4.getBody());
        Figure daughter4 = new Figure(mother1.getFeet(), mother2.getFeet(), mother3.getFeet(), mother4.getFeet());
        
        //storing daughters
        this.getFigures().put("Daughter 1", daughter1);
        this.getFigures().put("Daughter 2", daughter2);
        this.getFigures().put("Daughter 3", daughter3);
        this.getFigures().put("Daughter 4", daughter4);
        
        //calculating nieces
        Figure niece1 = mother1.combine(mother2);
        Figure niece2 = mother3.combine(mother4);
        Figure niece3 = daughter1.combine(daughter2);
        Figure niece4 = daughter3.combine(daughter4);
        
        //storing nieces
        this.getFigures().put("Niece 1", niece1);
        this.getFigures().put("Niece 2", niece2);
        this.getFigures().put("Niece 3", niece3);
        this.getFigures().put("Niece 4", niece4);
        
        //calculating witnesses
        Figure witness1 = niece1.combine(niece2);
        Figure witness2 = niece3.combine(niece4);
        
        //storing witnesses
        this.getFigures().put("Witness 1", witness1);
        this.getFigures().put("Witness 2", witness2);
        
        //calculating and storing the judge
        Figure judge = witness1.combine(witness2);
        
        this.getFigures().put("Judge", judge);
        
        //calculating and storing the reconciler
        Figure reconciler = mother1.combine(judge);
        
        this.getFigures().put("Reconciler", reconciler);
    }
    
}
