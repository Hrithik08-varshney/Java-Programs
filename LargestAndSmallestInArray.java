import java.util.*;
public class LargestAndSmallestInArray{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(max<arr[i]){
                max=arr[i];            }
        } 
      int min=max;
      for(int i=0;i<n;i++){
          if(min>arr[i])
          min=arr[i];
      }
      System.out.printf("Min=%d\nMax=%d",min,max);
      in.close();
    }
}