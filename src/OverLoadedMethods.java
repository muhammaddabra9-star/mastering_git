//Printing Array elements using overloaded methods.
public class OverLoadedMethods {
    public static void main(String[] args){
        //create arrays of integer,Double and character
        Integer[] integerArray = {1,2,3,4,5,6};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] characterArray = {'H','E','l','l','o'};

        System.out.printf("Array integerArray contains:%n");
        //(integerArray);//pass an integer array
        printArray(integerArray);

        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);

        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray);//pass a character array
    }
public static void printArray(Integer[] inputArray){
        //display array elements
    //BUT WHY DO I NEED FOR LINES OF CODE SINCE I USED LINES LIKE  ***printArray(integerArray);***
    for (Integer element: inputArray)
        System.out.printf("%s",element);

}
public static void printArray(Double[] inputArray){
        //display array  elements
    for (Double element: inputArray)
        System.out.printf("%s",element);
    System.out.println();
}
public static void printArray(Character[] inputArray){
        //display array elements
    for(Character element: inputArray )
        System.out.printf("%s",element);
    System.out.println();
   //display array elements

}

}//End of class overloaded methods
