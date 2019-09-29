class ZeroEvenOdd {
    private int n;
    private Semaphore semZero = new Semaphore(1);
    private Semaphore semEven = new Semaphore(0);
    private Semaphore semOdd = new Semaphore(0);
    private int evenTimes;
    private int oddTimes;

    public ZeroEvenOdd(int n) {
        this.n = n;
        evenTimes = n/2;
        oddTimes = n%2 == 0 ? n/2 : n/2+1;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            semZero.acquire();
            printNumber.accept(0);
            if (i%2 == 1) {
                semOdd.release();
            } else {
                semEven.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i = 0, j = 2; i < evenTimes; i++,j+=2) {
            semEven.acquire();
            printNumber.accept(j);
            semZero.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0,j = 1; i < oddTimes; i++,j+=2) {
            semOdd.acquire();
            printNumber.accept(j);
            semZero.release();
        }
    }
}