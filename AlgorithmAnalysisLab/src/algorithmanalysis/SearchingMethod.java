package algorithmanalysis;

import java.util.Arrays;
import java.util.Scanner;

class SearchingMethod {

    void linearSerach() {
        int i, skey;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nLinear Search Program");
        System.out.print("Enter number of items: ");
        int noi = sc.nextInt();
        int[] a = new int[noi];

        for (i = 0; i < a.length; i++) {
            System.out.print("Enter item " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Your items are : " + Arrays.toString(a));

        System.out.print("Enter a item to find: ");
        skey = sc.nextInt();

        for (i = 0; i < a.length; i++) {  

            if (a[i] == skey) {
                System.out.println(skey + " is found at location " + i);
                break;
            }

        }

        if (i == a.length) {
            System.out.println("Item " + skey + " is not found");

        }

    }

    void binarySerach() {
        int i, skey, first, middle, last;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nBinary Search Program");
        System.out.print("Enter number of items: ");
        int noi = sc.nextInt();
        int[] a = new int[noi];

        System.out.println("Please Enter Item in Asscending Order");
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter item " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Your items are : " + Arrays.toString(a));

        System.out.print("Enter a item to find: ");
        skey = sc.nextInt();

        first = 0;
        last = a.length - 1;
        middle = (first + last) / 2;

        while (first <= last) {

            if (skey == a[middle]) {
                System.out.println("Item " + skey + " is found at location " + middle);
                break;

            } else if (skey > a[middle]) {
                first = middle + 1;

            } else {
                last = middle - 1;

            }
            middle = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Item " + skey + " is not found");
        }

    }
}
