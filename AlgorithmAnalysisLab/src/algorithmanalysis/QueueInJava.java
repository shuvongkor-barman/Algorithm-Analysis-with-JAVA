package algorithmanalysis;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PLATEMAN
 */
public class QueueInJava {
    
public String queue() {

        LinkedList<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Queue in Java ***");
        System.out.println("Enter 1 to Enqueue");
        System.out.println("Enter 2 to Dequeue");
        System.out.println("Enter 3 to Peek");
        System.out.println("Enter 4 to Display");
        System.out.println("Enter 5 to Exit");

        System.out.print("Enter Your Choice: ");

        for (;;) {

            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter an item to Enqueue: ");
                    int item = sc.nextInt();
                    queue.add(item);
                    System.out.println("Your item " + item + " has been added to the Queue");
                    System.out.print("Enter Your Choice: ");
                    break;
                case 2: {
                    int front = queue.peek();
                    queue.remove();
                    System.out.println("Item " + front + " has been removed from the Queue");
                    System.out.print("Enter Your Choice: ");
                    break;
                }
                case 3: {
                    int top = queue.peek();
                    System.out.println("Current Front item is : " + top);
                    System.out.print("Enter Your Choice: ");
                    break;
                }
                case 4:
                    System.out.println("Your all items are: " + queue);
                    System.out.print("Enter Your Choice: ");
                    break;
                case 5:
                    System.out.println("Program Closed");
                    System.exit(0);
                default:
                    System.out.println("Invaid Operaton");
                    System.out.print("Enter Valid Choice: ");
                    break;
            }
        }
    }
}
