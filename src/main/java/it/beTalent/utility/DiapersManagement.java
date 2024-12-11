package it.beTalent.utility;

import it.beTalent.entity.Child;
import it.beTalent.entity.Diaper;

import java.util.LinkedList;

import static it.beTalent.entity.Diaper.completeSupply;

public class DiapersManagement {

    public static void managementDiapers(LinkedList<Child> childrenList, LinkedList<Diaper> diapersList) {
        int count = 0;
        while (!diapersList.isEmpty()) {
            int restOfSupply = diapersList.size();
            if (restOfSupply >= completeSupply ) {

                while (count < completeSupply ) {
                    childrenList.getFirst().setNumberDiaper(diapersList.getFirst().getNumberDiaper());
                    diapersList.removeFirst();
                    count++;
                }
                count = 0; //resetto il count a 0
                childrenList.getFirst().incrementSupplyCounter();
                System.out.println("Il bambino numero " + childrenList.getFirst().getChildNumber() + " ha ottenuto un numero di fornitura completa di sette pannolini, pari a: " + childrenList.getFirst().getSupplyCounter());
                childrenList.addLast(childrenList.removeFirst());
                ;

            } else {
                for (int i = 0; i < restOfSupply; i++) {
                    childrenList.getFirst().setNumberDiaper(diapersList.getFirst().getNumberDiaper());
                    diapersList.removeFirst();
                }
                System.out.println("Il bambino numero " + childrenList.getFirst().getChildNumber() + " ha ricevuto " + restOfSupply + " pannolini, oltre a una fornitura pari a: " + childrenList.getFirst().getSupplyCounter());
            }
        }
    }
}



