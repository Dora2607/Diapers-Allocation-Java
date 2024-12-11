package it.beTalent.entity;

public class Diaper {

    private int numberDiaper;

    public static final int completeSupply =7;

    public Diaper(int numberDiaper) {
        this.numberDiaper = numberDiaper;
    }

    public int getNumberDiaper() {
        return numberDiaper;
    }

    public void setNumberDiaper(int numberDiaper) {
        this.numberDiaper = numberDiaper;
    }

    @Override
    public String toString() {
        return "Diaper{" +
                "numberDiaper=" + numberDiaper +
                '}';
    }
}
