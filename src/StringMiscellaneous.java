//This app demonstrates the length ,charAt and getChars as Methods of String class

public class StringMiscellaneous {
    public static void main(String[] args) {

        String s1 = " hello there";
        char[] charArray = new char[5];




            System.out.printf("S1: %s", s1);

            //testing length
            System.out.printf("%nLength of s1: %d", s1.length());

            //Loop through characters in s1 with charAt and display reversed
        System.out.printf("%nThe String reversed is: ");
        for (int count = s1.length() - 1; count >= 0; count--)
            System.out.printf("%c ", s1.charAt(count));


        //copy characters from string into charArray
        s1.getChars(0,5,charArray,0);
        System.out.printf("%nThe character array is:");

        for (char character: charArray)
            System.out.print(character);
        System.out.println();
    }
}// end of class string miscellaneous
