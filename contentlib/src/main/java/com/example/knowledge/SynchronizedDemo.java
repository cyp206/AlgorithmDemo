package com.example.knowledge;


/**
 * Created by y on 2017/11/19.
 */

public class SynchronizedDemo {

    /**
     *
     * 关键字    synchronized、static 修饰
     *
     * synchronized修饰 为了保证线程安全，当synchronized修饰的时候，其他多线程调用该方法的时候，必须保证同部锁被释放才能执行该方法。
     * 对于 A类（有同部锁、无static修改）的a方法，当多线程调用不同实现类的a方法的时候，无法构成线程同步。这个时候，synchronized修饰的是对象方法
     * <p>
     * 对于 A类（有同部锁、有static修改）的a方法，当多线程调用不同的实现类的a方法时，已经构成了线程同步。这个时候，synchronized修饰的是class
     */


    static class A {
        public static synchronized void a() {
            for (int i = 0; i < 50; i++) {
                System.out.println("I am  [" + Thread.currentThread().getId() + "]  A  [" + i + "]");

            }

        }

        public synchronized void b() {
            for (int i = 0; i < 50; i++) {
                System.out.println("I am  [" + Thread.currentThread().getId() + "] B [" + i + "]");

            }

        }

    }


    public static void run() {

        final A objA = new A();
        final A objB = new A();
        final boolean isStatic = true;

        new Thread(new Runnable() {
            @Override
            public void run() {
                if (isStatic) {
                    objA.a();
                } else {
                    objA.b();
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                if (isStatic) {
                    objB.a();
                } else {
                    objB.b();
                }
            }
        }).start();


    }


}
