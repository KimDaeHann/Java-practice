package exercise.chap_34;

public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer("나철수");
        VIPCustomer vipCustomer = new VIPCustomer("나관종");
        Customer customer2 = new Customer("멍");

        customer.printMyInfo();
        vipCustomer.printMyInfo();
        customer2.printMyInfo();



    }
}
