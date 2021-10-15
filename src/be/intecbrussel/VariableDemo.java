package be.intecbrussel;

public class VariableDemo {
    private int instanceVariable = 1;

    public void method(){
        int localVariable = 2;

        if (true) {
            int localVariable2 = 3;
            int testInIF;
            testInIF = instanceVariable;
            testInIF = localVariable;
            testInIF = localVariable2;
        }

        if (true) {
            int localVariable3 = 4;

        }

        int testVariable;
        testVariable = instanceVariable;
        testVariable = localVariable;
//        testVariable = localVariable2;

    }
}
