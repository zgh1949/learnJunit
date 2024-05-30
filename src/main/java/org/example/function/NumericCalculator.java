package org.example.function;

public class NumericCalculator {
    public double eval(String expression) {
        // 优化
        final String[] data;
        if (expression.contains("+")) {
            data = expression.split("\\+");
            return Double.parseDouble(data[0]) + Double.parseDouble(data[1]);
        } else if (expression.contains("-")) {
            data = expression.split("-");
            return Double.parseDouble(data[0]) - Double.parseDouble(data[1]);
        } else if (expression.contains("*")) {
            data = expression.split("\\*");
            return Double.parseDouble(data[0]) * Double.parseDouble(data[1]);
        } else if (expression.contains("/")) {
            data = expression.split("/");
            return Double.parseDouble(data[0]) / Double.parseDouble(data[1]);
        }

        return 0.0D;
    }
}
