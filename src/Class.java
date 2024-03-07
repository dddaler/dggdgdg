import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (in m): ");
        float heightBielecki = scanner.nextFloat();

        System.out.print("Enter your weight (in kg): ");
        float weightBielecki = scanner.nextFloat();

        float bmi = weightBielecki / (float) Math.pow(heightBielecki, 2);

        String range;
        if (bmi < 16.00) {
            range = "starvation";
        } else if (bmi > 16.00 && bmi <=16.99) {
            range = "emaciation";
        } else if (bmi > 17.00 && bmi <= 18.49) {
            range = "underweight";
        } else if (bmi > 18.50 && bmi <= 22.99) {
            range = "normal, low range";
        } else if (bmi > 23.00 && bmi <= 24.99) {
            range = "normal, high range";
        } else if (bmi > 25 && bmi <= 27.49) {
            range = "overweight, low range";
        } else if (bmi > 27.50 && bmi <= 29.99) {
            range = "overweight, high range";
        } else if (bmi > 30 && bmi <= 34.9) {
            range = "1st degree obesity";
        } else if (bmi > 35 && bmi <= 39.9) {
            range = "2nd degree obesity";
        } else { range = "3rd degree obesity";
        }

        System.out.printf("Your BMI is %.2f%n", bmi);
        System.out.println("You are classified as: " + range);
        }
    }
