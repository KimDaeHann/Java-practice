package exercise.chap_53;

public class OuterStaticClass {

    private static int outerDate;

    public OuterStaticClass(int outerDate) {
        this.outerDate = outerDate;
    }
    //같은 static 이어야 private 가져올수있음
    public static class InnerClass{
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println("OuterData: " + outerDate );
            System.out.println("InnerData: " +innerData);
        }
    }
}
