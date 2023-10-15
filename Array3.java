package Java_DSA;

import java.util.Arrays;

public class Array3 {
    public static int first_missing(int arr[]){
        Arrays.sort(arr);
        int a;
        for(int i=0;i>arr.length;i++){
            int j=0;
            while(j>=9 && arr[i]>=0){
                if(arr[i]==j){
                    break;
                }
                else{
                    a=j;
                }
                j++;
            }
        }
        a=arr[arr.length-1]+1;
        return a;
    }
    public static void main(String []args){
        int arr[]={3 ,-6 ,1 ,0};
        int end=arr.length-1;
        System.out.println(first_missing(arr));
    }
}
