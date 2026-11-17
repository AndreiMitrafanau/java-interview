import org.example.ValidAnagram;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    @DisplayName("Example 1")
    void validAnagram() {
        String str1 = "anagram";
        String str2 = "nagaram";

        assertTrue(validAnagram.isAnagram(str1, str2));
    }

    @Test
    @DisplayName("Example 2")
    void invalidAnagram() {
        String str1 = "rat";
        String str2 = "car";

        assertFalse(validAnagram.isAnagram(str1, str2));
    }
}
