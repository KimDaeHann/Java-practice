package exercise.chap_34;

public class Customer {
    //속성
    static int serialNums = 1;

    protected String customerId;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    Customer(String name) {
        // CustomerId = 즉 Customer 가 생성 될 때 마다 serialNum(static) 이 1씩 증가
        this.customerId = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }


    Customer() {
    }


    //행위
    //돈을 얼마 내야하는지 계산
    public int calculatePrice(int price) {
        //내 스스로 적립하는 시스템
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    void printMyInfo() {
        System.out.printf("Customer(customerId=%s, name=%s , customerGrade=%s, bonusPoint = %d)\n"
                , this.customerId, this.name, this.customerGrade, this.bonusPoint);
    }
}
