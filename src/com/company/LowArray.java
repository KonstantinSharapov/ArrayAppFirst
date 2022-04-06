package com.company;

public class LowArray {
    private long[] a;

    public LowArray(int maxSize){
        a = new long[maxSize];
    }

    public void setElem(int index,long value){
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }

}
