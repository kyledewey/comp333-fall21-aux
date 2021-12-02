// General mechanism to introduce a type with cases: algebraic data types
//
// TrafficLightColor:
//   -Red
//   -Yellow
//   -Green
//
// General mechanism to look at the type and dispatch code: pattern matching
// 
// TrafficLightColor c1 = Red;
// TrafficLightColor c2 = Yellow;
//
// lookAtColor (c1) {
//   on Red: ...
//   on Yellow: ...
//   on Green: ...
// }
//
// if you've seen enum or switch before, hit yes
//
public class Foo {
    public static void doSomething(boolean b) {
        // we check a boolean value at runtime and conditionally
        // execute code depending on the value
        if (b) {
            // if true
        } else {
            // if false
        }
    }
    
    public static void main(String[] args) {
        // we can create a boolean
        boolean b1 = true;
        boolean b2 = false;
        doSomething(b1);
    }
}

public interface BinaryTree {
    public int sum();
}
public class InternalNode implements BinaryTree {
    public final BinaryTree left;
    public final int value;
    public final BinaryTree right;

    public InternalNode(final BinaryTree left,
                        final int value,
                        final BinaryTree right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    public int sum() {
        return left.sum() + value + right.sum();
    }
}
public class Leaf implements BinaryTree {
    public int sum() {
        return 0;
    }
}
