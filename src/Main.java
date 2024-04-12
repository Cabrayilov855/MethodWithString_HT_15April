import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Garbage collector
        Car car = new Car();
        Car car1 = new Car();
        car = car1;

        //Reverse string
        System.out.println(getReverseString("Cadillac"));

        //String is palindrome
        System.out.println(isPalindrome("Ana"));
    }
    public static String getReverseString(String string){
        char[] charArray = string.toLowerCase(Locale.of(string)).toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return new String(charArray);
    }

    public static boolean isPalindrome(String string){
        String reversedString = getReverseString(string);
        if (string.toLowerCase(Locale.of(string)).equals(reversedString)){
            return true;
        }else {
            return false;
        }
    }


}