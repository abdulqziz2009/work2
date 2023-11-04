public class Main {
            public static void main(String[] args) {
                double[] numbers = {8, -2, -4, 2, 3, 6, -7};

                double sum = 0;
                boolean foundNegative = false;
                int count = 0;

                for (double num : numbers) {
                    if (foundNegative && num > 0) {
                        sum += num;
                        count++;
                    } else if (num < 0) {
                        foundNegative = true;
                    }
                }

                double average = sum / count;


                System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
            }
        }
