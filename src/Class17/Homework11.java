package Class17;

import java.text.SimpleDateFormat;
import java.util.*;

public class Homework11 {
    /**
     * Question 1:
     * Create a method that will take String-array as input
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all.
     */
    public static HashSet<String> maxColor (String[] colorsArr){
        HashMap<String,Integer> maxColors = new HashMap<>();

        for (int i=0; i<colorsArr.length; i++){
            int num = 1;
            for (int j=0; j<colorsArr.length; j++){
                if(colorsArr[i].equalsIgnoreCase(colorsArr[j])){
                    maxColors.put(colorsArr[i],num++);
                }
            }
        }
        int maxValue = 1;
        for (Map.Entry<String,Integer> value :maxColors.entrySet()){
            for (Map.Entry<String,Integer> value1 :maxColors.entrySet()){
                if (value.getValue()>=maxValue){
                    maxValue=value.getValue();
                }
            }
        }
        HashSet<String> result = new HashSet<>();
        for (Map.Entry<String,Integer> color : maxColors.entrySet()){
            if (color.getValue()==maxValue){
                result.add(color.getKey());
            }
        }
        return result ;
    }

    /**
     * Question 2:
     * Create a method that will take an int as input.
     * return the timeline (houram/pm) with interval of 2 hour from the current hour.
     */

    public static ArrayList<String> intervals (int num){
        ArrayList<String> timeline = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat hoursAmPm = new SimpleDateFormat("ha");
        for (int i = 0; i<num;i++) {
            cal.add(Calendar.HOUR, 2);
            Date date = cal.getTime();
            String time = hoursAmPm.format(date);
            timeline.add(time);
        }
        return timeline;
    }



    public static void main(String[] args) {
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","grey","grey","grey","grey"};
        System.out.println(maxColor(arr));

        System.out.println(intervals(8));


    }
}
