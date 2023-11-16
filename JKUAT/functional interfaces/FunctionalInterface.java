/**
 * notes: annonymous inner class, interface/functionalInterface
 */

class A{
    int i;

    void show1()
    {
        System.out.println("----------Show--------");
    }

    class B
    {
        void show2()
        {
            System.out.println("innner");
        }
    }
}
public class FunctionalInterface
{
    public static void main(String[] args)
    {
        A outerClass = new A();
        outerClass.show1();

        // A.B innerClass = OutClass
    }
}