

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] copy = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      copy[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i++){
      arr[i] = copy[arr.length - 1 - i];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] copy = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      copy[arr.length - 1 - i] = arr[i];
    }
    return copy;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    boolean lowestRemoved = false;
    for(double num: arr) {
      if (num == lowest && lowestRemoved == false) { lowestRemoved = true;}
      else{ sum += num;}
    }
    return (double) sum / (arr.length - 1);
  }


}

