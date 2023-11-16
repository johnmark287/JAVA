interface B{
    void show();
}
public class Abstract {
    public static void main(String[] args) {
        B classA = () -> System.out.println("implrmrnt");

        classA.show();
    }
}

