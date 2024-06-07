package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] wordList = {"kil", "kül", "kelle", "kelime", "kelam","mermer", "evvel"};
        //String word1 =null;
        //String word2 = null;
        List<Character> letter= new ArrayList<>();
        String[] repeat= new String[wordList.length];
        //StringBuilder newWord=new StringBuilder();
        int i=0;
        //String newWord="";
        for (String word : wordList) {
            if (repeatChar(word) &&  i<= wordList.length) {
                repeat[i++]=word;
                for (char x:word.toCharArray()){
                    letter.add(x);
                }
            }
        }
        System.out.println("Harfler: " + letter);

        for (String x :repeat){
            System.out.println("Tekrar eden harf bulunan kelimeler: "+ x);
        }

        System.out.println("Yeni kelime: " + newWords(letter));
    }

    public static String newWords(List<Character> letter){ //String letter
        StringBuilder newWord=new StringBuilder();
        Random r=new Random();
        int letRandom=0;
        for (int i=0; i<6;i++){
            letRandom=r.nextInt(letter.size());
            newWord.append(letter.get(letRandom));
        } return newWord.toString();
    }

    public static boolean repeatChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }



}
