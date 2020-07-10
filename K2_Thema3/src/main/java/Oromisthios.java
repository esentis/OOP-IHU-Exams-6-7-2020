/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k2;

/**
 * @author esentis
 */
public class Oromisthios implements Salary {

    private double ores;
    private double oromisthio;

    public Oromisthios(double ores, double oromisthio) {
        this.ores = ores;
        this.oromisthio = oromisthio;
    }

    public double getOres() {
        return ores;
    }

    public void setOres(double ores) throws LathosEisodou {
        if (ores < 1 || ores > 200) {
            throw new LathosEisodou("Obey the rules, ores must be between 1 and 200");
        }
        this.ores = ores;
    }

    public double getOromisthio() {
        return oromisthio;
    }

    public void setOromisthio(double oromisthio) {
        this.oromisthio = oromisthio;
    }

    @Override
    public double salary() {
        return ores * oromisthio;
    }

    @Override
    public String toString() {
        return "Oromisthios{" + "ores=" + ores + ", oromisthio=" + oromisthio + '}';
    }

}
