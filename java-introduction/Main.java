// Every Java file is a class in itself
// The name of the file and the public class name should be the same
public class Main { // public class is accessible from other classes, files, packages, etc.
    public static void main(String[] args){
        // System.out.println("Hello World");
        System.out.println(args[0]); // prints first command line argument - the command line arguments are stored as an array ('args variable').
}}

// public - since main function is the entry point of the program, the main function is made publicly accessible
// static - we are having static here because we want to execute the main function without creating an object of the class Main
// void - we do not want the main function to return any anything
// String[] args - command line arguments of array of strings type - e.g: java Main 30 -> Output: 30 (iF System.out.orintln(args[0]))

