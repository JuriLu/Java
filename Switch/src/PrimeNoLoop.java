public class PrimeNoLoop {

    public static void main(String[] args) {

        int primeNumbers = 0;
        for (int i = 0; i <= 50; i++) {
            if (isPrime(i)) {
                primeNumbers++;
                System.out.println(i + " is a prime number. Prime number counter: " + primeNumbers);
                if (primeNumbers == 3) {
                    System.out.println("Found 3 prime numbers.");
                    break;
                }
            } else {
                System.out.println(i + " is not a prime number. Prime number counter: " + primeNumbers);
            }
        }

//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number.");

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

}
