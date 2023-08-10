package exercise.chap_37;

public class Female implements  EmployeeRole , Wife {

    //속성
    private String name;

    public Female(String name) {
        this.name = name;
    }

    private String job;
    private int age;

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name =employeeRole.getName();
        System.out.println(name + "인 직장 동료와 일을 하고 있습니다.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeCareHusband(HusbandRole husbandRole) {
        String name = husbandRole.getName();
        System.out.println(name + "인 남편을 케어합니다.");

    }
}
