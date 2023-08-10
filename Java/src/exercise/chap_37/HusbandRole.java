package exercise.chap_37;

public interface HusbandRole {

    void takeCareWife(Wife wife);

    default void sayLoveEveryDay() {
        System.out.println("우리 와이프 사랑합니다.");
    }

    ;

    String getName();
}
