package exercise.chap_34;

public class GoldCustomer extends Customer {

    private double discountRatio;

    GoldCustomer(String name) {
        super();
        this.customerId = "Customer" + Customer.serialNums++;
        this.name = name;
        this.customerGrade = "Gold";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }
}
