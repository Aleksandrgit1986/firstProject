

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Random;
import java.util.WeakHashMap;

public class Test1 {
    public static void main(String[] args) {
        //2.1
           /* Scanner in = new Scanner(System.in);
            System.out.println("input a:");
            int a = in.nextInt();
            System.out.println("input b:");
            int b = in.nextInt();
            System.out.println("input x:");
            int x = in.nextInt();
            double y;
            double k = Math.pow(a,2)+Math.pow(b,2);
            double d = 3* Math.pow(Math.E,a-x) + Math.log(3)/ Math.log(k+5);
            double f = Math.pow(Math.tan(a+b),4);
            if (k>5){
                y = d;
            }
            else if (k<1){
                y = f;
            }
            else{
                y = -3;
            }
            System.out.println(y);

            */


        //2.2
            /*
            Scanner in = new Scanner(System.in);
            System.out.println("input a:");
            int a = in.nextInt();
            System.out.println("input x:");
            int x = in.nextInt();
            double Y;
            double b = Math.pow(1+Math.pow(a,2),6);
            double c = Math.cos(Math.pow(Math.log(Math.abs(x)),2))+Math.pow(x,8);
            if (-5<=x && x<=5){
                Y=b;
            }
            else if(x>5){
                Y=c;
            }
            else {
                Y=a;
            }
            System.out.println("Answer:"+Y);





            //2.3
            /*
            Scanner in = new Scanner(System.in);
            System.out.println("input a:");
            int a = in.nextInt();
            System.out.println("input b:");
            int b = in.nextInt();
            System.out.println("input x:");
            int x = in.nextInt();
            double Y;
            double k = a + Math.abs(b);
            double c = Math.pow(Math.E,Math.abs(a+x))*Math.pow(Math.cos(a+x+b),2);
            double n = Math.cbrt(Math.atan(a+x));
            if (k<-5){
                Y = c;
            }
            else if(k>2){
                Y = n;
            }
            else {
                Y = k;
            }
            System.out.println(Y);

             */
        //2.4

        //        Scanner in = new Scanner(System.in);
        //        System.out.println("input a:");
        //        int a = in.nextInt();
        //        System.out.println("input b:");
        //        int b = in.nextInt();
        //        double Y;
        //        double k = a+b;
        //        double c = Math.pow(Math.atan(k),4);
        //        double m = Math.pow(Math.log(8)/Math.log(k),2);
        //        double n = Math.pow(a,15);
        //        if (k<3) {
        //            Y =c;
        //        }
        //        else if (k>5){
        //            Y=m;
        //        }
        //        else {
        //            Y=n;
        //        }
        //        System.out.println(Y);
        //2.5


        //        Scanner in = new Scanner(System.in);
        //        System.out.println("input c:");
        //        int c = in.nextInt();
        //        System.out.println("inputb b:");
        //        int b = in.nextInt();
        //        System.out.println("input x:");
        //        int x = in.nextInt();
        //        System.out.println("input a:");
        //        int a = in.nextInt();
        //            double Y;
        //            double n = b+Math.pow(Math.tan(c+a),5);
        //            double t = Math.pow(Math.log(Math.abs(x)),2);
        //            double m = Math.cos(t)+Math.pow(x,8);
        //            if (-1<c && c<1){
        //                Y=n;
        //            }
        //            else if (c<=-1) {
        //                Y = m;
        //            }
        //            else {
        //                Y=Math.pow(a,-10);
        //            }
        //        System.out.println(Y);


        //2.6

            /*Scanner in = new Scanner(System.in);
            System.out.println("input a:");
             int a = in.nextInt();
            System.out.println("input x:");
            int x  = in.nextInt();
            double Y;
            double n = Math.pow(Math.sin(Math.abs(x+a)),2);
            double m = n+Math.pow(Math.cos(Math.pow(x,2)),2);
            double l = Math.pow(Math.pow(a,2)+Math.pow(x,2),1/4d);
            double v = Math.log(2)/Math.log(Math.pow(a,2)+Math.pow(x,4));
             double g = l*v;
             if (Math.abs(a)<3){
                 Y=m;
             }
             else{
                 Y=g;
             }
            System.out.println(Y);

             */


        //2.7
        //        Scanner in =  new Scanner(System.in);
        //        System.out.println("input a:");
        //        int a = in.nextInt();
        //        System.out.println("input z:");
        //        int z = in.nextInt();
        //        double Y;
        //        double k = Math.abs(a);
        //        double c = 4+Math.pow(a,2);
        //        double m =Math.tan(z+a);
        //        double r = Math.pow(Math.log(2)/Math.log(c),5)+m;
        //        double n = Math.pow(Math.pow(z,4)+4*a,5);
        //        if(k>3){
        //            Y=r;
        //        }
        //        else{
        //            Y=n;
        //        }
        //        System.out.println(Y);

        //2.8

     /*       Scanner in = new Scanner(System.in);
           System.out.println("input x:");
            int x = in.nextInt();
            System.out.println("input z:");
            int z = in.nextInt();
            double Y;
            double n = Math.pow(Math.abs(x)+2*Math.abs(z),1/4f)+ Math.pow(Math.E,Math.abs(x+1));
            double a = Math.pow(Math.tan(Math.pow(x+z,7)),2);
            if (1<=x&&x<+7){
                Y=n;
            }
            else {
                Y=a;
            }
            System.out.println(Y);

      */


        //2.9
        /**
         Scanner in = new Scanner(System.in);
         System.out.println("input a:");
         int a = in.nextInt();
         System.out.println("input b:");
         int b = in.nextInt();
         System.out.println("input c:");
         int c = in.nextInt();
         double Y;
         double k = a+b;
         double n = Math.pow(1/Math.tan(Math.pow(a,2)+Math.pow(b,2)+c),2);
         double m = Math.pow(10,-7);
         if (k<7){
         Y=n;
         }
         else {
         Y=m;
         }
         System.out.println(Y);
         **/

        //2.10
           /* Scanner in = new Scanner(System.in);
            System.out.println("input a:");
            int a = in.nextInt();
            System.out.println("input b:");
            int b = in.nextInt();
            System.out.println("input x:");
            int x = in.nextInt();
            double Y;
            double n = Math.pow(Math.E,Math.cos(x+a+b));
            double r = Math.tan(a+Math.pow(b,2));
            double t = n*r;
            double m = Math.log(3)/Math.log(4+Math.pow(a,2)+Math.pow(b,2));
            if (a<3){
                Y=t;
            }
            else {
                Y=m;
            }
            System.out.println(Y);

            */


            /*Scanner in = new Scanner(System.in);
            System.out.println("What is your name?:");
            String c = in.nextLine();
            System.out.println("Hello "+c);

             */
        //        int s= 0;
        //        int k =1;
        //        while (s<66){
        //            k=k+3;
        //            s=s+k;
        //            System.out.printf("s=%d;k=%d \n",s,k);
        //        }
        //       int n = 1;
        //        int s = 0;
        //        while (n  <= 101) {
        //            s = s + 7;
        //            n = n + 1;
        //            System.out.println(s);
        //        }
        //        int personWeight,liftCapacity,numberOfPersons;
        //
        //
        //        personWeight=80;
        //        liftCapacity=1000;
        //        numberOfPersons = liftCapacity/personWeight;
        //        System.out.print("lift can lift ");
        //        System.out.print(numberOfPersons);
        //        System.out.print(" persons");

        //        String a = "jkkojhujikojjhhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjmjkkl" +
        //                "kkkkkll;lkjmmm,";
        //        System.out.println(a);
        //        int n = 12;
        //        n++;
        //        n--;
        //        System.out.println(n);

        //       int x = 10;
        //       while (x>4){
        //           x = x-10;
        //           System.out.println("hello");
        //        for (int i =45;i>=10;i-=9){
        //            System.out.println("hello");
        //        }
        /** int a = 7;
         while (a<98) {
         a += 7;
         System.out.println(a + "");

         }**/
        //Необходимо вывести на консоль такую последовательность чисел:
        //
        //1 2 4 8 16 32 64 128 256 512
           /* int c=2;
            while (c<512){
                c*=2;
                System.out.println(c);
             }
            */
        //Необходимо вывести на экран числа от 1 до 5. На экране должно быть:
        //
        //1 2 3 4 5
           /* int s = 0;
            while (s<5){
                s=1+s;
                System.out.println(s);
            }

            */
          /*Scanner my = new Scanner(System.in);
            System.out.println("input a:");
            int a = my.nextInt();
            System.out.println("input b: ");
            int b = my.nextInt();
            System.out.println("input x: ");
            int x = my.nextInt();
            double Y;
            double q = Math.pow(Math.E,Math.cos(x+a+b))*Math.tan(a+Math.pow(b,2));
            double c = Math.log(3)/Math.log(4+Math.pow(a,2)+Math.pow(b,2));
            // пишем условия
            if(a<3){
                Y=q;
            }
            else {
                Y=c;
            }
            System.out.println(Y);

           */
        //        int a =7;
        //        int b = ++a;
        //        System.out.println(a);
        //        System.out.println(b);


        //        int a =7;
        //        int b = a++;
        //        System.out.println(a);
        //        System.out.println(b);


        //        Scanner in = new Scanner(System.in);
        //        System.out.println("input a");
        //        int a= in.nextInt();
        //        System.out.println("input b");
        //        int b = in.nextInt();
        //
        //   boolean z = a>b? true:false;

            /*  Scanner in = new Scanner(System.in);
            System.out.println("input a:");
            int a = in.nextInt();
            System.out.println("input b:");
            int b = in.nextInt();
            System.out.println("input c:");
            int c = in.nextInt();
           if (a+b>c & a+c>b & b+c>a ){
               double y =1;
            }
           else{

               double y=2;
            }
             */
        //1
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            if (a>c & a>b){
                System.out.println(a);
            }
            else if (b>a & b>c ){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }*/

        //2
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            if (a<c & a<b){
                System.out.println(a);
            }
            else if (b<a & b<c ){
                System.out.println(b);
            }
            else {
                System.out.println(c);

             */
        //2.1
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            int s =Math.min(a,b);
            int r = Math.min(s,c);
                System.out.println(r);

             */
        //3
          /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();
            if (a==1 || b==1 || c==1){
                System.out.println("true");

            }
                else{
                System.out.println("false");
            }
    */
        //3.1
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();
            boolean z = a==1 || b==1 || c==1? true:false;

            System.out.println(z);

             */
        //4
          /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();
           /* boolean z = (a==2 & b==2) || (c==2 & b==2) || (a==2 & c==2) ? true:false;
            System.out.println(z);

            */
        //5
          /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();
            int z = a+b>c && a+c>b&& c+b>a? 1:2;
            System.out.println("Y= "+z);

           */

        //6
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
           int c =noWay.nextInt();
            int z = a%2==0|| b%2==0 || c%2==0 ? 1:2;
            System.out.println(z);
             */
        //7
           /*   Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();
            boolean z = b-a==c-b? true:false;
            System.out.println(z);

            */
        //8
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();
            if (b/a==c/b){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

            */
        //9
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();

            if (a<b & a<c &b<c){//1
                System.out.println(a+""+b+""+c);
            }
            if (b<a & b<c & a<c){//2
                System.out.println(b+""+a+""+c);
            }
            if (c<a & c<b & a<b){//3
                System.out.println(c+""+a+""+b);
            }
            if (a<b & a<c &c<b){//1.1
                System.out.println(a+""+c+""+b);
            }
            if (b<a & b<c & c<a){//2.1
                System.out.println(b+""+c+""+a);
           }
            if (c<a & c<b & b<a) {//3.1
                System.out.println(c + "" + b + "" + a);
            }
    */

        //10
            /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c =noWay.nextInt();

            if (a>b & a>c &b>c ){//1
                System.out.println(a+" "+b+" "+c);
            }
            if (b>a & b>c & a>c){//2
                System.out.println(b+" "+a+" "+c);
            }
            if (c>a & c>b & a>b){//3
                System.out.println(c+" "+a+" "+b);
            }
            if (a>b & a>c &c>b ){//1.1
                System.out.println(a+" "+c+" "+b);
            }
            if (b>a & b>c & c>a){//2.1
                System.out.println(b+" "+c+" "+a);
            }
            if (c>a & c>b & b>a){//3.1
                System.out.println(c+" "+b+" "+a);

             */


        //14.

            /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();
          /*  boolean Z = a + b == c + d ? true: false;
            System.out.println(Z);
           */
            /*//12
             Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();
        int z = Math.min(a,b);
        int s = Math.min(c,d);
        int x = Math.min(z,s);
            System.out.println(x);

             */ //16
    /*
            Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();

            if (a%2!=0 && b%2!=0 ||a%2!=0 && c%2!=0 ||c%2!=0 && b%2!=0 || a%2!=0 && d%2!=0 || b%2!=0 && d%2!=0 || c%2!=0 && d%2!=0 ){
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }

     */
        //18
            /*
            Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();
            if (b/a== d/c){
                System.out.println("true");

            }
            else {
                System.out.println("false");
            }

             */

        //20
        //1
            /*   Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();

            if (a>b && a>c && a>d & b>c & b>d & c>d){
                System.out.println(a+" "+b+" "+c+" "+d );
            }
           else if (a>b && a>d &&a>c && b>d && b>c &&d>c  ){
                System.out.println(a+" "+b+" "+d+" "+c );
            }
           else if (a>d && a>b && a>c && d>b && d>c && b>c ){
                System.out.println(a+" "+d+" "+b+" "+c);
            }
           else if(a>d && a>c && a>b && d>c && d>b && c>b){
                System.out.println(a+""+d+""+c+""+b);
            }
           else if (a>c && a>d && a>b &&c>d && c>b && d>b){
                System.out.println(a+""+c+""+d+""+b);
            }
           else if(a>c && a>b && a>d &&c>b && c>d &&b>d){
                System.out.println(a+""+c+""+b+""+d);
            }
           //2
            else if (b>a && b>c && b>d && a>c & a>d & c>d) {
                System.out.println(b+""+a+""+c+""+d);

            }
            else if(b>d && b>a && b>c && d>a && d>c && a>c){
                System.out.println(b+""+d+""+a+""+c);
            }
           else if (b>c && b>d && b>a && c>d && c>a && d>a ){
                System.out.println(b+""+c+""+d+""+a);
            }
           else if (b>a && b>d && b>c && a>d && a>c && d>c){
                System.out.println(b+""+a+""+d+""+c);
            }
           else if (b>c && b>a && b>d && c>a && c>d && a>d){
                System.out.println(b+""+c+""+a+""+d);
            }
           else if(b>d && b>c && b>a && d>c && d>a && c>a) {
                System.out.println(b +""+d+""+c+""+a);
            }


        //3
        else if(c>a  && c>b && c>d && a>b && a>d && b>d){
            System.out.println(c+""+a+""+b+""+d);
        }
        else if (c>a && c>d && c>b && a>d && a>b && d>b){
                System.out.println(c+""+a+""+d+""+b);
            }
        else if (c>b && c>d && c>a && b>d && b>a && d>a){
                System.out.println(c+""+b+""+d+""+a);
            }
        else  if (c>b && c>a && c>d && b>a && b>d && a>d){
                System.out.println(c+""+b+""+a+""+d);
            }
        else  if (c>d && c>a && c>b && d>a && d>b && a>b){
                System.out.println(c+""+d+""+a+""+b);
            }
        else if (c>d  && c>b && c>a && d>b && d>a && b>a){
                System.out.println(c+""+d+""+b+""+a);
            }

        //4
            else if (d>a && d>c && d>b && a>c && a>b && c>b){
                System.out.println(d+""+a+""+c+""+b);
            }
            else if (d>a && d>b && d>c && a>b && a>c && b>c){
                System.out.println(d+""+a+""+b+""+c);
            }
            else if (d>b && d>a && d>c && b>a && b>c && a>c){
                System.out.println(d+""+b+""+a+""+c);
            }
            else if (d>b && d>c && d>a && b>c && b>a && c>a){
                System.out.println(d+""+b+""+c+""+a);
            }
            else if (d>c && d>a && d>b && c>a && c>b && a>b ){
                System.out.println(d+""+c+""+a+""+b);
            }
            else if (d>c && d>b && d>a && c>b && c>a && b>a){
                System.out.println(d+""+c+""+b+""+a);
            }

             */
        //11
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();
            int q = Math.max(a,b);
            int v = Math.max(c,d);
            int x = Math.max(q,v);
            System.out.println("Answer: "+x);

            */
        //13
         /*   Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();
            boolean z = a==1 || b==1 || c==1 || d==1? true:false;
            System.out.println(z);

          */
        //15
            /*
            Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();
          if (a==b+c+d){
              System.out.println("true");
          }
          else if (b==a+c+d){
              System.out.println("true");
          }
          else if (c==a+b+d){
              System.out.println("true");
          }
          else if (d==a+b+c){
              System.out.println("true");
          }
          else {
              System.out.println("false");
          }

             */
        //17
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            System.out.println("input b: ");
            int b = noWay.nextInt();
            System.out.println("input c: ");
            int c = noWay.nextInt();
            System.out.println("input d: ");
            int d = noWay.nextInt();
            boolean x = b-a==d-c? true:false;
            System.out.println(x);

            */
        //       double x = Math.round(2.5);//3
        //        //System.out.println(x);
        //        double z = Math.ceil(2.5); //3
        //        double s = Math.floor(2.5); //2
        //        double e = Math.random();
        //        System.out.println(e);

        //1

            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y =0;
            double a = Math.sin(5*x);
            double v = Math.tan(1+x);
            double n = 1/(1+x);
            if (x>=-1 && x<=0){
                y=a;
            }
            else if (x>=0 && x<1){
                y=v;
            }
            else if(x>=1 && x<=2){
                y=n;
            }
            System.out.println(y);

             */
        //3
          /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y =0;
            if (x<=0 && x<0.8){
                y=Math.tan(x)/2;
            }
            else if (x<=0.8 && x<1.3){
                y=Math.sin(x)/x;
            }
            else if (x>=1.3 && x<=2){
                y=Math.pow(x,3);
            }
            System.out.printf("y=%f \n",y);

           */
        //2
          /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=1 && x<2){
                y=x;
            }
        else if (x>=2 && x<3){
            y=2+Math.cos(x);
            }
        else if (x>=3 && x<=4){
            y=Math.log10(6*x);
            }
            System.out.println(y);

           */
        //4
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=-2 && x<-1.4){
                y=4*Math.pow(Math.E,x);
            }
            else if (x>=-1.4 && x<-0.4){
                y=Math.pow(x,2)+2*x;
            }
            else if (x>=-0.4 && x<=0){
                y=Math.PI;
            }
            System.out.println(y);

            */
        //5
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=0.1 && x<0.8){
                y=Math.atan(x);
            }
            else if (x>=0.8 && x<1.3){
                y=Math.cos(x)*Math.sin(x);
            }
            else if (x>=1.3 && x<=1.8 ){
                y=(Math.pow(Math.E,x)+Math.pow(Math.E,-x))/2;
            }
            System.out.println(y);

             */
        //6
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=-0.5 && x<0){
                y=Math.abs(x);
            }
            else if (x>=0 && x<0.5){
                y=2+x;
            }
            else if (x>=0.5 && x<=1){
                y=Math.pow(2,x)+1;
            }
            System.out.println(y);

             */
        //7
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=1 && x<3){
                y=10/(x+1.5);
            }
            else if (x>=3 && x<5){
                y=Math.pow(2,x)-2;
            }
            else if (x>=5 && x<=7){
                y=Math.sqrt(Math.PI*x);
            }
            System.out.printf("y=%f \n",y);

            */
        //8
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=-1 && x<0){
                y=x*(3-x);
            }
            else if (x>=0 && x<1){
                y=1;
            }
            else if (x>=1 && x<=2){
                y=Math.tan(2*x);
            }
            System.out.printf("y=%f ",y);

             */
        //9
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=-1 && x<0){
                y=Math.pow(Math.E,x)/(Math.pow(Math.E,-x)+Math.PI-1);
            }
            else if (x>=0 && x<=1){
                y=(20*Math.sin(x))/Math.pow(2+x,3);
            }
            System.out.println(y);

             */
        //10
            /* Scanner noWay = new Scanner(System.in);
            System.out.println("input x");
            double x = noWay.nextDouble();
            double y=0;
            if (x>=0 && x<0.5){
                y=Math.PI*Math.cos(x);
            }
            else if (x>=0.5 && x<=1){
                y=x*Math.tan(x)-Math.log(x);
            }
            System.out.println(y);

             */
        //старые задания где было 1 условия,сделать через тернар.
        //2.6
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input x:");
            double x = noWay.nextDouble();
            System.out.println("input a:");
            double a = noWay.nextDouble();

            double s=Math.pow(Math.sin(Math.abs(x+a)),2) + Math.pow(Math.cos(Math.pow(x,2)),2);
            double q=Math.pow(Math.pow(a,2)+Math.pow(x,2),1/4d)* Math.log(2)/Math.log(Math.pow(a,2)+Math.pow(x,4));
            double y  = Math.abs(a)<3? s:q;
            System.out.printf("y=%f",y);

            */
        //2.7
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input a");
            double a = noWay.nextDouble();
            System.out.println("input z:");
            double z =noWay.nextDouble();
            double w=Math.pow(Math.log(2)/Math.log(4+Math.pow(a,2)),5)+Math.tan(z+a);
            double c=Math.pow(Math.pow(z,4)+4*a,5);
            double y= Math.abs(a)>3?  w:c;
            System.out.printf("y=%f",y);

             */
        //2.8
    /*        Scanner noWay = new Scanner(System.in);
            System.out.println("input x:");
            double x = noWay.nextDouble();
            System.out.println("input z:");
            double z = noWay.nextDouble();
            double d = Math.pow(Math.abs(x)+2*Math.abs(z),1/4d)+Math.pow(Math.E,Math.abs(x+1));
            double o = Math.pow(Math.tan(Math.pow(x+z,7)),2);
            double y= x>=1 && x<=7? d:o;
            System.out.printf("y=%f",y);

     */
        //2.9
           /* Scanner noWay = new Scanner(System.in);
            System.out.println("input a:");
            double a = noWay.nextDouble();
            System.out.println("input b:");
            double b = noWay.nextDouble();
            System.out.println("input c:");
            double c =noWay.nextDouble();
            double r=Math.pow(1/Math.tan(Math.pow(a,2)+Math.pow(b,2)+c),2);
            double w =Math.pow(10,-7);
            double y = a+b<7? r:w;
            System.out.printf("y=%f",y);

            */
        //20
    /*        Scanner noWay = new Scanner(System.in);
            System.out.println("input a:");
            double a = noWay.nextDouble();
            System.out.println("input b:");
            double b = noWay.nextDouble();
            System.out.println("input x:");
            double x =noWay.nextDouble();
            double w =Math.pow(Math.E, Math.cos(x+a+b))*Math.tan(a+Math.pow(b,2));
            double i =Math.log(3)/Math.log(4+Math.pow(a,2)+Math.pow(b,2));
            double y = a<3? w:i;
            System.out.printf("y=%f",y);

     */// чтобы вычислить логарифм сначало нужно подлогарифмическое выражение поделить на основание!!!
            /*double x =Math.pow(Math.log(3)/Math.log(9),3);
            //System.out.println(x);
            double s=Math.log(1/125d)/Math.log(1/5d);
            double m = Math.pow(Math.log(s)/Math.log(3),2);
            System.out.println(m);

             */
        //23
        /*    Scanner noWay = new Scanner(System.in);
            System.out.println("input n:");
             int n= noWay.nextInt();
            System.out.println("input k:");
            int k= noWay.nextInt();
            int a = n%10;
            int b = n/10%10;
            int c =n/100;
            if(n<100 || n>1000) {
                System.out.println("input n");
                n=noWay.nextInt();

                if (n > k) {
                    double s = n / (a + b + c);
                    System.out.println(s);
                } else {
                    double f = n / k;
                    System.out.println(f);
                }
            }*/
        //25
          /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input n:");
            int n= noWay.nextInt();
            int a = n%10;
            int b = n/10%10;
            int c =n/100;
                n = noWay.nextInt();
                double o = Math.min(a, b);
                double r = Math.min(o, c);
                System.out.println(r);

           */
        //27
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input n:");
            int n= noWay.nextInt();
            int a = n%10;
            int b = n/10%10;
            int c =n/100;
            if (n>300){
                double s = b/a;
                System.out.println(s);
            }
            else {
                double y = c/a;
                System.out.println(y);
            }

             */
        //28
            /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input n:");
            int n= noWay.nextInt();
               int a = n%10;
            int b = n/10%10;
            int c =n/100;
            if (b+c<5){
                char f ='a';
                System.out.println(f);
            }
            else {
                char y ='b';
                System.out.println(y);
            }

             */
        //домашняя работа
        //21. Присвойте переменной типа int значение true, если единица трехзначного числа равна сумме цифр десятков и сотен,иначе false.Выразить значение переменной int.
           /* Scanner room = new Scanner(System.in);
            System.out.println("input n");

            int n = room.nextInt();
            int b = n%10;
            int m = n/10%10;
            int l =n/100;

            String u = b==m+l?  "True":"False";
            System.out.println(u);

            */


        //22. Присвойте значение логической пременной true,если в трехзначном числе есть одинаковые цифры,иначе false.
            /*Scanner room = new Scanner(System.in);
            System.out.println("input n");
            int n = room.nextInt();
            int b = n%10;
            int m = n/10%10;
            int l =n/100;
            if (b==m || b==l ||l==m ) {
                boolean y = true;
                System.out.println(y);
            }
            else {
                boolean p =false;
                System.out.println(p);
            }

             */
        //24.Выразить и вычислить наибольшее из трехзначных цифр.
            /* Scanner room = new Scanner(System.in);
            System.out.println("input n");
            int n = room.nextInt();
            int b = n%10;
            int m = n/10%10;
            int l =n/100;
            if (b>m && b>l){
                System.out.println(b);
            }
            else if (m>b && m>l){
                System.out.println(m);
            }
            else  if (l>m && l>b){
                System.out.println(l);
            }

             */
        //30.Отобразить цифры трехзначного числа в порядке убывания.
            /* Scanner room = new Scanner(System.in);
            System.out.println("input n");
            int n = room.nextInt();
            int b = n%10;
            int m = n/10%10;
            int l =n/100;
           if (b>m && b>l && m>l){
               System.out.println(b+" "+m+" "+l);
           }
           else if (b>l && b>m && l>m){
               System.out.println(b+" "+l+" "+m);
           }
            else if (m>b && m>l && b>l){
               System.out.println(m+" "+b+" "+l);
           }
            else if (m>l && m>b && l>b){
               System.out.println(m+" "+l+" "+b);
           }
            else if (l>m && l>b && m>b){
               System.out.println(l+" "+m+" "+b);
           }
            else if (l>b && l>m && b>m){
               System.out.println(l+" "+b+" "+m);
           }

             */

         /*   Scanner noWay =new Scanner(System.in);
            System.out.println("input number");
            int number = noWay.nextInt();
            System.out.println( "your number is: " +number);

          */
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input n:");
            int n= noWay.nextInt();
            System.out.println("input k:");
            int k= noWay.nextInt();
            System.out.println(n+k);

             */
//           int a =8;
//            int b =--a;
//            System.out.println(a);
//            System.out.println(b);


            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input n:");
            int n= noWay.nextInt();
            if (n%2==0) {
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }

             */
            /*   int x =5;
            int y =6;
            System.out.printf("x=%d,y=%d ",x,y);

             */

         /*13   Scanner CR7 = new Scanner(System.in);
            System.out.println("input four digit number: ");
            int  number = CR7.nextInt();
            System.out.println("input k: ");
            int  k = CR7.nextInt(); 12345
            int a = number%10;
            int b = number%100/10;
            int c = number%1000/100;
            int d = number/1000;
            if (d+a>k){
                System.out.println(d/b);
            }
            else {
                System.out.println(d/a);
            }

          */
        //14
            /*Scanner CR7 = new Scanner(System.in);
            System.out.println("input n: ");
            int n = CR7.nextInt();
            if (n>0 && n<10){
                System.out.println("1");
            }
            else if (n>=10 && n<100){
                System.out.println("2");
            }
            else if (n>=100 && n<1000){
                System.out.println("3");
            }
            else if (n>=1000 && n<10000){
                System.out.println("4");

            }
            else if (n>=10000 && n<100000){
                System.out.println("5");
            }
            else if (n>=100000 && n<1000000){
                System.out.println("6");
            }
            else if (n>=1000000 && n<10000000){
                System.out.println("7");
            } else if (n>=10000000 && n<100000000) {
                System.out.println("8");
            }
            else if (n>=100000000 && n<1000000000){
                System.out.println("9");
            }
            else if (n>=1000000000 && n<2147483647){
                System.out.println(10);
            }

            else {


                System.out.println("0");
            }

             */


        //16.
            /*Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            boolean x = a== 0;
            System.out.println(x);
            */

        ///14
          /*  Scanner noWay = new Scanner(System.in);
            System.out.println("input a: ");
            int a = noWay.nextInt();
            int length = String.valueOf(a).length();
            System.out.println(length);

           */





          /*  float qqqq = 50.22f;
            float l = qqqq + 1000000f;
            System.out.println(l);

           */
          /* char little = 'b';
           char big = Character.toUpperCase(little);
            System.out.println(big);

           */
            /* Scanner noWay = new Scanner(System.in);
            System.out.println("input number from 1 to 5 : ");
            int userNumber = noWay.nextInt();
            Random ronaldo = new Random();
            int randomNumber = ronaldo.nextInt(5)+1;
            if (userNumber == randomNumber)              //если инструкция в иф одна, то можно не ставить скобки блока.
                System.out.println("win!!!");

            else {
                System.out.println("you played");
                System.out.println("random number is "+randomNumber );
            }
            System.out.println("Thanks for game!!");



             */
          /*    Scanner keyboard = new Scanner(System.in);
           int numGuesses=0;
           Random opop = new Random();
           int randomNumber =opop.nextInt(10)+1;
            System.out.println("input number 1 to 10");
            int inputNumber = keyboard.nextInt();
            numGuesses++;
            while(inputNumber != randomNumber){
                System.out.println("try again");
                System.out.println("input number 1 to 10");
                inputNumber = keyboard.nextInt();
                 numGuesses++;
            }
            System.out.println("you win after " + numGuesses +" attempts");

           */


        /** for (int a=0;a<10;a++){
         System.out.println("a="+ a);
         }
         **/
        /* final int a=5, b =7, c=8 ,d=7;

            switch (b){
                case a:
                    System.out.println("yes");
                    break;
                case d:
                    System.out.println("yes");
                    break;
                case c:
                    System.out.println("yes");
                    break;
                default:
                    System.out.println("no");

            }

         */

        //41 // в данном цикле фор,в взависимости от диапозона i задача имеет различные решения.
        // Цикл выведет сумму натуральных чисел которые делятся на 2 без остатка.
        //Ответ:2 ,2+4= 6, 6+6=12 , 12+8 =20.
        // каждое последющее число является суммой предыдущего и нынешнего.
//        int n=2;
//            int sum=0;
//            for (int i = 1; i<100 ; i++) {
//                if (i % n == 0) {
//                    sum = sum + i;
//
//                }
//            }
//                System.out.println(sum);


        //        Scanner noWay = new Scanner(System.in);
        ////        System.out.println("input n: ");
         /*   int sum =1;
            for (int i = 10; i <100 ; i++) {
                if(i%3==0 && (i&5)==0){
                    sum = i*sum;

                }
            }


            System.out.println(sum);

          */

        //50
         /*   boolean t=false;
            for (int i = 100; i <1000 ; i++) {
                for (int j = 10; j <100 ; j++) {
                    if(i*16==Math.pow(j,2)){
                        t=true;
                        System.out.println(i);
                        break;

                    }


                }
                if(t){
                    break;

          */

            /*    Scanner noWay = new Scanner(System.in);
            System.out.println("input n: ");
            int n = noWay.nextInt();
            boolean t=false;
            for (int i = 1; i <10 ; i++) {
            if(n==Math.pow(i,3)) {

               break;

            }
            else {
                t=false;
                break;

            }


            }
            System.out.println(t);

             */

        //        for (int i = 0; i <10 ; i++) {
        //            System.out.println(i);
        //        }


        //        int i =1;
        //        for (; i<10 ; ) {
        //            System.out.println(i);
        //            i++;

        //        for (;;){
        //            System.out.println("1");
        //        }
//            int a =1;
//            while (a<10) {
//                System.out.println(a);
//                a++;
//            }

//        int r =10;
//        while (r>2){
//            System.out.println(r);
//            r--;
//        }
        //42
      /*  int n =2;
        int multi =1;
        for (int i = 1; i <11 ; i++) {
            if(i%n==0){
               multi*=i;
            }
                System.out.println(multi);

        }

       *///43
      /* int n = 2;
        int sum = 0;
        for (int i = 1; i <21; i++) {
            if (i%n==0){
                sum+=i;
                System.out.println(sum);
            }
        }

       *///44
//        int n =5;
//        int multi=1;
//        for (int i = 1; i <100 ; i++) {
//            if (i%n==3){
//                multi*=i;
//            }
//        }
//                System.out.println(multi);


        //45
//        int n =3;
//        int sum =0;
//        for (int i = 10; i <100 ; i++) {
//           if(i%n==0) {
//               sum += i;
//           }
//        }
//               System.out.println(sum);


        //46
//        long multi =1;
//        for (long i = 100; i <1000 ; i++) {
//            if (i%3==0 && i%5==0){
//                multi*=i;
//            }
//        }
//                System.out.println(multi);



        //47
        /*int sum = 0;
        for (int i = 100; i <1000 ; i++) {
            if(i%5!=0){
                sum+=i;
                System.out.println(sum);
            }

        }

         *///48
       /* long multi =1;
        for (long i = 100; i <1000 ; i++) {
            if (i%2!=0 && i%3!=0){
                multi*=i;
                System.out.println(multi);
            }
        }

        */

        //49
        /*long multi =1;
        for (int i = 100; i <1000 ; i++) {
            if (i%3==1 && i%4==2){
                multi*=i;
                System.out.println(multi);
            }
        }

         *///50
//        boolean t=false;
//        for (int i = 107; i < 1000; i++) {
//            for (int j = 2; j < 100; j++)
//                if (i == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//
//                }
//
//                if (t) {
//
//                    break;
//                }
//
//
//        }
//


        //51
//        boolean t=false;
//        for (int i = 1000; i <10000 ; i++) {
//            for (int j = 100; j <1000 ; j++)
//                if (j % 2 == 0 && i*26 == Math.pow(j, 2)) {
//                    t=true;
//                    System.out.println(i +" "+j);
//                    break;
//            }
//            if (t)break;
//
//
//    }


        //52
//        boolean t=false;
//        for (int i =9999; i>=1000; i--) {
//            for (int j = 1000; j >=100 ; j--)
//                if (i*14==Math.pow(j,2)) {
//                     t=true;
//                    System.out.println(i +" "+j);
//                    break;
//                }
//            if (t)break;
//        }

        //53
//        boolean t=false;
//        for (int i = 9999; i>=1000 ; i--) {
//            for (int j =1000; j >=10 ; j--)
//                if (i*18==Math.pow(j,2)) {
//                    t=true;
//                    System.out.println(i+" "+j);
//                    break;
//
//                }
//            if (t)break;
//        }


        //54
//        boolean t=false;
//        Scanner noWay = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = noWay.nextInt();
//        for (double i = 100; i <1000 ; i++) {
//                if ( Math.sqrt(i)>n){
//                    t=true;
//                    System.out.println(i);
//                    break;
//                }
//                if (t)break;
//
//
//
//        }


        //55
    /*    boolean t = false;
        Scanner noWay = new Scanner(System.in);
        System.out.println("input n: ");
        int n = noWay.nextInt();
        int k = 0;
        for (int i = 1; i < 10; i++) {
            if (n == Math.pow(i, 3)) {
                k = i;
            }
        }
        if (n == Math.pow(k, 3)) {
            System.out.println("true");
        } else {

            System.out.println("false");

        }

     *///57
     /*  Scanner noWay = new Scanner(System.in);
        System.out.println("input number");
        int n= noWay.nextInt();
        int count =0;
        while (n!=0 ){

            n/=10;
            count++;
        }
        System.out.println(count);

      */

//
//        Scanner noWay = new Scanner(System.in);
//        System.out.println("input number");
//        int n= noWay.nextInt();
//        int multi =1;
//        while (n!=0 ){
//
//            multi*=n%10;
//            n=n/10;
//
//        }
//        System.out.println(multi);


        //57
//        int n=5347;
//        int count=0;
//        while (n != 0) {
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);

//        int count=0;
//        for (int n = 5347; n !=0 ; n/=10) {
//            count++;
//        }
//        System.out.println(count);


//61
//        Scanner noWay = new Scanner(System.in);
//        System.out.println("input number");
//        int n = noWay.nextInt();//236
//        int num = 0;
//        int sum = 0;
//        for (int i = 1; ; i *= 10) {
//            num = n / i % 10 * i;//6;
//            sum += num;//6+30+200
//
//            if (num == 0) {
//                break;
//            }
//        }
//        System.out.println(sum);





        //52
//        boolean t =false;
//        for (int i = 10000; i > 1000; i--) {
//
//            for (int j = 100; j > 10; j--) {
//
//
//                if (i * 14 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//                }
//            }
//
//        }

/*
        for (int i = 1; i <=10 ; i++) {
            int n=i*3;
            System.out.println(n);
        }

 */
        /*   Scanner CR7 = new Scanner(System.in);
        System.out.println("input number: ");
        int a = CR7.nextInt();
        int sum=0;
        for (int i = 1; i <=a ; i++) {
            sum +=i;


        }
        System.out.println(sum);


         */
       /* Scanner noWay = new Scanner(System.in);
        System.out.println("input number");
        int n = noWay.nextInt();//236
        int num = 0;
        int sum = 0;
        for (int i = 1; ; i *= 10) {
            num = n / i % 10 * i;//6;
            sum += num;//6+30+200

            if (num == 0) {
                break;
            }
        }
        System.out.print(sum +" ");

        */
        //цикл задачи
        //1
       /* for (int i = 1; i <=5 ; i++) {
            System.out.print(i+" ");

        }

        */

/*    //2    for (int i = 5; i>=1 ; i--) {
            System.out.print(i+" ");
        }

 */
        //3
       /* for (int i = 1; i <=10; i++) {
            int a = 3*i;
        System.out.println( "3*"+i+ "=" +a);
        }

        */
      /*  Scanner prime = new Scanner(System.in);
        System.out.println("input number: ");
        int t = prime.nextInt();
        int sum =0;
        for (int i = 1; i <=t ; i++) {
            sum+=i;
        }
            System.out.println("sum 1 to " + t +" = "+sum);

       */

        /*for (int i = 1; i <=10 ; i++) {
            int m = 2*i;
            System.out.println("2 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 3*i;
            System.out.println("3 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 4*i;
            System.out.println("4 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 5*i;
            System.out.println("5 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 5*i;
            System.out.println("5 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 6*i;
            System.out.println("6 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 7*i;
            System.out.println("7 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 8*i;
            System.out.println("8 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 9*i;
            System.out.println("9 * "+i +" = "+m);
        }
        for (int i = 1; i <=10 ; i++) {
            int m = 10*i;
            System.out.println("10 * "+i +" = "+m);
        }

         */


        /*//60
        Scanner ronaldo = new Scanner(System.in);
        System.out.println("input number: ");
        int n = ronaldo.nextInt();
        int num=0;
        for (int i = 1; ; i*=10) {
            num = n/i%10;
            if (num==0){
                break;
            }
        System.out.print(num+" ");
        }

         */


        /*boolean t =false;
        for (int i = 1; i <100 ; i++) {
            if (i%2!=0){
                t=true;
                System.out.println(true);
            } else if (t) {
                break;
            } else {
                System.out.println(false);
            }
        }

         */
        /*Scanner ronaldo = new Scanner(System.in);
        System.out.println("input number: ");
        int n = ronaldo.nextInt();
        if (n>=10 && n<100){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

         */
//        Scanner ronaldo = new Scanner(System.in);
//        System.out.println("input number: ");
//        int n = ronaldo.nextInt();
//        int num=0;
//        int sum =0;
//        for (int i = 1; ; i*=10) {
//            num = n/i%10;
//            sum+=num;
//            if (sum%2!=0){
//            System.out.println(true);
//                break;
//
//            }
//            else {
//                System.out.println(false);
//                break;
//            }
//        }


        /*    for (int i = 1; i <10000 ; i++) {
            if (i >= 10 && i < 100) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }

         */
        //задача №1
     /*   int i = 7;
        while (i<=98){
            System.out.println(i+" ");
            i=i+7;
        }

      *///2
        /*int i = 1;
        while (i<=512) {
            System.out.print(i+" ");
            i*=2;
        }

         */
       /* for (int i = 1; i <=10 ; i++) {
            if (i==5) {
                System.out.println("rrrrrrrrrr");
                break;
            }
        }

        */

        /*  int A [] = new int[100];
        int B [] = new int[100];
        for (int n = 1; n <101 ;n++) {
            A[n]= n-10;
            System.out.println(A[n]);
        }
        for (int n = 1; n <101 ; n++) {
            B[n]= A[n]*n;

            System.out.println(B[n]);
        }

         */

//        for (int i = 1; i <11 ; i++) {
//            int c= i-10;
//            System.out.println(c);
//        }
//
        //1
//        int n=2;
//        int s=35;
//        while (n<=25) {
//            s+=20;
//            n+=5;
//            System.out.println(s);
//        }
        //2
//        int s =0,n=3;
//        while (2*s*s<=200) {
//            s+=1;
//            n+=2;
//            System.out.println(n);
//        }

//        int n=5;
//        while (n < 10) {
//            n++;
//            System.out.println(n);
//        }
       /* int att=0;
         Scanner scr = new Scanner(System.in);
        System.out.println("input number 1 to 10 :");
        int inputNum = scr.nextInt();
        Random rnd = new Random();
        int randomNum =rnd.nextInt(10)+1;
         att++;
        while (inputNum!= randomNum) {
            System.out.println("you lose, try again: ");
            System.out.println("input number 1 to 10 : ");
            inputNum = scr.nextInt();
            att++;

        }
        System.out.println("you win after "+ att +" attempts");

        */
//        int att =0;
//        for (int i = 0; i <10 ; i++) {
//
//            att++;
//            System.out.println("i will not talk in classroom"+att);
//        }

        /*for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
        System.out.println("all right");

         */

//        int m =4;
//        do {
//            System.out.println("bbbb");
//            m--;
//        }while (m>1);
        //66
//        Scanner ronaldo = new Scanner(System.in);
//        System.out.println("input number: ");
//        int n = ronaldo.nextInt();
//
//        System.out.println("input N: ");
//        int N = ronaldo.nextInt();
//        int num=0;
//        for (int i = 1; ; i*=10) {
//            num = n   /i%10;
//            if (num==0){
//                break;
//            }
//            System.out.print(num+" ");
//        }
//
//        int messi=0;
//        for (int i = 1; ; i*=10) {
//            messi = N/i%10;
//            if (messi==0){
//                break;
//            }
//            System.out.print(messi+" ");
//        }

       /*
       //65
       Scanner ronaldo = new Scanner(System.in);
        System.out.println("input n: ");
        int n = ronaldo.nextInt();
        System.out.println("input m: ");
        int m = ronaldo.nextInt();
        int num =0;
        int num1 =0;
        int sum=0;
        int sum1=0;
        for (int i = 1;; i*=10) {
            if (n%2!=0){
                num=n/i%10;
                sum+=num;
                if (num == 0) {
                    break;
                }
            }
        }

        for (int j = 1;; j*=10) {
            if (m%2==0){
                num1=m/j%10;
                sum1+=num1;
                if (num1 == 0) {
                    break;
                }
            }
        }
        boolean v= sum==sum1;
        System.out.println(v);

        */
//        int[] arr = {-1, -2, 1, 3, 5};
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                sum += arr[i];
//                count++;
//            }
//        }
//        System.out.println(sum / count);


        //58
//        int sum=0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input num: ");
//        int n=scr.nextInt();
//        for (int i = 1;i<n; i*=10) {
//            sum+=n/i%10;
//        }
//        System.out.println(sum);



//        Scanner ronaldo = new Scanner(System.in);
//        System.out.println("input number: ");
//        int n = ronaldo.nextInt();
//        int num=0;
//        for (int i = 1; ; i*=10) {
//            num = n/i%10;
//            if (num==0){
//                break;
//            }
//            System.out.print(num+"");
//        }









}}













