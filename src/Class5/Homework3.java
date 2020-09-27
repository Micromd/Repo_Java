package Class5;

import java.util.Arrays;

public class Homework3 {
    public static void main (String[] args) {

        // Store your full name in a variable, and display the following:

        String myFullName = "Aleksandr Dokuchaev";
        String[] fullNameSplit = myFullName.split(" ");
        String firstName = fullNameSplit[0], lastName = fullNameSplit[1];

        // 1. Display length of the first name.

        int firstNameLength = firstName.length();
        System.out.println("length of my first name is " + firstNameLength);

        // 2. Does your last name starts with "K" (Ignoring cases)

        String lastNameUpperCase = lastName.toUpperCase();
        boolean  doesLastNameStartWith_K = lastNameUpperCase.startsWith("K");
        System.out.println("Does my last name start with 'K'? " + doesLastNameStartWith_K);

        // 3. print the last letter of your first name

        int firstNameIndex = firstNameLength - 1;
        char firstnameLastLetter = firstName.charAt(firstNameIndex);
        System.out.println("The last letter in my first name is '" + firstnameLastLetter + "'");

        //4. Does your last name ends with "M" (Ignoring cases)

        boolean doesLastNameEndWith_M = lastNameUpperCase.endsWith("M");
        System.out.println("Does my last name ends with 'M'? " + doesLastNameEndWith_M);



        // String myStatment = "I am a good programmer";
        // Use string methods to do following tasks:
        String myStatement = "I am a good programmer";

        // 1. Display the total number of words in the myStatement.

        String[] myStatementSplit = myStatement.split(" ");
        int numberOfWordsIn_MyStatement_ = myStatementSplit.length;
        System.out.println("Total number of words in 'my statement' is " + numberOfWordsIn_MyStatement_);

        // 2. replace all the 'r' characters with 'f' characters.

        String myStatementLowerCase = myStatement.toLowerCase();
        String myStatementReplaced = myStatementLowerCase.replace('r','f');
        System.out.println(myStatementReplaced);


        // Store your first name in a string variable.
        // Calculate the length of your first name, without using length() method of String class.

        //variable firstName already declared in line 10
        String[] lettersInFirstName = firstName.split("");
        int numberOfLettersInFirstName = lettersInFirstName.length;
        System.out.println("Number of letters in my first name are " + numberOfLettersInFirstName);



        // String strNew = "hello dear, how are you?";
        // Assign result (boolean) as true if length of strNew if greater than 10

        String strNew = "hello dear, how are you?";
        int strNewLength = strNew.length();
        boolean isLengthGreaterThan10 = strNewLength>10?true:false;
        System.out.println("Is number of words greater than 10? " + isLengthGreaterThan10);



        //String threeWordsSentence =  "hApPY nEW yeAr";
        // * sout(threeWordsSentence);  // hApPY nEW yeAr
        // * // code
        // * sout(threeWordsSentence);  // Happy New Year
        String threeWordsSentence =  "hApPY nEW yeAr";
        String threeWordsSentenceLowerCase = threeWordsSentence.toLowerCase();
        String[] threeWordsLC = threeWordsSentenceLowerCase.split(" ");
        String firstWord = threeWordsLC[0], secondWord = threeWordsLC[1], thirdWord = threeWordsLC[2];
        String firstWordCut = firstWord.substring(0,1);
        String firstWordCutUC = firstWordCut.toUpperCase();
        String firstWordUC = firstWord.replace(firstWordCut, firstWordCutUC);
        String secondWordCut = secondWord.substring(0,1);
        String secondWordCutUC = secondWordCut.toUpperCase();
        String secondWordUC = secondWord.replace(secondWordCut, secondWordCutUC);
        String thirdWordCut = thirdWord.substring(0,1);
        String thirdWordCutUC = thirdWordCut.toUpperCase();
        String thirdWordUC = thirdWord.replace(thirdWordCut, thirdWordCutUC);
        System.out.println(firstWordUC + " " + secondWordUC + " " + thirdWordUC);



        // Create abbreviation:
        // * String threeWordsSentence =  "Lab sessIONS clAsses";
        // * // code
        // * LSC

        String threeWordsSentence1 =  "Lab sessIONS clAsses";
        String threeWordsSentence1UC = threeWordsSentence1.toUpperCase();
        String[] threeWordsSplit = threeWordsSentence1UC.split(" ");
        String firstWord1 = threeWordsSplit[0], secondWord1 = threeWordsSplit[1], thirdWord1 = threeWordsSplit[2];
        String[] firstWordSplit = firstWord1.split("");
        String[] secondWordSplit = secondWord1.split("");
        String[] thirdWordSplit = thirdWord1.split("");
        System.out.println(firstWordSplit[0] + secondWordSplit[0] + thirdWordSplit[0]);










    }



















}
