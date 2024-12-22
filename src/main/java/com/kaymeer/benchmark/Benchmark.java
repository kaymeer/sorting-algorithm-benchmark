package com.kaymeer.benchmark;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Random;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Benchmark {

    // Constants for array sizes
    private static final int SMALL_SIZE = 100;
    private static final int MEDIUM_SIZE = 1000;
    private static final int LARGE_SIZE = 10000;

    // Arrays for different test cases
    private int[] randomArraySmall, sortedArraySmall, reverseArraySmall;
    private int[] randomArrayMedium, sortedArrayMedium, reverseArrayMedium;
    private int[] randomArrayLarge, sortedArrayLarge, reverseArrayLarge;

    // Setup method to initialize arrays before each iteration
    @Setup(Level.Iteration)
    public void setup() {
        randomArraySmall = generateRandomArray(SMALL_SIZE);
        sortedArraySmall = generateSortedArray(SMALL_SIZE);
        reverseArraySmall = generateReverseSortedArray(SMALL_SIZE);

        randomArrayMedium = generateRandomArray(MEDIUM_SIZE);
        sortedArrayMedium = generateSortedArray(MEDIUM_SIZE);
        reverseArrayMedium = generateReverseSortedArray(MEDIUM_SIZE);

        randomArrayLarge = generateRandomArray(LARGE_SIZE);
        sortedArrayLarge = generateSortedArray(LARGE_SIZE);
        reverseArrayLarge = generateReverseSortedArray(LARGE_SIZE);
    }

    // Benchmark methods for different sorting algorithms and array types/sizes
    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortRandomSmall() {
        selectionSort(Arrays.copyOf(randomArraySmall, randomArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortRandomSmall() {
        bubbleSort(Arrays.copyOf(randomArraySmall, randomArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortRandomSmall() {
        insertionSort(Arrays.copyOf(randomArraySmall, randomArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortRandomSmall() {
        mergeSort(Arrays.copyOf(randomArraySmall, randomArraySmall.length), 0, randomArraySmall.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortRandomSmall() {
        quickSort(Arrays.copyOf(randomArraySmall, randomArraySmall.length), 0, randomArraySmall.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortSortedSmall() {
        selectionSort(Arrays.copyOf(sortedArraySmall, sortedArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortSortedSmall() {
        bubbleSort(Arrays.copyOf(sortedArraySmall, sortedArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortSortedSmall() {
        insertionSort(Arrays.copyOf(sortedArraySmall, sortedArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortSortedSmall() {
        mergeSort(Arrays.copyOf(sortedArraySmall, sortedArraySmall.length), 0, sortedArraySmall.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortSortedSmall() {
        quickSort(Arrays.copyOf(sortedArraySmall, sortedArraySmall.length), 0, sortedArraySmall.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortReverseSmall() {
        selectionSort(Arrays.copyOf(reverseArraySmall, reverseArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortReverseSmall() {
        bubbleSort(Arrays.copyOf(reverseArraySmall, reverseArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortReverseSmall() {
        insertionSort(Arrays.copyOf(reverseArraySmall, reverseArraySmall.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortReverseSmall() {
        mergeSort(Arrays.copyOf(reverseArraySmall, reverseArraySmall.length), 0, reverseArraySmall.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortReverseSmall() {
        quickSort(Arrays.copyOf(reverseArraySmall, reverseArraySmall.length), 0, reverseArraySmall.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortRandomMedium() {
        selectionSort(Arrays.copyOf(randomArrayMedium, randomArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortRandomMedium() {
        bubbleSort(Arrays.copyOf(randomArrayMedium, randomArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortRandomMedium() {
        insertionSort(Arrays.copyOf(randomArrayMedium, randomArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortRandomMedium() {
        mergeSort(Arrays.copyOf(randomArrayMedium, randomArrayMedium.length), 0, randomArrayMedium.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortRandomMedium() {
        quickSort(Arrays.copyOf(randomArrayMedium, randomArrayMedium.length), 0, randomArrayMedium.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortSortedMedium() {
        selectionSort(Arrays.copyOf(sortedArrayMedium, sortedArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortSortedMedium() {
        bubbleSort(Arrays.copyOf(sortedArrayMedium, sortedArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortSortedMedium() {
        insertionSort(Arrays.copyOf(sortedArrayMedium, sortedArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortSortedMedium() {
        mergeSort(Arrays.copyOf(sortedArrayMedium, sortedArrayMedium.length), 0, sortedArrayMedium.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortSortedMedium() {
        quickSort(Arrays.copyOf(sortedArrayMedium, sortedArrayMedium.length), 0, sortedArrayMedium.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortReverseMedium() {
        selectionSort(Arrays.copyOf(reverseArrayMedium, reverseArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortReverseMedium() {
        bubbleSort(Arrays.copyOf(reverseArrayMedium, reverseArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortReverseMedium() {
        insertionSort(Arrays.copyOf(reverseArrayMedium, reverseArrayMedium.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortReverseMedium() {
        mergeSort(Arrays.copyOf(reverseArrayMedium, reverseArrayMedium.length), 0, reverseArrayMedium.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortReverseMedium() {
        quickSort(Arrays.copyOf(reverseArrayMedium, reverseArrayMedium.length), 0, reverseArrayMedium.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortRandomLarge() {
        selectionSort(Arrays.copyOf(randomArrayLarge, randomArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortRandomLarge() {
        bubbleSort(Arrays.copyOf(randomArrayLarge, randomArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortRandomLarge() {
        insertionSort(Arrays.copyOf(randomArrayLarge, randomArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortRandomLarge() {
        mergeSort(Arrays.copyOf(randomArrayLarge, randomArrayLarge.length), 0, randomArrayLarge.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortRandomLarge() {
        quickSort(Arrays.copyOf(randomArrayLarge, randomArrayLarge.length), 0, randomArrayLarge.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortSortedLarge() {
        selectionSort(Arrays.copyOf(sortedArrayLarge, sortedArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortSortedLarge() {
        bubbleSort(Arrays.copyOf(sortedArrayLarge, sortedArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortSortedLarge() {
        insertionSort(Arrays.copyOf(sortedArrayLarge, sortedArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortSortedLarge() {
        mergeSort(Arrays.copyOf(sortedArrayLarge, sortedArrayLarge.length), 0, sortedArrayLarge.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortSortedLarge() {
        quickSort(Arrays.copyOf(sortedArrayLarge, sortedArrayLarge.length), 0, sortedArrayLarge.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void selectionSortReverseLarge() {
        selectionSort(Arrays.copyOf(reverseArrayLarge, reverseArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void bubbleSortReverseLarge() {
        bubbleSort(Arrays.copyOf(reverseArrayLarge, reverseArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void insertionSortReverseLarge() {
        insertionSort(Arrays.copyOf(reverseArrayLarge, reverseArrayLarge.length));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void mergeSortReverseLarge() {
        mergeSort(Arrays.copyOf(reverseArrayLarge, reverseArrayLarge.length), 0, reverseArrayLarge.length - 1);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void quickSortReverseLarge() {
        quickSort(Arrays.copyOf(reverseArrayLarge, reverseArrayLarge.length), 0, reverseArrayLarge.length - 1);
    }

    // Selection sort implementation
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble sort implementation
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion sort implementation
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Merge sort implementation
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Helper method to merge two subarrays
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            arr[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    // Quick sort implementation
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Helper method to partition the array
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Method to generate a random array
    private int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000);
        }
        return array;
    }

    // Method to generate a sorted array
    private int[] generateSortedArray(int size) {
        int[] array = generateRandomArray(size);
        Arrays.sort(array);
        return array;
    }

    // Method to generate a reverse sorted array
    private int[] generateReverseSortedArray(int size) {
        int[] array = generateSortedArray(size);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}