package it.beTalent.entity;

public class Child {

    private int childNumber;

    private Integer numberDiaper=null;

    private int supplyCounter = 0;

    public Child(int childNumber) {
        this.childNumber = childNumber;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(int childNumber) {
        this.childNumber = childNumber;
    }



    public Integer getNumberDiaper() {
        return numberDiaper;
    }

    public void setNumberDiaper(Integer numberDiaper) {
        this.numberDiaper = numberDiaper;
    }


    public int getSupplyCounter() {
        return supplyCounter;
    }

    public void setSupplyCounter(int supplyCounter) {
        this.supplyCounter = supplyCounter;
    }
    public void incrementSupplyCounter() {
        supplyCounter++;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childNumber=" + childNumber +
                ", numberDiaper=" + numberDiaper +
                ", supplyCounter=" + supplyCounter +
                '}';
    }
}



