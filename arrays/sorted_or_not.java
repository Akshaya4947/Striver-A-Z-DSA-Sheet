package arraysEasy;

public class sorted_or_not {
    public static void main(String[] args) {
        int arr[] = {1,1,3,3,4};
        System.out.println(check(arr));
    }

    static boolean check(int arr[]){
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>=arr[i-1]){
                
            } else {
                return false;
            }
        }
        return true;
    }
}
