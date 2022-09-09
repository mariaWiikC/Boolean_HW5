package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i = 24;
        boolean is_prime = false;
        if (i > 1)
        {
            for (int u = 2; u <= i; u++)
            {
                if (i%u == 0)
                {
                    if (i == u)
                        is_prime = true;
                    else
                        break;
                }
            }
        }
        System.out.println(is_prime);
    }
}