package exercise.chap_37;

public class InterfaceTest {
    public static void main(String[] args) {
        //Male 3개 남편 , 아빠 ,회사원

       HusbandRole male = new Male("철수");
       Wife wife = new Female("영희");

       male.sayLoveEveryDay();
       male.takeCareWife(wife);

       //이어서 아빠
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby =new Baby("응애");

        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        //회사원
        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        EmployeeRole femaleEmployee = new Female("은애");
        EmployeeRole maleEmployeeTwo = new MaleTwo("옹잉");

        maleEmployee.workTogether(femaleEmployee);
        maleEmployee.workTogether(maleEmployeeTwo);
    }
}
