import java.util.*;
public class Max{
    public static void main(String[] args){
        int arr[] = {22,6,2,89,69};
int max = arr[0];

for(int i=1;i<arr.length;i++){
    if(arr[i]>max){
        max = arr[i];
    }
}
System.out.println("the max number is "+ max);
    }
}