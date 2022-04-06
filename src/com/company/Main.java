package com.company;

public class Main {

    public static void main(String[] args) {

        LowArray arr;
        arr = new LowArray(100);
        int nElem = 0;
        int j;

        arr.setElem(0,77);
        arr.setElem(1,99);
        arr.setElem(2,44);
        arr.setElem(3,55);
        arr.setElem(4,22);
        arr.setElem(5,88);
        arr.setElem(6,11);
        arr.setElem(7,0);
        arr.setElem(8,66);
        arr.setElem(9,33);
        nElem = 10;

        //output array
        for (j=0; j<nElem; j++)
            System.out.print(arr.getElem(j)+ " ");
        System.out.println(" ");

        //linear search
        int searchKey = 26;
        for (j=0;j<nElem;j++)
            if (arr.getElem(j)==searchKey)
                break;
        if (j == nElem)
            System.out.println("Can't to find! "+ searchKey);
        else
            System.out.println("Found !");


        //delete element in array
        for (j=0; j<nElem;j++)
            if (arr.getElem(j)==66)
                break;
        for (int k=j; k<nElem-1;k++){
            arr.setElem(k, arr.getElem(k+1));
        }
        nElem--;

        //output data
        for (j=0; j<nElem; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println();
    }
}
