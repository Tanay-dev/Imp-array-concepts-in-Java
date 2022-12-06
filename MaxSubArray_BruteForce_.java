package Arrays;

public class MaxSubArray_BruteForce_{
    public static void Maxsubarraysum(int numbers[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currsum = 0;
                for(int k=start; k<=end; k++){
                    currsum+=numbers[k];
                }
                System.out.print(currsum);
                if(maxSum<currsum){
                    maxSum = currsum;
                }
                System.out.println();
            }
        }
        System.out.println("The Max Sum is " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,4,6,8,9};
        Maxsubarraysum(numbers);
    }
}
