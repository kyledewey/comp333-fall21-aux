public interface List<A> {}

// Nil<A> is a subtype of List<A>
public class Nil<A> implements List<A> {}

// Cons<A> is a subtype of List<A>
public class Cons<A> implements List<A> {
    public final A head;
    public final List<A> tail;

    public Cons(final A head, final List<A> tail) {
        this.head = head;
        this.tail = tail;
    }
}

public class Main {
    //             introduces the type variable (puts it in scope)
    //             |
    //             |                        uses the type variable
    //             |                        |
    public static <B> int length(final List<B> list) {
        if (list instanceof Nil) {
            return 0;
        } else if (list instanceof Cons) {
            final Cons<B> asCons = (Cons<B>)list;
            final int tailLength = length(asCons.tail);
            return 1 + tailLength;
        } else {
            // SHOULD NOT BE POSSIBLE
            System.out.println("Not valid");
            System.exit(1);
            return -1;
        }
    }
}
