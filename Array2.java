package Java_DSA;
import java.util.*;

//In this program, We want to rotate the array by k times..
//We are going to stire the first index value
//Then swap the adjacent elements
//and at last insert the value of first index into last index
//Do it for k times to do rotation k times

public class Array2 {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int k=sc.nextInt();
        int end=arr.length-1;
        printArr(arr);
        System.out.println();

        while(k>0){
            int i=0;
            int n=0;
            int a=arr[i];
            while(n<arr.length-1){
                arr[n]=arr[n+1];
                n++;
            }
            i++;
            k--;
            arr[end]=a;
        }
        printArr(arr);
    }
}
