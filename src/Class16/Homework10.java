package Class16;

import java.util.*;

public class Homework10 {
    /**
    * Question 1:
    * Create a method, that will return all duplicates values with count from the given List<String>
    * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
    **/
    public static HashMap<String,Integer> duplicatesCount (ArrayList<String> arrList){
        HashMap<String, Integer> dupCount = new HashMap<>();

        for (int i = 0; i < arrList.size(); i++){
            int v = 2;
            for (int j = 0; j<arrList.size();j++){
                if (arrList.get(i).equals(arrList.get(j)) && i!=j) {
                    dupCount.put(arrList.get(i), v++);
                }
            }
        }
        return dupCount;
    }

    /**
     * Question 2:
     *      * Create a hashMap with any numbers of key-value pairs from the user
     *      * Key should be Integer
     *      * Value should be String
     *      Create method that will print the keys with same value, else "All keys have different values"
     *
     **/
    public static void keysValues (HashMap<Integer,String> hMap) {
        Set<Integer> allKeys = hMap.keySet();
        List<Integer> keyList = new ArrayList<>(allKeys);
        HashMap<Integer,String> dupHash = new HashMap<>();
        for(int i = 0; i<keyList.size(); i++){
            for (int j = 0; j<keyList.size();j++){
                if (hMap.get(keyList.get(i)).equalsIgnoreCase(hMap.get(keyList.get(j))) && i!=j ){
                    dupHash.put(keyList.get(i),hMap.get(keyList.get(i)).toLowerCase());
                }
            }
        }

        if (dupHash.isEmpty()){
            System.out.println("All keys have different values");
        }else{
            Collection<String> allValue = dupHash.values();
            Set <String> setValue = new HashSet<>(allValue);
            List<String> listValue = new ArrayList<>(setValue);
            for (String entry : listValue){
                System.out.print("\n" + entry + "->");
                for(Map.Entry<Integer,String> entry1 : dupHash.entrySet()){
                    if (entry.equals(entry1.getValue()))
                        System.out.print(entry1.getKey() + ",");

                }
            }
        }
        
    }



    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("happy");
        words.add("peace");
        words.add("joy");
        words.add("peace");
        words.add("joy");
        words.add("joy");
        words.add("peace");
        words.add("peaces");
        words.add("joy");
        HashMap<String,Integer> dup = new HashMap<>();
        System.out.println(duplicatesCount(words));

        HashMap<Integer,String> check = new HashMap<>();
        check.put(10,"HAppy");
        check.put(87,"Peace");
        check.put(18,"JOY");
        check.put(12,"hAppy");
        check.put(4,"Peace");
        check.put(90,"joY");
        check.put(14,"HAppy");
        check.put(7,"Peace");
        check.put(16,"hAppy");
        check.put(19,"HAPpy");
        check.put(1,"Peace");
        check.put(8,"joY");
        keysValues(check);

    }

















}