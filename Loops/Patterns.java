package Loops;
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
//Lecture 5

public class Patterns {
   public Patterns() {
   }

   public static void main(String[] var0) {
      
      System.out.println("1");
      //1
      
      for(int i = 1; i < 4; i++) {
         for(int j=1;j<5;j++){
               System.out.print("*");
         }
         System.out.println();
      }
      
      System.out.println("2");
      //2

      int n = 4;
      int m = 5;
      for (int i=1; i<=n; i++){
         for(int j=1;j<=m;j++){
            if(i==1 || j==1 || i==n || j==m){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
      
      System.out.println("3");
      //3

      for(int i =1; i<=4; i++){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }

      System.out.println("4");
      //4
      
      for(int i =4; i>=1; i--){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }


      System.out.println("5");
      //5

      int p=4;
      for (int i=1;i<=p;i++){
         for(int j=1;j<=p-i;j++){         //p-1 bcz n value need to change for ever iteration
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
         System.out.print("*");
         }
         System.out.println();
      }
      
      System.out.println("6");
      //6

      for (int i =1;i<=m;i++){
         for(int j=1;j<=i;j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }
      
      System.out.println("7");
      //7

      for(int i=5;i>=1;i--){
         for(int j=1;j<=i;j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }

      for(int i=1;i<=m;i++){
         for(int j=1;j<=m-i+1;j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }

      System.out.println("8");
      //8

      int e=5;
      int num=1;
      for(int i=1;i<=e;i++){
         for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;
         }
         System.out.println();
      }

      System.out.println("9");
      //9

      int s=0;
      for(int i=1;i<=e;i++){
         for (int j=1;j<=i;j++){
            s=i+j;
            if (s%2==0) 
               System.out.print("1 ");
            else
               System.out.print("0 ");
         }
         System.out.println();
      }


   }
}
