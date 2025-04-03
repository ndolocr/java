package arrays;

public class Notes {
    private String introduction = """
    Arrays in Java are one of the most fundamental data structures 
    that allow us to store multiple values of the same type in a 
    single variable. They are useful for storing and managing collections 
    of data. Arrays in Java are objects, which makes them work differently 
    from arrays in C/C++ in terms of memory management. For primitive arrays, 
    elements are stored in a contiguous memory location, For non-primitive arrays, 
    references are stored at contiguous locations, but the actual objects may be at 
    different locations in memory.
    """;

    private String arrayFeatures = """
    - Contiguous Memory Allocation (for Primitives): 
        Java array elements are stored in continuous memory locations, 
        which means that the elements are placed next to each other in memory.
    - Zero-based Indexing: The first element of the array is at index 0.
    - Fixed Length: Once an array is created, its size is fixed and cannot be changed.
    - Can Store Primitives & Objects: Java arrays can hold both primitive types 
        (like int, char, boolean, etc.) and objects (like String, Integer, etc.)
    """;

    private String arrayDeclaration = """
    - To declare an array in Java, use the following syntax:
            type[] arrayName;
                    OR
            type arrayName[];
    - type: The data type of the array elements (e.g., int, String).
    - arrayName: The name of the array.
      (Note: The array is not yet initialized.)
    """;

    private String ArrayCreation = """
    - Once declared, an array can be initialized by allocating memory to it using the
        'new' keyword. Example:

        int[] nums = new int[5];
        OR
        int[] numbers = {1,2,3,4,5};
    """;

    private String accessArrayElelments = """
    - Array elements are accessed using indexes. For example, to access first element 
        of numbers array, we use the index 0. (Indexing starts from 0)
        For example:
        
        numbers[0]; 
    """;

    private String changeArrayElement = """
    - Array elements are changed by assigning an element to a specific index
        For example:
        numbers[0] = 7;
    """;

    private String arrayLength = """
    - We can get the length of an array using the length property:
        Example:
        numbers.length;
    """;

    private String arrayTypes = """
    We have the following array types in Java:
        - Single-Dimensional Arrays
        - Multi-Dimensional Arrays
    """;

    private String singleDimensionalArrays = """
    - Elements are stored in a linear order in this type of array.
    
        For Example
        _________________________
        | 1 | 2 | 3 | 4 | 5 | 6 |
        _________________________
    """;

    private String multiDimensionalArrays = """
    - These are arrays with more than one dimension
        Fof Example
        {   {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    """;

    private String arrayOfObjects = """
    - An array can be used to store objects.
    
        Syntax
        
        objectType [] arrayName;
        OR
        objectType arrayName [];
        
        Example:
        
        class Student {
            public int roll_no;
            public String name;
         
            Student(int roll_no, String name){
                this.roll_no = roll_no;
                this.name = name;
            }
        }
        
        public class Main {
            public static void main(String[] args){
                // declares an Array of Student
                Student[] arr;
    
                // allocating memory for 5 objects of type Student.
                arr = new Student[5];
    
                // initialize the elements of the array
                arr[0] = new Student(1, "aman");
                arr[1] = new Student(2, "vaibhav");
                arr[2] = new Student(3, "shikar");
                arr[3] = new Student(4, "dharmesh");
                arr[4] = new Student(5, "mohit");
    
                // accessing the elements of the specified array
                for (int i = 0; i < arr.length; i++)
                    System.out.println("Element at " + i + " : { "
                                       + arr[i].roll_no + " "
                                       + arr[i].name+" }");
            }
        }
    
    """;
}