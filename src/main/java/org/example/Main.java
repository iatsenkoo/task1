package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        Integral types
            Integer types
                char Символы Unicode
                byte - диапазон от -128 до 127
                short - диапазон от -32768 до 32767
                int
                long
            Character types
                char

        Floating-point types
            float
            double
         */
        // никогда не закончится, так как Потому что значение счётчика дойдёт до максимума (127),
        // произойдёт переполнение и значение станет -128. И мы никогда не выйдем из цикла
        /* for (byte i = 1; i <= 200; i++) {
            System.out.println(i);
        }*/
        byte byte1 = 126;
        System.out.println("byte1 = " + byte1);
        byte1++;
        System.out.println("byte1 = " + byte1);
        byte1++;
        System.out.println("byte1 = " + byte1);
        byte1++;
        System.out.println("byte1 = " + byte1);

        char symbol = '\u0066'; // Unicode
        char symbol1 = 102; // ASCII
        System.out.println(symbol);
        System.out.println(symbol1);

        char a = 'a', b, c = 'c';
        b = (char) ((a + c) / 2);
        System.out.println(b);

        int value = 4;
        System.out.println(8/value);
        System.out.println(9/value);
        System.out.println(10/value);
        System.out.println(11/value);

        System.out.println("при работе с int, дробная часть отбрасывается");

        System.out.println("точность вычислений float");
        float amount1 = 1.00000005F;
        float avalue1 = 0.00000004F;
        float result1 = amount1 - avalue1;
        System.out.println(result1);

        float amount = 1.0000005F;
        float avalue = 0.0000004F;
        float result = amount - avalue;
        System.out.println(result);


        float piValue = (float)Math.PI;
        double piValueExt = Math.PI;
        System.out.println("Float value: " + piValue );
        System.out.println("Double value: " + piValueExt );

        double positive_infinity = 12.0 / 0;
        System.out.println(positive_infinity + " то есть бесконечность");

        double positive_infinity1 = 12.0 / 0;
        double negative_infinity1 = -15.0 / 0;
        System.out.println(positive_infinity1 + negative_infinity1 + " то есть Not a number");

        boolean res = 5 < 4;
        System.out.println(res);

        //ссылка на разные объекты в памяти
        String a1 = "hi!";
        String b1 = new String("hi!");
        System.out.println(a1 == b1);

        //ссылка на один и тот же объект в памяти
        String aa = "hello";
        String bb = "hello";
        System.out.println(aa == bb);

        System.out.println("Here comes a tab.\t And here comes another one\u0009!");


    }
}