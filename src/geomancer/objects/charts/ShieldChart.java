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
        Figure niece1 = new Figure(mother1.getHead() + mother2.getHead(),
                mother1.getNeck() + mother2.getNeck(),
                mother1.getBody() + mother2.getBody(),
                mother1.getFeet() + mother2.getFeet());
        Figure niece2 = new Figure(mother3.getHead() + mother4.getHead(),
                mother3.getNeck() + mother4.getNeck(),
                mother3.getBody() + mother4.getBody(),
                mother3.getFeet() + mother4.getFeet());
        Figure niece3 = new Figure(daughter1.getHead() + daughter2.getHead(),
                daughter1.getNeck() + daughter2.getNeck(),
                daughter1.getBody() + daughter2.getBody(),
                daughter1.getFeet() + daughter2.getFeet());
        Figure niece4 = new Figure(daughter3.getHead() + daughter4.getHead(),
                daughter3.getNeck() + daughter4.getNeck(),
                daughter3.getBody() + daughter4.getBody(),
                daughter3.getFeet() + daughter4.getFeet());
        
        //storing nieces
        this.getFigures().put("Niece 1", niece1);
        this.getFigures().put("Niece 2", niece2);
        this.getFigures().put("Niece 3", niece3);
        this.getFigures().put("Niece 4", niece4);
        
        //calculating witnesses
        Figure witness1 = new Figure(niece1.getHead() + niece2.getHead(),
                niece1.getNeck() + niece2.getNeck(),
                niece1.getBody() + niece2.getBody(),
                niece1.getFeet() + niece2.getFeet());
        Figure witness2 = new Figure(niece3.getHead() + niece4.getHead(),
                niece3.getNeck() + niece4.getNeck(),
                niece3.getBody() + niece4.getBody(),
                niece3.getFeet() + niece4.getFeet());
        
        //storing witnesses
        this.getFigures().put("Witness 1", witness1);
        this.getFigures().put("Witness 2", witness2);
        
        //calculating and storing the judge
        Figure judge = new Figure(witness1.getHead() + witness2.getHead(),
                witness1.getNeck() + witness2.getNeck(),
                witness1.getBody() + witness2.getBody(),
                witness1.getFeet() + witness2.getFeet());
        
        this.getFigures().put("Judge", judge);
        
        //calculating and storing the reconciler
        Figure reconciler = new Figure(mother1.getHead() + judge.getHead(),
                mother1.getNeck() + judge.getNeck(),
                mother1.getBody() + judge.getBody(),
                mother1.getFeet() + judge.getFeet());
        
        this.getFigures().put("Reconciler", reconciler);
    }
    
}
