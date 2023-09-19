package org.launchcode;

public  class DVD extends BaseDisc implements OpticalDisc {
    private final int spinSpeed;

    public DVD(String name, int capacity){
        super(name,capacity,"DVD");
        this.spinSpeed = 570;
    }
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of " + spinSpeed + " - 1600 rpm.");
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
