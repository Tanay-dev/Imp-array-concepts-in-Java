package Arrays;

public class Q1 {
    // Question 1:Given an integer array nums, return true if any value appears at
    // least twice in the array, and return false if every element is distinct.

    public static boolean distinct(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 4, 5 };
        System.out.println(distinct(numbers));
    }
}
