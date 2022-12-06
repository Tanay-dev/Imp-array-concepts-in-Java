package Arrays;

public class BinarySearch {
    public static int search(int numbers[], int key){
        int start = 0, end = numbers.length-1; //Initialising the starting and the ending point of the list.

        while(start<=end){
            int mid = (start+end)/2;

            //Comparison
            if(numbers[mid]==key){
                return mid; //Found the key
            }
            if(numbers[mid]<key){
                start=mid+1; //Matlab ki array ka number bada hai Mid se, so mid ke aage he hoga; isliye Start ko mid ke ek aage se shuru kiya hai!
            }
            else{
                end = mid-1; //Matlab ki array ka number chota hai Mid se, so mid ke peeche he hoga; isliye End ko mid ke ek peeche se shuru kiya hai!
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,5,6,7,10,69,75,98};
        int key = 69;
        System.out.println("The index is " + search(num, key));
    }
}
