package myapp;

import java.util.*;
import java.io.Console;

public class Shopping {
    public static void main(String[] args) {

        Console cons = System.console();

        //from lecturer
        boolean stop = false;
        String input;
        String cart;
    

        while (!stop) {
            input = cons.readLine(" > ");
            System.out.printf("READ: %s\n", input);
            // add <list of space separated items>
            // list
            // del <idx>
            // end
            String[] terms = input.split(" ");
            String cmd = terms[0];

            switch (cmd) {
                case "add":
                break;

                case "list":
                if(cart.size() > 0) {
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.printf("%d. %s\n", (i +1), cart.get(i));
                    }
                } else {
                    System.out.println("Your cart is empty!");
                }
                break;

                case "del":
                if (terms.length < 2) {
                    System.err.println("Please provide an index to delete");
                    }
                    else {
                        delIndex = Integer.parseInt(terms[1]) - 1;
                        if (delIndex < cart.size()) {
                            cart.remove(delIndex);
                            System.out.println("Deleted");
                        }
                        else {
                            System.err.println("No such item");
                        }



                }

                break;

                case "end":
                break;

                default:
            }

            System.out.printf("");
        }

       
        
       





         






    }

}

