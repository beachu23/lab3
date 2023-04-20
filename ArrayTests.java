import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 5, 4, 3 }, input2);

	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = { 1, 2};
    assertArrayEquals(new int[]{2, 1 }, ArrayExamples.reversed(input2));

  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1.0, 1.0, 1.0, 4.0, 6.0};
    assertEquals("3.00", String.format("%.2f", ArrayExamples.averageWithoutLowest(input1)));
  }
}
