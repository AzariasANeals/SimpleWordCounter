
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class MainTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MainTest
{
    // 3 normal test cases
    @Test
    public void testSimpleSentence(){
        String[] words = {"the", "cat", "sat", "on", "the", "mat"};
        HashMap<String, Integer> result = Main.wordFrequencyCounter(words);
        assertEquals(2, (int) result.get("the"));
        assertEquals(1, (int) result.get("cat"));
        assertEquals(1, (int) result.get("sat"));
        assertEquals(1, (int) result.get("on"));
        assertEquals(1, (int) result.get("mat"));

    }

    @Test
    public void testSameWordThreeTimes(){
        String[] words = {"hello", "hello", "hello"};
        HashMap<String, Integer> result = Main.wordFrequencyCounter(words);
        assertEquals(3, (int) result.get("hello"));
    }

    @Test
    public void testMultipleDifferentWords(){
        String[] words = {"apple", "banana", "apple", "banana", "orange"};
        HashMap<String, Integer> result = Main.wordFrequencyCounter(words);
        assertEquals(2, (int) result.get("apple"));    
        assertEquals(2, (int) result.get("banana"));    
        assertEquals(1, (int) result.get("orange"));    

    }
    
    // 3 edge test cases
    @Test
    public void testEdgeEmptyArray(){
        String[] words = {};
        HashMap<String, Integer> result = Main.wordFrequencyCounter(words);
        assertTrue(result.isEmpty());
    }
    
    @Test
    public void testEmptyStringArray(){
        String[] words = {"", "", "test", ""};
        HashMap<String, Integer> result = Main.wordFrequencyCounter(words);
        assertEquals(3, (int) result.get(""));
        assertEquals(1, (int) result.get("test"));
    }
    
    @Test
    public void testNullInput(){
        String[] words = null;
        HashMap<String, Integer> result = Main.wordFrequencyCounter(words);
        assertTrue(result.isEmpty());
    }
    

}