package exercise.JavasClassic;
@FunctionalInterface
interface MyFunction {
    void run(); //public abstract void run();
}

public class Interface {
    static  void execute(MyFunction f){ // 매개변수 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
        //매개변수하고 반환 타입이 같아야 정상 작동 됨
//        MyFunction f = () -> System.out.println("f3.run()");
//        return f;
          return  () -> System.out.println("f3.run()");
    }

    public static void main(String[] args){
        //람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction(){ // 익명클래스로 run() 구현
            public void run() {  //public을 반드시 붙여야함
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute( () -> System.out.println("f1.run()"));
        execute( () -> System.out.println("run()"));

    }
}
