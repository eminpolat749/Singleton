package com.eminpolat.app;

import com.eminpolat.Singleton;

public class SingletonTest {
    public static void run()
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2 ? "Aynı nesne" : "Farklı nesneler");
    }
    public static void main(String[] args)
    {
        run();
    }
}
