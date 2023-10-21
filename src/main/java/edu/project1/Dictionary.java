package edu.project1;

import java.util.List;
import java.util.Random;

class Dictionary {

    private List<String> dictionary = List.of("education", "house", "hello", "animal");
    private final Random random = new Random();

    public String getRandomWord(){
        return dictionary.get(random.nextInt(dictionary.size()));
    }

    public List<String> getDictionary(){
        return dictionary;
    }

    public void addWordToDictionary(String word){
        String newWord = word.toLowerCase();
        dictionary.add(newWord);
    }

}
