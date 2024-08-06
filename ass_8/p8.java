//write a program to throw an exception when no is Prime from 1 to n.

class PrimeNumberException extends Exception {
    public PrimeNumberException(int number) {
        super("Number " + number + " is a prime number.");
    }
}

public class p8 {
    public static void main(String[] args) {
        int n = 50; // Change this to any number you want to check up to
        try {
            checkNumbers(n);
        } 
        catch (PrimeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkNumbers(int n) throws PrimeNumberException {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                throw new PrimeNumberException(i);
            }
        }
        System.out.println("No prime numbers found from 1 to " + n);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
