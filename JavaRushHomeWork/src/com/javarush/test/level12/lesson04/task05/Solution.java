package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы

    public static int max(int a,int b){
        int min;
        if (a < b) min = b;
        else min = a;
        return min;
    }

    public static long max(long a,long b){
        long min;
        if (a < b) min = b;
        else min = a;
        return min;
    }

    public static double max(double a,double b){
        double min;
        if (a < b) min = b;
        else min = a;
        return min;
    }
}
