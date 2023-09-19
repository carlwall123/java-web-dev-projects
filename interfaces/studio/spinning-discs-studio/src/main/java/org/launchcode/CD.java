package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    private final int spinSpeed;

    public CD(String name, int capacity){
        super(name,capacity,"CD");
        this.spinSpeed = 200;
    }
    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of " + spinSpeed + " - 500 rpm");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void reportInformation() {

    }
}
