package Facade;

public class BinOps {
    public String sum(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int result = arg1 + arg2;
        return Integer.toBinaryString(result);
    }

    public String sub(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int result = arg1 - arg2;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int result = arg1 * arg2;
        return Integer.toBinaryString(result);
    }

    public String div(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int result;
        if (b.equals("0")){
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        } else {
            result = arg1 / arg2;
        }
        return Integer.toBinaryString(result);
    }
}