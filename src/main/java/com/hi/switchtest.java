package com.hi;

import java.util.Scanner;

public class switchtest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int mon=0;
        int x=1;
        int one=0,fiv=0,ten=0,fif=0;
        while (x!=0){
            System.out.println("持續輸入，退幣按0");
            System.out.println("請輸入投入幣值(硬幣):");
            String  s=scanner.next();
            x=Integer.parseInt(s);
            if(x==0) {
                System.out.println("退幣:");
                break;
            }
            System.out.println("請輸入投入數量:");
            String  nu=scanner.next();
            int num=Integer.parseInt(nu);
        switch (x){
            case 1:
                mon=1*num+mon;
                one=one+num;
                System.out.println("目前投入:"+mon);
                break;
            case 5:
                mon=5*num+mon;
                fiv=fiv+num;
                System.out.println("目前投入:"+mon);
                break;
            case 10:
                mon=10*num+mon;
                ten=ten+num;
                System.out.println("目前投入:"+mon);
                break;
            case 50:
                mon=50*num+mon;
                fif=fif+num;
                System.out.println("目前投入:"+mon);
                break;

            default:
                System.out.println("請輸入正確幣值");
                break;
            }
        }
        System.out.println("投入退法:");
        System.out.println("共退"+one+"個1元");
        System.out.println("共退"+fiv+"個5元");
        System.out.println("共退"+ten+"個10元");
        System.out.println("共退"+fif+"個50元");
        System.out.println();

        System.out.println("最佳退法:");
        fif=mon/50;
        System.out.println("共退"+fif+"個50元");
        ten=(mon-fif*50)/10;
        System.out.println("共退"+ten+"個10元");
        fiv=(mon-fif*50-ten*10)/5;
        System.out.println("共退"+fiv+"個5元");
        one=(mon-fif*50-ten*10-fiv*5)/1;
        System.out.println("共退"+one+"個1元");

    }
}
