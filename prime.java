class AlternatePrimes {
    public static void main(String[] args) {
        int count = 0;

        for (int n = 2; n <= 50; n++) {
            boolean prime = true;
            for (int i = 2; i <= n / 2; i++)
                if (n % i == 0) { prime = false; break; }

            if (prime && ++count % 2 == 0)
                System.out.print(n + " ");
        }
    }
}
