package Arrays;

public class ReverseanArray {
    public static void reverse(int numbers[]){
        int start = 0, last = numbers.length-1;

        while(start<last){
            //Now we will Swap
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;

            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,69};

        reverse(numbers);
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
