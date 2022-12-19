package Adapter;

public class IntsCalculator implements Ints {

    @Override
    public int sum(int arg0, int arg1) {
        Calculator calculator = new Calculator();
        double result = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) result;
    }

    @Override
    public int sub(int arg0, int arg1) {
        Calculator calculator = new Calculator();
        double result = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
        return (int) result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator calculator = new Calculator();
        double result = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) result;
    }

    @Override
    public int div(int arg0, int arg1) {
        Calculator calculator = new Calculator();
        double result;
        if (arg1 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        } else {
            result = calculator.newFormula()
                    .addOperand(arg0)
                    .addOperand(arg1)
                    .calculate(Calculator.Operation.DIV)
                    .result();
        }
        return (int) result;
    }

    @Override
    public int pow(int a, int b) {
        Calculator calculator = new Calculator();
        double result = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int) result;
    }
}
