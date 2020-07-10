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
public class Domatio extends ExohikiKatoikia{
    
    private int DomatioTypeId;

    public Domatio(int DomatioTypeId, String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras) {
        super(typeName, Periohi_Poli, typeID, NrOfDays, TimiHmeras);
        this.DomatioTypeId = DomatioTypeId;
    }
    
    

    @Override
    public String getEnoikioType() {
       return "day";
    }

    @Override
    public double calcEnoikio() {
        return (super.NrOfDays*super.TimiHmeras);
    }

    public int getDomatioTypeId() {
        return DomatioTypeId;
    }

    public void setDomatioTypeId(int DomatioTypeId) {
        this.DomatioTypeId = DomatioTypeId;
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
        this.NrOfDays = NrOfDays;
    }

    public int getTimiHmeras() {
        return TimiHmeras;
    }

    public void setTimiHmeras(int TimiHmeras) {
        this.TimiHmeras = TimiHmeras;
    }
    
}
