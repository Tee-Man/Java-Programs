import java.sql.Struct;
import java.util.function.Function;

public class main {

    public static void main(String[] aargs){
        main a = new main();
        a.foo();
        a.foo2();
        a.personProps().getAttributes()
    }

    public Function foo()
    {
        String hello = "Hello World";
        System.out.println("Foo function method is: " + hello);
        return null;
    }

    public void foo2(){
        String hello = "Hello World";
        System.out.println("Foo2 function method is: " + hello);

        Struct personProps
        {
            int eyes;
            int hands;
            int legs;
            int ears;
            int nose;
        }


    }


}
