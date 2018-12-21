import java.util.*;

public class QuickSortVariations extends TestInteger{

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

    // QuickSort implemented with insertion sort

    public static void switchInsertionSort(TestInteger[] array){

        semiQuickSort(array, 0, array.length);
        insertionSort(array);
    }

    public static void insertionSort(TestInteger[] iArray){

        for (int j = 1; j < iArray.length; j++){

            TestInteger key = iArray[j];
            int i = j-1;

            while (i >= 0 && iArray[i].compareTo(key) == 1){
                iArray[i+1] = iArray[i];
                i = i-1;
            }
            iArray[i+1] = key;
        }
    }

    public static void semiQuickSort(TestInteger[] array, int start, int end){

        if (end - start < 3){
            int q = partition(array, start, end);
            quickSort(array, start, q-1);
            quickSort(array, q+1, end);
        }
    }

}
