import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    private static void task1() {
        System.out.println(" задача 1 ");
        int [] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySun = 0;
        for (int salary: salaryArray){
            salarySun += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salarySun + " рублей");
    }

    private static void task2() {
        System.out.println(" задача 2 ");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salaryMax = 99_000;
        int salaryMin = 200_001;

        for (int salary: salaryArray) {
            if (salary > salaryMax){
                salaryMax = salary;
            }
            if (salary < salaryMin){
                salaryMin = salary;
            }
        }
        System.out.println(" Минимальная сумма трат за день составила " + salaryMin + " рублей. " +
                " Максимальная сумма трат за день составила " + salaryMax + " рублей");
    }
    private static void task3() {
        System.out.println(" задача 3 ");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySun = 0;
        for (int salary: salaryArray){
            salarySun += salary;
        }
        double saleryAvarage = (double) salarySun / salaryArray.length;
        System.out.println("Сумма трат за месяц составила " + salarySun + " рублей");


    }
    private static void task4() {
        System.out.println(" задача 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}