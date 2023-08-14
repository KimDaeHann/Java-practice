package exercise.chap_53;

public class OuterClass {

    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass{

        private int InnerData;

        public InnerClass(int innerData) {
            InnerData = innerData;
        }

        void display(){
            System.out.println("OuterData: " + outerData);
            System.out.println("InnerData: " + InnerData);
        }
    }
}
