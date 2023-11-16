// package test;

class OutClass
{
    /**
     * InnerOuterClass
     */
    int x = 44;
    
    public class InnerClass
    {

        public void myMethod()
        {
            System.out.println(x);
        }
    }
}
public class OuterClass {

    public static void main(String[] args)
    {
        OutClass obj = new OutClass();
        obj.new InnerClass().myMethod();
        // OutClass.InnerClass obj2 = obj.new InnerClass();

        // System.out.println(obj);
    }
}
