/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k2;

/**
 *
 * @author esentis
 */
public class Symvasiouhos implements Salary {
    
    // Who knows why days are double...maybe he worked for 2.653 days..
    private double meres;
    private double hmeromisthio;

    public Symvasiouhos(double meres, double hmeromisthio) {
        this.meres = meres;
        this.hmeromisthio = hmeromisthio;
    }

    public double getMeres() {
        return meres;
    }

    public void setMeres(double meres) throws LathosEisodou{
        if (meres < 1 || meres > 25) {
            throw new LathosEisodou("Obey the rules, meres must be between 1 and 25");
        }
        this.meres = meres;

    }

    public double getHmeromisthio() {
        return hmeromisthio;
    }

    public void setHmeromisthio(double hmeromisthio) {
        this.hmeromisthio = hmeromisthio;
    }

    @Override
    public double salary() {
        return meres * hmeromisthio;
    }

    @Override
    public String toString() {
        return "Symvasiouhos{" + "meres=" + meres + ", hmeromisthio=" + hmeromisthio + '}';
    }

}
