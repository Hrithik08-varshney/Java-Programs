import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);  
         int n=sc.nextInt();

        //RIGHT TRIANGLE STAR PATTERN ------------------------------------------------------
         /* for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }  */
        
        //DOWNWARD TRIANGLE STAR PATTERN PROGRAM------------------------------------------------
        /* for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.printf("*");
            }
            System.out.printf("\n");
        } */

        // Left Triangle Star Pattern---------------------------------------------------------

         /* for(int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
                 if(j<(n+1)-i)
                 System.out.printf(" ");
                 else
                 System.out.printf("*");
             }
             System.out.printf("\n");
         } */


        //Left Triangle Reverse Star Pattern --------------------------------------------------
        /* for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<i)
                System.out.printf(" ");
                else
                System.out.printf("*");
            }
            System.out.printf("\n");
        } */

        //pyramid pattern---------------------------------------------------------
         
         for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*n)-1;j++){
                if(j>=n+1-i&&j<=n-1+i){
                    System.out.printf("*"); 
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }

        //pyramid space pattern---------------------------------------------------

        /* for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*n)-1;j++){
                if(j>=n+1-i && j<=n-1+i){
                    if(i%2!=0){
                        if(j%2==0)
                        System.out.printf("*");
                        else
                        System.out.printf(" ");
                    }
                    else{
                        if(j%2!=0)
                        System.out.printf("*");
                        else
                        System.out.printf(" ");
                    }
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        } */

        //Sandglass pattern---------------------------------------------------------

        /* for(int i=1;i<=n;i++){
            for (int j=1;j<=(2*n)-1;j++){
                if(j>=i && j<=(2*n)-i){
                    System.out.printf("*");
                }
                else
                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*n)-1;j++){
                if(j>=n+1-i&&j<=n-1+i){
                    System.out.printf("*"); 
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        } */

        /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=(n+1)/2){
                    if(j>=i&&j<=n+1-i){
                        System.out.printf("*"); 
                    }
                    else{
                        System.out.printf(" ");
                    }
                }
                else{
                   if(j>=n+1-i && j<=i){
                   System.out.printf("*");
                   }
                else
                  System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        } */

        //Reverse Pyramid------------------------------------------------------------------

        /* for(int i=1;i<=n;i++){
            for (int j=1;j<=(2*n)-1;j++){
                if(j>=i && j<=(2*n)-i){
                    System.out.printf("*");
                }
                else
                System.out.printf(" ");
            }
            System.out.printf("\n");
        } */

        //Diamond Pattern-----------------------------------------------------------------
        
           /* int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=(n+1)/2){
                    if(j>=((n+1)/2)+1-i&&j<=((n+1)/2)-1+i){
                        System.out.printf("*"); 
                    }
                    else{
                        System.out.printf(" ");
                    }
                }
                else{
                   if(j>=i-((n+1)/2)+1 && j<=n-num){
                   System.out.printf("*");
                   }
                else
                  System.out.printf(" ");
                }
            }
            if(i>(n+1)/2){
            num++;
            }
            System.out.printf("\n");
        }   */

        //DIAMOND NUMBER PATTERN -----------------------------------------------------------------

        /* if(n%2==0)
        n-=1;
         int num=1,val;
        int half=(n+1)/2;
        for(int i=1;i<=n;i++){
            if(i<=half)
             val=i;
            else
            val=n+1-i;
            for(int j=1;j<=n+1;j++){
                if(i<=half){
                    if(j>=half+1-i && j<=half-1+i){
                        System.out.printf("%d",val); 
                        if(j<half){
                            val--;
                        }
                        else val++;
                    }
                    else{
                        System.out.printf(" ");
                    }
                }
                else{
                   if(j>=i-half+1 && j<=n-num){
                   System.out.printf("%d",val);
                   if(j<half){
                    val--;
                }
                else val++;
                   }
                else
                  System.out.printf(" ");
                }
            }
            if(i>(n+1)/2){
            num++;
            }
            System.out.printf("\n");
        }  */

        //ALPHABET PATTERN PROGRAM ------------------------------------------------------

        /* for (int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.printf("%c",ch);
                ch++;
            }
            System.out.printf("\n");
        } */

        //Diagonal of a Square ------------------------------------------------------------

        /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=(n+1)/2){
                    if(j==i || j==n+1-i){
                        System.out.printf("*"); 
                    }
                    else{
                        System.out.printf(" ");
                    }
                }
                else{
                   if(j==n+1-i || j==i){
                   System.out.printf("*");
                   }
                else
                  System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        } */

        //Reverse Alphabet Pattern

        /* for (int i=1;i<=n;i++){
            char ch='A';
          for(int j=1;j<=n+1-i;j++){
            System.out.printf("%c",ch);
            ch++;
          }
          System.out.println("\n");
        } */

        //K Shaped Pattern ----------------------------------------------
        /* int half=(n+1)/2;
        
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=half;j++){
                if(i<=half){
                   if(j<=half+1-i){
                   System.out.printf("%c",ch);
                   ch++;
                   }
                   else
                   System.out.printf(" ");
                }
                else{
                    if(j<=half+i-n){
                    System.out.printf("%c",ch);
                    ch++;
                    }
                    else
                    System.out.printf(" ");
                }
            }
            System.out.printf(" \n");
        } */

        //String Pattern ----------------------------------------------

        /* String s=sc.nextLine();
        int len=s.length();
        char[] ch = s.toCharArray();
        for (int i=0,val=1;i<len;i++,val+=2){
            for (int j=0;j<=(2*len);j++){
         if(j<val){
            System.out.printf("%c",ch[i]);
          }
           else{
               System.out.printf(" ");
           }
            }
            System.out.printf("\n");
        } */

        //Number Pattern---------------------------------------------------------------

        /* int num=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf(" %d ",num);
                num++;
            }
            System.out.printf("\n");
        } */

        //Square Number Pattern----------------------------------------------------------

         /* for (int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=n;j++){
                System.out.printf(" %d ",num);
                num++;
            }
            System.out.printf("\n");
        } 
 */
        //Row number triangle pattern----------------------------------------------------

        /* for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf(" %d ",i);
            }
            System.out.printf("\n");
        } */

        //Binary Number Right Angled Triangle ----------------------------------------------

        /* for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0)
                System.out.printf("0");
                else
                System.out.printf("1");
            }
            System.out.printf("\n");
        } */

        //Binary Number Rectangle Pattern ----------------------------------------------------

        /* for(int i=1;i<=n;i++){
            if(i%2==0)
            System.out.printf("01010\n\n");
            else
            System.out.printf("10101\n\n");
        } */
          
        /* int num;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==0){
                    num=0;
                    if(j%2==0){
                        num+=1;
                        System.out.printf("%d",num);
                    }
                    else{
                        num-=1;
                        System.out.printf("%d",num);
                    }
                }
                else{
                    num=1;
                    if(j%2==0){
                        num-=1;
                        System.out.printf("%d",num);
                    }
                    else{
                        num+=1;
                        System.out.printf("%d",num);
                    }
                }
            }
        } */

        //Number pattern horizontal

        /* for (int i=1;i<=n;i++){
            int num=i;
            for (int j=1;j<=n;j++){
                System.out.printf(" %d ",num);
                num+=5;
            }
            System.out.printf("\n");
        } */

        //Decending number pattern program

        
     /*     for(int i=1;i<=n;i++){
            int val=n;
            for(int j=1;j<=n+1-i;j++){
                System.out.printf(" %d ",val);
                val-=1;
            }
            System.out.printf("\n");
        } 
 */
        //Pascal's traingle
        sc.close();
    }
}
