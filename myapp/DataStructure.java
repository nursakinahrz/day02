package myapp;

// import the collection framework
import java.util.*;

public class DataStructure {
    
    public static void main(String[] args) {

        //create list of integer
        // List - generics
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(10);
        intList.add(50);
        intList.add(2, 15);

        System.out.println(intList);





    }
}
