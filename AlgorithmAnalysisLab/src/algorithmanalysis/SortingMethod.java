package algorithmanalysis;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingMethod {

    // Bubble Sort Start
    public void bubbleSort() {
        int i, j, temp = 0, choice;

        System.out.println("***Bubble Sort Program");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int noi = sc.nextInt();
        int[] a = new int[noi];

        System.out.println("Please Enter Items in Random order");
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter item " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Your items are : " + Arrays.toString(a));

        System.out.println("Enter 1 for Ascending Order");
        System.out.println("Enter 2 for Dscending Order");
        System.out.println("Enter Your Choice: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (i = a.length - 1; i > 0; i--) {
                    for (j = 0; j < i; j++) {
                        if (a[j] > a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }

                    }

                }

                System.out.println("Your items in Ascending Order is: " + Arrays.toString(a));
                break;

            case 2:
                for (i = a.length - 1; i > 0; i--) {
                    for (j = 0; j < i; j++) {
                        if (a[j] < a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }

                    }

                }

                System.out.println("Your items in Descending Order is: " + Arrays.toString(a));
                break;
            default:
                System.out.println("Invalid Choice");

        }

    }
// Bubble Sort End

// Selection Sort    
    public void selectionSort() {

        int i, j, choice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int noi = sc.nextInt();
        int[] a = new int[noi];

        System.out.println("Please Enter Items in Random order");
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter item " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Your items are : " + Arrays.toString(a));

        System.out.println("Enter 1 for Ascending Order");
        System.out.println("Enter 2 for Dscending Order");
        System.out.println("Enter Your Choice: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (i = a.length - 1; i > 0; i--) {

                    int largest = 0;

                    for (j = 1; j <= i; j++) {

                        if (a[j] > a[largest]) {
                            largest = j;
                        }

                    }
                    swap(a, largest, i);

                }
                System.out.println("Your items is Ascending Order is: " + Arrays.toString(a));
                break;

            case 2:

                for (i = a.length - 1; i > 0; i--) {

                    int smallest = 0;

                    for (j = 1; j <= i; j++) {

                        if (a[j] < a[smallest]) {
                            smallest = j;
                        }

                    }
                    swap(a, smallest, i);

                }

                System.out.println("Your items is Descending Order is: " + Arrays.toString(a));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    } // End of Insertion sort

// Inserton Sort Method
    public void insertionSort() {

        System.out.println("***Insertion Sort***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int noi = sc.nextInt();
        int[] a = new int[noi];

        System.out.println("Please Enter Items in Random order");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter item " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Your items are : " + Arrays.toString(a));

        System.out.println("Enter 1 for Ascending Order");
        System.out.println("Enter 2 for Dscending Order");
        System.out.println("Enter Your Choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 1; i < a.length; i++) {

                    int newElement = a[i];

                    int m;

                    for (m = i; m > 0 && a[m - 1] > newElement; m--) {
                        a[m] = a[m - 1];
                    }

                    a[m] = newElement;
                }
                System.out.println("Your items is Ascending Order is: " + Arrays.toString(a));
                break;

            case 2:
                for (int i = 1; i < a.length; i++) {

                    int newElement = a[i];

                    int m;

                    for (m = i; m > 0 && a[m - 1] < newElement; m--) {
                        a[m] = a[m - 1];
                    }

                    a[m] = newElement;
                }

                System.out.println("Your items is Descending Order is: " + Arrays.toString(a));
                break;
            default:
                System.out.println("Invalid Choice");

        }

    }

// Quick Sort Start    
    public void quickSort(int[] A) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter 1 for Ascending Order: ");
        System.out.print("\nEnter 2 for Descending Order: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nAscending Order: ");
                quickSort(A, 0, A.length - 1);
                break;
            case 2:
                System.out.print("\nDescending Order: ");
                quickSort2(A, 0, A.length - 1);
                break;
            default:
                System.out.println("Invaid Choice");
        }

    }

    public void quickSort(int[] A, int low, int high) {

        if (low < high + 1) {
            int p = partition(A, low, high);
            quickSort(A, low, p - 1);
            quickSort(A, p + 1, high);
        }
    }

    public void quickSort2(int[] A, int low, int high) {

        if (low < high + 1) {
            int p = partition2(A, low, high);
            quickSort2(A, low, p - 1);
            quickSort2(A, p + 1, high);
        }
    }

    public static void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    public int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    public int partition(int[] A, int low, int high) {

        swap(A, low, getPivot(low, high));

        int border = low + 1;

        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border - 1);

        return border - 1;
    }

    public int partition2(int[] A, int low, int high) {

        swap(A, low, getPivot(low, high));

        int border = low + 1;

        for (int i = border; i <= high; i++) {
            if (A[i] > A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border - 1);

        return border - 1;
    }

    void quickSortA() {
        int i, j, temp = 0, choice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int noi = sc.nextInt();
        int[] a = new int[noi];

        System.out.println("Please Enter Items in Random order");
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter item " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Your items are : " + Arrays.toString(a));

        quickSort(a);

        System.out.println("" + Arrays.toString(a));

    } //  End of Quick Sort







public void mergeSort() {

        System.out.println("***Merge Sort***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int noi = sc.nextInt();
        int[] a = new int[noi];

        System.out.println("Please Enter Items in Random order");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter item " + i + " : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Your items are : " + Arrays.toString(a));

        mergeSort(a, 0, a.length);

        System.out.println("Your items in Asscending Order is: " + Arrays.toString(a));

    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {

            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }









}
