package algorithmanalysis;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PLATEMAN
 */
public class StackInJava {

    public String stack() {

        LinkedList<Integer> stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Stack in Java ***");
        System.out.println("Enter 1 to Push");
        System.out.println("Enter 2 to Pop");
        System.out.println("Enter 3 to Peek");
        System.out.println("Enter 4 to Display");
        System.out.println("Enter 5 to Exit");

        System.out.print("Enter Your Choice: ");

        for (;;) {

            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter an item to push: ");
                    int item = sc.nextInt();
                    stack.push(item);
                    System.out.println("Your item " + item + " has been pushed to the Stack");
                    System.out.print("Enter Your Choice: ");
                    break;
                case 2: {
                    int top = stack.peek();
                    stack.pop();
                    System.out.println("Item " + top + " has been poped from the Stack");
                    System.out.print("Enter Your Choice: ");
                    break;
                }
                case 3: {
                    int top = stack.peek();
                    System.out.println("Current Top item is : " + top);
                    System.out.print("Enter Your Choice: ");
                    break;
                }
                case 4:
                    System.out.println("Your all items are: " + stack);
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
