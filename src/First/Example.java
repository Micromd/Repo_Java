package First;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.Flow;

public class Example {
    public static void main(String[] args){ //psvm
      String days = "weekend";
      boolean anyMeetings = true;
      String clothes = "" ;
      if (days.equalsIgnoreCase("weekdays") && anyMeetings==false) {
          clothes = "formals";
      } else if (days.equalsIgnoreCase("weekdays") && anyMeetings==true) {
          clothes = "suit";
      } else if (days.equalsIgnoreCase("weekend")) {
          clothes = "casual";
      }
        System.out.println(clothes);

        int num = 10;
        if (num%2==0) {
            System.out.println("Even");
        }

        String name = "Happy1111111111111";
        boolean result = true ;
        int number = 22;


        int nameLength = name.length();
        if (nameLength>10 && number>5) {
            String nameUppercaseReplaced = name.toUpperCase().replace('p','b');
            System.out.println(nameUppercaseReplaced);
        } else result = false;
        System.out.println(result);


                String month = "April";

            switch(month) {
                case "December":
                    System.out.println("Winter");
                    break;
                case "March","April","May":
                    System.out.println("Spring");
                    break;
                case "June":
                    System.out.println("Summer");
                    break;
                case "October":
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Invalid month");
                    break;

            }




    }
    








    }
