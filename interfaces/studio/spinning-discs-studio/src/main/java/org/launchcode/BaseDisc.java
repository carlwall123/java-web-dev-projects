package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int capacity;
    private String contents;
    private String discType;

    public BaseDisc(String name, int capacity, String discType){
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }
    public abstract void spinDisc();
}
