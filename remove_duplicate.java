package arraysEasy;

public class remove_duplicate {
    public static void main(String[] args) {
        int arr[] =  {-2, 2, 4, 4, 4, 4, 5, 5};
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
       }
       System.out.println(i+1);
    }
    
}
