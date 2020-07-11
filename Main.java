    public class Main {
        public static void main(String[] args) {
            long balance = 500_000_500;
            long transfer = 700_000_100_000L;
            long bonus = 1;
            long rubles = 100;

            long amount = balance + transfer + transfer / rubles * bonus;
            System.out.println(amount);
        }
    }

