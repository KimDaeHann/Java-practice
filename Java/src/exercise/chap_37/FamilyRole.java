package exercise.chap_37;

public interface FamilyRole extends DaddyRole , HusbandRole{


    @Override
    default void sayLoveEveryDay() {
        HusbandRole.super.sayLoveEveryDay();
        DaddyRole.super.sayLoveEveryDay();
    }
}
