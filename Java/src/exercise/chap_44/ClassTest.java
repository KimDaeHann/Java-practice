package exercise.chap_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer();
          Class clazz = Customer.class;
//        Class clazz2 = Customer.class;

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        //Object method 를 볼 수 있음
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //public 된 필드가 없을 경우 값이 안뜸
        //getDeclaredFields() 를 쓰면 값이 나옴
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Customer customer2 = (Customer) clazz.getConstructor(String.class).newInstance("민철");
        System.out.println(customer2);
    }
}
