package exercise.chap_34;

public class DepartmentSituation {

    public static void main(String[] args) {


        Customer customer = new VIPCustomer("단골");
        Customer customer1 = new GoldCustomer("골드");


        Customer[] customerQueue = {
                new Customer("몽"), new Customer("키"),
                customer, new VIPCustomer("못단골"),customer1,
                new Customer("탱"), new Customer("구"),
                customer, new VIPCustomer("안단골"),new GoldCustomer("부자"),
                new Customer("라"), new Customer("숑")
                ,customer1
        };
        //시나리오
        //1.손님은 점원에게 가격으로 결제 요청을 한다.
        int price = 10000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);


        for (Customer customerEach : customerQueue) {
            customerEach.printMyInfo();

            //손님이 금액을 물어보는것을 하나의 함수로 정의
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은: %d ,\n", cash);
            //2.점원은 손님정보에 기반하여 물품 계산을 한다.
            //3.점원은 자신의 매상에 결제 금액을 추가한다.
            staff.addSalesAmount(cash);
            //4.기다리는 손님이 남아 있다면 다시 1을 수행한다
        }
        staff.printMySalesAmount();


    }
}
