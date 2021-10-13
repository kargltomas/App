package com.company;

public class Main {

    public static void main(String[] args) {

        int[]array ={1, 2, 3, 4, 5};
        System.out.println(halfInterval(3,array));
        System.out.println(BM(2,1));

    }

    public static int halfInterval(int number, int[] array) {

        return halfInterval(number,array, 0, array.length);
    }

    private static int halfInterval(int number, int[] array, int startIndex, int endIndex) {
        int middleIndex = (startIndex + endIndex) / 2;

        if (array[middleIndex] == number) {
            return middleIndex;
        }
        else if (array[middleIndex] < number) {
            return halfInterval(number, array, middleIndex,endIndex);
        }
        else if(array[middleIndex] > number) {
            return halfInterval(number,array,startIndex,middleIndex);
        }
        return -1;
    }

    public static double BM(int index, double num){

        if (index==0){
            return num/2;
        }

        double xn = BM(index -1,num);
        return (xn + num/xn)/2;

    }
}


