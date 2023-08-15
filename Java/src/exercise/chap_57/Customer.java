package exercise.chap_57;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

    private final long serialVersionUID = 1L;
    //속성 static 설계도의 포함 된 친구 공통된게 아님
    static int seralNums = 1; //순차적으로 생성되기 때문에 static(추적할수있는값) 있어야 됨


    //자식 객체는 private X
    protected String customerID;
    protected String name;
    protected String customerGrade;


    protected int bonusPoint;
    protected double bonusPointRatio;

    //행위 //어떤 가격이 들어옴 //int 이기 때문에 return 필요
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio; //고객이 직접 적립하는 형식을 하는 행위
        return price;
    }

    //default 값 추가 후 진행
    Customer() {
    }

    public Customer(String customerID, String name) {
        this(name); //this(name)은 밑에 생성자를 호출 커스텀 아이디만 오버라이트
        this.customerID = customerID;
    }

    //생성자
    public Customer(String name) {
        this.customerID = "Customer" + seralNums++; //Customer 값이 추가되면 seralNums 값 증가
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo() {
        System.out.printf("CustomerId=%s, name=%s , customerGrade=%s, bonusPoint=%d\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("CustomerId=%s, name=%s , customerGrade=%s, bonusPoint=%d\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override //obj가 비교를 하고싶 다른 obj가 오는데 obj와 같은지
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }//null값으로 같은경우 Customer라는 뜻 결국 다운캐스팅이 가능해야됨
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        return false;
    }


    //
    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);

    }
}

