package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class Wielkanoc extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int  t = Integer.parseInt(input[1]);
        int a,b,c,d,e,f,g,h,i,k,l,m,p;
        int dzien,miesiac;
        a = t%19;
        b = (int)t/100;
        c = t%100;
        d = (int)b/4;
        e = b%4;
        f = (int)((b+8)/25);
        g = (int)((b-f +1)/3);
        h = (19 * a+b -d -g+15)%30;
        i = (int)c/4;
        k = c%4;
        l = (32 + 2*e+2*i-h-k)%7;
        m = (int)(a+11*h+22*l)/451;
        p = (h+l-7*m+114)%31;
        dzien = p+1;
        miesiac = (int)(h+l-7*m+114)/31;
        if (m == 4)
            System.out.println("Wielkanoc odbedzie sie"+miesiac +" dnia : "+dzien);
        else System.out.println("Wiekanoc odbedzie sie :"+ miesiac +"dnia : "+dzien);

    }
}
