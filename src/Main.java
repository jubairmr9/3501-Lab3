import java.util.*;

public class Main extends TestInteger{

    // Randomized version of QuickSort

    public static void rQuickSort(TestInteger[] newArray, int firstValue, int lastValue){

        if (firstValue < lastValue) {
            int anyRandValue = rPartition(newArray, firstValue, lastValue);
            rQuickSort(newArray, firstValue, anyRandValue - 1);
            rQuickSort(newArray, anyRandValue + 1, lastValue);
        }
    }

    public static int rPartition(TestInteger[] rPartitionArray, int firstValue, int lastValue){

        Random rand = new Random();

        int result = rand.nextInt(lastValue-firstValue) + firstValue;

        exchange(result, lastValue, rPartitionArray);
        return partition(rPartitionArray, firstValue, lastValue);
    }

    // The exchange method for int exchanging two elements in an array.

    public static void exchange(int posOne, int posTwo, TestInteger[] newArray){

        //Creating a temporary array to store the value so that I can swap the elements.

        TestInteger temp = newArray[posOne];
        newArray[posOne] = newArray[posTwo];
        newArray[posTwo] = temp;

    }


    public static void main(String[] args) {



    }

}
