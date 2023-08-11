package exercise.chap_47;

public class VIPCustomer extends Customer {
    static int serialNums = 1;
    //속성

    private String agentID;
    private double discountRatio;

    //행위
    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio; //보너스 적립
        price -= price * discountRatio; //할인
        return price;
    }
    //Vip만 있는 method 이기 때문에 override X
    public void callAgent() {
        System.out.println("담당직원" + this.agentID + "님 문의드릴게 있어요~");
    }

    //setter 추가 why? 객체 내부 속성에 직접 접근하지 않아
    // 객체의 정보 은닉을 가능하게 해주어 보안을 강화할 수 있고,
    // 코드의 안전성과 유지보수성을 높일 수 있다는 장점
    // 굳이 VIPCustomer 값에 this.agentID를 하지 않아도 값 출력이 가능
    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public VIPCustomer(String agentID, double discountRatio) {
        this.agentID = agentID;
        this.discountRatio = discountRatio;
    }

    public VIPCustomer(String name, String agentID, double discountRatio) {
        super(name);
        this.agentID = agentID;
        this.discountRatio = discountRatio;
    }

    //자식 클래스는 생성자를 만들때 부모클래스는 실행하고 함
    //그래서 super()값을 넣음
    public VIPCustomer(String name) {
        super();
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }
    @Override
    public void printMyInfo() {
        System.out.print("Vip");
        super.printMyInfo();
    }
}
