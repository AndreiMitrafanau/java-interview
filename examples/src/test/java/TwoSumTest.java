import org.example.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void twoSumTest() {
        var nums = new int[]{2, 7, 11, 15};
        var target = 9;
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = new int[]{0, 1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void twoSumTest2() {
        var nums = new int[]{3,2,4};
        var target = 6;
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = new int[]{1,2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void twoSumTest3() {
        var nums = new int[]{3,3};
        var target = 6;
        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = new int[]{0,1};

        assertArrayEquals(actual, expected);
    }
}
