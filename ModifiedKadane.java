package Arrays;

public class ModifiedKadane {
    public static int kadaneforNegative(int numbers[]){
        int ms = numbers[0];
        int cs = numbers[0];
        for(int i=1; i<numbers.length; i++){
            cs = Math.max(numbers[i], cs+numbers[i]);
            ms = Math.max(ms, cs);
        }
        System.out.println("The Maximum SubArray Sum is " + ms);
        return ms;
    }
    public static void main(String[] args) {
        int numbers[] = {-5, 4, -8, -6, -4, 6, 2};
        kadaneforNegative(numbers);
    }
}
