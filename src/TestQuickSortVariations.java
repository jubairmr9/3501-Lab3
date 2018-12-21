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

            double rQSortStartTime = new Double(System.currentTimeMillis());
            rQuickSort(tenSeqRandArr, 0, tenSeqRandArr.length - 1);
            double rQSortEndTime = new Double(System.currentTimeMillis());

            double qSortTimeDifference = rQSortEndTime - rQSortStartTime;

            System.out.println("Sorting time for TsH using Randomized QuickSort for time #" + i + " = "+ qSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            tenSeqRandArr = secTenSeqRandArr.clone();

        }

        for(int i = 1; i<6; i++){

            double sISortStartTime = new Double(System.currentTimeMillis());
            switchInsertionSort(tenSeqRandArr);
            double sISortEndTime = new Double(System.currentTimeMillis());

            double sISortTimeDifference = sISortEndTime - sISortStartTime;

            System.out.println("Sorting time for TsH using SwitchInsertionSort for time #" + i + " = "+ sISortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            tenSeqRandArr = secTenSeqRandArr.clone();

        }

        for(int i = 1; i<6; i++){

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

        // Loop to run randomized quicksort 5 times and record the time it takes

        for(int i = 1; i<6; i++){

            double rQSortStartTime = new Double(System.currentTimeMillis());
            rQuickSort(hundredSeqRandArr, 0, hundredSeqRandArr.length - 1);
            double rQSortEndTime = new Double(System.currentTimeMillis());

            double rQSortTimeDifference = rQSortEndTime - rQSortStartTime;

            System.out.println("Sorting time for HsH using Randomized QuickSort on new array for time #" + i + " = "+ rQSortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(hundredSeqRandArr));

            hundredSeqRandArr = secHundredSeqRandArr.clone();

        }

        for(int i = 1; i<6; i++){

            double sISortStartTime = new Double(System.currentTimeMillis());
            switchInsertionSort(hundredSeqRandArr);
            double sISortEndTime = new Double(System.currentTimeMillis());

            double sISortTimeDifference = sISortEndTime - sISortStartTime;

            System.out.println("Sorting time for HsH using SwitchInsertionSort for time #" + i + " = "+ sISortTimeDifference);
            System.out.println("Sorted? " + TestInteger.isSorted(tenSeqRandArr));

            hundredSeqRandArr = secHundredSeqRandArr.clone();

        }

        // Loop to run quicksort 5 times and record the time it takes

        for(int i = 1; i<6; i++){

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
