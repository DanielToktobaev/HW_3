public class Main {
    public static void main(String[] args) {
        // массив дробных чисел
        double[] numbers = {8.0, 1.5, -2.0, 4.5, 3.0, 6.0, -7.0, 9.5, -3.0, 0.5, 2.0, -1.5, 7.0, 1.0, -6.0};

        // флаг для оислеживания первого отрицательного числа
        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        // aикл for each для подсчета среднего
        for (double num : numbers) {
            if (!foundNegative && num < 0) {
                foundNegative = true; // После первого отрицательного числа
            } else if (foundNegative && num > 0) {
                sum += num;
                count++;
            }
        }

        // выводим результат
        if (count > 0) {
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + (sum / count));
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        }
    }
}