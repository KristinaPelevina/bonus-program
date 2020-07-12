public class Main {
    public static void main(String[] args) {
        long transfer = 1100L;
        long bonus;
        long rubles = 100;
        long condition = 1000;
        if (transfer >= condition) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }

        long balance = 500_000_100;
        long amount = balance + transfer + bonus;
        System.out.println(amount);
    }
}
