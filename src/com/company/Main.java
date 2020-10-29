package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        //Առաջադրանք 1: իրականացնել XOR օպերատորը. Մուտքին տալ երկու թիվ ու տպել XOR-ի արդյունքը
       // XOR_number(number);
        //մուտքին տալ թիվ. Ստուգել՝ արդյոք պարզ թիվ է, եթե այո, տպել prime
      /*  prime(number);*/
        //Առաջադրանք 3: մուտքին տալ թիվ, տպել թվի ֆակտորիալը
      /*  Fact(number);*/
       // Տրված է ոչ բացասական int num, շարունակաբար գումարեք թվանշանները մինչև ստանաք 1 նիշ ունեցող թիվ։
      /*  Number(number);*/
        //Տրված է int n, որոշել n-ը 2-ի աստիճան է թե ոչ։
      /*  Rank_number(number);*/
        Triangle_two(number);
        Triangle();
    }
    /* static void XOR_number(Scanner number) {

         System.out.print("Թիվ 1 = ");
         int number1 = number.nextInt();
         System.out.print("Թիվ 2 = ");
         int number2 = number.nextInt();
         int t=0;
         int ast=0;
         int max=Math.max(number1,number2);
         while(max!=0)
         {
             if((number1%2==0 && number2%2==1)||(number1%2==1 && number2%2==0)){
                 t+=1* Math.pow(2, ast);
             }
             ast++;
             number1=number1/2;
             number2=number2/2;
             max=max/2;

         }
         System.out.println(number1+" XOR "+number2+" = "+t);

     }*/
   /*  static  void prime(Scanner number){
         System.out.print("number = ");
        int numberPrime=number.nextInt();
        boolean prime=true;
        for(int i=2;i<numberPrime;i++){
            if(numberPrime%i==0){
                prime=false;
                break;
            }
        }
        if (prime==true){
            System.out.println("prime");
        }

     }*/
 /*  static void Fact(Scanner number){
       System.out.print("number = ");
        int factorial_number=number.nextInt();
        int factorial_result=1;
        for(int i=factorial_number;i>=1;i--){
            factorial_result*=i;
       }
        System.out.println(factorial_number+"! = "+factorial_result);
    }*/
   /* static void Number(Scanner number) {
        System.out.print("number = ");
        int num = number.nextInt();
        if (num < 0) {
            System.out.print("number = ");
            num = number.nextInt();
        }
        int sum;
        while (num % 10 != 0 && num % 10 != num) {
        sum=0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;

            }
            num=sum;
        }
        System.out.println(num);

    }*/
    /*static void Rank_number(Scanner number){
        System.out.print("number = ");
        int n=number.nextInt();
        boolean p = false ;
        for (int i = 0;i<n/2;i++){
            if(Math.pow(2,i)==n){
                p=true;
                break;
            }
        }
        System.out.print(p);
    } */
  static  void Triangle_two(Scanner number){
      System.out.print("rang = ");
      int rang=number.nextInt();
      int k=1;
    for (int i=1;i<rang;i++){
        for(int j=rang;j>1;j--){
            if(i<j) {
                System.out.print(" ");
            }

        }
        for (int p=0;p<k;p++){
                System.out.print("*");
        }
        k+=2;
        for(int j=rang;j>1;j--){
            if(i<j) {
                System.out.print(" ");
            }

        }
        System.out.println();
    }

      for (int i=1;i<rang;i++){
          for(int j=rang;j>=0;j--){
              if(i>j) {
                  System.out.print(" ");
              }

          }
          k-=2;
          for (int p=0;p<k;p++){

              System.out.print("*");
          }

          for(int j=rang;j>=0;j--){
              if(i>j) {
                  System.out.print(" ");
              }

          }
          System.out.println();


      }
    }
    static void Triangle(){
        for(int i=1 ; i<=4;i++){
            for(int j=4;j>=0;j--){
                if(i>j)
                { System.out.print("*");}
                else { System.out.print(" ");}
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++){
            for (int j=0;j<=4;j++){
                if(i>j){ System.out.print("*");}
                else { System.out.print(" ");}

            }            System.out.println();

        }
    }
}