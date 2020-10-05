package Class7;

public class Homework5 {
    public static void main (String[] args){
        /**
         * Write code/method to return abbreviation for any given string
                * Example: String msg = "Outfit of the day"
                * Expected: OOTD   // GM HAGDTY
                * String msg = "have a great day to you"
         */
        String msg = "have a great day to you";
        String msgUC = msg.toUpperCase();
        String abr = "";
        String[] msgSplitUC = msgUC.split(" ");
        for (int i = 0 ; i<msgSplitUC.length ; i++){
            abr = abr + (msgSplitUC[i].charAt(0));

        }
        System.out.println(("Abbreviation: " + abr));



        /**
         * Change the string to title case
         String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        // code
        System.out.println("Line (After modification) : " + line);
         */

        String sentence =  "once upOn a tiMe in the UNIVERSE";
        String sentenceLC = sentence.toLowerCase();
        String mod = "";
        String[] sentenceLCSplit = sentenceLC.split(" ");
        int k = 0;
        while (k<sentenceLCSplit.length) {
            String firstLetter = sentenceLCSplit[k].substring(0,1);
            String firstLetterUC = firstLetter.toUpperCase();
            String replaced = sentenceLCSplit[k].replace(firstLetter, firstLetterUC);
            mod = mod + " " + replaced;
            k++;
        }
        System.out.println("Line (Before modification) : " + sentence);
        System.out.println("Line (After modification) : " + mod);



        /**
         * reverse a string
         String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);
        // code
        System.out.println(System.out.println("Message : " + message));    // syadiloh yppah
         */
        String msg1 = "happy holidays";
        String msg2 = "";
        String[] msg1Split = msg1.split("");

        for (int j = msg1Split.length - 1; j >= 0; j--){
            msg2 = msg2 + (msg1Split[j]);
        }
        System.out.println("Message : " + msg1);
        System.out.println("Message : " + msg2);





























}


}
