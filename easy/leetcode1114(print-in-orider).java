class Foo {

    private CountDownLatch latchSecond = new CountDownLatch(2);
    private CountDownLatch latchThird = new CountDownLatch(3);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        latchSecond.countDown();
        latchThird.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        latchSecond.countDown();
        latchSecond.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        latchThird.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        latchThird.countDown();
        latchThird.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}