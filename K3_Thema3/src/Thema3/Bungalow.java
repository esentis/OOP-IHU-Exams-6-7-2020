/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thema3;

/**
 * @author esentis
 */
public class Bungalow extends ExohikiKatoikia {

    private int PlithosDomation;

    public Bungalow(String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras, int PlithosDomation) {
        super(typeName, Periohi_Poli, typeID, NrOfDays, TimiHmeras);
        this.PlithosDomation = PlithosDomation;
    }

    @Override
    public String getEnoikioType() {
        return "week";
    }

    @Override
    public double calcEnoikio() {
        return (super.NrOfDays * super.TimiHmeras) - (super.NrOfDays * super.TimiHmeras) * 0.1;
    }

    public int getPlithosDomation() {
        return PlithosDomation;
    }

    public void setPlithosDomation(int PlithosDomation) {
        this.PlithosDomation = PlithosDomation;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPeriohi_Poli() {
        return Periohi_Poli;
    }

    public void setPeriohi_Poli(String Periohi_Poli) {
        this.Periohi_Poli = Periohi_Poli;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getNrOfDays() {
        return NrOfDays;
    }

    public void setNrOfDays(int NrOfDays) {
        if (NrOfDays <= 7) {
            throw new WrongRentPeriodException("Obey the rules,the rent days should be more than 7 days");
        }
        this.NrOfDays = NrOfDays;
    }

    public int getTimiHmeras() {
        return TimiHmeras;
    }

    public void setTimiHmeras(int TimiHmeras) {
        this.TimiHmeras = TimiHmeras;
    }

}
