package by.it.matyuta.jd02_05;

import java.util.Locale;

public class TaskA {
    public static void main(String[] args) {
        ResourceManager rm = ResourceManager.INSTANCE;
        if(args.length<2)
                rm.setLocale(Locale.US);
        else
        rm.setLocale(new Locale("be","BY"));
       // System.out.println(rm.get(Messeges.WELCOME));
    }
}
