class FooBar {
    private int n;
    private final Semaphore semFoo = new Semaphore(1);
    private final Semaphore semBar = new Semaphore(0);


    private volatile boolean flag = true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semFoo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semBar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semBar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semFoo.release();
        }
    }
}