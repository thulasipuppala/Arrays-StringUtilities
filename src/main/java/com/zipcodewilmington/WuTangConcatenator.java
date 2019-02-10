package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private final int num;

    public WuTangConcatenator(int n) {
        this.num = n;
    }

    public boolean isWu(){
        if(num % 3 == 0)
            return true;
        else
            return false;
    }

    public boolean isTang(){
        if(num % 5 == 0)
            return true;
        return false;
    }

    public boolean isWuTang(){
        if(num % 5 == 0 && num % 3 == 0)
            return true;
        return false;
    }
}
