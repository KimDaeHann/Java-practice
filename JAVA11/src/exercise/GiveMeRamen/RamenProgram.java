package exercise.GiveMeRamen;

import java.util.Scanner;

interface Runnable {
    void run();
}

public class RamenProgram {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("라면 몇 개 끓일까요?");

        //라면 몇개를 끓일지 질문 후 사용자는 입력
        num = input.nextInt();

        System.out.println(num + "개 주문 완료! 조리시작!");
        try {
            RamenCook ramenCook = new RamenCook(num);
            //4개의 쓰레드 생성
            new Thread(ramenCook, "A").start();
            new Thread(ramenCook, "B").start();
            new Thread(ramenCook, "C").start();
            new Thread(ramenCook, "D").start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class currentThread extends Thread {
    static String nam;
    public RamenCook ramenCook;

    currentThread() {
        this(new RamenCook(5), "");
    }

    currentThread(RamenCook ramenCook, String nam) {
        this.ramenCook = ramenCook;
        currentThread.nam = nam;
    }
}


class RamenCook extends Thread implements Runnable {
    private int ramenCount;
    private final String[] burners = {"_", "_", "_", "_"};

    public RamenCook(int count) {
        ramenCount = count;
    }

    @Override
    public void run() {
        while (ramenCount > 0) {
            synchronized (this) {
                ramenCount--;
                System.out.println(Thread.currentThread().getName() + " : " + ramenCount + "개 남았습니다");
            }

            for (int i = 0; i < burners.length; i++) {
                if (!burners[i].equals("_")) {
                    continue;
                }

                synchronized (this) {
                    //if(burners[i].equals("_"))
                    //{
                    burners[i] = Thread.currentThread().getName();
                    System.out.println("                 " + Thread.currentThread().getName() + " : [" + (i + 1) + "]번 버너 ON");
                    showBurners();
                    //}
                }

                try {
                    //쓰레드를 일정 시간 정지 ex 라면이 끓는 시간
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (this) {
                    //라면이 다 끊으면 "_" 값 즉 빈값 추출
                    burners[i] = "_";
                    System.out.println("                                  " + Thread.currentThread().getName() + " : [" + (i + 1) + "]번 버너 OFF");
                    //버너의 상태를 출력 ( 비엇나 안비었나)
                    showBurners();
                }
                break;
            }

            try {
                //다음 라면 끊이기까지 랜덤으로 시간 걸림
                Thread.sleep(Math.round(1000 * Math.random()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void showBurners() {
        String stringToPrint = "                                                             ";
        for (int i = 0; i < burners.length; i++) {
            stringToPrint += (" " + burners[i]);
        }
        System.out.println(stringToPrint);
    }
}


