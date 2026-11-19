public class PrimeNumbersV2 {

    public static boolean checkPrime(int number) {

        if (number < 2) {
            return false;
        }

        int divisors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
            }
        }

        return divisors == 2;
    }

    public static void main(String[] args) {

        System.out.println("Prime numbers between 0 and 500:");

        int number = 0;

        while (number <= 500) {

            if (checkPrime(number)) {
                System.out.println(number);
            }

            number++;
        }
    }
}
