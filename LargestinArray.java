package Arrays;

public class LargestinArray {
    public static int largestNum(int numberslist[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numberslist.length; i++){
            if(largest<numberslist[i]){
                largest = numberslist[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,3,5,10,54,12,69};
        System.out.println("The largest number is " + largestNum(numbers));
    }
}
