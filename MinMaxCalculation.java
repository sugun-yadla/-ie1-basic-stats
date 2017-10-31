public class MinMaxCalculation {
    public static double minimum(double ... numbers) {
        double[] sorted = bubbleSort(numbers);

        return sorted[0];
    }

    public static double maximum(double ... numbers) {
        double[] sorted = bubbleSort(numbers);

        return sorted[sorted.length - 1];
    }

    public static double[] bubbleSort(double[] numArray) {

      int size = numArray.length;
      double hold = 0;

      //Iterate to bubble up O(n^2)
      for (int i = 0; i < size; i++) {
          //Second loop
          for (int j = 1; j < (size - j); j++) {
              //Bubble up
              if (numArray[j - 1] > numArray[j]) {
                  hold = numArray[j - 1];
                  numArray[j - 1] = numArray[j];
                  numArray[j] = hold;
              }

          }
      }

      return numArray;
    }
}



