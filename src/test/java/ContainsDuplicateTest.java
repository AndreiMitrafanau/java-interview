import org.example.ContainsDuplicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    @DisplayName("Example 1")
    void duplicateOnStartAndEnd() {
        int[] nums = new int[]{1, 2, 3, 1};

        assertTrue(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    @DisplayName("Example 2")
    void noDuplicates() {
        int[] nums = new int[]{1, 2, 3, 4};

        assertFalse(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    @DisplayName("Example 3")
    void duplicateOnStart() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        assertTrue(containsDuplicate.containsDuplicate(nums));
    }

}
