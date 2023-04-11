import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UnitTests {

    @Test
    public void Test1() {
        int[] actual = { -55, 34, 2147483647, 2342, -300, 0, 89, 678, -999 };
        int[] expected = { -999, -300, -55, 0, 34, 89, 678, 2342, 2147483647 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] actual = { 1, 2, 3, 4, 5, 6 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] actual = { 6, 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void Test5() {
        int[] actual = { 1 };
        int[] expected = { 1 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
}
