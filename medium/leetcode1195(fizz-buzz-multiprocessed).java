class FizzBuzz {
    private int n;
    private volatile int start = 1;
    private Semaphore semFizzBuzz = new Semaphore(1);
    private Semaphore semFizz = new Semaphore(0);
    private Semaphore semBuzz = new Semaphore(0);
    private Semaphore semNone = new Semaphore(0);


    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (true) {
            semFizz.acquire();
            if (start > n) {
                semBuzz.release();
                semNone.release();
                semFizzBuzz.release();
                break;
            }
            if (start % 3 == 0) {
                printFizz.run();
                start++;
                semFizzBuzz.release();
            } else {
                semBuzz.release();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (true) {
            semBuzz.acquire();
            if (start > n) {
                semFizz.release();
                semNone.release();
                semFizzBuzz.release();
                break;
            }
            if (start % 5 == 0) {
                printBuzz.run();
                start++;
                semFizzBuzz.release();
            } else {
                semNone.release();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (true) {
            semFizzBuzz.acquire();
            if (start > n) {
                semFizz.release();
                semBuzz.release();
                semNone.release();
                break;
            }
            if (start % 3 == 0 && start % 5 == 0) {
                printFizzBuzz.run();
                if (start == n) {
                    start++;
                    semFizz.release();
                    semBuzz.release();
                    semNone.release();
                    break;
                }
                start++;
                semFizzBuzz.release();
            } else {
                semFizz.release();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            semNone.acquire();
            if (start > n) {
                semFizz.release();
                semBuzz.release();
                semFizzBuzz.release();
                break;
            }
            printNumber.accept(start);
            start++;
            semFizzBuzz.release();
        }
    }
}