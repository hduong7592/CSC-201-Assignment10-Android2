package edu.vccs.hduong7592.csc_201_assignment10_android;

/**
 * Created by hieuduong on 10/7/17.
 */

public class MyInteger {
    private int value;

    public MyInteger(int Input){
        this.value = Input;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        if((this.value%2) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOdd(){
        if((this.value%2) > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPrime(){
        int divider = 0, flag = 0;
        divider = this.value/2;
        for(int i=2;i<=divider;i++){
            if((this.value)%i == 0){
                //Not a prime number
                flag = 1;
            }
        }
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isEven(int Input){
        if((Input%2) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isOdd(int Input){
        if((Input%2) > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPrime(int Input){
        int divider = 0, flag = 0;
        divider = Input/2;
        for(int i=2;i<=divider;i++){
            if((Input)%i == 0){
                //Not a prime number
                flag = 1;
            }
        }
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isEven(MyInteger myInt){
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt){
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt){
        return myInt.isPrime();
    }

    public boolean equals(int Input){
        if(this.value == Input){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(MyInteger myInt){
        if(this.value == myInt.value){
            return true;
        }
        else{
            return false;
        }
    }

    public static int parseInt(char[] array) {
        int sum = 0;
        for (char i : array) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
