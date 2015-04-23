/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geomancer.objects;

/**
 *
 * @author Akenu
 */
public class Figure {
    private int head;
    private int neck;
    private int body;
    private int feet;

    public Figure combine(Figure figure) {
        int newhead = head + figure.getHead();
        int newneck = neck + figure.getNeck();
        int newbody = body + figure.getBody();
        int newfeet = body + figure.getFeet();
        
        return new Figure(newhead, newneck, newbody, newfeet);
    }
    
    
    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getNeck() {
        return neck;
    }

    public void setNeck(int neck) {
        this.neck = neck;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public Figure(int head, int neck, int body, int feet) {
        this.head = head;
        this.neck = neck;
        this.body = body;
        this.feet = feet;
    }

    private String numberToLine(int figureLine) {
        if (figureLine % 2 == 0) {
            return ". .";
        } else {
            return " . ";
        }
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(numberToLine(head)).append("\n");
        sb.append(numberToLine(neck)).append("\n");
        sb.append(numberToLine(body)).append("\n");
        sb.append(numberToLine(feet));
        
        return sb.toString();
    }
    
    
}
