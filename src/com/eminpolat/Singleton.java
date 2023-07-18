package com.eminpolat;

public class Singleton {
    private static Singleton ms_instance;
    private int m_value;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (ms_instance == null)
            ms_instance = new Singleton();

        return ms_instance;
    }
    public int getValue()
    {
        return m_value;
    }

    public void setValue(int value)
    {
        m_value = value;
    }


}
