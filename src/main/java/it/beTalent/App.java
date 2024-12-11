package it.beTalent;


import it.beTalent.entity.Child;
import it.beTalent.entity.Diaper;
import it.beTalent.utility.DiapersManagement;
import it.beTalent.utility.Initializer;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        LinkedList<Diaper> diapers = new LinkedList<Diaper>();
        LinkedList<Child> children = new LinkedList<Child>();

        //Inizializzo la lista di bambini
        int counterOne=0;
        try{
           int childrenNumber =  Initializer.childrenInitializer(scan);
           while (counterOne<childrenNumber){
               Child child = new Child(counterOne);
               children.addLast(child);
               counterOne++;
           }
        }catch(InputMismatchException e) {
            System.out.println("Input non valido. Inserisci un numero: ");
            scan.next();
        }

        //if di controllo da cancellare
        if(!children.isEmpty()){
            System.out.println("Nella lista ci sono:"+children.size());

        }


        //Inizializzo la lista di pannolini (l'indice parte da zero per non avere problemi di conti quando assegno i pannolini)
        int counterTwo=1;
        try{
            int diapersNumber =  Initializer.diapersInitializer(scan);
            while(counterTwo<=diapersNumber){
                Diaper diaper = new Diaper(counterTwo);
                diapers.addLast(diaper);
                counterTwo++;
            }
        }catch(InputMismatchException e) {
            System.out.println("Input non valido. Inserisci un numero: ");
            scan.next();
        }

        //If di controllo da cancellare
        if(!diapers.isEmpty()){
            System.out.println("Nella lista ci sono:"+diapers.size());

        }

        DiapersManagement.managementDiapers(children,diapers);

    }
}
