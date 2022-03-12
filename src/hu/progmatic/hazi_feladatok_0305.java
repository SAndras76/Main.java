package hu.progmatic;

public class hazi_feladatok_0305 {
    public static void main(String[] args) {
       /* int j = 5, i = 10;
        j += j * 2 == i ? j : i % 3;
//5 * 2 == 10 ? 5 : 10 % 3*/

        /*int n = 0;
        n -= (n % 2 > 0) ? 1 + 2 * n : n - 3;
        System.out.println(n);*/

        /*int b = 9;
        boolean a = ++b % 5 == 0 ? b == 10 : b != 9;
//10 % 5 == 0 (true) 10 = 10 (true) 10 nem egyenlő 9 (true)
        System.out.println(a);*/

       /* boolean b = false, c = true, d = true;
        boolean a = b || c ? ! ( b || c && d ) : c && ! d;
// true/ false = true or false , true, true és nem true megoldás false
        System.out.println(a);*/

        /*int f = 1;
        boolean e = !false == (10%3 == f);
        int g = e ? f -= (++f * -1) : f+ (f+f) * ++f;
        // e= true, = 1 = f <- ez true
        // g = 1 , 1 -2*-1 = 1 , 1+1 (1+1)*
        System.out.println(g);*/

        /*int v = 5, x = v * --v;
        boolean y = x % v < 0 ? v == 0 : !false;
        boolean z = !y && x == v * v;

        System.out.println(v); System.out.println(z); System.out.println(x); System.out.println(y);
        //v = 4 mert x % v az kisebb, mint nulla, tehát az x osztója itt 4
        // boolean y = true*/


    }
}
