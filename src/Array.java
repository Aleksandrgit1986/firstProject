import java.math.BigDecimal;
import java.util.*;

public class Array {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // способы обьявления массива
       /* int array[];
        int[]array1;

        */
        // Можно внести сразу конкретные значения при создании массива
       /* int[]array = new int[]{1,2,3,4};
        int[]arrays ={1,2,3,4};
        System.out.println(array[3]);

        */
        // Можно также указывать в квадратных скобках размер массива, и потом присваивать значение.
      /*  int[] arr= new int[4] ;
        arr[0]=1;
        arr[1]=5;
        arr[2]=7;
        arr[3]=2;
        System.out.println(arr[2]);

       */
        //Важнейшее свойство, которым обладают массивы -это свой lenght.
        /*int[]arr = {1,2,5,6};
        int lenght = arr.length;
        System.out.println(lenght);

         */
        //Если мы хотим получить последний элемент массива,для этого есть след.свойство.
        /*int []arr = {1,6,9,59};
        System.out.println(arr[arr.length-2]);

         */
        /*int[] array = new int[]{10,2,3,4,5};
        for  (int i: array) {
            System.out.println(i);
        }

         */
        //Создадим двумерный массив.
//        int[][] matrice= {{1,2,3},
//                          {4,5,6},
//                          {7,8,9}};
//        for (int i = 0; i <matrice.length ; i++) {
//            for (int j = 0; j < matrice[i].length; j++) {
//
//                System.out.print(matrice[i][j]+ " ");
//            }
//            System.out.println(" ");
//        }

//        int[] arr = {1,3,7,0};
//
//        for (int all:arr) {
//            System.out.println(all);


//        int [][] mat = {{1,6,4,5},{2,14,7,2},{3,4,1,0}};
//        for (int i = 0; i <mat.length; i++) {
//            for (int j = 0; j <mat[i].length; j++) {
//                System.out.print(mat[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
        //68
//        int cout =0;
//        int sum =0;
//        int[] array = {1,3,-1,4,-4,-5};
//        for (int all:array) {
//            if (all > 0) {
//                sum+=all;
//                cout++;
//            }
//        }
//            System.out.println(sum/cout);
        //69
        /*int multi =1;
        int cout =0;
        int[]array = {1,7,-67,2,-9};
        for (int ron: array) {
            if (ron > 0) {
                multi*=ron;
                cout++;
            }
        }
        System.out.println(multi/cout);

         */
        //70
//        int multi = 1;
//        int count = 0;
//        int[]array = new int[]{1,-3,0,-7,4,-2};
//        for (int ron:array) {
//            if (ron<0) {
//                multi*=ron;
//                count++;
//
//            }
//        }
//        System.out.println(multi/count);

        //71
//        int sum =0;
//        int count=0;
//        int[]array = {1,-9,-7,5,-8};
//        for (int ron:array) {
//            if (ron < 0) {
//                sum+=ron;
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        //72
//        int sum=0;
//        int [] array ={1,3,5,6,7,8};
//        for (int i = 0; i < array.length ; i++) {
//            if (i%2==0) {
//                sum+=array[i];
//            }
//        }
//        System.out.println(sum);

        //73
        /*int multi =1;
        int[]array = {1,4,-1,2,5};
        for (int i = 0; i <array.length ; i++) {
            if (i%2==0) {
                multi*=array[i];

            }
        }
        System.out.println(multi);

         */
        //74
        /*int multi = 1;
        int count =0;
        int[]array ={1,3,4,2,8,9};
        for (int i = 0; i <array.length ; i++) {
            if (i % 2 != 0) {
                multi*=array[i];
                count++;
            }
        }
        System.out.println(multi/count);

         */
        //75
        // Сумма положительных элементов с нечетными индексами
//        int sum=0;
//        int [] array= {1,3,-5,7,-6,-9};
//        for (int i = 0; i < array.length ; i++) {
//            if (i%2!=0 && array[i]>0) {
//                sum+=array[i];
//            }
//        }
//        System.out.println(sum);
        //76
//        int count=0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int [] array = {1,5,7,9,5,2,8,14};
//        for (int i = 0; i < array.length ; i++) {
//            if (i%k==0) {
//                count++;
//            }
//        }
//        System.out.println(count);
        //77
//        int count=0;
//        int count1=0;
//
//        int []array= {4,7,8,-6,89,-1,3,0,-6,2,-8};
//        for (int ron:array) {
//            if (ron>0) {
//                count++;
//            }
//            else  {
//                count1++;
//            }
//
//        }
//            System.out.println("numbers of positive numbers: "+ count);
//            System.out.println("numbers of negative numbers: "+ count1);

        //78

//        int sum=0;
//
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        int []array= {a,b};
//
//        for (int i = a; i <=b ; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);


        //84
        /*int sum=0;
        int count=0;
        Scanner scr = new Scanner(System.in);
        System.out.println("input k: ");
        int k = scr.nextInt();
        int[] array = {1,2,3,4,5,6,7};
        for (int i = 0; i <array.length ; i++) {
            if (i%k==0) {
               sum+=array[i];
               count++;
            }
        }
        System.out.println(sum/count);

         */

        //85
//        int sum=0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int[]array= {2,13,56,32,11};
//        for (int i = 0; i <array.length ; i++) {
//            if (i%k==0) {
//                sum+=array[i];
//            }
//        }
//        System.out.println(sum);


        //87
//        int multi = 1;
//        int count = 0;
//        int f = 0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int[] array = {1, 2, 3, 4};
//        for (int i : array) {
//
//            if (array[i] % k == 0) {
//                multi *= i;
//                count++;
//
//            }
//        }
//            System.out.println(multi / count);
//    }

//        int[][] array =  {{1,2,3},
//                          {4,5,6},
//                          {7,8,9}};
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = 0; j <array[i].length ; j++) {
//
//            System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//
        //69
//        int multi =1;
//        int count =0;
//        int []array ={1,3,-2,5,-9};
//        for (int ron:array) {
//            if (ron>0) {
//                multi*=ron;
//                count++;
//            }
//        }
//        System.out.println(multi/count);
        //70
//        int multi=1;
//        int count=0;
//        int[]array= {1,3,-7,-3};
//        for (int ron:array) {
//            if (ron<0) {
//                multi*=ron;
//                count++;
//            }
//        }
//        System.out.println(multi/count);
        //71
//        int sum=0;
//        int count=0;
//        int[]array= {1,3,-7,-3};
//        for (int ron:array) {
//            if (ron<0) {
//                sum+=ron;
//                count++;
//            }
//        }
//        System.out.println(sum/count);
//        int [] array= {1,2,3,4};
//        System.out.println(array.length-1);

        //68
//        int sum=0;
//        int count=0;
//        int [] array={1,2,-2,-4,5};
//        for (int ron:array) {
//            if (ron>0) {
//                sum+=ron;
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        //69

//        int multi=1;
//        int count=0;
//        int [] array={1,2,-2,-4,5};
//        for (int ron:array) {
//            if (ron>0) {
//                multi*=ron;
//                count++;
//            }
//        }
//        System.out.println(multi/count);

//        int [][] array = {{1,2,3},{4,5,6},{7,8,9},{0,11,12}};
        // System.out.println(array[1][1+1]);
//        int array[][] = {{1,2,3,4,5},{4,5,6}};
//        System.out.println(array[0][array.length-2]);
//
//        int array[] ={1,2,3,5,2345};
//        System.out.println(array[array.length-1]);


//81
//        int sum=0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int [] array = {1,-1,3,-4};
//        for (int ron:array) {
//            if(Math.abs(ron)<k){
//                sum+=Math.pow(ron,3);
//
//            }
//        }
//        System.out.println(sum);


//        //82
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input t: ");
//        int t = scr.nextInt();
//        int multi=1;
//        int []array = {1,2,-8,4,-5};
//        for (int ron:array) {
//            if (Math.abs(ron)<t){
//                multi*=ron;
//            }
//
//        }
//        System.out.println(multi);
        //83
//        int count =0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input t: ");
//        int k = scr.nextInt();
//        int []array = {1,2,-8,4,-5};
//        for (int ron:array) {
//            if (Math.abs(ron)<k) {
//             count++;
//            }
//        }
//        System.out.println(count);

        //86
//        int multi =1;
//        int [] array = {1,2,3,4,5};
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]-i>0) {
//                multi*=array[i];
//            }
//        }
//        System.out.println(multi);


        //71 izscreenshot
        /*for (double x = 2.4; x <=7.6 ; x+=0.2) {
            double y=Math.tan(2*x+Math.pow(x,2));
            System.out.println(y);

        }

        */
//        double x =2.4;
//        while (x<=7.6) {
//           double y = Math.tan(2 * x + Math.pow(x, 2));
//            x += 0.2;
//            System.out.println(y);
//        }

        //76
//        double y=0;
//        for (int x = -5; x <=5 ; x+=2) {
//            if (x > 0) {
//                y=Math.pow(x,2)+4*Math.pow(x,8);
//            }
//            else {
//                y=0;
//            }
//            System.out.println(y);
//        }


        //80

//        double y=0;
//        int x =-5;
//        while (x <= 5) {
//            if (x>5) {
//                y= Math.pow(2,5-x);
//            }
//            else {
//                y=7-x;
//            }
//            x+=2;
//            System.out.println(y);
//        }


        //81
//        for (double x = -7.5; x <=8.3 ; x+=0.3) {
//            double y = Math.log(Math.pow(x,2)+4)/Math.log(3);
//            System.out.println(y);
//        }


        //90
//        int x =-30;
//        double y=0;
//        while (x <= 30) {
//            if (x>5) {
//                y= Math.sin(x);
//            }
//            else {
//                y= Math.cos(x);
//            }
//            x+=3.5;
//            System.out.println(y);
//        }


        //121
//        double x=0;
//        double y=0;
//        double sum=0;
//        for (int i = 1; i <16 ; i++) {
//            if (i % 2 != 0) {
//                x = i;
//            } else {
//                x = Math.pow(i, 3);
//            }
//            if (i % 2 != 0) {
//                y = Math.pow(i, 2);
//            } else {
//                y = i;
//
//            }
//
//        }
//                sum+=Math.pow(x-y,2);
//        System.out.println(sum);


        //123
//        double x=0;
//        double y =0;
//        double multi =1;
//        for (int i = 1; i <14 ; i++) {
//            if (i%2!=0){
//                x=Math.pow(Math.E,i-4);
//
//            }
//            else {
//                x=Math.pow(i,2)-i;
//            }
//            y=Math.pow(i,4);
//
//        }
//            multi=Math.pow(x,2)*Math.pow(y,2);
//        System.out.println(multi);
//

        //125
//        double x=0;
//        double y =0;
//        double sum =0;
//        for (int i = 1; i <10 ; i++) {
//            if (i%3==0){
//                x=Math.log(i)/Math.log(Math.E);
//    }
//        else{
//            x=3;
//            }
//
//
//            if (i%7==0){
//                y=Math.log(i)/Math.log(3);
//            }
//            else {
//                y=3;
//            }
//
//            sum+=x-y;
//    }
//            System.out.println(sum);


        // homework
        //71
//        double y =0;
//        for (double x = 2.4; x <=7.6 ; x+=0.2) {
//            y=Math.tan(2*x+Math.pow(x,2));
//            System.out.println(y);
//        }
//
        //72
//        double y=0;
//        double x=-5.4;
//        while (x <= 1.2) {
//            y=Math.pow(1/Math.tan(Math.pow(x,2)),2);
//            x+=0.4;
//            System.out.println(y);
//        }
        //73
//        double y=0;
//        for (double x = 7.5; x <=12.5 ; x+=0.2) {
//            y=Math.pow(x+1,2);
//            System.out.println(y);
//        }

        //74
//        double y=0;
//        double x=-3.8;
//        while (x <= 5.4) {
//            y= Math.pow(2,x+4);
//            x+=0.3;
//            System.out.println(y);
//        }
        //74

//        for (double x = -3.8; x <=5.4 ; x+=0.3) {
//            double y =Math.pow(x+1,2);
//            System.out.println(y);
//        }
        //75
//        double x = -Math.PI;
//        while (x <= Math.PI) {
//            double y= Math.pow(Math.sin(x),2)+ Math.cos(x);
//            System.out.println(y);
//            x+=Math.PI/8;
//        }
        //76
//        double y=0;
//        for (double x = -5; x <=5 ; x+=2) {
//            if (x > 0) {
//                 y=Math.pow(x,2)+4*Math.pow(x,8);
//
//            }
//            else {
//                y=0;
//            }
//            System.out.println(y);
//        }

        //77
//        double y=0;
//        double x =-8;
//        while (x<=8) {
//            if (x > 3) {
//                y= Math.pow(x,2)+4*Math.pow(x,8);
//            }
//            else {
//                y=0;
//            }
//            System.out.println(y);
//            x+=3;
//        }
        //78
//        double y=0;
//        for (double x = 10; x <=20 ; x+=2) {
//            if (x > 12) {
//                y=3*Math.log(x)/Math.log(3);
//
//            }
//            else {
//                y=Math.pow(x,3);
//            }
//            System.out.println(y);
//        }

        //79
        /*double x= -4;
        double y=0;
        while (x<=5) {
            if (x > 1) {
                y = Math.log(x) / Math.log(4);
            } else {
                y = -9;

            }
            System.out.printf("y=%f \n", y);
            x += 1;
        }

         */

//        }
        //80
//            double y=0;
//        for (double x = -5; x <=5 ; x+=2) {
//            if (x > 5) {
//                y=Math.pow(2,5-x);
//            }
//            else {
//                y=7-x;
//            }
//            System.out.printf("y=%f \n",y);
//        }

        //81
//         double y=0;
//        for (double x = -7.5; x <=8.3 ; x+=0.3) {
//            y= Math.log(Math.pow(x,2)+4)/Math.log(3);
//            System.out.printf("y=%f \n",y);
//            System.out.printf("x=%f \n",x);
//        }


        //82
//    double y=0;
//    double x= -2.7;
//        while (x<=3.3) {
//            y=Math.pow(x+Math.pow(x,2),7);
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//            x+=0.5;
//        }

        //83
//        double y=0;
//        for (double x =-4.8 ; x <=5.2 ; x+=0.2) {
//            y=Math.pow(Math.atan(x+1),2);
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//        }

        //84
//        double x=-6.4;
//        double y=0;
//        while (x <= 2.4) {
//            y= Math.pow(Math.E,1/Math.tan(x));
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//            x+=0.2;
//        }
        //84
//        for (double x = -6.4; x <=2.4 ; x+=0.2) {
//            double y= Math.pow(Math.E,1/Math.tan(x));
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//
//        }

        //85
//        for (double x = -3.3; x <=2.7 ; x+=0.3) {
//            double y = Math.abs(2*x+Math.pow(x,3));
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//        }
        //86
//        double x=-5;
//        double y=0;
//        while (x<=8) {
//            if (x>2) {
//                y=Math.pow(3,x+4);
//            }
//            else {
//                y=-8;
//            }
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//          x+=2;
//    }
        //87
//            double y=0;
//        for (double x = 10; x <=23 ; x+=3.2) {
//            if (x > 7) {
//                y=Math.pow(Math.E,Math.sin(x));
//            }
//            else {
//                y=0;
//            }
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//        }

        //88
//        double x=-3.3;
//        double y=0;
//        while (x <= 3) {
//            if (x > 1) {
//                y=6*Math.pow(Math.E,8+x);
//            }
//            else {
//                y=x+4;
//            }
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//            x+=0.8;
//        }
        //88
//        double y=0;
//        for (double x = -3.3; x <=3 ; x+=0.8) {
//            if (x > 1) {
//                y=6*Math.pow(Math.E,8+x);
//            }
//            else {
//                y=x+4;
//            }
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//
//            }

        //89
//        double y=0;
//        for (double x = -5; x <=9 ; x+=1.5) {
//            if (x > 3) {
//                y=Math.log(x)/Math.log(4);
//            }
//            else {
//                y=-9;
//            }
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//        }

        //90
//        double x=-30;
//        double y=0;
//        while (x <= 30) {
//            if (x > 5) {
//                y=Math.sin(x);
//            }
//            else {
//                y=Math.cos(x);
//            }
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//            x+=3.5;
//        }
        //121
//        double sum=0;
//        double x =0;
//        double y =0;
//
//        for (int i = 1; i <16 ; i++) {
//            if (i % 2 != 0) {
//                x=i;
//            }
//            else {
//                x=Math.pow(i,3);
//            }
//            if (Math.pow(i, 2) % 2 != 0) {
//                y=Math.pow(i,2);
//            }
//            else {
//                y=i;
//            }
//            System.out.printf("x=%f \n",x);
//            System.out.printf("y=%f \n",y);
//
//            sum+=Math.pow(x-y,2);
//        }
//            System.out.println("sum= "+sum);

//        //122
//        double x=0;
//        double y=0;
//        double sum=0;
//        double [] array ={1,2,3,4,5,6,7,8,9};
//        for (double i:array) {
//            if (i % 2 != 0) {
//                x=Math.pow(Math.E,4);
//            }
//            else {
//                x=Math.pow(i,2)-i;
//            }
//            if (Math.pow(i, 2) % 2 != 0) {
//                y=Math.pow(Math.tan(i),2);
//            }
//            else {
//                y=0;
//            }
////            System.out.println("i= "+i);
////            System.out.println("x= "+x);
////            System.out.println("y= "+y);
//            sum+=Math.pow(x,2)-Math.pow(y,2);
//
//
//        }
//        System.out.println("sum= "+sum);

        //122

//        double x=0;
//        double y=0;
//        double sum=0;
//        for (int i = 1; i <10 ; i++) {
//
//            if (i % 2 != 0) {
//                x=Math.pow(Math.E,4);
//            }
//            else {
//                x=Math.pow(i,2)-i;
//            }
//            if (Math.pow(i, 2) % 2 != 0) {
//                y=Math.pow(Math.tan(i),2);
//            }
//            else {
//                y=0;
//            }
////            System.out.println("i= "+i);
////            System.out.println("x= "+x);
////            System.out.println("y= "+y);
//            sum+=Math.pow(x,2)-Math.pow(y,2);
//
//        }
//        System.out.println("sum="+sum);

        //123
//
//        double x=0;
//        double y=0;
//        double multi=1;
//        double[]array =new double[13];
//        for (int i = 1; i <array.length+1 ; i++) {
//            if (i%2!=0) {
//                x=Math.pow(Math.E,i-4);
//                System.out.println(i);
//            }
//            else {
//                x=Math.pow(i,2)-i;
//
//            }
//            y=Math.pow(i,4);
//            multi*=Math.pow(x,2)*Math.pow(y,2);
//            }
//        System.out.println("multi= "+multi);

        //124
//        double x =0;
//        double y=0;
//        double multi =1;
//        double i=2;
//        while (i < 18) {
//            if (i % 2 != 0) {
//                x=Math.pow(2,i-4);
//            }
//            else {
//                x=Math.pow(i,2)+2;
//            }
//            y=Math.pow(i,2)+2;
//            multi*=(x*y);
////            System.out.println("x= "+x);
////            System.out.println("y= "+y);
////            System.out.println("i= "+i);
//
//            i++;
//
//        }
//        System.out.printf("multi=%f ",multi);

        //125
//        double x =0;
//        double y=0;
//        double sum =0;
//        for (int i = 1; i <10 ; i++) {
//            if (i % 3 == 0) {
//                x=Math.log(i);
//            }
//            else {
//                x=3;
//            }
//            if (i % 7 == 0) {
//                y=Math.log(i)/Math.log(3);
//            }
//            else {
//                y=3;
//            }
//            sum+=(x-y);
//        }
//        System.out.println("sum= "+sum);

        //126
//        double x =0;
//        double y=0;
//        double sum =0;
//        double i =1;
//        while (i < 16) {
//
//            if (i % 5 == 0) {
//                x=i;
//            }
//            else {
//                x=0;
//            }
//            if (i % 7 == 0) {
//                y=Math.pow(i,2);
//            }
//            else {
//                y=i;
//            }
//            i+=1;
//            sum+=(x-y);
//    }
//        System.out.println("sum= "+sum);

        //127
//        double x=0;
//        double y=0;
//        double multi=1;
//        for (double i = 1; i <17 ; i++) {
//            if (i % 2 != 0) {
//                x=Math.pow(Math.sin(i),2);
//            }
//            else {
//                x=0;
//            }
//            if (i % 2 != 0) {
//                y=Math.tan(i);
//            }
//            else {
//                y= 1/Math.tan(i);
//            }
//            System.out.println("x= "+x);
//            System.out.println("y= "+y);
//            System.out.println("i= "+i);
//
//
//            multi*=(Math.pow(x,2)*y);
//
//        }
//        System.out.println("multi= "+multi);

        //127
//        double x=0;
//        double y=0;
//        double multi=1;
//        double i =1;
//        while (i < 14) {
//            if (i%2==0) {
//                x=Math.pow(Math.PI,3*i-4);
//            }
//            else {
//                x=Math.pow(i,2)-i;
//            }
//            y=Math.pow(i-1,2);
//            multi*=x*Math.pow(y,2);
//            i++;
//        }
//        System.out.println("multi= "+multi);
        //128
//        double x=0;
//        double y=0;
//        double multi=1;
//        for (int i = 1; i <14 ; i++) {
//            if (i % 2 == 0) {
//                x=Math.pow(Math.E,3*i-4);
//            }
//            else {
//                x=Math.pow(i,2)-i;
//            }
//            y=Math.pow(i-1,2);
//            multi*=x*Math.pow(y,2);
//        }
//        System.out.println(multi);


        //129
        //  double x=0;
//        double y=0;
//        double sum=0;
//        for (int i = 1; i <16 ; i++) {
//            if (Math.sqrt(i) %1== 0) {
//                x=Math.tan(i);
//            }
//            else {
//                x=1/Math.tan(i);
//            }
//            y=Math.pow(Math.E,i-4);
//            sum+=x*y-i;
//        }
//        System.out.println(sum);

        //131

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//        for (int k = 1; k <4 ; k++) {
//            if (x > 1) {
//                y=3*Math.pow(x,k+1);
//
//            }
//            else {
//                y=5*x +Math.pow(k,7);
//            }
//            System.out.println(y);
//        }
        //
        // 132
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//        System.out.println("input n: ");
//        double n=scr.nextDouble();
//        for (int k = 1; k <n ; k++) {
//            if (x>5) {
//                y=3*Math.log(x)/Math.log(3)+5*k;
//
//            }
//            else {
//                y=4*(Math.pow(x+k,8));
//            }
//            System.out.println(y);
        //133
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//
//        for (int k = 1; k <5 ; k++) {
//            if (x<1) {
//                y=8*Math.pow(x,k);
//
//            }
//            else {
//                y=7*x + Math.log(x)/Math.log(3);
//            }
//            System.out.println(y);
//
        //134
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//        for (int k = 1; k <8 ; k++) {
//            if (x>1) {
//                y=Math.pow(x,k-1);
//
//            }
//            else if(x>0 && x<5) {
//                y=x*Math.pow(k,3);
//            }
//            else {
//                y=Math.pow(10,-6);
//
//            }
//            System.out.println(y);
        //135
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//
//        for (int k = 1; k <4 ; k++) {
//            if (x>1) {
//                y=Math.pow(x,k-1);
//            }
//            else if (x<3){
//                y=x*Math.pow(k,3);
//            }
//            else {
//                y=Math.pow(10,-6);
//            }
//            System.out.println(y);
//
//
//        }
//
        //136
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//
//        for (int k = 2; k <=8 ; k++) {
//            if (x > 3 && x < 7) {
//                y = 9 * Math.pow(x, k);
//            } else {
//                y = 8 * x + Math.pow(k, 3);
//            }
//            System.out.println(y);
//        }
//
//
//        }
        //137
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//
//        for (int k = 1; k <=10 ; k++) {
//            if (x>2 && x<6) {
//                y=Math.log(x)/Math.log(4) + Math.log(k);
//            }
//
//            else {
//                y=4*Math.pow(x+k,8);
//            }
//            System.out.println(y);

        //138
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        double y=0;
//
//        for (int k = 2; k <=7 ; k++) {
//            if ( x<6) {
//                y=Math.pow(x,k)+k;
//            }
//
//            else {
//                y=Math.log(k)/Math.log(5);
//            }
//            System.out.println(y);


        //141
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a=scr.nextDouble();
//        double W=0;
//        double sum=0;
//        double multi=1;
//        for (int m = 0; m <5 ; m++) {
//            for (int n = 0; n <6 ; n++) {
//                sum+=Math.pow(a,m+n);
//            }
//            W= multi*=sum;
//
//        }
//        System.out.println(W);
//


        //130
//        double x=0;
//        double y=0;
//        double multi =1;
//        double[] array= new double[9];
//        for (int i = 1; i < array.length+1 ; i++) {
//            if (i % 5 == 0) {
//                x=i;
//            }
//            else {
//                x=Math.pow(i,2);
//            }
//            if (i % 3 == 0) {
//                y=Math.pow(i,3);
//            }
//            else {
//                y=6;
//            }
//            multi*=x*y;
//        }
//        System.out.println("multi= "+multi);
        //

        // повторение материала
        //69
//        int multi=1;
//        int count =0;
//        int[]array={1,3,4,-6,-3,5};
//        for (int ron:array) {
//            if (ron > 0) {
//                multi*=ron;
//                guess++;
//            }
//
//        }
//        System.out.println(multi);

        //70
//        int multi=1;
//        int count =0;
//        int []array = {-2,6,-3,5,3,-1};
//        for (int ron:array) {
//            if (ron < 0) {
//                multi*=ron;
//                count++;
//            }
//
//        }
//        System.out.println(multi/count);

        //71
//        int sum=0;
//        int count =0;
//        int[]array={-4,0,-7,4,6};
//        for (int ron:array) {
//            if (ron < 0) {
//                sum+=ron;
//                count++;
//            }
//        }
//        System.out.println(sum/count);


        //72
//            int sum=0;
//            int []array={1,3,6,7,2};
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 == 0) {
//                sum+=array[i];
//            }
//
//        }
//        System.out.println(sum);

        //73
//        int multi =1;
//        int[]array= {1,2,3,4,5,6,7,8,9,0};
//        for (int i = 0; i <array.length ; i++) {
//            if (i % 2 == 0) {
//                multi*=array[i];
//            }
//        }
//        System.out.println(multi);


        //74
//        int multi =1;
//        int[]array= {1,2,3,4,5};
//        for (int i = 0; i <array.length ; i++) {
//            if (i % 2 != 0) {
//                multi*=Math.pow(array[i],2 );
//            }
//        }
//        System.out.println(multi);

        //75
//        int sum =0;
//        int[]array={1,-3,5,7,-9};
//        for (int i = 0; i <array.length ; i++) {
//            if (i % 2 != 0) {
//                sum+=Math.abs(array[i]);
//            }
//
//        }
//        System.out.println(sum);

        //76
//        int count=0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int[]array = new int[]{1,2,4,56,3,8,-6};
//        for (int i = 0; i < array.length ; i++) {
//            if (i % k == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

//        //77
//        int count =0;
//        int count1 =0;
//        int[]array= new int[]{1,2,3,-4,-5,-6,7,8,9};
//        for (int ron:array) {
//            if (ron > 0) {
//                count++;
//            }
//            else {
//                count1++;
//            }
//        }
//        System.out.printf("numbers of positiv numbers = %d \n",count);
//        System.out.printf("numbers of negativ numbers = %d \n" ,count1);

        //78
//        int sum=0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        for (int i=a; i <=b ; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);

        //80
//        int count =0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        for (int i = a; i <=b ; i++) {
//            count++;
//        }
//        System.out.println(count);

        //81
//        int sum =0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//
//        int[]array={1,2,3,4,5,6,7};
//        for (int ron:array) {
//            if (Math.abs(ron) < k) {
//               sum+=Math.pow(ron,3);
//            }
//        }
//        System.out.println(sum);

        //79
//        int multi=1;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input g: ");
//        int g = scr.nextInt();
//        for (int i = c; i <g ; i++) {
//            multi*=i;
//        }
//        System.out.println(multi);

        //82
//        int multi=1;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input t: ");
//        int t = scr.nextInt();
//        int[]array={1,-2,3,-4,5,-6,7,-8};
//        for (int ron:array) {
//            if (Math.abs(ron) < t) {
//                multi*=ron;
//            }
//
//        }
//        System.out.println(multi);

        //83
//        int count=0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int[]array= {1,-3,-5,-3,6,7,8};
//        for (int ron:array) {
//            if (Math.abs(ron) < k) {
//                count++;
//            }
//        }
//        System.out.println(count);

        //84
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int sum=0;
//        int count =0;
//        int []array= {1,2,3,4,5,6,7,8};
//        for (int i = 0; i < array.length ; i++) {
//            if (i % k == 0) {
//                sum+=array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        //85
//        int sum=0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input an integer k: ");
//        int k = scr.nextInt();
//        int[]array={1,2,3,4,5,6,7,8};
//        for (int i = 0; i < array.length ; i++) {
//            if (i % k == 0) {
//                sum+=array[i];
//            }
//        }
//        System.out.println(sum);
//
        //86
//        int multi =1;
//        int[]array={1,2,3,4,5};
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] - i > 0) {
//                multi*=array[i];
//            }
//        }
//        System.out.println(multi);

        //87?

        //41
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        int sum=0;
//        for (int i = 1; i <10 ; i++) {
//            if (i % n == 0) {
//                sum+=i;
//            }
//        }
//            System.out.println(sum);

        //42
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        int multi=1;
//        for (int i = 1; i <10 ; i++) {
//            if (i % n == 0) {
//                multi*=i;
//            }
//        }
//        System.out.println(multi);

        //43
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        int sum=0;
//        for (int i = 1; i <100 ; i++) {
//            if (i % n == 2) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

        //44
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        int multi=1;
//        for (int i = 1; i <100 ; i++) {
//            if (i % n == 3) {
//                multi+=i;
//            }
//        }
//        System.out.println(multi);
        //45
//        int sum=0;
//        for (int i = 10; i <100 ; i++) {
//            if (i % 3 == 0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

        //46
//
//        int multi=1;
//        for (int i = 10; i <100 ; i++) {
//            if (i % 3 == 0 && i%5==0) {
//                multi+=i;
//            }
//        }
//        System.out.println(multi);

        //50
//        for (int i = 100; i <1000 ; i++) {
//            for (int j = 11; j <1000 ; j++) {
//                if (i * 16 == Math.pow(j, 2)) {
//            System.out.println(i);
//                    System.out.println(j);
//
//                }
//
//            }
//            break;
//        }
        //52
//        boolean t=false;
//        for (int i = 9999; i >=1000; i--) {
//            for (int j = 1000; j>10 ; j--) {
//                if (i * 14 == Math.pow(j, 2)) {
//                    t=true;
//                    System.out.println(i);
//                    System.out.println(j);
//                    break;
//
//                }
//
//            }
//
//            if (t) break;
//
//
//        }

        //53
//        boolean t =false;
//        for (int i = 9999; i >=1000 ; i--) {
//            for (int j = 10; j <1000 ; j++) {
//                if (i * 18 == Math.pow(j, 2)) {
//                    t=true;
//                    System.out.println(i);
//                    System.out.println(j);
//                    break;
//                }
//
//            }
//            if (t)break;
//        }


        //75
//   double y=0;
//        for (double x = -Math.PI; x <=Math.PI ; x+=Math.PI/8) {
//            y= Math.pow(x,2)+4*Math.pow(x,8);
//
//        System.out.println(y);
//        }
//


        //78
//        double x=10;
//        double y=0;
//        while (x <= 20) {
//            if (x > 12) {
//                y=3*Math.log(x)/Math.log(3);
//            }
//            else {
//                y=Math.pow(x,3);
//            }
//            System.out.println(y);
//            x+=2;
//        }


        //123
//        double multi=1;
//        double x=0;
//        double y=0;
//        double []array =new double[13];
//        for (int i = 1; i < array.length+1 ; i++) {
//            if (i%2!=0) {
//                x=Math.pow(Math.E,i-4);
//            }
//            else {
//                x= Math.pow(i,2)-i;
//            }
//            y=Math.pow(i,4);
//            multi*=Math.pow(x,2)*Math.pow(y,2);
//        }
//        System.out.printf("multi = %f \n",multi);


//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        double n=scr.nextDouble();
//
//
//        double P=0;
//
//        double multi=1;
//        double multi1=1;
//        for (int i = 0; i <15 ; i++) {
//            for (int m = 1; m < 6; m++) {
//                multi *= i / (i + n * m);
//            }
//            P = multi1 *= multi;
//        }
//        System.out.println(P);
//

        //145
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input c: ");
//        double c=scr.nextDouble();
//     int z=0;
//       int  multi=1;
//        int sum =0;
//        for (int i = 1; i <7 ; i++) {
//            for (int k = 1; k < 8; k++) {
//                multi *= Math.pow(i,2)+c*k;
//            }
//            sum+=multi;
//        }
//        z=sum;
//        System.out.println(z);
//
//
//
//
//
//

        //147
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        double n=scr.nextDouble();
//
//        System.out.println("input v: ");
//        double v=scr.nextDouble();
//        double Z=0;
//        double sum=0;
//        double sum1=0;
//        for (double k = 1; k <n ; k++) {
//            for (double i = 1; i <k ; i++) {
//                sum+=(v*i +k);
//            }
//            sum1+=(k+5)*sum;
//            Z=sum1;
//
//
//        }
//        System.out.println(Z);


//149
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a=scr.nextDouble();
//        double S=0;
//        double sum=0;
//        double multi=1;
//        for (double i = 1; i <8 ; i++) {
//            for (double j = 1; j <8 ; j++) {
//               multi*=Math.cos(a*i +j);
//            }
//            sum+=Math.sin(Math.pow(i,2)+1)*multi;
//
//        S=sum;
//
//        }
//        System.out.println(S);


        // Homework


        //134
//        double y=0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x = scr.nextDouble();
//        for (int k = 1; k <8 ; k++) {
//            if (x > 1) {
//                y=Math.pow(x,k-1);
//            } else if (x > 0 && x < 5) {
//                y=x*Math.pow(k,3);
//            }
//            else {
//                y=Math.pow(10,-6);
//            }
//            System.out.println(y);
//        }

        //135
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x = scr.nextDouble();
//        double y=0;
//        double k=2;
//        while (k <= 8) {
//            if (x > 3 && x < 7) {
//                y=9*Math.pow(x,k);
//            }
//            else {


//                y=8*x +Math.pow(k,3);
//            }
//            System.out.println(y);
//            k++;
//        }

        // 141
      /*  Scanner scr = new Scanner(System.in);
                System.out.println("input a: ");
                double a = scr.nextDouble();
                double w=0;
                double multi=1;
                double sum=0;
                for (int m = 0; m <5 ; m++) {
                    for (int n = 0; n <6; n++) {
                        sum+=Math.pow(a,m+n);
                    }
                   w= multi*=sum;

                }
                System.out.println("w = "+w);

       */
        //142
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        double w=0;
//        double sum1=0;
//        double sum=0;
//        for (double k = 1; k <9 ; k++) {
//            for (double m = 1; m <5 ; m++) {
//                sum+=a*Math.pow(m,2)+Math.pow(k,2);
//            }
//            sum1+=sum;
//        w=sum1
//        }
//        System.out.println(w);

        //143
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        double n = scr.nextDouble();
//        double p=0;
//        double multi=1;
//        double multi1=1;
//        for (int i = 0; i <15 ; i++) {
//            for (int m = 1; m <6 ; m++) {
//                multi*=i/(i+n*m);
//            }
//          p=  multi1*=multi;
//
//        }
//        System.out.println(p);

        //144
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input y: ");
//        double y = scr.nextDouble();
//        System.out.println("input x: ");
//        double x = scr.nextDouble();
//        double S=0;
//        double sum1=0;
//        double sum=0;
//        for (int i = 1; i <7 ; i++) {
//            for (int j = 1; j <8 ; j++) {
//                sum+=y*Math.pow(x,i-j);
//            }
//            sum1+=sum;
//            S=sum1;
//        }
//        System.out.println(S);

        //145
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        double Z=0;
//        double sum=0;
//        double multi=1;
//        for (int i = 1; i <7 ; i++) {
//            for (int k = 1; k <8 ; k++) {
//                multi*=Math.pow(i,2)+c*k;
//            }
//            sum+=multi;
//            Z=sum;
//        }
//        System.out.println(Z);

        //146
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        double Z=0;
//        double sum=0;
//        double sum1=0;
//        for (int i = 1; i <5 ; i++) {
//            for (int k = 1; k <8 ; k++) {
//                sum+=(c*i +k)/k;
//            }
//            sum1+=Math.pow(i,2)*sum;
//            Z=sum1;
//        }
//        System.out.println(Z);

        //148
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input f: ");
//        double f = scr.nextDouble();
//        double Y=0;
//        double sum=0;
//        double multi=1;
//        for (int i = 1; i <12 ; i++) {
//            for (int j = 1; j <7 ; j++) {
//                sum += f * i + Math.pow(j, 2);
//            }
//            multi*=(i+1)*sum;
//            Y=multi;
//        }
//        System.out.println(Y);

        //149
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        double S=0;
//        double sum=0;
//        double multi=1;
//        for (int i = 0; i <8 ; i++) {
//            for (int j = 1; j <8 ; j++) {
//                multi*=Math.cos(a*i + j);
//            }
//            sum+=Math.sin(Math.pow(i,2)+1)*multi;
//            S=sum;
//        }
//        System.out.println(S);

        //150
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        double S=0;
//        double sum=0;
//        double multi=1;
//        for (int k = 1; k <10 ; k++) {
//            for (int j = 1; j <8 ; j++) {
//                sum+=Math.tan(b*k +Math.pow(j,2));
//            }
//            multi*=(k+1)*sum;
//            S=multi;
//        }
//        System.out.println(S);


        // array


        // HOMEWORK
        //88
//        int sum=0;
//        int []array = {1,2,3,4,5,6,7,8};
//        for (int ron:array) {
//            if (ron % 2 == 0) {
//                sum+=Math.pow(ron,2);
//            }
//
//        }
//        System.out.println(sum);

        //89
//        int count=0;
//        int[]array = {1,2,3,4,5,6,7,8,9,0};
//        for (int ron:array) {
//            if (ron % 2 == 0) {
//                count++;
//            }
//        }
//
//        System.out.println(count);


        //90
//        int multi =1;
//        int sum=0;
//        int[]array={1,2,3,4,5,6,7,8,9};
//        for (int ron:array) {
//            if (ron % 2 == 0) {
//                multi*=ron;
//                sum+=ron;
//            }
//        }
//        System.out.printf("multi= %d \n",multi);
//        System.out.printf("sum= %d",sum);


        //91
//        int sum=0;
//        int count=0;
//        int[]array ={1,2,3,4,5,6,7,8,9};
//        for (int ron:array) {
//            if (ron % 2 != 0) {
//                sum+=ron;
//                count++;
//            }
//        }
//        System.out.println(sum/count)


        //92
//        int multi=1;
//        int count=0;
//        int[]array={1,2,3,4,5,6,7,8,9};
//        for (int ron:array) {
//            if (ron % 2 != 0) {
//                multi*=ron;
//                count++;
//            }
//
//        }
//        System.out.println(multi/count);

        //93
         /*
        int count=0;
        int count1=0;
        int[]array={1,2,3,4,5,6,7,89,0};
        for (int i = 0; i <array.length ; i++) {
            if (i % 2 != 0  ) {
                count++;

            }
            if (array[i] % 2 != 0) {
                count1++;
            }

        }
        System.out.println(count);
      System.out.println(count1);

          */


        //94
//        int count=0;
//        int []array ={1,0,6,0,6,4,3};
//        for (int ron:array) {
//            if (ron == 0) {
//                count++;
//            }
//        }
//        System.out.printf("count = %d ",count);
//

        //95
//        int sum=0;
//        int count=0;
//        int[]array={1,2,3,4,5,21,8};
//        for (int ron:array) {
//            if (ron % 3 == 0) {
//                count++;
//                sum+=ron;
//            }
//        }
//
//        System.out.println(sum/count);


        //96
//        int multi =1;
//        int count=0;
//        int[]array ={0,1,2,3,4,5,6,7,8,9,10};
//        for (int ron:array) {
//            if (ron % 5 == 0) {
//                multi*=ron;
//                count++;
//            }
//        }
//        System.out.println(multi/count);
//

        //97
//        int count =0;
//        int[]array={1,2,3,4,5,6,7};
//        for (int ron:array) {
//            if (ron % 7 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);


        //98

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k=scr.nextInt();
//        int sum=0;
//        int[]array={1,2,3,4,5,6,7};
//        for (int ron:array) {
//            if (ron % k == 0) {
//                sum+=ron;
//            }
//        }
//        System.out.println("sum = "+sum);


        //99
//        int multi =1;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input m: ");
//        int m= scr.nextInt();
//        int[]array={1,2,3,4,5,6,7,8,9};
//        for (int ron:array) {
//            if (ron % m == 0) {
//                multi*=ron;
//
//            }
//        }
//        System.out.println(multi);

        //100
//        int count=0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input t: ");
//        int t=scr.nextInt();
//        int []array={1,2,4,5,6,7,8};
//        for (int ron:array) {
//            if (ron % t == 0) {
//                count++;
//            }
//        }
//        System.out.println("count = "+count);

        //101
//        int multi=1;
//        int[]array={1,2,3,4,5,6,7};
//        for (int ron:array) {
//            if (ron % 5 == 2) {
//                multi*=ron;
//            }
//        }
//        System.out.println(multi);


        //102

//        int sum=0;
//        int sum1=0;
//        int []array ={1,2,3,4,5,6,7,8};
//        for (int i = 0; i <array.length ; i++) {
//            sum+=array[i]+i;
//
//            if (sum % 3 == 0) {
//                sum1+=Math.pow(array[i],2 );
//            }
//        }
//        System.out.println("sum = "+ sum);
//
        //103
//        int sum=0;
//        int count=0;
//        int[]array={1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,4,6,7,8,6,4,4,5,6,};
//        for (int i = 0; i < array.length ; i++) {
//            if (i == Math.pow(array[i], 2)) {
//                sum+=array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        //104
//        int multi=1;
//        int count=0;
//        int []array ={1,2,3,4,5,6,0,3,2,8};
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > i) {
//                multi*=array[i];
//                count++;
//            }
//        }
//        System.out.println(multi/count);
//
//
//    }

        //106
//        int count =0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k = scr.nextInt();
//        int []array ={1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < array.length ; i++) {
//            int a = array[i]-i;
//            if (Math.abs(a)>k) {
//                    count++;
//            }
//        }
//        System.out.println(count);

        //108

//        int []array ={1,2,300,4,5};
//        int max=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max = array[i];
//                System.out.println(max);
//            }
//
//        }
//            System.out.println(max);

        //110
//        int []array ={1,2,33,4,5};
//        int max=array[0];
//        int min =array[0];
//        int sum=0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max = array[i];
//
//            }
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//          sum+=max+min;
//
//        System.out.println(sum);


//        for (int i = 1; i <=9; i++) {
//            for (int j = 1; j <=10 ; j++) {
//                System.out.println(i+"*"+j+ "=" +i*j);
//            }
//        }


//            int[]array = {3,2,3,6,-3,1,4};
//        int min =array[0];
//        int max =array[0];
//        for (int ron:array) {
//            if (ron < min) {
//                min=ron;
//            }
//            if (ron > max) {
//                max=ron;
//            }
//        }
//        System.out.println(min+max);
//        System.out.println(max);



        /*for (int i = 1; i <=9; i++) {
           for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"*"+j+ "=" +i*j);
            }
        }

         */

        //109
//        int[]array={9,2,3,4,5,6,7};
//        int min =array[0];
//        for (int ron :array) {
//            if (ron<min) {
//                min=ron;
//            }
//        }
//        System.out.println(min);

        //111

//        int[]array={5,2,3,4,5,6,7};
//        int min =array[0];
//        int max =array[0];
//        for (int ron:array) {
//            if (ron < min) {
//                min=ron;
//            }
//            if (ron>max) {
//                max=ron;
//            }
//
//        }
//        System.out.println(max*min);
        // 114
//        int[]array={1,22,1,22,9};
//        int max =array[array.length-1];
//        int c=0;
//        for (int i = array.length-1; i>=0 ; i--) {
//            if (array[i] > max) {
//                max=array[i];
//                c=i;
//                break;
//
//            }
//
//        }
//         System.out.println(c);


        //115
//        int[]array={88,22,88,22,9};
//        int max = array[array.length-1];
//        int c=0;
//
//        for (int i = array.length-1; i >=0 ; i--) {
//            if (array[i] > max) {
//                max=array[i];
//                c=i;
//            }
//        }
//        System.out.println(c);

        //116

//        int [] array={3,1,5,1,0,9,0};
//        int min = array[0];
//        int c=0;
//
//        for (int i =0 ; i< array.length;i++) {
//            if (array[i] < min) {
//                min=array[i];
//                c=i;
//
//            }
//        }
//        System.out.println(c);


//        //116
//        int []array={22,111,22,99,9};
//
//        int c=0;
//        for (int i =0; i <array.length ; i++) {
//            if (array[i]<array[i+1]) {
//
//                c=i;
//                break;
//
//            }
//            else {
//                c=i+1;
//                break;
//            }
//        }
//        System.out.println(c);


//117
//        int [] array={22,1,22,1,4,9};
//        int min = array[array.length-1];
//
//        int c=0;
//        for (int i =array.length-1 ; i>=0;i--) {
//            if (array[i]< min) {
//                min=array[i];
//                c=i;
//            }
//        }
//        System.out.println(c);


//117
//        int []array = {1,2,3,4,5};
//        int c =0;
//        for (int i = array.length-1; i >0 ; i--) {
//            if (array[i]<array[i-1]){
//                c=i;
//                break;
//            }
//            else {
//                c=i-1;
//                break;
//            }
//        }
//        System.out.println(c);


//        Scanner scr =new Scanner(System.in);
//        System.out.println("input n: ");
//        int n =scr.nextInt();
//        int a = n%10;
//        int c = n/10%10;
//        int x = n/100%10;
//        int z =n/1000;
//        if (a + c < x + z) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }


        //
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input array length:");
//        int length=scr.nextInt();
//        int[]array=new int[length];
//        for (int i = 0; i < array.length ; i++) {
//            array[i]=scr.nextInt();
//        }
//        for (int i = 0; i < array.length ; i++) {
//
//        System.out.print(array[i]+" ");
//        }

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input array length");
//        int length = scr.nextInt();
//        int[]array = new int[length];
//            int max=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=scr.nextInt();
//        }
//        for (int ron:array) {
//            if (ron>max) {
//                max=ron;
//            }
//        }
//        System.out.println(max);


        //114
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input array length");
//        int length = scr.nextInt();
//        int[]array = new int[length];
//        int max=array[0];
//        int c =0;
//        for (int i = 0; i <array.length ; i++) {
//            array[i] = scr.nextInt();
//        }
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max=array[i];
//                c=i;
//                break;
//            }
//        }
//        System.out.println(c);

//        int count =0;
//
//        for (double i = 8.7; i >=0 ; i-=0.3) {
//
//            count++;
//        }
//
//        System.out.println(count);
//        int count=0;
//        double x=-20.3;
//        while (x < 0) {
//            count++;
//            System.out.println(count);
//            x+=1.6;
//        }


// int n =122;
// int a = n%10;
// int c=n/10%10;
// int b =n/100;
// boolean t;
//        if (a == b || a == c || c == a || c == b || b == a || b == c) {
//           t=true;
//        }
//        else {
//            t=false;
//        }
//        System.out.println(t);


//        Scanner scr = new Scanner(System.in);
//        System.out.println("num: ");
//        int n = scr.nextInt();
//        int count = 0;
//        while (n > 0) {
//            count++;
//            n = n / 10;
//        }
//
//            System.out.println(count);
//        while (n < 0) {
//            count++;
//            n = n / 10;
//
//        }
//            System.out.println(count);

//        Scanner noWay = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = noWay.nextInt();
//        int length = String.valueOf(a).length();
//        System.out.println(length);


//        Scanner scr = new Scanner(System.in);
//        System.out.println("input num: ");
//        int b=1;
//        int max=0;
//        int num= scr.nextInt();//1345
//        for (int i = 1; b >0 ; i*=10) {
//             b=num/i%10;
//
//            if (b > max) {
//                max=b;
//            }
//
//        }
//        System.out.println(max);


        //112
//        int []array= {1,2,3,4,5,6};
//        int max =array[0];
//        int c=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max=array[i];
//                c=i;
//            }
//
//        }
//        System.out.println(max+c);


//        int i=1;
//            do {
//                System.out.println("aaaa");
//            }
//        while (i > 2);


//        int[][]array ={{1,2,3},
//                       {5,6,7}};
//
//        System.out.println(array[0][2]);


//        Scanner scr = new Scanner(System.in);
//        System.out.println("input num: ");
//        int n = scr.nextInt();
//        int max=0;
//        int r=1;
//
//        for (int i = 1;r>0 ; i*=10) {
//            r=n/i%10;
//            if (r > max) {
//                max=r;
//            }
//        }
//        System.out.println(max);


        //9
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        int sum=0;
//        for (int i = 1; i <=100 ; i++) {
//            if (i % n == 0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

        //10
//        int multi =1;
//        for (int i = 10; i <100 ; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                multi*=i;
//            }
//        }
//        System.out.println(multi);

        //11
//        boolean t=false;
//        for (int i = 101; i <1000 ; i++) {
//            for (int j = 10; j <100 ; j++)
//                if (i * 16 == Math.pow(j, 2)) {
//                    t=true;
//                    System.out.println(i);
//                    break;
//                }
//            if (t)break;
//        }

        //12
//        boolean t= false;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        for (int i = 100; i <1000 ; i++) {
//            if (Math.sqrt(i) > n ) {
//                t=true;
//                System.out.println(i);
//                break;
//            }
//
//        }

        //13
//        boolean t=false;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        for (int i = 0; i <100 ; i++) {
//            if (Math.pow(n, 3) == i) {
//              t=true;
//                System.out.println(t);
//            }
//        }
        //14
//        int count =0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input number: ");
//        int n = scr.nextInt();
//        for (; n!=0; ) {
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);

        //18
//        int[]array = new  int[4];
//        array[5]=1;
//        System.out.println(array[5]);

        //22
//        int sum=0;
//        int[]array={1,2,3,4,5,6};
//        for (int ron:array) {
//            if (ron % 2 == 0) {
//                sum+=Math.pow(ron,2);
//            }
//        }
//        System.out.println(sum);

        //23
//        int sum=0;
//        int count =0;
//        int[]array={1,2,3,4,45,6};
//        for (int ron:array) {
//            if (ron % 2 == 0) {
//                count++;
//                sum+=ron;
//            }
//        }
//        System.out.println(sum/count);

        //24
//        int count =0;
//        Scanner scr =new Scanner(System.in);
//        System.out.println("input k: ");
//        int k= scr.nextInt();
//        int[]array = {1,22,3,4,33,2,56,9};
//        for (int i = 0; i < array.length ; i++) {
//            if (Math.abs(array[i] - i) > k) {
//                count++;
//            }
//        }
//        System.out.println(count);
        //25
//         int sum =0;
//         int count =0;
//         int[]array = {1,2,3,4,5};
//        for (int ron:array) {
//            if (ron % 2 != 0) {
//                count++;
//                sum+=ron;
//            }
//        }
//        System.out.println(sum/count);

        //26
//        int[]array ={1,2,3,4,5,6,7,9};
//        int max =array[0];
//        for (int ron:array) {
//            if (ron > max) {
//                max=ron;
//            }
//        }
//        System.out.println(max);

        //27
//        int c=0;
//        int []array = {1,2,3,66,4,7,66};
//        int max=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max=array[i];
//                c=i;
//            }
//        }
//        System.out.println(c);
        //28
//        int c=0;
//        int []array ={1,2,3,4,6,7,1,9};
//        int min =array[array.length-1];
//        for (int i = array.length-1; i>=0 ; i--) {
//            if (array[i] < min) {
//                min=array[i];
//                c=i;
//            }
//        }
//        System.out.println(c);

        //29

//        int n =8;
//        switch (n) {
//            case 3:
//                System.out.println("c");
//            case 4:
//                System.out.println("f");
//            case 5:
//                System.out.println("a");
//            case 8:
//                System.out.println("o");
//        }
        //2
//        double z =0;
//        double c = 2;
//        double a =1.5;
//        double d =2;
//        double x =3;
//
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n =scr.nextInt();
//        switch (n){
//            case 0:
//                z=1+c*Math.sqrt(d);
//                System.out.println(z);
//                break;
//            case 1:
//            case 6:
//                z=x-a;
//                System.out.println(z);
//                break;
//            case 2:
//            case 3:
//            case 4:
//                z=2/3*Math.pow(x,2)-1/2*d;
//                System.out.println(z);
//                break;
//        }


        //3
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input X: ");
//        int X =scr.nextInt();
//        double z=0;
//        double a=5;
//        double b=1.2;
//        double v =0.6;
//        double y=2;
//        switch (X){
//            case 3:
//                z= Math.pow(y,2)+0.3*a;
//                System.out.println("z="+z);
//                break;
//            case 5:
//            case 2:
//                z=a+Math.pow(Math.E,y*b);
//                System.out.println("z=" +z);
//                break;
//            case 6:
//            case 7:
//                case 8:
//                    z= Math.pow(y,2)+y-b;
//                    System.out.println("z="+z);
//                    break;

        //4

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input j: ");
//        int j =scr.nextInt();
//        double z=0;
//        double d=2;
//        double a=3.5;
//        double x=3;
//        double i=2.3;
//        double y=2;
//        switch (j){
//            case 1:
//                z= 1+d* Math.sin(d)/a;
//                System.out.println("z =" +z);
//                break;
//            case 2:
//            case 4:
//            case 8:
//                z=(i-1)*i+Math.pow(a,2);
//                System.out.println("z="+z);
//                break;
//            case 5:
//            case 6:
//            case 7:
//                z=i+2/3*x;
//                System.out.println("z="+z);
//                break;
// }

        //5
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input c: ");
//        int c =scr.nextInt();
//        double w=1;
//        double x=2.5;
//        double a=4;
//        double b=0.4;
//        double z=0;
//        switch (c){
//            case 3:
//                z=w/3 +Math.pow(a,2)*x;
//                System.out.println("z="+z);
//                break;
//            case 8:
//            case 9:
//            case 10:
//                z=w-Math.log(b);
//                System.out.println("z="+z);
//                break;
//            case 2:
//            case 5:
//            case 7:
//                z=Math.pow(b,2)+w*x;
//                System.out.println("z=" +z);
//                break;
//}
        //118
//        int[] array={3,-5,-4,6,-7,4};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if(array[i]<0){
//                count++;
//            }
//
//        }
//        int b[]=new int[count];
//        int j=0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]<0){
//                b[j] =array[i];
//                j++;
//
//            }
//
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }
        //118.2
//        int a=2;
//        int b=4;
//        int max=0;
//        int []array ={1,2,3,4,5,6,7,8};
//        for (int i = 0; i <array.length ; i++) {
//        if( array[i] <a || array[i]>b ) {
//            int[] array2 = new int[]{array[i]};
//            for (int j = 0; j <array2.length ; j++) {
//                if (array2[j] > max) {
//                    max = array2[j];
//                }
//            }
//        }
//    }
//        System.out.println(max);

        //127
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k= scr.nextInt();
//        int []array ={1,2,3,-4,45,5,6,7};
//        for (int i = 0; i < array.length ; i++) {
//            if (Math.pow(array[i], 2) > k) {
//                int []array2 = new int[] {array[i]};
//                for (int j = 0; j <array2.length ; j++) {
//                    System.out.println(array2[j]);
//                }
//            }
//        }
//        int[]array={1,-2,-9,0,3,-5};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] < 0) {
//                count++;
//
//            }
//        }
//            int []b= new int [count];
//        int j=0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]<0) {
//                b[j] = array[i];
//                j++;
//            }
//        }
//        System.out.println(b[2]);

        //119
//        int []array= {1,2,3,4,5,6,7,8,57,876,4323,578,0};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] %7 !=0) {
//                count++;
//            }
//        }
//        int[]b=new int[count];
//        int j=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] % 7 != 0) {
//                b[j]=array[i];
//                j++;
//            }
//        }
//        System.out.println(b[b.length-1]);

        //120
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b =scr.nextInt();
//        int []array ={1,2,3,4,5,6,7,8,9,10,11};
//        int count=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] < a || array[i] > b) {
//                count++;
//
//            }
//        }
//        int[] x = new int[count];
//        int j=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] < a || array[i] > b) {
//                x[j]=array[i];
//                j++;
//            }
//        }
//        for (int i = 0; i <x.length ; i++) {
//            System.out.println(x[i]);
//        }


        //120
//        int[]array={1,2,3,4,5,6,7,8,9};
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//
//        System.out.println("input b: ");
//        int b =scr.nextInt();
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] < a || array[i] > b) {
//               int [] x=new int[]{array[i]};
//                for (int j = 0; j < x.length ; j++) {
//                    System.out.println(x[j]);
//                }
//            }
//
//        }

        //121
//        int []array ={1,2,3,4,5,6,7,8,9};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 == 0) {
//                count++;
//            }
//        }
//       int [] b= new int[count];
//        int j=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 == 0) {
//                b[j]=array[i];
//                j++;
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//
//        System.out.println(b[i]);
//        }

        //121-2
//        int []array={1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 == 0) {
//                int []b=new int[]{array[i]};
//            for (int j = 0; j< b.length ; j++) {
//                System.out.println(b[j]);
//            }
//
//            }
//        }

        //122
//        int []array = {1,2,3,4,5,6,7,8};
//        int count =0;
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 != 0) {
//                count++;
//            }
//        }
//        int[]b= new int[count];
//        int j =0;
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 != 0) {
//
//            b[j]=array[i];
//            j++;
//            }
//        }
//        for (int i = 0; i < b.length; i++) {
//
//        System.out.println(b[i]);
//        }


        //122-2
//        int[]array={1,2,3,4,5,6};
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 != 0) {
//                int []b= new int[]{array[i]};
//                for (int j = 0; j < b.length ; j++) {
//                    System.out.println(b[j]);
//                }
//            }
//        }

        //123
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k=scr.nextInt();
//        int[]array={1,2,3,4,5,6,7,8};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] % k != 2) {
//                count++;
//            }
//        }
//        int j=0;
//        int[]b= new int[count];
//        for (int i = 0; i <array.length; i++) {
//            if (array[i] % k != 2) {
//
//            b[j]=array[i];
//            j++;
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }

        //123-2
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k=scr.nextInt();
//        int[]array={1,2,3,4,5,6,7,8};
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] % k != 2) {
//                int []b=new int[]{array[i]};
//                for (int j = 0; j <b.length ; j++) {
//                    System.out.println(b[j]);
//                }
//            }
//        }


        //124

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k=scr.nextInt();
//        int[]array={1,2,3,4,5,6,7,8};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (Math.abs(array[i]) < k) {
//                count++;
//            }
//        }
//        int []b=new int[count];
//        int j=0;
//        for (int i = 0; i < array.length ; i++,j++) {
//            if (Math.abs(array[i]) < k) {
//             b[j]=array[i];
//
//            }
//        }
//        for (int i = 0; i < b.length; i++) {
//
//        System.out.println(b[i]);
//        }

        //124-2
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k=scr.nextInt();
//        int[]array={1,2,3,4,5,6,7,8};
//        for (int i = 0; i < array.length ; i++) {
//            if (Math.abs(array[i]) < k) {
//                int b[]= new int[]{array[i]};
//                for (int j = 0; j < b.length; j++) {
//                    System.out.println(b[j]);
//                }
//            }
//        }

        //125
//        int [] array={1,2,3,4,5,6,7,8};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] % 2 != 0) {
//                count++;
//
//            }
//        }
//        int[]b =new int[count];
//        int j=0;
//        for (int i = 0; i < array.length ; i++,j++) {
//            if (array[i] % 2 != 0) {
//                b[j]=array[i];
//            }
//        }
//        for (int i = 0; i < b.length ; i++) {
//            System.out.println(b[i]);
//        }


        //125-2

//        int[]array={1,2,3,4,5,6,7,8};
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] % 2 != 0) {
//                int[]b= new int[]{array[i]};
//                for (int j = 0; j <b.length ; j++) {
//                    System.out.println(b[j]);
//
//                }
//            }
//        }

        //126

//        int[]array= {1,2,3,4,5,6,7,8,9};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        int[]b=new int[count];
//        int j=0;
//        for (int i = 0; i < array.length ;  i++) {
//            if (array[i] % 2 == 0) {
//                b[j]=array[i];
//                j++;
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }
        //126-2
//          int[]array={1,2,3,4,5,56,7};
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] % 2 == 0) {
//                int []b=new int[]{array[i]};
//                for (int j = 0; j <b.length ; j++) {
//                    System.out.println(b[j]);
//                }
//            }
//        }

        //127
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input k: ");
//        int k=scr.nextInt();
//        int[]array={1,2,3,4,5,6,7,8};
//        int count=0;
//        for (int i = 0; i < array.length ; i++) {
//            if (Math.pow(array[i], 2) > k) {
//                count++;
//            }
//        }
//        int[]b=new int[count];
//        int j=0;
//        for (int i = 0; i < array.length; i++) {
//            if (Math.pow(array[i], 2) > k) {
//                b[j]=array[i];
//                j++;
//            }
//        }
//        System.out.println(b[3]);

//        int sum=0;
//        int num=0;
//        int n=123456;
//        for (int i = 1; ; i*=10) {
//            num=n/i%10*i;
//        sum+=num;
//            if (num == 0) {
//                break;
//            }
//        }
//            System.out.println(sum);
//

//            int[]array = {11,2,12,8,9};
//        int temp=0;
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length ; j++) {
//                if (array[j]<array[i]){
//                    temp=array[i];//11
//                    array[i]=array[j];//2
//                    array[j]=temp;//11
//
//
//
//                }
//            }
//        System.out.println(array[i]);
//        }


        //


//        int[]   array = {123456,12, 56, 78, 90, 123, 75, 897};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));


////128
//        int[]array={1,2,3,4,5,9};
//        int max=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max=array[i];
//                int []b=new int[]{array[i]+max};
//                for (int j = 0; j <b.length ; j++) {
//                    System.out.println(b[j]);
//                }
//            }
//        }


//        int[]array={1,2,3,4,5,9};
//        int max=0;
//        int count=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max=array[i];
//                count++;
//            }
//
//        }
//        int j=0;
//        int []b =new int[count];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max = array[i];
//                b[j] = array[i];
//            }
//        }
//            for (int k = 0; k < b.length; k++) {
//
//                System.out.println(b[k]);
//            }


        //128
//        int []array ={1,-7,3,-2,6};
//        int count=0;
//        int max=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > 0 ) {
//                count++;
//            }
//            if (array[i] > max) {
//                max=array[i];
//            }
//
//        }
//            int b[]=new int[count];
//        int j=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > 0) {
//            b[j]=array[i]+max;
//                j++;
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }

        //128-2
//        int []array ={1,-3,-8,9,15};
//        int max=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max=array[i];
//            }
//        }
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > 0) {
//                int[] b=new  int[]{array[i]+max};
//                for (int j = 0; j <b.length ; j++) {
//                    System.out.println(b[j]);
//                }
//            }
//        }


        //129
//        int[]array={1,3,6,2,9,-3};
//        int max=array[0];
//        int count=0;
//        for (int i = 0; i <array.length ; i+=2) {
//            if (array[i] > array[i+1]) {
//               count++;
//            }
//            else  {
//                count++;
//
//
//            }
//
//
//        }
//        int[]b=new  int[count];
//        int j=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > array[i+1]){
//
//            b[j]=array[i];
//            j++;
//
//            }
//            else {
//                b[j]=array[i+1];
//                j++;
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }


//        int count=0;
//        int n=23409985;
//        for (int i = 1; i <=n ; i*=10) {
//            count++;
//        }
//        System.out.println(count);

        //128
//        int []array= {1,-8,7,6,-4,10};
//        int max=array[0];
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] > 0) {
//                    int[] b = new int[]{array[i]+max};
//                    for (int k = 0; k < b.length; k++) {
//                        System.out.println(b[k]);
//                    }
//                }
//            }

        //128-2
//        int []array ={1,-7,3,-2,6};
//        int count=0;
//        int max=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > 0 ) {
//                count++;
//            }
//            if (array[i] > max) {
//               max=array[i];
//            }
//
//        }
//        int b[]=new int[count];
//        int j=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > 0) {
//                b[j]=array[i]+max;
//                j++;
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//       }
        //пример в классе
//        int[]array = {11,2,12,8,9};
//        int temp=0;
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length ; j++) {
//                if (array[j]<array[i]){
//                    temp=array[i];//11
//                    array[i]=array[j];//2
//                    array[j]=temp;//11
//
//
//
//                }
//            }
//        System.out.println(array[i]);
//        }

//        int[]array={1,-8,12,7};//-8,1,7,12
//        int temp=0;
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length ; j++) {
//                if (array[j]<array[i]){
//                    temp=array[i];//1,
//                    array[i]=array[j];//-8,7
//                    array[j]=temp;//1,12
//                }
//            }
//            System.out.println(array[i]);
//        }


        //homework
        //129
//        int[]array={1,3,2,5,9,7};
//        int max=array[0];
//        int[]b;
//        for (int i = 0; i < array.length ; i+=2) {
//            if (array[i]>array[i+1]){
//                max=array[i];
//                b=new int[]{max};
//            }
//            else {
//                max=array[i+1];
//                b=new int[]{max};
//            }
//
//        for (int k = 0; k <b.length ; k++) {
//            System.out.println(b[k]);
//        }
//
//        }

        //130
//        int temp=0;
//        int[]array={1,4,2,7,8,0};
//        int[]b;
//        for (int i = 0; i < array.length ; i+=1) {
//            if (i%2==0) {
//                temp=array[i+1];
//                b=new int[]{temp};
//
//            }
//            else {
//                temp=array[i-1];
//                b=new int[]{temp};
//            }
//            for (int j = 0; j < b.length ; j++) {
//                System.out.println(b[j]);
//            }
//        }

        //131
//        int[]b;
//        int[]array={1,-3,5,2,-7};
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > 0) {
//                 b=new int[]{array[i]};
//            for (int j = 0; j <b.length ; j++) {
//                System.out.println(b[j]);
//            }
//            }
//        }

        //132 //?
//

        //133
//        int m=0;
//        int []k;
//        int count =0;
//        int sum=0;
//        int sum1=0;
//        int[]array={1,-4,2,-8,25};
//        int min=array[0];
//        int max=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] < min) {
//                min=array[i];
//            } else if (array[i] > max) {
//                max=array[i];
//            }
//
//        }
//        m=(sum+=min+max)/2;
//        for (int i = 0; i <array.length ; i++) {
//            if (Math.abs(array[i]) < m) {
//               k=new int[]{array[i]};
//                for (int j = 0; j < k.length ; j++) {
//                    System.out.println(k[j]);
//                }
//            }
//        }

//                //134
//        int[]array={1,2,3,7,9,14};
//        int n[];
//        int max=array[0];
//        for (int i = 0; i < array.length ; i++) {
//            if (i % 2 == 0 && array[i] > max) {
//                max=array[i];
//            }
//        }
//        for (int i = 0; i <array.length ; i++) {
//            if (i % 2 != 0) {
//                n=new int[]{array[i]+max};
//                for (int j = 0; j < n.length ; j++) {
//                    System.out.println(n[j]);
//                }
//            }
//        }

        //135
//        int[]array={0,-4,-8,9,10,-7};
//        int temp=0;
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length ; j++) {
//                if (array[j]<array[i]){
//                    temp=array[i];
//                    array[i]=array[j];
//                    array[j]=temp;
//                }
//            }
//            System.out.println(array[i]);
//        }
//
//                //136 //
//        int[] array = {1, 2, 7, 9, 5, 21};
//        int max = array[0];
//        int[] n;
//        for (int m = 0; m < array.length; m++) {
//            if (array[m] > max) {
//                max = array[m];
//
//            }
//        }
//        n = new int[array.length];
//        for (int i = 0; i < array.length; i ++) {
//          if (i%3==2){
//              n[i]=0;
//          }
//          else{
//              n[i]=array[i]+max;
//          }
//    }
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]);
//        }


        //137


//        int[]array={3,7,6,4,8,6,1,9};
//        int max=array[0];
//        int c=0;
//        int m=0;
//        int[]n;
//            int min=array[array.length-1];
//            boolean t=false;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]>array[i+1]){
//                max=array[i];
//                break;
//            }
//            else {
//                max=array[i+1];
//                break;
//            }
//        }
//        for (int i = array.length-1; i>0 ; i--) {
//            if (array[i] < min) {
//                min=array[i];
//                break;
//            }
//            else {
//                min=array[i-1];
//                break;
//            }
//        }
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] !=min && array[i]!=max ) {
//               n=new int[]{array[i]} ;
//                for (int j = 0; j <n.length ; j++) {
//                    System.out.println(n[j]);
//                }
//        }
//        }


//        int []array ={-8,1,2,-8,7,6,1,7};
//        int max=array[0];
//        int min=array[0];
//        int indexMax=0;
//        int indexMin =0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > max) {
//                max=array[i];
//                indexMax=i;
//            }
//            if (array[i] < min) {
//                min=array[i];
//                indexMin++;
//            }
//        }
//
//        int a=indexMax;
//        int b=indexMin;
//        int generalLength=array.length-2;
//        int []arr2=new int[generalLength];
//        int k=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (i == a || i==b) {
//                i++;
//            }
//            arr2[k++]=array[i];
//        }
//            for (int j = 0; j < generalLength; j++) {
//                System.out.println(arr2[j]);
//            }
//
//
//


//        int s=1;
//        int b=0;
//        int n=1;
//        while (n <= 17) {
//            b+=2;
//            s=b+7;
//            n++;
//        }
//        System.out.println("b="+b);

//     1)
//     Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x=scr.nextDouble();
//        System.out.println("input y: ");
//        double y= scr.nextDouble();
//
//        double a= y+1;
//        double b= x+ Math.pow((Math.pow(x,2)+1),6);
//        double c= Math.sin(Math.pow(x,2)-3);
//        double w= Math.tan(y);
//        double z= a*(b*c-w);
//        System.out.println(z);

        // 2)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x= scr.nextDouble();
//        System.out.println("input y: ");
//        double y = scr.nextDouble();
//
//        double a=(Math.pow(x,2)-4)/(Math.pow(y,2)+2) + Math.pow(2,Math.sin(Math.sqrt(Math.pow(x,2)+1)));
//        System.out.println(a);

        // 3)

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x= scr.nextDouble();
//        System.out.println("input y: ");
//        double y= scr.nextDouble();
////
//        double a= (1/Math.tan((Math.abs(Math.pow(x,2)-y)/(Math.pow(x,2)+Math.pow(y,2)))) + Math.log10(Math.pow(x,2)+1));
//        System.out.println(a);

        // 4)
//       Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x= scr.nextDouble();
//        double a= Math.log(Math.pow(Math.E,x)+1);
//        double c= Math.cbrt(Math.pow(x,2)+4);
//        double m= a+c;
//        System.out.println(m);

        //5)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x= scr.nextDouble();
//        System.out.println("input y: ");
//        double y = scr.nextDouble();
//        double a = (Math.pow(2,x)-5)/(Math.pow(3,y)+2);
//        double k= Math.abs(x)+1;
//        double v = Math.pow(k,4);
//        double w = Math.pow(y,2);
//        double q= v+w;
//        double r= Math.log(q)/Math.log(2);
//        double h = a + r;
//        System.out.println(h);

        // 11)
//        double Y=0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x= scr.nextDouble();
//        System.out.println("input a: ");
//        double a= scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        double k = Math.pow(a,2)+Math.pow(b,2);
//        double q = 3*Math.pow(Math.E,a-x) + Math.log(k)/Math.log(3);
//        double i = Math.pow(Math.tan(a+b),4);
//
//
//        if (k > 5) {
//            Y = q;
//        }
//        else if (k < 1) {
//        Y = i;
//        }
//        else {
//            Y = -3;
//        }
//        System.out.println(Y);


        //13)
//        double Y = 0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input x: ");
//        double x = scr.nextDouble();
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println(" input b: ");
//        double b = scr.nextDouble();
//        double m = a + Math.abs(b);
//        double w = Math.pow(Math.E,Math.abs(a+x)) * Math.pow(Math.cos(a+x+b),2);
//        double t = Math.cbrt(Math.atan(a+x));
//
//        if (m < -5) {
//            Y = w;
//        }
//        else if (m > 2) {
//        Y = t;
//        }
//        else {
//            Y = m;
//        }
//        System.out.println(Y);

        // 18)
//        double Y = 0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println(" input x: ");
//        double x = scr.nextDouble();
//        System.out.println(" input z: ");
//        double z = scr.nextDouble();
//        double n = Math.pow((Math.abs(x)+2*Math.abs(z)),1/4d);
//        double c = n + Math.pow(Math.E,Math.abs(x+1));
//        double f = Math.pow(Math.tan(Math.pow(x+z,7)),2);
//
//        if (x <= 7 && x >= 1) {
//        Y = c;
//        }
//        else {
//            Y = f;
//        }
//        System.out.println("Y = "+Y);

// 3)
//        Scanner scr = new Scanner(System.in);
//        System.out.println(" inppppppppppppppppppppppppppppppppppppppppppppppppppuuut x: ");
//        double x = scr.nextDouble();
//        double y = 0;
//        if (x >= 0 && x < 0.8) {
//            y = Math.tan(x)/2;
//        }
//        else if (x >= 0.8 && x < 1.3) {
//        y = Math.sin(x)/x;
//
//        }
//        else if (x >= 1.3 && x <= 2) {
//          y = Math.pow(x,3);
//
//        }
//        System.out.println("y = " + y );


//1)
//        double c =188;
//        double m =7;
//        double r =6;
//        double i = Math.max(c,m);
//        double y = Math.max(i,r);
//        System.out.println(y);

        //2)
//  double e = 123445;
//  double b =3;
//  double n =4442;
//
//        if (e < b && e < n) {
//            System.out.println(e);
//        }
//         else if (b < e && b < n) {
//            System.out.println(b);
//        }
//        else {
//            System.out.println(n);
//        }

        //3)
//        double a =2;
//        double v =1;
//        double h =0;
//        if (a==1 || v==1 || h==1) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }


        //4)
//        double a =2;
//        double v =1;
//        double h =2;
//        boolean z =((a == 2 && v == 2) || (a == 2 && h == 2) || (v == 2 && h == 2)) ? true:false;
//        System.out.println(z);

//        //5)
//        double a =5;
//        double v =1;
//        double h =9;
//        int z = ((a%2==0) ||(v%2==0) ||(h%2==0))? 1:2;
//        System.out.println(z);


        //6)
//         Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        int z = a%2==0 || b%2==0 || c%2==0 ? 1:2;
//        System.out.println(z);

        //7)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        if (b - a == c - b) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //8)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        boolean z = (b/a == c/b)? true:false;
//        System.out.println(z);


        //11)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//
//        double n = Math.max(a,b);
//        double m = Math.max(c,d);
//        double i = Math.max(n,m);
//        System.out.println(i);


        //12)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//        double j = Math.min(a,b);
//        double o = Math.min(c,d);
//        double k = Math.min(j,o);
//        System.out.println(k);
        //13)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//        boolean z = a==1 || b==1 || c==1 || d ==1 ? true:false;
//        System.out.println(z);


        //14)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//        boolean z = a+b == c+d ? true:false;
//        System.out.println(z);

        //15)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//        if (a == b + c + d) {
//            System.out.println(true);
//        } else if (b == a + c + d) {
//            System.out.println(true);
//        } else if (c == a + b + d) {
//            System.out.println(true);
//        } else if (d == a + c + b) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        //16)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//        int z = (a%2!=0 && b%2!=0) || (a%2!=0 && c%2!=0) || (a%2!=0 && d%2!=0) || (b%2!=0 && c%2!=0) || (b%2!=0 && d%2!=0)? 1:2;
//        System.out.println(z);

        //17)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//        boolean z = (b-a) == (c-b) && (d-c )== (b-a) && (d-c)==(c-b) ? true:false;
//        System.out.println(z);
        //18)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        System.out.println("input b: ");
//        double b = scr.nextDouble();
//        System.out.println("input c: ");
//        double c = scr.nextDouble();
//        System.out.println("input d: ");
//        double d = scr.nextDouble();
//        boolean e = b/a == d/c ? true:false;
//        System.out.println(e);


//        //21)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        double a = scr.nextDouble();
//        double m = a%10;
//        double n = a/10%10;
//        double b = a/100;
//        if (m == n + b) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //22)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        int s = a%10;
//        int n = a/10%10;
//        int z = a/100;
//        if (s == n || s == z || n == z ) {
//            System.out.println(true);
//        }
//
//        else {
//
//            System.out.println(false);
//
//        }
        //23)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input 3 digit number:");
//        int a = scr.nextInt();
//        System.out.println("input k:");
//        int k = scr.nextInt();
//
//        int m = a % 10;
//        int s = a / 10 % 10;
//        int q = a / 100;
//        int r = m + s + q;
//
//        if (a >= 100 && a < 1000) {
//
//            if (a > k) {
//                int l = a / r;
//                System.out.println(l);
//            } else {
//                int w = a / m;
//                System.out.println(w);
//            }
//        }
        //24)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input 3 digit number: ");
//        int n = scr.nextInt();
//
//        int r = n%10;
//        int w = n/10%10;
//        int c = n/100;
//        if (n >= 100 && n <1000) {
//            double x = Math.max(r,w);
//            double m = Math.max(x,c);
//            System.out.println("MAX = "+m);
//        }

        //24)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input three-digit number: ");
//        int n = scr.nextInt();
//
//        int r = n%10;
//        int m = n/10%10;
//        int h = n/100;
//        if (n >= 100 && n < 1000) {
//            if (r > m && r > h) {
//                System.out.println("MAX = "+r);
//            }
//            if (m > r && m > h) {
//                System.out.println("MAX = "+m);
//            }
//            if (h > r && h > m) {
//                System.out.println("MAX = "+h);
//            }
//        }
//        System.out.println("ERROR");

     //27)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input three-digit number: ");
//        int n = scr.nextInt();
//
//        int q = n%10;
//        int h = n/10%10;
//        int d = n/100;
//        if (n > 300 && q!=0) {
//            System.out.println(h/q);
//        }
//        else if (q!=0){
//            System.out.println(d/q);
//        }


        //28)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input three-digit number: ");
//        int n = scr.nextInt();
//        int q = n%10;
//        int h = n/10%10;
//        int d = n/100;
//        if (h + d < 5) {
//            char f = 'a';
//            System.out.println(f);
//        }
//        else {
//            char f = 'b';
//            System.out.println(f);
//        }


//        //30)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input three-digit number: ");
//        int n = scr.nextInt();
//
//        int d = n/100;
//        int h = n/10%10;
//        int q = n%10;
//        if (q > h && q > d && h > d) {
//            System.out.println(q+" "+h+" "+d);
//        }
//        if (q > d && q>h && d > h) {
//            System.out.println(q+" "+d+" "+h);
//        }
//        if (h> q && h > d && q > d) {
//            System.out.println(h+" "+q+" "+d);
//        }
//        if (h > d && h>q && d > q) {
//            System.out.println(h+" "+d+" "+q);
//        }
//        if (d > h && d>q && h>q) {
//            System.out.println(d+" "+h+" "+q);
//        }
//        if (d > q && d>h && q>h) {
//            System.out.println(d+" "+q+" "+h);
//        }
//        int x =5;
//        int y = 6;
//        System.out.printf("x=%d;y=%d \n",x,y);


//int a =8;
//int b =++a;
//        System.out.println(a);
//        System.out.println(b);


        //14)
//        int count = 0;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int a =0;
//        int n = scr.nextInt();
//        for (int i = 1; i<=n ; i*=10) {
//             a = n/i%10;
//            count++;
//        }
//        System.out.println(count);
//        final int a =9;

        //41)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        int sum = 0;
//        for (int i = 0; i <10 ; i++) {
//            if (i % n == 0) {
//                sum+=i;
//            }
//        }
//            System.out.println(sum);



        //42)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        int multi = 1;
//        for (int i = 1; i <=10 ; i++) {
//            if (i % n == 0) {
//                multi *= i;
//        System.out.println(multi);

//            }
//        }

        //42)
//        int multi = 1;
//        int n = 2;
//        int i = 1;
//        while (i < 10) {
//            if (i % n == 0) {
//                multi*=i;
//                System.out.println(multi);
//
//            }
//            i++;
//        }


//        int b =0;
//        int s = 1;
//        int n =1;
//        while (n <= 17) {
//
//            System.out.println(n);
//            n++;
//        }

        //43)
//        int n =4;
//        int sum = 0;
//        int i = 0;
//        while (i < 100) {
//            if (i % n == 2) {
//                sum+=i;
//            }
//            i++;
//        }
//        System.out.println(sum);


        //44)

//        int n = 2;
//        int i = 1;
//        int multi = 1;
//        while (i < 100000) {
//            if (i % n == 2) {
//                multi*=i;
//            }
//            i++;
//        }
//        System.out.println(multi);

        //45)
//        int sum = 0;
//        for (int i = 10; i <100 ; i++) {
//            if (i % 3 == 0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);


        //46)
//        long multi = 1;
//        long i =10;
//        while (i < 100) {
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                multi*=i;
//            }
//            i++;
//        }
//        System.out.println(multi);

        //47)
//        int sum = 0;
//        for (int i =100; i <1000 ; i++) {
//            if (i % 5 != 0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

        //48)
//        long multi = 1;
//        long i = 100;
//        while (i < 1000) {
//            if (i % 2 != 0 && i % 3 != 0) {
//                multi*=i;
//            }
//            i++;
//        }
//        System.out.println(multi);


        //49)

//        long multi = 1;
//
//        for (long i = 100; i <1000 ; i++) {
//            if (i % 3 == 1 && i % 4 == 2) {
//                multi*=i;
//            }
//        }
//        System.out.println(multi);

        //50)
//        boolean t = false;
//        for (int i = 100; i <1000 ; i++) {
//            for (int j = 0; j <100 ; j++)
//                if (i * 16 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//
//
//            }
//            if (t)break;
//        }

        //51)
//        boolean t = false;
//        for (int i = 1000; i <10000 ; i++) {
//            for (int j = 0; j <1000 ; j++)
//                if (i * 26 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i + " " + j);
//                    break;
//                }
//            if (t)break;
//        }

        //52)
//        boolean t = false;
//        for (int i = 10000; i >=1000 ; i--) {
//            for (int j = 1000; j >=0 ; j--) {
//                if (i * 14 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i+" "+j);
//                    break;
//                }
//            }
//            if (t) break;
//        }

        //53)
//        boolean t = false;
//        for (int i = 10_000; i >=1_000 ; i--) {
//            for (int j = 1000; j >0 ; j--) {
//                if (i * 18 == Math.pow(j, 2)) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//                }
//            }
//            if (t)break;
//        }

        //54)
//        boolean t = false;
//        for (double i = 100; i <1000 ; i++) {
//            for (double n = 10; n <1000 ; n++) {
//                if (Math.sqrt(i) > n) {
//                    t = true;
//                    System.out.println(i);
//                    break;
//                }
//            }
//            if (t)break;
//        }

        //55-56)?

        //57)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input N: ");
//        int N = scr.nextInt();
//        int count = 0;
//
//        for (int i = 1;  ; i*=10) {
//            int v = N/i;
//            if (v == 0) {
//                break;
//            }
//            count++;
//
//        }
//        System.out.println(count);

        //58)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input N: ");
//        int N = scr.nextInt();
//        int sum = 0;
//        for (int i = 1;; i*=10) {
//            int y = N/i%10;
//            sum+=y;
//            if (y == 0) {
//                break;
//            }
//        }
//        System.out.println(sum);

        //59)
//        int multi = 1;
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input N: ");
//        int N = scr.nextInt();
//        for (int i = 1; i <=N ; i*=10) {
//            int r =N/i%10;
//            multi*=r;
//            if (r == 0) {
//                break;
//            }
//        }
//        System.out.println(multi);

        //60) 1254   == 4521
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input N: ");
//        int N = scr.nextInt();
//        for (int i = 1; ; i*=10) {
//            int v = N/i%10;
//
//            if (v == 0) {
//                break;
//            }
//            System.out.print(v);
//        }

        //61)
//        Scanner scr = new Scanner(System.in);
//        System.out.println("input N: ");
//        int N = scr.nextInt();
//        int sum = 0;
//        int num = 0;
//        for (int i = 1; ; i*=10) {
//            num= N/i%10*i;
//            sum+=num;
//            if (num == 0) {
//                break;
//            }
//
//        }
//        System.out.println(sum);

        //62)
//        Scanner scr = new Scanner(System.in);
//        System.out.print("input N: ");
//        int N = scr.nextInt();
//        int sum = 0;
//
//        for (int i = 1; ; i*=10) {
//            int u = N/i%10*i;
//            sum+=u;
//            if (u == 0) {
//                break;
//            }
//
//        }
//        System.out.print(sum);
//
//
//        for (int i = 1; ; i*=10) {
//            int y = N/i%10;
//            if (y == 0) {
//                break;
//            }
//            System.out.print(y);
//        }

        //63)

//        Scanner scr = new Scanner(System.in);
//        System.out.print("input N: ");
//        int N = scr.nextInt();
//        if (N >= 10 && N < 100) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //64)?
        //65)

//        Scanner scr = new Scanner(System.in);
//        System.out.print("input N: ");
//        int N = scr.nextInt();
//        int a = 0;
//        for (int i = 1; ; i*=10) {
//            a = N/i%10;
//            if (a == 0) {
//                break;
//            }
//            if (a % 2 != 0) {
//                System.out.println(true);
//                break;
//            }
//            else {
//                System.out.println(false);
//                break;
//            }
//        }

        //homework
        //9
//        System.out.println("input x: ");
//        int x = scr.nextInt();
//        System.out.println("input y: ");
//        int y = scr.nextInt();
//        double z = Math.pow((x+4)/Math.pow(Math.pow(y,2)+4,3),(double)1/5);
//        double a = Math.sin(Math.pow(x+z,2)) + 3*z+ y/Math.pow(x,2);
//        System.out.println(a);

        //11)
//        System.out.println("input a,b: ");
//        int a = scr.nextInt();
//        int b = scr.nextInt();
//        System.out.println("input x: ");
//        int x = scr.nextInt();
//        double q = Math.pow(a,2)+Math.pow(b,2);
//        double y = 0;
//        if (q > 5) {
//            y = 3*Math.pow(Math.E,a-x) + Math.log(q+5)/Math.log(3);
//        } else if (q < 1) {
//            y = Math.pow(Math.tan(a+b),4);
//        }
//        else {
//            y = -3;
//        }
//        System.out.println("y = "+y);

        //12)
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input x: ");
//        int x = scr.nextInt();
//        double y = 0;
//
//        if (x >= -5 && x <= 5) {
//            y = Math.pow((1+Math.pow(a,2)),6);
//        }
//        else if (x > 5) {
//            y = Math.cos(Math.pow(Math.log(Math.abs(x)),2))+Math.pow(x,8);
//        }
//        else{
//            y = a;
//        }
//        System.out.println("y = "+y);

        //13)
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input x: ");
//        int x = scr.nextInt();
//        double y = 0;
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        double c = a+Math.abs(b);
//
//        if (c < -5) {
//            y = Math.pow(Math.E,Math.abs(a+x)) * Math.pow(Math.cos(a+x+b),2);
//        }
//        else if (c > 2) {
//        y = Math.cbrt(Math.atan(a+x));
//        }
//        else {
//            y = c;
//        }
//        System.out.println("y = "+y);

        //switch case

        //2)
//        double c = -2;
//        double a = 1.5;
//        double d = 2;
//        double x = 3;
//        double z = 0;
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        switch (n){
//            case 0:
//                z = 1 + c*Math.sqrt(d);
//                System.out.println(z);
//                break;
//            case 1:
//            case 6:
//                z = x-a;
//                System.out.println(z);
//                break;
//            case 2:
//            case 3:
//            case 4:
//                z = (double)2/3*Math.pow(x,2) - 0.5*d;
//                System.out.println(z);
//                break;
//            default:
//                System.out.println("error");
//        }


//        double c = -2;
//        double a = 1.5;
//        double d = 2;
//        double x = 3;
//        double z = 0;
//        System.out.println("input n: ");
//        int n = scr.nextInt();
//        switch (n) {
//            case 0 -> {
//                z = 1 + c * Math.sqrt(d);
//                System.out.println(z);
//
//            }
//            case 1, 6 -> {
//                z = x - a;
//                System.out.println(z);
//            }
//            case 2, 3, 4 -> {
//                z = (double) 2 / 3 * Math.pow(x, 2) - 0.5 * d;
//                System.out.println(z);
//            }
//            default -> System.out.println("error");
//        }

        //3)
//        double a = 5;
//        double b= 1.2;
//        double v = 0.6;
//        double z = 0;
//        double y = 2.4;
//        System.out.println("input x: ");
//        int x= scr.nextInt();
//
//        switch (x){
//            case 3:
//                z = Math.pow(y,2) + 0.3*a;
//                System.out.println("z = "+z);
//                break;
//            case 5:
//            case 2:
//                z = a+ Math.pow(Math.E,y+b);
//                System.out.println("z = "+z);
//                break;
//            case 6:
//            case 7:
//            case 8:
//                z = Math.pow(y,2)+y -b;
//                System.out.println("z = "+z);
//                break;
//            default:
//                System.out.println("error");
//        }

//        double a = 5;
//        double b= 1.2;
//        double v = 0.6;
//        double z = 0;
//        double y = 2.4;
//        System.out.println("input x: ");
//        int x= scr.nextInt();
//
//        switch (x){
//            case 3 ->{
//                z = Math.pow(y,2)+0.3*a;
//                System.out.println("z = "+z);
//            }
//            case 5,2 -> {
//                z = a + Math.pow(Math.E, y * b);
//                System.out.println("z = " + z);
//            }
//                case 6,7,8 -> {
//                    z = Math.pow(y,2)+y-b;
//                    System.out.println("z = "+z);
//                }
//            default -> {
//                System.out.println("error");
//            }
//            }

        //4)
//        double a = 3.5;
//        double d= 2;
//        double x = 3;
//        double z = 0;
//        double i = 2.3;
//        System.out.println("input x: ");
//        int j= scr.nextInt();
//        if (j == 1) {
//            z = 1+d*Math.sin(d)/a;
//            System.out.println("z = "+z);
//        }
//        else if (j == 2 || j == 4 || j == 8) {
//            z = (i-1)*i + Math.pow(a,2);
//            System.out.println("z = "+z);
//        }
//        else if (j == 5 || j == 6 || j == 7) {
//        z = i+(double)2/3*x;
//            System.out.println("z = "+z);
//        }
//        else {
//            System.out.println("error");
//        }

        //4-1)
//        double a = 3.5;
//        double d= 2;
//        double x = 3;
//        double z = 0;
//        double i = 2.3;
//        System.out.println("input x: ");
//        int j= scr.nextInt();
//        switch (j){
//            case 1:
//                z = 1+d*Math.sin(d)/a;
//            System.out.println("z = "+z);
//            break;
//            case 2:
//            case 4:
//            case 8:
//                z = (i-1)*i + Math.pow(a,2);
//            System.out.println("z = "+z);
//            break;
//            case 5:
//            case 6:
//            case 7:
//                z = i+(double)2/3*x;
//            System.out.println("z = "+z);
//            break;
//            default:
//                System.out.println("error");
//        }


        //5)
//        double w = 1;
//        double x =2.5;
//        double a = 4;
//        double b = 0.4;
//        double z = 0;
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        switch (c){
//            case 3-> {
//                z = w / 3 + Math.pow(a, 2) * x;
//                System.out.println("z = " + z);
//            }
//            case 8,9,10 ->{
//                z  = w-Math.log(b);
//            }
//            case 2,5,7 ->{
//                z = Math.pow(b,2)+w*x;
//                System.out.println("z = "+z);
//            }
//            default -> {
//                System.out.println("error");
//            }
//        }

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

        //55)
        int n = scr.nextInt();
        double a = scr.nextInt();
        System.out.println(a);
























    }
    }






