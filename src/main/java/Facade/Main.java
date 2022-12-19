package Facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Сумма двоичных чисел 11 и 01: " + bins.sum("11","01"));
        System.out.println("Разность двоичных чисел 11 и 01: " + bins.sub("11","01"));
        System.out.println("Произведение двоичных чисел 11 и 11: " + bins.mult("11","11"));
        System.out.println("Деление двоичных чисел 11 и 01: " + bins.div("11","01"));
        System.out.print("Деление двоичных чисел 11 и 0: ");
        System.out.println(bins.div("11","0"));
    }
}
