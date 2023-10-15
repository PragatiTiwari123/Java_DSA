package Java_DSA;
import java.util.*;
/* --the problem is to find the second largest element of an array--

   we also have to define the no of arrays
   and also no of elements in an array
   then find the second largest element of that unsorted array
   if all the elements are same then return -1 */

class Array1{
    public static void create_arr(Integer arr[],int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int secondLargest(Integer arr[]){
        int a=0;
        int a1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]==arr[i]){
                a++;
            }
            if(arr[i]<0){
                a1++;
            }
        }
        if(a==arr.length){
            printArr(arr);
            return -1;
        }
        else if(a1==arr.length){
            Arrays.sort(arr,Collections.reverseOrder());
            printArr(arr);
            return (arr[arr.length-2]);
        }
        else{
            Arrays.sort(arr);
            printArr(arr);
            return(arr[arr.length-2]);
        }
    }
    public static int sLargest(Integer arr[]){
        int end=arr.length-1;
        Arrays.sort(arr);
        printArr(arr);
        int a1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                a1++;
            }
        }
        // System.out.println(a1+"=="+(arr.length-1));
        if(a1==end+1 && a1!=0){
            int start=0;
            for(int i=0;i<end;i++){
                if(arr[start]<arr[start+1]){
                    return arr[start+1];
                }
                else{
                    start++;
                }
            }
            return -1;
        }
        else{
            for(int i=0;i<end;i++){
                if(arr[end]>arr[end-1]){
                    return arr[end-1];
                }
                else{
                    end=end-1;
                }
            }
            return -1;
        }
        
        
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n_arr=sc.nextInt();
        while(n_arr>0){
            System.out.print("Enter the no Of elements : ");
            int n=sc.nextInt();
            Integer arr[]=new Integer[n];
            create_arr(arr,n);
            System.out.println("\n"+sLargest(arr));

            n_arr--;
        }
    }
}