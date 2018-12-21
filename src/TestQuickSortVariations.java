public class TestQuickSortVariations extends QuickSortVariations {

    public static void main(String[] args){

        // Creating arrays with 10 sorted sequences of 1000 elements each

        int tenSeqInd = 0;

        TestInteger[] tenSeqRandArr = new TestInteger[10000];

        for(int i = 0; i< 10; i++){

            int tenSeqFirValue = (int)(Math.random() * 1000000);

            for(int j = tenSeqFirValue; j < tenSeqFirValue + 1000; j++){

                tenSeqRandArr[tenSeqInd] = new TestInteger(j);
                tenSeqInd++;

            }

        }

        TestInteger[] secTenSeqRandArr = tenSeqRandArr.clone();

        System.out.println("10 seq. of 1000 elements.");

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            double rQSortStartTime = new Double(System.currentTimeMillis());
            rQuickSort(tenSeqRandArr, 0, tenSeqRandArr.length - 1);
            double rQSortEndTime = new Double(System.currentTimeMillis());

            double qSortTimeDifference = rQSortEndTime - rQSortStartTime;

            System.out.println("Sorting time for TsH using Randomized QuickSort for time #" + i + " = "+ qSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            tenSeqRandArr = secTenSeqRandArr.clone();

        }

        // Switch Insertion Sort

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            double sISortStartTime = new Double(System.currentTimeMillis());
            switchInsertionSort(tenSeqRandArr);
            double sISortEndTime = new Double(System.currentTimeMillis());

            double sISortTimeDifference = sISortEndTime - sISortStartTime;

            System.out.println("Sorting time for TsH using SwitchInsertionSort for time #" + i + " = "+ sISortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            tenSeqRandArr = secTenSeqRandArr.clone();

        }

        // Median of Three Pivot Sort

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            double qSortStartTime = new Double(System.currentTimeMillis());
            mOfThreeSort(tenSeqRandArr, 0, tenSeqRandArr.length - 1);
            double qSortEndTime = new Double(System.currentTimeMillis());

            double qSortTimeDifference = qSortEndTime - qSortStartTime;

            System.out.println("Sorting time for TsH using Medium for time #" + i + " = "+ qSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            tenSeqRandArr = secTenSeqRandArr.clone();

        }

        // Regular Quicksort

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            double qSortStartTime = new Double(System.currentTimeMillis());
            quickSort(tenSeqRandArr, 0, tenSeqRandArr.length - 1);
            double qSortEndTime = new Double(System.currentTimeMillis());

            double qSortTimeDifference = qSortEndTime - qSortStartTime;

            System.out.println("Sorting time for TsH using Quick Sort for time #" + i + " = "+ qSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            tenSeqRandArr = secTenSeqRandArr.clone();

        }

        int hundredSeqInd = 0;

        TestInteger[] hundredSeqRandArr = new TestInteger[10000];

        for(int i = 0; i< 100; i++){

            int hundredSeqFirValue = (int)(Math.random() * 1000000);

            for(int j = hundredSeqFirValue; j < hundredSeqFirValue + 100; j++){

                hundredSeqRandArr[hundredSeqInd] = new TestInteger(j);
                hundredSeqInd++;

            }

        }

        TestInteger[] secHundredSeqRandArr = hundredSeqRandArr.clone();

        System.out.println("100 seq. of 100 elements.");

        // Randomized QuickSort

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            double rQSortStartTime = new Double(System.currentTimeMillis());
            rQuickSort(hundredSeqRandArr, 0, hundredSeqRandArr.length - 1);
            double rQSortEndTime = new Double(System.currentTimeMillis());

            double rQSortTimeDifference = rQSortEndTime - rQSortStartTime;

            System.out.println("Sorting time for HsH using Randomized QuickSort on new array for time #" + i + " = "+ rQSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            hundredSeqRandArr = secHundredSeqRandArr.clone();

        }

        // Switch Insertion SOrt

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            double sISortStartTime = new Double(System.currentTimeMillis());
            switchInsertionSort(hundredSeqRandArr);
            double sISortEndTime = new Double(System.currentTimeMillis());

            double sISortTimeDifference = sISortEndTime - sISortStartTime;

            System.out.println("Sorting time for HsH using SwitchInsertionSort for time #" + i + " = "+ sISortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            hundredSeqRandArr = secHundredSeqRandArr.clone();

        }

        // Median of Three Pivot Sort

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            double rQSortStartTime = new Double(System.currentTimeMillis());
            mOfThreeSort(hundredSeqRandArr, 0, hundredSeqRandArr.length - 1);
            double rQSortEndTime = new Double(System.currentTimeMillis());

            double rQSortTimeDifference = rQSortEndTime - rQSortStartTime;

            System.out.println("Sorting time for HsH using Median on new array for time #" + i + " = "+ rQSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            hundredSeqRandArr = secHundredSeqRandArr.clone();

        }

        // Regular QuickSort

        for(int i = 1; i<6; i++){

            System.out.println("Pre-Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            double qSortStartTime = new Double(System.currentTimeMillis());
            quickSort(hundredSeqRandArr, 0, hundredSeqRandArr.length - 1);
            double qSortEndTime = new Double(System.currentTimeMillis());

            double qSortTimeDifference = qSortEndTime - qSortStartTime;

            System.out.println("Sorting time for HsH using Quick Sort for time #" + i + " = "+ qSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            hundredSeqRandArr = secHundredSeqRandArr.clone();

        }

    }

}
