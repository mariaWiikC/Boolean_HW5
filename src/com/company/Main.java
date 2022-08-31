package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 38;
        double y = Math.sqrt(x);
        int n = 2;
        boolean prime = true;
        while (n <= y) {
            if (x % n == 0) {
                prime = false;
            }
            n++;
        }
        System.out.println(prime);

        // or

        boolean test=false;
        int pn=5;
        int tpn=pn-1;
        while(tpn>1)
        {
            if(pn%tpn==0)
            {
                test=true;
            }
            else {
                tpn--;
            }
        }
        System.out.println(test);
    }
}
