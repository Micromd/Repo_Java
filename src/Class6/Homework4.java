package Class6;

public class Homework4 {
    public static void main (String[] args){

        /**
         * * Create variable to store student-score and total-possible-score;
         *         * Based on the percentage, display grade to student:
         *         * Grade A: 91-100
         *         * Grade B: 81-90
         *         * Grade C: 71-80
         *         * Grade D: 61-70
         *         * Grade E: 51-60
         *         * Grade F: less than or equal to 50
         */


        float maxScore = 250;
        float studentScore = 199;
        float scorePercentage = studentScore/maxScore * 100;

        if ((scorePercentage<=100) && scorePercentage>=91){
            System.out.println("Your result is " + scorePercentage + "%" + ". Your grade is " + "A");
        } else if ((scorePercentage<=90) && scorePercentage>=81){
            System.out.println("Your result is " + scorePercentage + "%" + ". Your grade is " + "B");
        } else if ((scorePercentage<=80) && scorePercentage>=71){
            System.out.println("Your result is " + scorePercentage + "%" + ". Your grade is " + "C");
        } else if ((scorePercentage<=70) && scorePercentage>=61){
            System.out.println("Your result is " + scorePercentage + "%" + ". Your grade is " + "D");
        } else if ((scorePercentage<=60) && scorePercentage>=51){
            System.out.println("Your result is " + scorePercentage + "%" + ". Your grade is " + "E");
        } else {
            System.out.println("Your result is " + scorePercentage + "%" + ". Your grade is " + "F");
        }


        /**
         *  store value in an int variable
         *         * if number is divisible by 3, print "divisible by 3"
         *         * if number is divisible by 5, print "divisible by 5"
         *         * if number is divisible by 3 and 5, print "divisible by both"
         *         * if not divisible by 3 or 5, print the number
         */

        int num = 15;
        int mod3 = num%3;
        int mod5 = num%5;
        if ((mod3==0) && mod5!=0) {
            System.out.println("Divisible by 3");
        } else if ((mod3!=0) &&mod5==0){
            System.out.println("Divisible by 5");
        } else if ((mod3==0) && mod5==0){
            System.out.println("Divisible by both");
        } else {
            System.out.println(num);

        }
        /**
         *
         * * Checking car mode (P, D, N, R)   // switch
         *  * if car mode is P and "you can park car"
         *  * if car mode is D drive car
         *  *      if drive type is Snow, display "You are on Snow mode"
         *  *      if drive type is Sport, display "You are on Sport mode"
         *  *      if drive type is Eco, display "You are on Eco mode"
         *  * if car mode is N you can "put car in car wash"
         *  * if car mode is R you can "revere the car"
         */

        char carGear = 'D';
        String driveType = "Sport";
        switch (carGear) {
            case 'P':
                System.out.println("You can park car");
                break;
            case 'D':
                if(driveType == "Snow"){
                    System.out.println("You are on Snow mode");
                } else if(driveType == "Sport"){
                    System.out.println("You are on Sport mode");
                } else if(driveType == "Eco"){
                    System.out.println("You are on Eco mode");
                }
                break;
            case 'N':
                System.out.println("Put care in car wash");
                break;
            case 'R':
                System.out.println("Reverse the car" );
                break;



        }


















        }
























    }




















