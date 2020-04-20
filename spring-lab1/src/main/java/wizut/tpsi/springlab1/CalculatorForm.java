/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.springlab1;

/**
 *
 * @author naeri
 */

public class CalculatorForm {

    private String opera;
    private Double x;
    private Double y;

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public Double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public Double getWynik() {
        Double temp=0.0;
        switch(opera){
            case "+":
                temp=x+y;
                break;
            case "-":
                temp=x-y;
                break;
            case "*":
                temp=x*y;               
                break;
            case "/":
                temp=x/y;              
                break;
        }
        return temp;
    }
}
