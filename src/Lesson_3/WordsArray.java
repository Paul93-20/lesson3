package Lesson_3;

import java.util.HashMap;

public class WordsArray {

    public static void main(String[] args) {
        String[] wordsArr = new String[]{"Russia","England","USA","Germany","Sweden","Italy","Greece","Spain","Belgium","Russia","Russia"};
        HashMap<String, Integer> uniqList = new HashMap<>();
        for(String i : wordsArr){
            uniqList.put(i, uniqList.getOrDefault(i, 0) + 1);
        }
        System.out.println(uniqList);
    }
}
