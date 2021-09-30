// function indirectIf(ifTrue, func1, func2)
// {
// 	if(ifTrue)
// 	{
// 		func1();
// 	}
// 	else
// 	{
// 		func2();
// 	}	
// }

public class Main {
    public static void indirectIf(boolean b, Operation op1, Operation op2) {
        if (b) {
            op1.doOp();
        } else {
            op2.doOp();
        }
    }
}

public interface Operation {
    public void doOp();
}

public class SomeOp implements Operation {
    public void doOp() { System.out.println("foo"); }
}

        
