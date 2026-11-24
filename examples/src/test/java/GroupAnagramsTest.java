import org.example.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void emptyTest() {
        var input = new String[]{""};
        List<List<String>> actual = groupAnagrams.groupAnagrams(input);
        List<List<String>> expected = List.of(List.of(""));

        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    public void test1() {
        var input = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> actual = groupAnagrams.groupAnagrams(input);
        List<List<String>> expected = List.of(List.of("bat"),List.of("nat","tan"),List.of("ate","eat","tea"));

        assertEquals(normalize(expected), normalize(actual));
    }


    @Test
    public void test2() {
        var input = new String[]{"a"};
        List<List<String>> actual = groupAnagrams.groupAnagrams(input);
        List<List<String>> expected = List.of(List.of("a"));

        assertEquals(normalize(expected), normalize(actual));
    }

    /** Order of groups and of words inside a group does not matter, so sort both. */
    private static List<List<String>> normalize(List<List<String>> groups) {
        return groups.stream()
                .map(group -> group.stream().sorted().toList())
                .sorted(Comparator.comparing(Object::toString))
                .toList();
    }
}
