package Class9;

public class Homework7 {
    /**
    1. Create a method to add all the numbers in a array with double-values
     */
    public static double arraySum(double[] arr ){
        double result = 0;
        for (int i = 0; i<arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }
    /**
    2. Create a method to verify if the input-int-number is prime or not
    */
    public static boolean isPrime(int num) {
        boolean isNumPrime = true;
        if (num < 2) isNumPrime = false;
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0 && num > 2 && num != i) {
                    isNumPrime = false;
                }
            }
        }
        return isNumPrime;
    }

    /**3. Create a method to find if given string is palindrome.
     */
    public static boolean isPalindrome(String sen1){
        boolean isSentencePalindrome = false;
        String sen2 = "";
        sen1 = sen1.replace(" ", "");
        String[] sen1Split = sen1.split("");

        for (int j = sen1Split.length - 1; j >= 0; j--) {
            sen2 = sen2 + (sen1Split[j]);
        }

        if (sen1.equalsIgnoreCase(sen2)){
             isSentencePalindrome = true;
        }
        return isSentencePalindrome;
    }

    /**4. Write a method to print(no return) the duplicate values in a given String array.
     */
    public static void duplicates(String[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    temp = temp + " " + arr[i];
                }
            }

        }
        System.out.println("Duplicates are " + temp);
    }

    /**5. Write a method to print(no return) the common values between two arrays (string arrays)
     */
    public static void commonValues (String[] arr1,String[] arr2){
        String temp = "";
        for (int i = 0; i<arr1.length; i++){
            for (int j = i+1; j < arr2.length; j++){
                if (arr1[i].equals(arr2[j])){
                    temp = temp + " " + arr1[i];
                }
            }
        }
        System.out.println("Common values "  + "are " + temp);




    }


    /**
        Methods check
     */
    public static void main(String[] args) {
        double[] check = {3.5,7.3,3.5,5,23,46};
        System.out.println(arraySum(check));
        System.out.println(isPrime(12));
        System.out.println(  isPalindrome("A Santa Lived As a Devil At NASA"));
        String[] array = {"hello", "peace", "happy" , "hello", "happy", "hello", "peace"};
        duplicates(array);
        String[] arr2 = {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"};
        String[] arr1 = {"hello", "grow", "laugh" , "peace"};
        commonValues(arr1,arr2);
    }













































    }







