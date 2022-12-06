package Arrays;

public class KadaneAlgoMSA {
    //The idea of Kadane’s algorithm is to maintain a variable max_ending_here that stores the maximum sum contiguous subarray ending at current index and a variable max_so_far stores the maximum sum of contiguous subarray found so far, Everytime there is a positive-sum value in max_ending_here compare it with max_so_far and update max_so_far if it is greater than max_so_far.
    public static void kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs+numbers[i];
            if (cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum SubArray Sum is " + ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, -1, -2 -3};
        kadane(numbers);
    }
}
