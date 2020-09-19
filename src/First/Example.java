package First;

import java.util.concurrent.Flow;

public class Example {
    public static void main(String[] args){ //psvm
        System.out.println("Hello");    //Sout
        System.out.println("my first steps");
        byte test = 100;
        System.out.println(test);
        int numberOfDays = 365;
        System.out.println(numberOfDays);
        /**
         * Comments Comments Comments
         * Blah Blah Blah
         */
        System.out.println("number of days in regular year is " + numberOfDays );
        float gNumber = 9.8f;
        System.out.println("G number on Earth is " + gNumber );
        double numberPi = 3.14159265359;
        System.out.println("Number Pi value is " + numberPi );
        char firstLetter = 'A';
        System.out.println("First letter in the Alphabet is " + firstLetter );
        boolean examPassed = false;
        System.out.println("Test score less than 70. Exam passed? " + examPassed);
        examPassed = true ;
        System.out.println("Test score more than 70. Exam passed? " + examPassed);
        int Num = test + numberOfDays ;
        System.out.println(Num);
        double num1 = gNumber + numberPi;
        System.out.println(num1);
        int inc = 21;
        inc++;
        System.out.println(inc++);
        System.out.println(++inc);
        int com1 = 1;
        int com2 = 2;
        boolean comGrCom2 = com1 > com2;
        System.out.println(comGrCom2);
        int lVar1 = 1, lVar2 = 2, lVar3 = 3, lVar4 = 4 ;
        boolean  lRes1 = lVar1 < lVar4 && lVar3 == lVar2 ;
        System.out.println(lRes1);
        boolean  lRes2 = lVar1 < lVar4 || lVar3 > lVar2 ;
        System.out.println(lRes2);
        boolean  lRes3 = !(lVar1 < lVar4 || lVar3 > lVar2);
        System.out.println(lRes3);

    }
    








    }
