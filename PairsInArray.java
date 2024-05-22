
//How to find all pairs on integer array whose sum is equal to given number?

import java.util.Scanner;
public class PairsInArray {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
           int n=in.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<n;i++){
               arr[i]=in.nextInt();
           }
           System.out.printf("Enter sum of number you want to find");
           int sum=in.nextInt();
           for(int i=0;i<n;i++){
               for(int j=i+1;j<n;j++){
                   if(arr[i]+arr[j]==sum){
                       System.out.printf("{%d,%d}\n", arr[i],arr[j]);
                   }
               }
           }
           in.close();
        }
}
