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
public class MainClass {

    public static void main(String[] args) {
        // We create the array
        ExohikiKatoikia[] katoikies = new ExohikiKatoikia[3];
        // Since the exercise doesnt want user to add the info we create dummy objects
        // DOMATIO (int DomatioTypeId, String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras)
        Domatio doma = new Domatio(1, "Δωματιο", "Χαλκδικη", 10, 23, 2);
        // VILLA (String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras, int PlithosDomation)
        Villa villa = new Villa("Βίλα", "Επανομη", 3, 35, 20, 5);
        // BUNGALOW (String typeName, String Periohi_Poli, int typeID, int NrOfDays, int TimiHmeras, int PlithosDomation)
        Bungalow bung = new Bungalow("Μπανγκαλου", "Αθηνα", 2, 20, 15, 2);

        // Beauty
        katoikies[0] = doma;
        katoikies[1] = villa;
        katoikies[2] = bung;
        for (ExohikiKatoikia katoikia : katoikies) {
            // Adjust the toString in ExohikiKatoikia to style it as you want
            System.out.println(katoikia.toString());
            // And we show the methods of each object
            System.out.println("ENOIKIO TYPE " + katoikia.getEnoikioType());
            System.out.println("ENOIKIO AMOUNT " + katoikia.calcEnoikio());
        }
    }
}
