package love.programming;

public class VariableScope {

    static int myGlobalint = 5;
    static int a;

    public static void main(String[] args) {


        int myMainLocalint = 10;

        System.out.println("Local Variable is :" +myMainLocalint);
        System.out.println("Gobal Variable is :" +myGlobalint);
        VariableScope vs = new VariableScope();
        vs.myMethod();
//        VariableScope vs = new VariableScope();


        {

            int myCodeblockInt = 100;
            System.out.println("Code Block Variabe" +myCodeblockInt);

        }


    }



    void myMethod() {

        int myLoacalInt = 10;

        System.out.println("Gobal Variable decleared in a Method :" +myGlobalint);

    }
}

class AnotherVariableScopeClass{

    static int myStaticGloabalInt;

}
