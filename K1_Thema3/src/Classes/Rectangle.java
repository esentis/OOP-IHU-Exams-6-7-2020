/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * @author esentis
 */
public class Rectangle implements Shape {

    private double vasi;
    private double ipsos;

    public Rectangle(double vasi, double ipsos) {
        this.vasi = vasi;
        this.ipsos = ipsos;
    }

    @Override
    public double area() {
        return vasi * ipsos;
    }

    public double getVasi() {
        return vasi;
    }

    public void setVasi(double vasi){
        if (vasi < 10 || vasi > 50) {
            throw new WrongDimensionsException("Wrong Dimensions");
        }
        this.vasi = vasi;
    }

    public double getIpsos() {
        return ipsos;
    }

    public void setIpsos(double ipsos) throws WrongDimensionsException {
        try {
            if (ipsos > 10 || ipsos < 50) {
                this.ipsos = vasi;
            } else {
                throw new WrongDimensionsException("Wrong Dimensions");
            }
        } catch (WrongDimensionsException errMsg) {
            // We print the error message
            System.out.println(errMsg.getMessage());
        }
    }

    @Override
    public String toString() {
        return "A beautiful Rectangle with base " + vasi + ", height " + ipsos + " and area " + area();
    }

}
