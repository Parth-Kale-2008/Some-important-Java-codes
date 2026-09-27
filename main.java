public class main{
    public static void main(String[] args){
        int[] arr = {23,69,43,21,19};
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max number is "+max);

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            temp = arr[right];

            left++;
            right--;
        }
        System.out.println("reversed array is ");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}