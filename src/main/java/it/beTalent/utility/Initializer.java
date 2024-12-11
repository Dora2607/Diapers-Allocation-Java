package it.beTalent.utility;

import it.beTalent.entity.Child;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Initializer {

    public static int childrenInitializer(Scanner scan) throws InputMismatchException {
        int number;
        do{
            System.out.println("Inserisci il numero di bambini bisognosi di pannolini: ");
            number = scan.nextInt();
        }while(number<=0);
        return number;
    }

    public static int diapersInitializer(Scanner scan) throws InputMismatchException {
        int number;
        do{
            System.out.println("Inserisci il numero di pannolini disponibili: ");
            number = scan.nextInt();
        }while(number<=0);
        return number;
    }

}
