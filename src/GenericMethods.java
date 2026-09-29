//Using generic methods for codes with same logic to bypass looping and creating the method over and over again

public class GenericMethods {
    public static void main(String[] args)

    {
        //creating arrays of Integer ,Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1,  2.2,  4.4,  5.5,  7.7};
        Character[] characterArray = {'H', 'A', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray);//Pass an integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray );
        System.out.printf("%nArray characterArray Contains ; %n");
        printArray(characterArray);

    }
    public static <T> void printArray(T[] inputArray){
        for (T element : inputArray)
            System.out.printf("%s ",element );

       // System.out.println();

    }

}//End of generic method class
