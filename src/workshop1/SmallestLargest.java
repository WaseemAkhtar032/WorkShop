package workshop1;
public class SmallestLargest extends InputString {
    public void smallestLargest(int arr[]){

        int small = arr[0];
        for (int i=0; i< arr.length ; i++){
            if (arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("Smallest number is : "+small);
        int large = arr[0];
        for (int i=0; i< arr.length;i++){
            if (arr[i]> large){
                large = arr[i];
            }
        }
        System.out.println("Largest number is : "+large);
    }
}
