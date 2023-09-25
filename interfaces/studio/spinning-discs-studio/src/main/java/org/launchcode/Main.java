package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD myCd = new CD("My CD", 700);
        DVD myDvd = new DVD("My DVD", 4700);

        myCd.spinDisc();
        myCd.storeData();
        myCd.writeData();
        myCd.readData();
        myCd.reportInformation();

        myDvd.spinDisc();
        myDvd.storeData();
        myDvd.writeData();
        myDvd.readData();
        myDvd.reportInformation();
    }
}