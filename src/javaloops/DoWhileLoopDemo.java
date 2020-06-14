package javaloops;

public class DoWhileLoopDemo {
    public static void main(String[] args) {

        /*
        initialization, increment/decrement, condition.
        1. int = data type declare
        2. i=1; initialize variable
        3. do { as keyword
        4. sout("USA");  code/task
        5. i++ increment/decrement by 1;
        6. while as keyword
        7. i<6; condition true

        Note : Print first then check the condition true
         */

        int i = 1;

        do {
            System.out.println("USA");
            i++;
        }while (i<6);
    }
}
