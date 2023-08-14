package exercise.chap_45;

public class GeneralPrint<T> {

    private T material;

    public void printMyInfo() {
        System.out.println(material + "를 출력합니다.");
    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
