import java.util.Arrays;

// Credits to Ahnaf for taking the time to explain.

public class TestInteger implements Comparable<TestInteger> {

    public int value;
    static long counter;

    public TestInteger() {
    }

    public TestInteger(int initVal) {
        this.value = initVal;
    }

    public static void quickSort(TestInteger[] newArray, int firstValue, int lastValue){

        if (firstValue < lastValue) {
            int anyValue = partition(newArray, firstValue, lastValue);
            quickSort(newArray, firstValue, anyValue - 1);
            quickSort(newArray, anyValue + 1, lastValue);
        }
    }

    public static int partition(TestInteger[] pAarray, int firstValue, int lastValue){

        TestInteger x = pAarray[lastValue];
        int i = firstValue - 1;

        // The next line is basically what the book's pseudocode meant.
        for (int m = firstValue; m < lastValue; m++){

            if(pAarray[m].compareTo(x) <= 0){
                i++;
                exchange(i, m, pAarray);
            }

        }

        exchange(i+1, lastValue, pAarray);

        return i+1;

    }

    // The exchange method for int exchanging two elements in an array.

    public static void exchange(int posOne, int posTwo, TestInteger[] newArray){

        //Creating a temporary array to store the value so that I can swap the elements.

        TestInteger temp = newArray[posOne];
        newArray[posOne] = newArray[posTwo];
        newArray[posTwo] = temp;

    }

    public static void resetCounter() {
        TestInteger.counter = 0;
    }

    public int compareTo(TestInteger valueToCompare) {

        int less = -1;
        int eq = 0;
        int greater = 1;
        counter++;

        if (this.value < valueToCompare.value){
            return less;
        }
        if (this.value == valueToCompare.value){
            return eq;
        }
        else return greater;
    }

    public static boolean isSorted(TestInteger[] newArray){

        for(int i = 1; i < newArray.length; i++){
            if(newArray[i-1].compareTo(newArray[i]) ==1){
                return false;
            }
        }
        return true;
    }

}