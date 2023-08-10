package exercise.chap_34;

public class VIPCustomer extends Customer {
    //static는 instance의 고유 값
    static int serialNums = 1;
    //속성

    //VIP 담당직원 ID
    private String agentID;
    private double discountRatio;

    //자식 클래스는 생성자 만들때 부모클래스 생성자 실행하고 해야됨
    public VIPCustomer(String name) {
        super();
        this.customerId = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPointRatio = 0.05;
        this.bonusPoint = 0;
        this.discountRatio = 0.1;
    }


    //행위
    @Override
    public int calculatePrice(int price) {
        //적립
        this.bonusPoint += price * bonusPointRatio;

        //할인
        price -= price * discountRatio;
        return price;
    }

    //vip 담당직원 부름
    public void callAgent() {
        System.out.println("담당직원 " + this.agentID + "일루오게나");
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    void printMyInfo() {
        System.out.print("VIP");
        super.printMyInfo();
    }
}
