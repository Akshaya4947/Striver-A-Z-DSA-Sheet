package arrays;

import java.util.Arrays;

//    Brute force approach = NlogN + N

public class secondLargestElement {
    public static void main(String[] args){
        int arr[] = {3,5,2,1,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr)); 
        System.out.println(second(arr));
    }

    static void swap(int arr[], int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        second(arr);
    }

    static int second(int arr[]){
        int n = arr.length;
        int second = 0;
        for(int i=n-2;i>0;i--){
            if(arr[i]!=arr[n-1]){
                second = arr[i];
                break;
            }
        }
        return second;
    }


    // Better approach compare than the Brute force approach = O(2N)
    public static void main(String [] args){
        int arr[] = {1,2,4,7,7,5};
        int largest = flargest(arr);
        System.out.println(slargest(arr,largest));
    }

    static int flargest(int arr[]){
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    static int slargest(int arr[],int largest){
        int second = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second && arr[i]!=largest){
                second = arr[i];
            }
        }
        return second;
    }


    // optimal approach

    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        int largest = arr[0];
        int slargest = -1;
        System.out.println(secondLargestElement(arr,largest,slargest));
    }

    static int secondLargestElement(int []arr,int largest,int slargest){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}
