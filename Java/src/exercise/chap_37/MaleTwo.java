package exercise.chap_37;

public class MaleTwo extends FamilyMan implements FamilyRole,EmployeeRole{



    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + " 인 직장 동료와 업무를 하고 있습니다.");

    }

    public MaleTwo(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
