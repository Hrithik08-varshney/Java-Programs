//Write a program to remove duplicates from array in Java?

import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      
      for(int i=0;i<n;i++){
          arr[i]=in.nextInt();
      }

      //only for 0 to n
      /* int count=0;
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(arr[i]<0){
                  break;
              }
              else
                  if(arr[i]==arr[j]){
                      arr[j]=-1;
                  count++;
              }
          }
      }
      int len=n-count;
      int[] newarr=new int[len+1];
      for(int i=0,k=0;i<n;i++){
          if(arr[i]>=0){
            newarr[k]=arr[i];
            k++;
          }
      }
      for(int i=0;i<len;i++){
          System.out.printf("%d ", newarr[i]);
      } */
      
      int[] newarr=new int[n];
      newarr[0]=arr[0];
      int k=1;
      for(int i=1;i<n;i++){
          int flag=0;
          for(int j=0;j<n;j++){
              if(arr[i]==newarr[j]){
                  flag=1;
              }     
          }
          if(flag==0){
            newarr[k]=arr[i];
            k+=1;
        }
      }
      for(int i=0;/* newarr[i]!='\0' */ i<=k-1;i++){
         System.out.printf("%d ",newarr[i]);
      }
      in.close();
    }
}
