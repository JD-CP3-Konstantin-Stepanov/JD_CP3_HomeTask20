package Adapter;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("Сложение 2 и 2 - " + intsCalc.sum(2, 2));
        System.out.println("Разность 1 и 22 - " + intsCalc.sub(1, 22));
        System.out.println("Разность 15 и 8 - " + intsCalc.sub(15, 8));
        System.out.println("Произведение 40 на 22 - " + intsCalc.mult(40, 22));
        System.out.println("Возведение числа 2 в степень 10 - " + intsCalc.pow(2, 10));
        System.out.println("Деление 10 на 5 - " + intsCalc.div(10, 5));
        System.out.print("Деление 10 на 0 - ");
        System.out.println(intsCalc.div(10, 0));
    }
}