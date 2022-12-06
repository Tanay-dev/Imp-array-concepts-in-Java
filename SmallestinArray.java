package Arrays;

public class SmallestinArray {
    public static int small(int numberslist[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numberslist.length; i++){
            if(smallest>numberslist[i]){
                smallest = numberslist[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {5,69,5,6,5,2,3,1,9};
        System.out.println("The smallest number from the above array is " + small(numbers));
    }
}
