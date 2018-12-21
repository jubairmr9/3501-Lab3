# 3501-Lab3

Using three variations of QuickSort and comparing their results with the regular one.

# How To Proceed

Run the TestQuickSortVariations file.

# Types of inputs:

- Ten Sequences of a Thousand Elements
- A Hundred Sequences of a Hundred Elements

## 10 seq. of 1000 elements.

### Randomized QuickSort 

Pre-Sorted? false
Sorting time for TsH using Randomized QuickSort for time #1 = 12.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Randomized QuickSort for time #2 = 2.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Randomized QuickSort for time #3 = 7.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Randomized QuickSort for time #4 = 3.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Randomized QuickSort for time #5 = 2.0
Sorted? true

### Switch Insertion Sort

Pre-Sorted? false
Sorting time for TsH using SwitchInsertionSort for time #1 = 102.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using SwitchInsertionSort for time #2 = 106.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using SwitchInsertionSort for time #3 = 80.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using SwitchInsertionSort for time #4 = 65.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using SwitchInsertionSort for time #5 = 59.0
Sorted? true

### Median of Three Sort

Pre-Sorted? false
Sorting time for TsH using mOTSort for time #1 = 16.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using mOTSort for time #2 = 6.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using mOTSort for time #3 = 4.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using mOTSort for time #4 = 3.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using mOTSort for time #5 = 1.0
Sorted? true

### Regular QuickSort

Pre-Sorted? false
Sorting time for TsH using Quick Sort for time #1 = 102.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Quick Sort for time #2 = 88.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Quick Sort for time #3 = 90.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Quick Sort for time #4 = 81.0
Sorted? true

Pre-Sorted? false
Sorting time for TsH using Quick Sort for time #5 = 67.0
Sorted? true

## 100 seq. of 100 elements.

### Randomized QuickSort

Pre-Sorted? false
Sorting time for HsH using Randomized QuickSort on new array for time #1 = 8.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Randomized QuickSort on new array for time #2 = 2.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Randomized QuickSort on new array for time #3 = 2.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Randomized QuickSort on new array for time #4 = 1.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Randomized QuickSort on new array for time #5 = 1.0
Sorted? true

### Switch Insertion Sort

Pre-Sorted? false
Sorting time for HsH using SwitchInsertionSort for time #1 = 97.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using SwitchInsertionSort for time #2 = 59.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using SwitchInsertionSort for time #3 = 136.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using SwitchInsertionSort for time #4 = 64.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using SwitchInsertionSort for time #5 = 54.0
Sorted? true

### Median of Three Sort

Pre-Sorted? false
Sorting time for HsH using mOTSort on new array for time #1 = 1.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using mOTSort on new array for time #2 = 2.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using mOTSort on new array for time #3 = 1.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using mOTSort on new array for time #4 = 2.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using mOTSort on new array for time #5 = 1.0
Sorted? true

### Regular QuickSort

Pre-Sorted? false
Sorting time for HsH using Quick Sort for time #1 = 16.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Quick Sort for time #2 = 15.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Quick Sort for time #3 = 16.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Quick Sort for time #4 = 12.0
Sorted? true

Pre-Sorted? false
Sorting time for HsH using Quick Sort for time #5 = 14.0
Sorted? true

## Observations

- Randomized QuickSort works really well for both types of inputs.
- Median of Three sort is the same as above, works really well a larger group.
- Switch Insertion Sort has the same effect on both types of data, but whereas it improves on the time of Regular Quicksort for larger amount of elements in a group, Regular Quicksort is better at the smaller sized groups.

## Verdict

Best sorting algorithms for inputs:

- Ten Sequences of a Thousand Elements - Median of Three and Randomized Quicksort
- A Hundred Sequences of a Hundred Elements - Median of Three
