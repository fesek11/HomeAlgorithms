package CodeWars;

public class PrimeTask {
    public static void main(String[] args) {
        isPrime(10);
    }

    public static boolean isPrime(int num) {
        int ost;
        while (num > 1) {
            ost = num%num;
            if (ost != 1) {
                isPrime(ost);
            }
            return true;
        }
        return false; //TODO
    }
}
