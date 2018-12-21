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

    public static void main(String args[]) {
        TestInteger program = new TestInteger();
        program.compareAlgorithms();
    }

    public void compareAlgorithms() {
        TestInteger[] qArray = genRanArr(10000);
        TestInteger[] tArray = qArray.clone();


        System.out.println(("## Random Arrays\n"));
        runQuickSort(qArray);
        runTimSort(tArray);


        System.out.println("\n\n## Ordered Arrays\n");
        runQuickSort(qArray);
        runTimSort(tArray);


        System.out.println("\n\n## 10 Sorted Seqs of 1000\n");
        toSortedChunks(qArray, 1000);
        tArray = qArray.clone();

        runQuickSort(qArray);
        runTimSort(tArray);


        System.out.println("\n\n## 100 Sorted Seqs of 100\n");
        toSortedChunks(qArray, 100);
        tArray = qArray.clone();

        runQuickSort(qArray);
        runTimSort(tArray);
    }

    public void runQuickSort(TestInteger[] array) {
        TestInteger.resetCounter();

        long startTime = System.currentTimeMillis();
        TestInteger.quickSort(array, 0, array.length - 1);
        long endTime = System.currentTimeMillis();

        long counter = TestInteger.counter;


        System.out.println("### Quicksort");
        System.out.println("\t* Comparisons: " + counter);
        System.out.println("\t* Runtime: " + (endTime - startTime) + " ms");
        System.out.println("\t* Sorted: " + TestInteger.isSorted(array) + "\n");
    }

    public void runTimSort(TestInteger[] array) {
        TestInteger.resetCounter();

        long startTime = System.currentTimeMillis();
        Arrays.sort(array);
        long endTime = System.currentTimeMillis();

        long counter = TestInteger.counter;

        System.out.println("### Tim Sort");
        System.out.println("\t* Comparisons: " + counter);
        System.out.println("\t* Runtime: " + (endTime - startTime) + " ms");
        System.out.println("\t* Sorted: " + TestInteger.isSorted(array) + "\n");
    }

    public int genRanInt() {
        return (int) (Math.random() * 1000000);
    }

    public TestInteger[] genRanArr(int size) {
        TestInteger[] result = new TestInteger[size];

        for (int i = 0; i < size; i++) {
            result[i] = new TestInteger(genRanInt());
        }

        return result;
    }

    public void toSortedChunks(TestInteger[] array, int chunkSize) {

        for (int chunkIndex = 0; chunkIndex < array.length; chunkIndex += chunkSize) {
            int startValue = genRanInt();

            // for every element within each of those thousand chunks
            for (int relativeIndex = chunkIndex; relativeIndex < chunkIndex + chunkSize; relativeIndex++) {
                array[relativeIndex].value = startValue + relativeIndex;
            }
        }
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