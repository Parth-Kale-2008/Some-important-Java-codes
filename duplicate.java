import java.util.*;
public class duplicate{
    public static void main(String[] args){
        int arr[] = {1,2,2,3,4,3,5,6,5,3,2};

        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("the duplicates are "+arr[i]);
                }
            }
        }
    }
}