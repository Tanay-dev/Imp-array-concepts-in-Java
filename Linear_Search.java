package Arrays;

public class Linear_Search {
    public static int search(int numbers[], int key){
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,4,8,6,4,8,6,5,69};
        int key = 69;
        
        int index = search(numbers, key);
        if(index==-1){
            System.out.println("404 Not Found!");
        }
        else{
            System.out.println("The key is " + index);
        }
    }
}
