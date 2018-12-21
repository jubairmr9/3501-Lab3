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

    // Randomized QuickSort Helper Functions

    public static int rPartition(TestInteger[] rPartitionArray, int firstValue, int lastValue){

        Random rand = new Random();

        int result = rand.nextInt(lastValue-firstValue) + firstValue;

        exchange(result, lastValue, rPartitionArray);
        return partition(rPartitionArray, firstValue, lastValue);
    }

    public static void exchange(int posOne, int posTwo, TestInteger[] newArray){

        TestInteger temp = newArray[posOne];
        newArray[posOne] = newArray[posTwo];
        newArray[posTwo] = temp;

    }

    // QuickSort implemented with insertion sort - Switch Insertion Sort

    public static void switchInsertionSort(TestInteger[] array){

        semiQuickSort(array, 0, array.length);
        insertionSort(array);
    }

    // Switch Insertion Sort Helper Functions

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

    public static void semiQuickSort(TestInteger[] array, int firstValue, int lastValue){

        if (lastValue - firstValue < 3){
            int q = partition(array, firstValue, lastValue);
            quickSort(array, firstValue, q-1);
            quickSort(array, q+1, lastValue);
        }
    }

    // Median of Three Pivot Sort

    public static void mOfThreeSort(TestInteger[] medArray, int firstValue, int lastValue){
        if (firstValue < lastValue){
            int q = partitionMedian(medArray, firstValue, lastValue);
            mOfThreeSort(medArray, firstValue, q-1);
            mOfThreeSort(medArray, q+1, lastValue);
        }
    }

    // Median of Three Helper Functions

    public static int partitionMedian(TestInteger[] mPartArray, int subfirstValue, int sublastValue) {
        int result =  findMedianIndex(mPartArray, subfirstValue, sublastValue);
        exchange(sublastValue, result, mPartArray);
        TestInteger x = mPartArray[sublastValue];
        int i = subfirstValue - 1;

        for (int count = subfirstValue; count <= sublastValue - 1; count++) {
            if (mPartArray[count].compareTo(x) <= 0) {
                i++;
                exchange(i, count, mPartArray);
            }
        }

        exchange(i+1, sublastValue, mPartArray);

        return i+1;
    }

    public static int findMedianIndex(TestInteger[] medArray, int subfirstValue, int sublastValue){
        int ind1;
        int ind2;
        int ind3;

        ind1 = (int)(Math.random() *(sublastValue-subfirstValue) + subfirstValue);
        ind2 = (int)(Math.random() * (sublastValue-subfirstValue) + subfirstValue);
        ind3 = (int)(Math.random() * (sublastValue-subfirstValue) + subfirstValue);

        int[] indArr = new int[3];
        indArr[0] = ind1;
        indArr[1] = ind2;
        indArr[2] = ind3;

        int result = medArray[indArr[0]].compareTo(medArray[indArr[1]]);
        if (result == -1){
            exchangeInt(0, 1, indArr);
        }

        result = medArray[indArr[1]].compareTo(medArray[indArr[2]]);
        if (result == -1){
            exchangeInt(1, 2, indArr);
        }

        result = medArray[indArr[0]].compareTo(medArray[indArr[1]]);
        if (result == -1){
            exchangeInt(0, 1, indArr);
        }
        return indArr[1];
    }

    public static void exchangeInt(int posOne, int posTwo, int[] Array){
        int temp = Array[posOne];
        Array[posOne] = Array[posTwo];
        Array[posTwo] = temp;
    }

}
