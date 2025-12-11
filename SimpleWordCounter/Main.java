import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        HashMap<String, Integer> wordCounter = null;
        
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>();
        System.out.println("Please enter in a string of text: ");
        
        String paragraph = lowerCase(s.nextLine());
        
        String[] words = splitParagraphToWords(paragraph);
        
        wordCounter = wordFrequencyCounter(words);
        
        System.out.println("You had this many words: " + words.length);
        System.out.println("Your paragraph is: " + paragraph);
        
        for(HashMap.Entry<String, Integer> e : wordCounter.entrySet()){
            sorted.put(e.getKey(), e.getValue());
        }
        
        for(Map.Entry<String, Integer> srt : sorted.entrySet()){
            System.out.println(srt.getKey() + ": " + srt.getValue());
        }
        
    }
    
    public static String lowerCase(String paragraph){
        return paragraph.toLowerCase();
    }
    
    public static String[] splitParagraphToWords(String paragraph){
        return paragraph.split(" ");
    }
    
    public static HashMap<String, Integer> wordFrequencyCounter(String[] words){
        HashMap<String, Integer> buffer = new HashMap<String, Integer>();
        
        if(words == null){
            return buffer;
        }
        
        for(String w: words){
            
            if(buffer.containsKey(w)){
                int counter = buffer.get(w).intValue();
                counter++;
                buffer.put(w, counter);
            }
            
            else{
                buffer.put(w, 1);
            }
            
        }
        
        return buffer;
    }
    
}