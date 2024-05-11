import java.util.Scanner;

public class loopStr {

    public static void main(String[] args) {
        /*int sum=1;
        long num1=0l,num2=1l,num3=0l,even=0l;

        while (sum<4000000){

            num3=num1+num2;
            if (num3%2==0) even=num3+even;
            num1=num2;
            num2=num3;
            sum++;
        }
        System.out.println(even);*/


        /*for (int i = 2; i <= 100; i++) {
            boolean o = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) o = false;
            }
            if (o) System.out.println(i);*/

        Scanner input= new Scanner(System.in);
        /*int num=input.nextInt(),max=num,min=num;
        for (int i = 0; i < 9; i++) {
            num=input.nextInt();
            if (num<min) min=num;
            if (num>max) max=num;

        }
        System.out.println("min : "+min+"  max : "+ max);*/

        /*int num=input.nextInt(),c=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) c+=i;
        }
        if (c==num)System.out.println("c");*/

        /*int sum=0;
        for (int i = 0; ; i++) {
            int num= input.nextInt();
            if (num==0) {
                sum/=i;
                break;
            }
            else sum+= num;
        }
        System.out.println(sum);*/

        /*int num =input.nextInt();
        int face=1;
        for (int i = 1; i <=num ; i++) {
            face*=i;
        }
        System.out.println(face);*/
        /*int t=0,f=0,s=1;
        System.out.print(f+" - ");
        while (t<=1000){
            System.out.print(s+((s==987)?  "    :)" : " _ "));
            t=f+s;
            f=s;
            s=t;
        }*/

        int num=input.nextInt();
        for (int i = 7; i < num; i++) {

           do {
               if (i%10==7) System.out.println(i);
               num/=10;
           }
           while (num/10!=0&&num%10==7);

        }

    }
}
