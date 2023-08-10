package exercise.chap_37;

public class Male extends FamilyMan implements FamilyRole, EmployeeRole {


    private String job;
    private int age;


    public Male(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + " 인 직장 동료와 업무를 하고 있습니다.");

    }
}
