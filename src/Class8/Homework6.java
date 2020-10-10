package Class8;

public class Homework6 {

    /**
     * Create a method to find average of an int-array
     * */

    public static double arrayAvg(double[] arr ){
        double sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        double result = sum/arr.length;
        return result;
    }


    /**
     *
     * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method (NO return) that will print the index of given name in the given array
     *
     */

    public static void nameSearch (String[] names, String givenName) {
        for (int i=0; i<names.length; i++){
            if (names[i].equalsIgnoreCase(givenName)){
                System.out.println(i);
            }

        }

    }

    //methods check

    public static void main (String[] args) {
        double[] check = {3.5,7.3,3.5,5,23,46};
        System.out.println(arrayAvg(check));
        String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"};


    }




















}
