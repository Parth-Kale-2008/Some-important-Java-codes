import java.util.*;
public class RemoveDuplicates{
    public static void main(String args[]){
        int arr[] = {5,5,6,6,7,8,9,9};

        int new_arr[] = new int[arr.length];
        int j =0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                new_arr[j] = arr[i];
                j++;
            }
        }
        new_arr[j] =arr[arr.length - 1];
        j++;

        for(int i =0;i<j;i++){
            System.out.println(new_arr[i]+" ");
        }
    }
}