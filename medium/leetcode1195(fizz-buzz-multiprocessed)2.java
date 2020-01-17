class FizzBuzz {
    private int n;
    private volatile int index = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (; index <= n; ) {
            if (index % 3 == 0 && index % 5 != 0 && index <= n) {
                printFizz.run();
                index++;
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (; index <= n; ) {
            if (index % 5 == 0 && index % 3 != 0 && index <= n) {
                printBuzz.run();
                index++;
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (; index <= n; ) {
            if (index % 5 == 0 && index % 3 == 0 && index <= n) {
                printFizzBuzz.run();
                index++;
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (; index <= n; ) {
            if (index % 5 != 0 && index % 3 != 0 && index <= n) {
                printNumber.accept(index);
                index++;
            }
        }
    }
}