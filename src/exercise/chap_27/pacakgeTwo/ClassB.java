package exercise.chap_27.pacakgeTwo;

import exercise.chap_27.pacakgeOne.ClassA;

public class ClassB {


    //public 적용 O
    public void testPublic(ClassA classA) {
        String test = classA.publicStr;
        classA.methodPublic();
    }


    //Private 적용 X
//    public  void  testPrivate(ClassA classA){
//        String test2 = classA.priviteStr;
//        classA.methodPrivate();
//    }

//    //Default 적용 X
//        public void  testDefault(ClassA classA){
//        String str =classA.defaultStr;
//        classA.methodProtected();
//        }
//}
}
