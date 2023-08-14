package exercise.chap_27.pacakgeOne;

public class ClassAA {
    //같은 패키지 하위에 있는 것 끼리 접근이 가능 !
    void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();
    }
//    'methodPrivate()'
//
//    이(가) 'exercise.chap_27.pacakgeOne.ClassA'에서
//    private 액세스를 가집니다

//    void testPrivate(ClassA classA) {
//        String str = classA.privateStr;
//        classA.methodPrivate();
}

