import java.util.Arrays;

public class MidTermExam {

    /**
     * Question 1:
     */
    public static int[] newArray (int[] arr,int num){
        int[] result = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            if (num!=arr[i]){
                result[i] = arr[i];

            }
        }

        return result;
    }

    /**
     * Question 2:
     */
    public static int num (int[] arr){
        int smallestInt = 1;

        for (int i=0; i<arr.length; i++){
            if (arr[i]==smallestInt){
                smallestInt++;
                i=-1;
            }
        }



        return smallestInt;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5,0,-298,7,256,4,9,4,1,2,3};
        System.out.println(num(arr));


    }


    /**
    * Question 3:
    */
    public static void points (int speed){

        int score = (speed - 70)/5;
        if (score<=0){
            score=0;
            System.out.println(score + " Points. Thank you for driving within the speed limit");
        }
        else if(score>0 && score<21) {
            System.out.println(score + " Points");
        }
        else if(score>=21){
            System.out.println(score + " License suspended");
        }


    }








}
