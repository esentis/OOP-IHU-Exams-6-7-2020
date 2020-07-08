/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thema3;

/**
 *
 * @author esentis
 */
abstract class ExohikiKatoikia {

    String typeName;
    String Periohi_Poli;
    int typeID;
    int NrOfDays;
    int TimiHmeras;

    public abstract String getEnoikioType();

    public abstract double calcEnoikio();

    public ExohikiKatoikia(String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras) {
        this.typeName = typeName;
        this.Periohi_Poli = Periohi_Poli;
        this.typeID = typeID;
        this.NrOfDays = NrOfDays;
        this.TimiHmeras = TimiHmeras;
    }

    @Override
    public String toString() {
        return "ExohikiKatoikia{" + "typeName=" + typeName + ", Periohi_Poli=" + Periohi_Poli + ", typeID=" + typeID + ", NrOfDays=" + NrOfDays + ", TimiHmeras=" + TimiHmeras + '}';
    }

}
