package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonPattern {
    private static SingletonPattern pattern=null;

    private static WebDriver browserInstance;

    private SingletonPattern()
    {

    }
    public static WebDriver getbrowserInstance()
    {
        if(pattern==null)
        {
            WebDriver driver=new ChromeDriver();
            return browserInstance;
        }
        return browserInstance;

    }
    private static SingletonPattern getInstance()
    {
        if(pattern==null)
        {
            pattern=new SingletonPattern();
            return pattern;
        }
        return pattern;


    }

    public static void main(String[] args) {
        SingletonPattern pattern1= SingletonPattern.getInstance();
        WebDriver w1= getbrowserInstance();
        WebDriver w2=getbrowserInstance();
        if(w1==w2)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
