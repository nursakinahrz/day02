package myapp;

public class Test {

    public static void main(String[] args) {
        String[] todos = new String[4];

        // Assign some value to the array
        todos[0] = "learn Java";
        todos[1] = "go jogging";
        todos[2] = "watch movie";
        todos[3] = "brisk walk";

        System.out.printf("Index: %d: value = %s\n", 0, todos[0]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[1]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[2]);
        System.out.printf("Index: %d: value = %s\n", 0, todos[3]);

        // Every array has a property called length
        System.out.printf("Size of array: %d\n",  todos.length);

        System.out.printf("Size of array: %d\n", args.length);
        System.out.printf("Index: %d: value = %s\n", 0, args[0]);
        System.out.printf("Index: %d: value = %s\n", 0, args[1]);
        System.out.printf("Index: %d: value = %s\n", 0, args[2]);


}
}
