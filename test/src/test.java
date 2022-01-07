public class test {
    public int x, y;

    public test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void switcheroo(test a, test b) {
        test temp = a;
        a = b;
        b = temp;
    }

    public static void fliperoo(test a, test b) {
        test temp = new test(a.x, a.y);
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }

    public static void swaperoo(test a, test b) {
        test temp = a;
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }
    public static void main (String[] args) {
         test testbar = new test(10, 20);
         test baz = new test(30, 40);

         switcheroo(testbar, baz);
         System.out.println( testbar.x+ " "+testbar.y+ " "+baz.x+" "+baz.y);

         fliperoo(testbar, baz);
         System.out.println( testbar.x+ " "+testbar.y+ " "+baz.x+" "+baz.y);

         swaperoo(testbar, baz);
         System.out.println( testbar.x+ " "+testbar.y+ " "+baz.x+" "+baz.y);
         }
}

