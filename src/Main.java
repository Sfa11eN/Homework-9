import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы урок 2");
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;

            System.out.println("Сумма трат за месяц составила " + salarySum + " рублей ");
        }

    }

    public static void task2() {
        System.out.println("Задание 2");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int lowSpendings = salaryArray[0];
        int highSpendings = salaryArray[0];

        for (int salary : salaryArray) {
            if (salary < lowSpendings) {
                lowSpendings = salary;
            }
            if (salary > highSpendings) {
                highSpendings = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + lowSpendings + " рублей." + " Максимальная сумма трат за день составила " + highSpendings + " рублей");
    }

    public static void task3() {
        System.out.println("Задание 3");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;
        }
         int salaryAverage = salarySum / salaryArray.length;

        System.out.println("Средняя сумма  за месяц  составила "+salaryAverage +" рублей.");

    }
    public static void task4(){
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i=reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }

    }

public static int[]generateRandomArray(){
        java.util.Random random=new java.util.Random();
        int[]arr=new int[30];
        for(int i=0;i<arr.length;i++){
        arr[i]=random.nextInt(100_000)+100_000;
        }
        return arr;
        }
        }
