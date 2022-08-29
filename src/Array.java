import java.math.BigDecimal;
import java.util.*;

public class Array {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
   }

        //6)
//        double a = 0.5;
//        double b = 2;
//        double z = 0;
//        double h = 7.5;
//        double R = 1.11;
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        switch (n){
//            case 0:
//            case 1:
//            case 6:
//            z = (a*b) +(Math.pow(Math.atan(a),2));
//                System.out.println("z = "+z);
//            case 7:
//                z = a*h/2;
//                System.out.println("z = "+z);
//            case 2:
//            case 3:
//            case 4:
//                z = Math.PI *Math.pow(R,2);
//                System.out.println("z = "+z);
//            default:
//                System.out.println("error");
//        }

        // tasks
//
//        System.out.println("input a:");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();

        //1)
//        if (a > b && a > c) {
//            System.out.println(a);
//        }
//        else if (b > a && b > c) {
//            System.out.println(b);
//        }
//        else if (c > a && c > b) {
//            System.out.println(c);
//        }

        //1-1)
//        double z = Math.max(a,b);
//        double s = Math.max(z,c);
//        System.out.println("the biggest number is : "+s);


//2)
//        if (a < b && a < c) {
//            System.out.println(a);
//        }
//        else if (b < a && b < c) {
//            System.out.println(b);
//        }
//        else if (c < a && c < b) {
//            System.out.println(c);
//        }
        //2-1)
//        double w = Math.min(a,b);
//        double z = Math.min(w,c);
//        System.out.println(z);

        //3)
//        boolean z = (a == 1) || (b == 1) || (c == 1);
//        System.out.println(z);
        //3-1)
//        if (a == 1) {
//            System.out.println(true);
//        }
//        else if (b == 1) {
//            System.out.println(true);
//        }
//        else if (c == 1) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //4)
//        boolean z = (a==2 && b==2) ||(a==2 && c==2 ) || (b==2 && c ==2)? true:false;
//        System.out.println(z);

        //4-1)

//        if (a == 2 && b == 2) {
//            System.out.println(true);
//        }
//        else if (b == 2 && c == 2) {
//            System.out.println(true);
//        }
//        else if (a == 2 && c == 2) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
        //5)
//        if ((a + b > c) && (a + c> b) && (b + c> a)) {
//            System.out.println(1);
//        }
//        else {
//            System.out.println(2);
//        }
//
//        //5-1)
//        int z = (a + b >c)&&(a + c >b )&& (b + c> a)? 1:2;
//        System.out.println(z);

        //6)
//        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
//            System.out.println(1);
//        }
//        else {
//            System.out.println(2);
//        }

        //6-1)
//        int z = (a%2==0) || (b%2==0) || (c%2==0)? 1:2;
//        System.out.println(z);

        //7)
//        if (b - a == c - b) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //7-1)
//        boolean z = (b - a) == (c - b);
//        System.out.println(z);

//        //8)
//        if (b / a == c / b) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //8-1)
//        boolean z =b/a == c/b;
//        System.out.println(z);

        //9)
//        double q = Math.max(a,b);
//        double max = Math.max(q,c);
//
//        double w = Math.min(a,b);
//        double min = Math.min(w,c);
//
//
//        if (a == 0) {
//            double i = Math.min(a,b);
//            double o = Math.min(b,c);
//            double p = Math.max(i,o);
//            Sy
////        if (b == 0) {
////            double e = Math.max(a,b);
////            double t = Math.max(b,c);
////            double z = Math.min(e,t);
////            System.out.println(min+" "+z+" "+max);
////        }
////        if (c == 0) {
////            double y = Math.min(a,b);
////            double u = Math.min(b,c);
////            double z1 = Math.max(y,u);
////            System.out.println(min+" "+ z1+" "+max);
////        }stem.out.println(min+" "+ p +" "+max);
//        }
        // 0 8 9
        //9-1)
//        if (a < b && a < c && b<c) {
//            System.out.println(a+" " + b+" "+c);
//        }
//        else if (a < b && a < c && c < b) {
//            System.out.println(a+" "+ c+" "+ b);
//        }
//        else if (b < a && b < c && a < c) {
//            System.out.println(b+" " + a+" "+c);
//        }
//        else if (b < a && b < c && c < a) {
//            System.out.println(b+" " + c+" "+a);
//        }
//        else if (c < a && c < b && a < b) {
//            System.out.println(c+" " + a+" "+b);
//        }
//        else if (c < a && c < b && b < a) {
//            System.out.println(c+" " + b+" "+a);
//        }

        //10-1)
//        double q = Math.max(a,b);
//        double max = Math.max(q,c);
//
//        double w = Math.min(a,b);
//        double min = Math.min(w,c);
//
//        double e = Math.min(b,c);
//        double bit = Math.max(w,e);       //a
//
//        double r = Math.max(b,c);
//        double bit1 = Math.min(q,r);      //b
//
//
//        double bit2 = Math.max(w,e);      //c
//
//        if (a <b && a<c) {
//            System.out.println(max+"\n"+bit+"\n"+min);
//        }
//        if (b <a && b<c ) {
//            System.out.println(max+"\n"+bit1+"\n"+min);
//        }
//        if (c<a && c<b ) {
//            System.out.println(max+"\n"+bit2+"\n"+min);
//        }

        //10-2)
//        if (a > b && b > c) {
//            System.out.println(a+"\n"+b+"\n"+c);
//        }
//        else if (a > c && c > b) {
//            System.out.println(a+"\n"+c+"\n"+b);
//        }
//        else if (b > a && a > c) {
//            System.out.println(b+"\n"+a+"\n"+c);
//        }
//        else if (b > c && c > a) {
//            System.out.println(b+"\n"+c+"\n"+a);
//        }
//        else if (c > a && a > b) {
//            System.out.println(c+"\n"+ a +"\n"+b);
//        }
//        else if (c > b && b > a) {
//            System.out.println(c+"\n"+b+"\n"+a);
//        }


        //11)
//        double q = Math.max(a,b);
//        double w = Math.max(c,d);
//        double max = Math.max(q,w);
//        System.out.println("max = "+max);

        //12)
//        double q = Math.min(a,b);
//        double w = Math.min(c,d);
//        double min = Math.min(q,w);
//        System.out.println("min = "+min);

        //13)
//        boolean z = a==1 || b==1 || c==1 || d==1;
//        System.out.println(z);

        //14)
//        boolean z = a+b == c+d || a+c==b+d || a+d == b+c;
//        System.out.println(z);

        //15)
//        boolean z =  a== b+c+d ||b==a+c+d || c==a+b+d || d==a+b+c;
//        System.out.println(z);

        //16)
//        int z = (a%2!=0 && b%2!=0) || (c%2!=0 && d%2!=0) || (a%2!=0 && c%2!=0) || (a%2!=0 && d%2!=0) || (b%2!=0 && c%2!=0) || (b%2!=0 && d%2!=0)? 1:2;
//        System.out.println(z);

        //17)
//        if (b - a == c-b   && b-a == d - c && c-b==d-c) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //18)
        // b/a == c/b == d/c
//        boolean z = (b/a == c/b) && (b/a == d/c) && (c/b==d/c);
//        System.out.println(z);

        //19)
//        double q = Math.min(a,b);
//        double w = Math.min(c,d);
//        double min = Math.min(q,w);
//
//        double e = Math.max(a,b);
//        double r = Math.max(c,d);
//        double max = Math.max(e,r);
//
//        if (a < b && a < c && a < d && c>b) {
//            double t = Math.min(a,b);
//            double y = Math.min(b,c);
//            double u = Math.min(d,c);
//
//            double i = Math.min(t,y);
//            double o = Math.min(y,u);
//            double p = Math.max(i,o);
//
//            double x = Math.max(t,y);
//            double k = Math.max(y,u);
//            double v = Math.max(x,k);
//            System.out.println(min+"\n"+p+"\n"+v+"\n"+max);
//        }
//
//        if (a < b && a < c && a < d && b > c) {
//            double q1 = Math.min(a,b);
//            double w1 = Math.min(b,c);
//            double e1 = Math.min(d,c);
//
//            double r1 = Math.min(q1,w1);
//            double t1 = Math.min(w1,e1);
//            double y1 = Math.max(r1,t1);
//
//            double a1 = Math.max(a,b);
//            double a2 = Math.max(b,c);
//            double a3 = Math.max(c,d);
//            double a4 = Math.min(a1,a2);
//            double f4 = Math.min(a2,a3);
//            double a5 = Math.min(a4,f4);
//            System.out.println(min+"\n"+y1+"\n"+a5+"\n"+max);
//
//        }
//                                   classwork
        //11)

//        double q = Math.max(a,b);
//        double w = Math.max(c,d);
//        double max = Math.max(q,w);
//        System.out.println("max = "+max);

        //12)
//        double q = Math.min(a,b);
//        double w = Math.min(c,d);
//        double min = Math.min(q,w);
//        System.out.println("min = "+min);

        //13)
//        boolean z = a==1 ||b==1 ||c==1 ||d==1;
//        System.out.println(z);

        //15)
//        boolean z = a ==b+c+d || b== c+a+d || c==a+b+d || d ==a+b+c;
//        System.out.println(z);

        //17)
        // b-a = c-b = d-c
//        boolean z = b-a == c-b && b-a==d-c && c-b==d-c;
//        System.out.println(z);

        //21)
//        System.out.println("input 3 digit num: ");
//        int n = scr.nextInt();
//
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        boolean z = a == (b+c);
//        System.out.println(z);

        //23)
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int sum = a+b+c;
//        if (n > k) {
//            int e  = n/sum;
//            System.out.println(e);
//        }
//        else {
//            int d = n/a;
//            System.out.println(d);
//        }

        //25)
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        double v = Math.min(a,b);
//        double min = Math.min(v,c);
//        System.out.println("min = "+min);


        //27)
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//
//        if (a != 0) {
//
//
//        if (n > 300  )  {
//            int r = b/a;
//            System.out.println(r);
//
//        }
//        else {
//
//            int y = c/a;
//                System.out.println(y);
//
//        }
//
//        }
//        else {
//            System.out.println("error");
//        }

        //30)

//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int d = n/1000%10;
//
//        if (a < b && a<c && a<d && b<c && b<d)

        //32)
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int d = n/1000%10;
//        if (a + b !=0) {
//
//            if (n < 5000) {
//                int w = n / (a + c);
//                System.out.println(w);
//            } else {
//                int y = n / (d + b);
//            }
//        }


        //34)
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int d = n/1000%10;
//        if (a + b == 5) {
//         char v = 'w';
//            System.out.println(v);
//        }
//        else {
//            char v = 'd';
//            System.out.println(v);
//        }

        //36)
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int d = n/1000%10;
//
//String z = d==4 && a==4? "Yes":"NO";
//        System.out.println(z);



        //38)
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int d = n/1000%10;
//        if (a > b) {
//            int multi = a*c;
//            System.out.println(multi);
//        }
//        else {
//            System.out.println(1);
//        }

        //40)
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int d = n/1000%10;
//        int multi = a*b*c*d;
//        int y = 0;
//        if (multi > 200) {
//            y = 0;
//            System.out.println(y);
//        }
//        else {
//            y = 1;
//            System.out.println(y);
//        }

        //71)
//        double y = 0;
//        for (double x =2.4  ; x <=7.6 ; x+=0.2) {
//            y = Math.tan(2*x+Math.pow(x,2));
//            System.out.println(y);
//        }

        //73)
//        double y = 0;
//        double x = -5.4;
//        while (x <= 1.2) {
//            y = Math.pow(1/Math.atan(Math.pow(x,2)),2);
//            System.out.println(y);
//            x+=0.4;
//
//        }

        //75)
//        double y = 0;
//        double x = -Math.PI;
//        while (x <= Math.PI) {
//            y = Math.pow(Math.sin(x),2)+Math.cos(x);
//            System.out.println(y);
//            x+=Math.PI/8;
//        }



        //homework

//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();


        //12)

//        double q = Math.min(a,b);
//        double w = Math.min(c,d);
//        double min = Math.min(q,w);
//        System.out.println("min = " +min);


        //14)
        // a b c d
        // a+b = c+d
        //a+c = b+d
        //a+d = b+c

//        boolean z = a+b == c+d || a+c == b+d || a+d ==b+c ;
//        System.out.println(z);

        //16)
        //a b c d
        //a b
        //a c
        //a d
        //b c
        //b d
        //c d


//        int z = (a%2!=0 && b%2!=0) || (a%2!=0 && c%2!=0) || (a%2!=0 && d%2!=0)|| (b%2!=0 && c%2!=0)|| (b%2!=0 && d%2!=0)|| (c%2!=0 && d%2!=0)? 1:2;
//        System.out.println(z);

        //18)
        // b/a = c/b = d/c

//        boolean z = (b/a== c/b )&& (b/a==d/c)&& (c/b==d/c);
//        System.out.println(z);


        //19)

//        // a b c d
//
//        // 1) a b c d  2) a b d c    3) a c b d   4) a c d b  5) a d b c  6) a d c b     >
//
//        //1)
//        if (a < b && a < c && a < d && b < c && b < d && c < d) {
//            System.out.println(a+" "+b+" "+c+" "+d);
//            //2)
//
//        } else if (a < b && a < c && a < d && b < d && b < c && d < c) {
//            System.out.println(a+" "+b+" "+d+" "+c);
//        }
//        //3)
//        else if (a < b && a < c && a < d && c < b && c < d && b < d) {
//            System.out.println(a+" "+c+" "+b+" "+d);
//
//        }
//        //4)
//        else if (a < b && a < c && a < d && c < d && c < b && d < b) {
//            System.out.println(a+" "+c+" "+d+" "+b);
//
//        }
//        //5)
//        else if (a < b && a < c && a < d && d < b && d < c && b < c) {
//            System.out.println(a+" "+d+" "+b+" "+c);
//
//        }
//        //6)
//        else if (a < b && a < c && a < d && d < c && d < b && c < b) {
//            System.out.println(a+" "+d+" "+c+" "+b);
//
//        }
//
//        // b a c d
//
//        // 1) b a c d  2) b a d c  3) b c a d  4) b c d a  5) b d a c  6)b d c a
//        // 1)
//        else if (b < a && b < c && b < d && a < c && a < d && c < d) {
//            System.out.println(b+" "+a+" "+c+" "+d);
//
//        }
//        //2)
//        else if (b < a && b < c && b < d && a < d && a < c && d < c) {
//            System.out.println(b+" "+a+" "+d+" "+c);
//
//        }
//        //3)
//        else if (b < a && b < c && b < d && c < a && c < d && a < d) {
//            System.out.println(b+" "+c+" "+a+" "+d);
//
//        }
//        //4)
//        else if (b < a && b < c && b < d && c < d && c < a && d < a) {
//            System.out.println(b+" "+c+" "+d+" "+a);
//        }
//        //5)
//        else if (b < a && b < c && b < d && d < a && d < c && a < c) {
//            System.out.println(b+" "+d+" "+a+" "+c);
//
//        }
//        //6)
//        else if (b < a && b < c && b < d && d < c && d < a && c < a) {
//            System.out.println(b+" "+d+" "+a+" "+c);
//        }
//
//        //d a c b
//        // 1) d a b c  2) d a c b  3) d b a c  4) d b c a  5) d c a b  6) d c b a
//        //1)
//        else if (d < a && d < b && d < c && a < b && a < c && b < c) {
//            System.out.println(d+" "+a+" "+b+" "+c);
//        }
//        //2)
//        else if (d < a && d < b && d < c && a < c && a < b && c < b) {
//            System.out.println(d+" "+a+" "+c+" "+b);
//        }
//        //3)
//        else if (d < a && d < b && d < c && b < a && b < c && a < c) {
//            System.out.println(d+" "+b+" "+a+" "+c);
//        }
//        //4)
//        else if (d < a && d < b && d < c && b < c && b < a && c < a) {
//            System.out.println(d+" "+b+" "+c+" "+a);
//        }
//        //5)
//        else if (d < a && d < b && d < c && c < a && c < b && a < b) {
//            System.out.println(d+" "+c+" "+a+" "+b);
//
//        }
//        //6)
//        else if (d < a && d < b && d < c && c < b && c < a && b < a) {
//            System.out.println(d+" "+c+" "+a+" "+b);
//        }
//
//        // c a b d
//
//        // 1) c a b d  2) c a d b  3) c b a d  4) c b d a  5) c d a b  6) c d b a
//
//        //1)
//        else if (c < a && c < b && c < d && a < b && a < d && b < d) {
//            System.out.println(c+" "+a+" "+b+" "+d);
//        }
//        //2)
//        else if (c < a && c < b && c < d && a < d && a < b && d < b) {
//            System.out.println(c+" "+a+" "+d+" "+b);
//        }
//        //3)
//        else if (c < a && c < b && c < d && b < a && b < d && a < d) {
//            System.out.println(c+" "+b+" "+a+" "+d);
//        }
//        //4)
//        else if (c < a && c < b && c < d && b < d && b < a && d < a) {
//            System.out.println(c+" "+b+" "+d+" "+a);
//        }
//        //5)
//        else if (c < a && c < b && c < d && d < a && d < b && a < b) {
//            System.out.println(c+" "+d+" "+a+" "+b);
//        }
//        //6)
//        else if (c < a && c < b && c < d && d < b && d < a && b < a) {
//            System.out.println(c+" "+d+" "+b+" "+a);
//
//        }

        //20)

        // a b c d

        // 1) a b c d  2) a b d c    3) a c b d   4) a c d b  5) a d b c  6) a d c b     >

        //1)
//        if (a > b && a > c && a > d && b > c && b > d && c > d) {
//            System.out.println(a+" "+b+" "+c+" "+d);
//            //2)
//
//        } else if (a > b && a > c && a > d && b > d && b > c && d > c) {
//            System.out.println(a+" "+b+" "+d+" "+c);
//        }
//           //3)
//        else if (a > b && a > c && a > d && c > b && c > d && b > d) {
//            System.out.println(a+" "+c+" "+b+" "+d);
//
//        }
//          //4)
//        else if (a > b && a > c && a > d && c > d && c > b && d > b) {
//            System.out.println(a+" "+c+" "+d+" "+b);
//
//        }
//          //5)
//        else if (a > b && a > c && a > d && d > b && d > c && b > c) {
//            System.out.println(a+" "+d+" "+b+" "+c);
//
//        }
//          //6)
//        else if (a > b && a > c && a > d && d > c && d > b && c > b) {
//            System.out.println(a+" "+d+" "+c+" "+b);
//
//        }
//
//        // b a c d
//
//        // 1) b a c d  2) b a d c  3) b c a d  4) b c d a  5) b d a c  6)b d c a
//        // 1)
//        else if (b > a && b > c && b > d && a > c && a > d && c > d) {
//            System.out.println(b+" "+a+" "+c+" "+d);
//
//        }
//        //2)
//        else if (b > a && b > c && b > d && a > d && a > c && d > c) {
//            System.out.println(b+" "+a+" "+d+" "+c);
//
//        }
//        //3)
//        else if (b > a && b > c && b > d && c > a && c > d && a > d) {
//            System.out.println(b+" "+c+" "+a+" "+d);
//
//        }
//        //4)
//        else if (b > a && b > c && b > d && c > d && c > a && d > a) {
//            System.out.println(b+" "+c+" "+d+" "+a);
//        }
//        //5)
//        else if (b > a && b > c && b > d && d > a && d > c && a > c) {
//            System.out.println(b+" "+d+" "+a+" "+c);
//
//        }
//        //6)
//        else if (b > a && b > c && b > d && d > c && d > a && c > a) {
//            System.out.println(b+" "+d+" "+a+" "+c);
//        }
//
//        //d a c b
//        // 1) d a b c  2) d a c b  3) d b a c  4) d b c a  5) d c a b  6) d c b a
//        //1)
//        else if (d > a && d > b && d > c && a > b && a > c && b > c) {
//            System.out.println(d+" "+a+" "+b+" "+c);
//        }
//        //2)
//        else if (d > a && d > b && d > c && a > c && a > b && c > b) {
//            System.out.println(d+" "+a+" "+c+" "+b);
//        }
//        //3)
//        else if (d > a && d > b && d > c && b > a && b > c && a > c) {
//            System.out.println(d+" "+b+" "+a+" "+c);
//        }
//        //4)
//        else if (d > a && d > b && d > c && b > c && b > a && c > a) {
//            System.out.println(d+" "+b+" "+c+" "+a);
//        }
//        //5)
//        else if (d > a && d > b && d > c && c > a && c > b && a > b) {
//            System.out.println(d+" "+c+" "+a+" "+b);
//
//        }
//        //6)
//        else if (d > a && d > b && d > c && c > b && c > a && b > a) {
//            System.out.println(d+" "+c+" "+a+" "+b);
//        }
//
//        // c a b d
//
//        // 1) c a b d  2) c a d b  3) c b a d  4) c b d a  5) c d a b  6) c d b a
//
//        //1)
//        else if (c > a && c > b && c > d && a > b && a > d && b > d) {
//            System.out.println(c+" "+a+" "+b+" "+d);
//        }
//        //2)
//        else if (c > a && c > b && c > d && a > d && a > b && d > b) {
//            System.out.println(c+" "+a+" "+d+" "+b);
//        }
//        //3)
//        else if (c > a && c > b && c > d && b > a && b > d && a > d) {
//            System.out.println(c+" "+b+" "+a+" "+d);
//        }
//        //4)
//        else if (c > a && c > b && c > d && b > d && b > a && d > a) {
//            System.out.println(c+" "+b+" "+d+" "+a);
//        }
//        //5)
//        else if (c > a && c > b && c > d && d > a && d > b && a > b) {
//            System.out.println(c+" "+d+" "+a+" "+b);
//        }
//        //6)
//        else if (c > a && c > b && c > d && d > b && d > a && b > a) {
//            System.out.println(c+" "+d+" "+b+" "+a);
//
//        }


//        System.out.println("input 3-digital number: ");
//        int n = scr.nextInt();
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;

        //22)

//        boolean z = a%2==0 || b%2==0 || c%2==0 ;
//        System.out.println(z);

        //24)
//        int q = Math.max(a,b);
//        int q1 = Math.max(q,c);
//        int max = Math.max(q,q1);
//
//        System.out.println("max = "+max);

        //26)
//        int sum = a+b+c;
//        if (a > b) {
//            int r = n/sum;
//            System.out.println(r);
//        }
//        else {
//            System.out.println(n);
//        }

        //28)
//        char f = b+c<5? 'a':'b';
//        System.out.println(f);

        //29)

//        // a b c
//        // 1) a min
//
//
//        //b>c
//        // 2 6 4
//        //    2 4  min
//        //    4    max
//
//
//        //c>b
//        // 9 6 3
//        //   9  6   max
//        //    6     min
//
//        double q = Math.max(a,b);
//        double max = Math.max(q,c);
//
//        double w = Math.min(a,b);
//        double min = Math.min(w,c);
//
//        if (a < b && a < c && b>c) {
//            int t = Math.min(a,b);
//            int y = Math.min(b,c);
//            int u = Math.max(t,y);
//            System.out.println(min+" "+ u +" "+max);
//        }
//        else if (a < b && a < c && c > b) {
//        int t = Math.max(a,b);
//        int e = Math.max(b,c);
//        int r = Math.min(t,e);
//            System.out.println(min+" "+ r +" "+max);
//
//        }
//
//        //2) b min
//
//        //a>c
//        //5 2 8
//        // 5  8   max
//        //   5    min
//
//        if (b < a && b < c  ) {
//            int t = Math.max(a,b);
//            int r = Math.max(b,c);
//            int e = Math.min(t,r);
//            System.out.println(min+" "+ e +" "+max);
//        }
//
//        //3)
//        // c   min
//        // b>a
//        // 2 7 5
//        //  2  5  min
//        //   5    max
//
//        // a>b
//        // 2 5 7
//        //  2  5  min
//        //   5    max
//
//        if (c < a && c < b ) {
//            int t = Math.min(a,b);
//            int y = Math.min(b,c);
//            int u = Math.max(t,y);
//            System.out.println(min+" "+ u +" "+max);
//        }


//        System.out.println("input 4-digital number: ");
//        int n = scr.nextInt();
//        int a = n%10;
//        int b = n/10%10;
//        int c = n/100%10;
//        int d = n/1000%10;

        //31)
//        boolean z  = a+b == c+d;
//        System.out.println(z);

        //33)
//        int z = a==1|| b==1 || c==1 || d==1? 1:0;
//        System.out.println(z);

        //35)
//        String z = a*b==12? "y=12":"y=0";
//        System.out.println(z);

        //37)
//        int sum = a+b+c+d;
//        String z = n == Math.pow(sum,2)?  "YES":"NO";
//        System.out.println(z);

        //39)
//        int sum = a+b+c+d;
//
//        int y = sum>20? 1:2;
//        System.out.println(y);


        //41)
//        int sum = 0;
//        for (int i = 1; i <10 ; i++) {
//            if (n % i == 0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

        //42)
//        int multi = 1;
//        int i =1;
//        while (i < 100) {
//            if (n % i == 0) {
//                multi *= i;
//            }
//            i++;
//        }
//        System.out.println(multi);

        //43)
//        int sum = 0;
//        for (int i = 1; i <100 ; i++) {
//            if (n % i == 2) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

        //44)
//        int multi = 1;
//        int i = 1;
//        while (i < 100) {
//            if (n % i == 3) {
//                multi*=i;
//            }
//                i++;
//        }
//        System.out.println(multi);

        //45)
//        int sum = 0;
//        for (int i = 10; i <100 ; i++) {
//            if (i % 3 == 0) {
//                sum+=i;
//            }
//        }
//                System.out.println(sum);

        //46)
//        int multi = 1;
//        for (int i = 10; i <100 ; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                multi*=i;
//            }
//        }
//        System.out.println(multi);


        //47)
//        int sum = 0;
//        for (int i = 100; i <1000 ; i++) {
//            if (i % 5 != 0) {
//                sum+=i;
//            }
//        }y
//        System.out.println(sum);

        //48)
//        int multi = 1;
//        for (int i = 100; i <1000 ; i++) {
//            if (i % 2 != 0 && i % 3 != 0) {
//                multi*=i;
//            }
//        }
//        System.out.println(multi);

        //49)
//        int multi = 1;
//        for (int i = 1; i <100 ; i++) {
//            if (i % 3 == 1 && i % 4 == 2) {
//                multi*=i;
//            }
//        }
//        System.out.println(multi);

        //50)
//        boolean t = false;
//        for (int i = 100; i <1000 ; i++) {
//            for (int j = 10; j <1000 ; j++) {
//                if (i * 16 == Math.pow(j, 2)) {
//                    t= true;
//                    System.out.println(i);
//                    break;
//                }
//            }
//                if (t)break;
//        }

        //51)
//        boolean t = false;
//        for (int i = 1_000; i <10_000 ; i++) {
//            for (int j = 10; j <10000 ; j++) {
//                if (i * 26 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//                }
//            }
//            if (t)break;
//        }

        //52)
//            boolean t = false;
//        for (int i = 9_999; i >=1_000 ; i--) {
//            for (int j = 10000; j >=10 ; j--) {
//                if (i * 14 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//                }
//            }
//            if (t)break;
//        }

        //53
//            boolean t = false;
//        for (int i = 9_999 ; i >=1000 ; i++) {
//            for (int j = 10; j <10000 ; j++) {
//                if (i * 18 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//
//                }
//            }
//            if (t)break;
//        }

        //54)
//        boolean t = false;
//        for (int i = 100; i <1000 ; i++) {
//            if (Math.sqrt(i) > n) {
//                t = true;
//                System.out.println(i);
//                break;
//            }
//        }

        //55)
//        boolean t = false;
//        for (int i = 1; i <100 ; i++) {
//            if (n == Math.pow(i, 3)) {
//
//
//                System.out.println(true);
//            }
//            else {
//                System.out.println(false);
//            }
//        }

        // 56)
//        int n = 16;
//        double y = 0;
//        boolean t = false;
//        for (int i = 0; i <100 ; i++) {
//            if (n != Math.pow(i, 4)) {
//                t = true;
//               y = 0;
//
//                System.out.println("y = "+y);
//
//            }
//            else {
//
//                y = 1;
//                System.out.println("y = "+y);
//
//            }
//        }

//        //72)
//        double y = 0;
//        for (double x = -5.4; x <=1.2 ; x+=0.4) {
//            y = Math.pow(1/Math.tan(Math.pow(x,2)),2);
//            System.out.println(y);
//        }

        //74)
//        double y = 0;
//        double x = -3.8;
//        while (x <= 5.4) {
//            y = Math.pow(2,(x+4));
//            System.out.println(y);
//            x+= 0.3;
//        }

        //76)
//        double y = 0;
//        for (int x = -5; x <=5 ; x+=2) {
//
//            double z = x>0?    y = Math.pow(x,2)+4*Math.pow(x,8):0;
//            System.out.println(z);
//
//        }

        //78)
        //only with for
//        double y = 0;
//        for (int x = 10; x <=20 ; x+=2) {
//            double z = x>12? y = 3*Math.log(x)/Math.log(3):Math.pow(x,3);
//            System.out.println(z);
//        }

        //80)
//        double y = 0;
//        for (int x = -5; x <=5 ; x+=2) {



//            double z =  x>5 ? y = Math.pow(2,(5-x)):7-x;
//            System.out.println("y = "+z);
//        }


        //81)
//        double y = 0;
//        double x = -7.5;
//        while (x <= 8.3) {
//            y = Math.log(Math.pow(x,2)+4);
//            System.out.println("y = "+y);
//            x+=0.3;
//        }

        //82)
//        double y = 0;
//        for (double x = -2.7; x <=3.3 ; x+=0.5) {
//            y = Math.pow(x+Math.pow(x,2),7);
//            System.out.println("y = "+y);


        //83)
//        double y = 0;
//        for (double x = -4.8; x <=5.8 ; x+=0.2) {
//            y = Math.pow(Math.E,1/Math.tan(x));
//            System.out.println("y = "+y);
//        }

        //121
//        double x = 0;
//        double y = 0;
//        double sum = 0;
//        for (int i = 1; i <16 ; i++) {
//            if (i % 2 == 0) {
//                x= i;
//                y = Math.pow(i,2);
//
//            }
//            else {
//                x = Math.pow(i,3);
//                y = i;
//            }
//
//        }
//        sum+=Math.pow(x-y,2);
//        System.out.println(sum);

        //122)
//        double x = 0;
//        double y = 0;
//        double sum = 0;
//        double multi = 1;

//        int i = 1;
//        while (i < 10) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.E,i-4);
//
//            }
//            else {
//                x = Math.pow(i,2)-i;
//            }
//            if (Math.pow(i, 2) % 2 == 0) {
//                y = Math.pow(Math.tan(i),2);
//            }
//            else {
//                y = 0;
//            }
//            i++;
//        }
//        sum+=Math.pow(x,2)-Math.pow(y,2);
//        System.out.println(sum);


        //123)
//        for (int i = 1; i <14 ; i++) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.E,i-4);
//            }
//            else {
//                x = Math.pow(i,2)-i;
//            }
//            y = Math.pow(i,4);
//        }
//        multi*=Math.pow(x,2)*Math.pow(y,2);

        //124)
//        for (int i = 2; i < 18; i++) {
//            if (i % 2 == 0) {
//                x = Math.pow(2,i-4);
//            }
//            else {
//                 x = Math.pow(i,2)+2;
//            }
//            y = Math.pow(i,2)+2;
//        }
//        multi*=x*y;
//        System.out.println(multi);

        //125)
//        int i = 1;
//        while (i < 10) {
//            if (i % 3 == 0) {
//                x = Math.log(i);
//            }
//            else {
//                x = 3;
//            }
//            if (i % 7 == 0) {
//                y = Math.log(i)/Math.log(3);
//            }
//            else {
//                y = 3;
//            }
//            i++;
//        }
//        sum+=(x-y);
//        System.out.println(sum);

        //126)

//        for (int i = 1; i <16 ; i++) {
//            if (i % 5 == 0) {
//                x = i;
//            }
//            else {
//                x = 0;
//            }
//            if (i % 7 == 0) {
//                y = Math.pow(i,2);
//            }
//            else {
//                y = i;
//            }
//
//        }
//        sum+=(x-y);
//        System.out.println(sum);

        //127)
//        int i = 1;
//        while (i < 17) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.sin(i),2);
//                y = Math.tan(y);
//            }
//            else {
//                x = 0;
//                y = 1/Math.tan(i);
//            }
//
//            i++;
//        }
//        multi*=Math.pow(x,2)*y;
//        System.out.println(multi);

        //141)
//        int a = scr.nextInt();
//        for (int m = 0; m <5; m++) {
//            for (int n = 0; n <6 ; n++) {
//            sum+=Math.pow(a,m+n);
//
//            }
//            multi*= sum;
//
//        }

        //142)
//        int sum1 = 0;
//        for (int k = 0; k <9 ; k++) {
//            for (int m = 1; m <5 ; m++) {
//                sum+=(a*Math.pow(m,2)+Math.pow(k,2));
//            }
//            sum1+=sum;
//        }
//        System.out.println(sum);

        //41)
//        int n = scr.nextInt();
//        int sum = 0;
//        for (int i = 1; i <100 ; i++) {
//            if (i % n == 0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

//        for (int i = 0; ; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        while (i>=0) {
//            System.out.println(i);
//            i++;
//        }

        //128)
//        double x = 0;
//        double y = 0;
//        double multi = 1;
//        int i = 1;
//        while (i < 14) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.E,3*i-4);
//            }
//            else {
//                x = Math.pow(i,2);
//            }
//            y = Math.pow(i-1,2);
//            multi*=x*Math.pow(y,2);
//            i++;
//        }
//        System.out.println(multi);

        //129)
//        double x = 0;
//        double y = 0;
//        double sum = 0;
//        for (int i = 1; i <16 ; i++) {
//            if (x % 1 == 0) {
//                x = Math.tan(i);
//            }
//            else {
//                x =1/ Math.tan(i);
//            }
//            y = Math.pow(Math.E,i-4);
//            sum+=(x*y-i);
//        }
//        System.out.println(sum);

        //130)
//        double x = 0;
//        double y = 0;
//       double multi = 1;
//       int i = 1;
//        while (i < 10) {
//            if (i % 5 == 0) {
//                x = i;
//            }
//            else {
//                x = Math.pow(i,2);
//            }
//            if (i % 3 == 0) {
//                y = Math.pow(i,3);
//
//            }
//            else {
//                y = 6;
//            }
//            multi*=x*y;
//            i++;
//        }
//        System.out.println(multi);


        //131)
//        double x = scr.nextDouble();
//        double y = 0;
//        double sum = 0;
//        for (int k = 1; k <4 ; k++) {
//            if (x > 1) {
//                y = 3*Math.pow(x,k+1);
//            }
//            else {
//                y = 5*x+Math.pow(k,7);
//            }
//        }
//        System.out.println(y);

        //132)
//        double x = scr.nextDouble();
//        double y = 0;
//        double n = scr.nextDouble();
//        for (int k = 1; k <n ; k++) {
//            if (x > 5) {
//                y = 3*Math.log(x)/Math.log(3)+5*k;
//            }
//            else {
//                y = 4*(Math.pow(x+k,8));
//            }
//        }
//        System.out.println(y);

        //133)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 1; k <5 ; k++) {
//            if (x < 1) {
//                y = 8*Math.pow(x,k);
//            }
//            else {
//                 y = 7*x + Math.log(x)/Math.log(3);
//            }
//        }
//        System.out.println(y);

        //134)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 1; k <8 ; k++) {
//            if (x > 1) {
//                y = Math.pow(x,k-1);
//            } else if (x > 0 && x < 5) {
//                y = x*Math.pow(k,3);
//            }
//            else {
//                y = Math.pow(10,-6);
//            }
//        }
//        System.out.println(y);

        //135)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 1; k <4 ; k++) {
//            if (x > 1) {
//                y = Math.pow(x,k-1);
//            } else if (x < 3) {
//                y = x*Math.pow(k,3);
//            }
//            else {
//                y = Math.pow(10,-6);
//            }
//        }
//        System.out.println(y);

        //136)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 2; k <=8 ; k++) {
//            if (x > 3 && x < 7) {
//                y = 9*Math.pow(x,k);
//            }
//            else {
//                y = 8*x+Math.pow(k,3);
//            }
//        }
//        System.out.println(y);

        //137)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 1; k <=10 ; k++) {
//            if (x > 2 && x < 6) {
//                y = Math.log(x)/Math.log(4)+Math.log(k);
//            }
//            else {
//                y = 4*(Math.pow(x+k,8));
//            }
//        }
//        System.out.println(y);

        //138)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 2; k <=7 ; k++) {
//            if (x < 6) {
//                y = Math.pow(x,k)+k;
//            }
//            else{
//                y = Math.log(k)/Math.log(5);
//            }
//        }
//        System.out.println(y);

        //139)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 1; k <=8 ; k++) {
//            if (x < 2 && x < 5) {
//                y = 7*Math.pow(Math.E,k+3);
//            } else if (x > 0 && x <= 5) {
//                y = 8*x*Math.pow(k,5);
//            }
//            else {
//                y = 7;
//            }
//        }
//        System.out.println(y);

        //140)
//        double x = scr.nextDouble();
//        double y = 0;
//        for (int k = 2; k <10 ; k++) {
//            if (x > 3 && x < 5) {
//                y = Math.pow(x,k+6);
//            } else if (x <= 3) {
//                y = x+Math.pow(k,4);
//            }
//            else {
//                y = Math.pow(5,6);
//            }
//        }
//        System.out.println(y);
        //141)
//        double multi = 1;
//        double sum = 0;
//        double a = scr.nextDouble();
//        for (int m = 0; m <5 ; m++) {
//            for (int n = 0; n <6 ; n++) {
//                sum+=Math.pow(a,m+n);
//            }
//            multi*=sum;
//        }
//        System.out.println(multi);

       // prepare for the test
        //9
//        System.out.println("input x :");
//        int x = scr.nextInt();
//        System.out.println("input y :");
//        int y = scr.nextInt();
//        double a = x+4;
//        double b = Math.pow(Math.pow(y,2)+4,3);
//        double z = Math.pow(a/b,(double)1/5);
//
//        double m = Math.sin(Math.pow(x+z,2))+3*z +y/Math.pow(y,2);
//        System.out.println(m);


        //11)
//        int x = 554;
//        int a = 5;
//        int b = 4;
//        double q = Math.pow(a,2)+Math.pow(b,2);
//        double y = 0;
//        if (q > 5) {
//            y = 3*Math.pow(Math.E,a-x) + Math.log(q+5)/Math.log(3);
//            System.out.println("y = "+y);
//        }
//        else if (q < 1) {
//        y = Math.pow(Math.tan(a+b),4);
//            System.out.println("y = "+y);
//        }
//        else {
//            y = -3;
//            System.out.println(y);
//        }

        //2)
//        double c = 2;
//        double a = 1.5;
//        double d = 2;
//        double x = 3;
//        System.out.println("input n : ");
//        int n= scr.nextInt();
//        double z = 0;
//        switch (n){
//            case 0-> {
//                z = 1 + c * Math.sqrt(d);
//                System.out.println("z = " + z);
//            }
//            case 1,6 -> {
//                    z = x-a;
//                    System.out.println("z = "+z);
//                }
//                case 2,3,4 ->{
//                z = (double)2/3*Math.pow(x,2)-(double)1/2*d;
//                    System.out.println("z = "+z);
//                }
//        }

        //3)
//        int x = scr.nextInt();
//        double a = 5;
//        double b = 1.2;
//        double v = 0.6;
//        double z = 0;
//        double y = 2.4;
//        switch (x){
//            case 3:
//                z = Math.pow(y,2)+0.3*a;
//                System.out.println("z = "+z);
//                break;
//            case 5:
//            case 2:
//                z = a+Math.pow(Math.E,y*b);
//                System.out.println("z = "+z);
//            case 6:
//            case 7:
//            case 8:
//                z = Math.pow(y,2)+y-b;
//                System.out.println("z = "+z);
//        }

        System.out.println("input a :");
        int a = scr.nextInt();
        System.out.println("input b: ");
        int b = scr.nextInt();
        System.out.println("input c: ");
        int c = scr.nextInt();
        //1)
//        int q = Math.max(a,b);
//        int max = Math.max(q,c);
//        System.out.println(max);

        //2)
//        int q =Math.min(a,c);
//        int min = Math.min(q,b);
//        System.out.println("min = "+min);
        //3)
//        boolean z = a==1 || b==1 ||c==1;
//        System.out.println(z);

        //4)



























    }
    }






