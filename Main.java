//Noah

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      results(getNums());
    }

    public static void results (ArrayList<Integer> nums){
      nums = BubbleSort(nums);
      for (Integer num : nums){
        System.out.println(num);
      }
      System.out.println("Mean is: " + calculateAverage(nums));
    }

    public static ArrayList<Integer> getNums (){
      ArrayList<Integer> output = new ArrayList<Integer> ();
      int size = 0;
      Boolean negativeReceived = false;
      System.out.println("Enter up to 100 positive numbers.\n" + //
          "A negative number will end the input:");

      while (size < 100 && !negativeReceived) {
        //grab valid int from user
        int x = getNum();
        //if x is positive, add it to our list and increase size by one
        if (x > 0) {
          output.add(x);
          size++;
        } 
        //if we are not yet at 2 numbers given, and the user tries to finish inputting, tell them to fuck off and give more numbers
        else if (size < 2) {
          System.out.println("You need to give at least 2 numbers before we can continue.");
        } 
        //if negative number given, break out of the while loop
        else {
          negativeReceived = true;
        }
      }
      return output;
    }

    public static int getNum(){
      Scanner input = new Scanner(System.in);
      try {
        int x = input.nextInt();
        return x;
      } catch (InputMismatchException e) {
        System.out.println("That's not a number silly!");
        return getNum();
      }
    }

    public static double calculateAverage(ArrayList<Integer> nums) {
      double sum = 0;
      for (Integer num : nums) {
        sum += num;
      }
      return sum / nums.size();
    }

    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> nums) {
      // here you're gonna put your sorting algorithm the prof gave you, im not gonna to the effort of making 
      // a bubble sort in java since the result is the same and you were given code for this part anyways
      nums.sort(null);
      return nums;
    }
}