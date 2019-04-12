package algorithmanalysis;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PLATEMAN
 */
public class AlgorithmAnalysis {

    public static void main(String[] args) {

        System.out.println("***Menu List***");
        System.out.println("Enter 1 for : Searching Method");
        System.out.println("Enter 2 for : Sorting Method");
        System.out.println("Enter 3 for : Stack in Java");
        System.out.println("Enter 4 for : Queue in Java");
        System.out.println("Enter 5 for : Exit Program");

        System.out.print("\nEnter Your Choice: ");

        for (;;) {

            Scanner sc = new Scanner(System.in);
            int cn = sc.nextInt();

            switch (cn) {

                case 1:

                    System.out.println("Enter 1 for : Linear Search");
                    System.out.println("Enter 2 for : Binary Search");
                    int choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            SearchingMethod ls = new SearchingMethod();
                            ls.linearSerach();
                            break;

                        case 2:
                            SearchingMethod bs = new SearchingMethod();
                            bs.binarySerach();
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;

                case 2:
                    System.out.println("Enter 1 for : Bubble Sort");
                    System.out.println("Enter 2 for : Selection Sort");
                    System.out.println("Enter 3 for : Insertion Sort");
                    System.out.println("Enter 4 for : Quick Sort");
                    System.out.println("Enter 5 for : Merge Sort");

                    int choice2 = sc.nextInt();

                    switch (choice2) {
                        case 1:

                            SortingMethod bs = new SortingMethod();
                            bs.bubbleSort();
                            break;

                        case 2:
                            SortingMethod ss = new SortingMethod();
                            ss.selectionSort();
                            break;
                        case 3:
                            SortingMethod is = new SortingMethod();
                            is.insertionSort();
                            break;

                        case 4:
                            SortingMethod qs = new SortingMethod();
                            qs.quickSortA();
                            break;
                        
                        case 5:
                            SortingMethod ms = new SortingMethod();
                            ms.mergeSort();
                            break;

                        default:
                            System.out.println("Invaild Choice");

                    }

                    break;

                case 3:
                    StackInJava st = new StackInJava();
                    System.out.println(st.stack());
                    System.exit(0);
                    break;

                case 4:
                    QueueInJava q = new QueueInJava();
                    System.out.println(q.queue());
                    break;

                case 5:
                    System.out.println("Program Closed");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invaild Choice");
                    System.out.println("Please enter a valid choice");

            }

            System.out.println("\n ");
            System.out.println("***Menu List***");
            System.out.println("Enter 1 for : Searching Method");
            System.out.println("Enter 2 for : Sorting Method");
            System.out.println("Enter 3 for : Exit Program");
        }

    }
}
