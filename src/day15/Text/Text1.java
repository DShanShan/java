package day15.Text;

public class Text1 {
    public static void main(String[] args) {
       /* MyThread my=new MyThread();
        my.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("aaaa");
        }*/

      /* MyThread2 my2=new MyThread2();
       Thread th=new Thread(my2);
       th.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("aaa");
        }*/

      /*Runnable runn=new Runnable(){
          @Override
          public void run() {
              for (int i = 0; i < 100; i++) {
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println(Thread.currentThread().getName()+"123");
              }
          }
      };
      Thread th=new Thread(runn,"ddd:");
      th.start();
*/

       /* new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("画法几何解放军");
            }
        }).start();*/

       /* Thread th1=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        th1.start();

        Thread th2=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("a"+i);
                    if (i == 50) {
                        try {
                            th1.join();
                            //当i等于50的时候,让t1线程加入执行,执行10毫秒之后交出执行权
//                            th1.join(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        th2.start();*/

/*

        for (int i = 0; i < 100; i++) {
            System.out.println("ccc");
        }
*/

        /*Thread th1=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    System.out.println(i);
                }
            }
        });

        th1.setDaemon(true);
        Thread th2=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);
                }
            }
        });

        Thread th3=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);
                }
            }
        });
        th1.start();
        th2.start();
        th3.start();
*/



        Thread th1=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("b"+i);
                }
            }
        });

        Thread th2=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i==50){
                        //当i等于50的时候该线程礼让,但是不一定会交出线程执行权
                        Thread.yield();
                    }
                    System.out.println("a"+i);
                }
            }
        });

//        th1.setPriority(8);
//        th2.setPriority(10);
        th1.start();
        th2.start();













    }
}
