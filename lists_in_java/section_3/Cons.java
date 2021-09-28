public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    // Cons is a list that has at least one element
    // [1, ...].isEmpty();
    // Cons(1, ...).isEmpty()
    public boolean isEmpty() {
        return false;
    }

    // [8, 2, 9].length() ==> 3
    // [9, 1, 4, 7].length() ==> 4
    // [9, 1].length() ==> 2
    //
    // [8, 2, 9].length()
    //    1 + [2, 9].length()

    public static void castExample() {
        Object obj = "hello"; // ok - subtyping (String is an Object)
        String s = (String)obj; // now compiles with the cast
    }
    
    public static ImmutableList addAmountStatic(ImmutableList input, int amount) {
        // tail.addAmount(amount);
        //
        // if (tail instanceof Nil) {
        //   return addAmountForNil(...);
        // } else {
        //   return addAmountForCons(...);
        // }


        // input could be Cons or Nil
        if (input instanceof Nil) {
            // base case
            return new Nil();
        } else {
            // recursive case
            // input must be a Cons
            Cons asCons = (Cons)input; // cast - if you've seen this before, hit yes
            ImmutableList rest = addAmountStatic(asCons.tail, amount);
            return new Cons(asCons.head + amount, rest);
        }
    }
    
    // [8, 9, 10].addAmount(4); // returns [8 + 4, 9 + 4, 10 + 4] ==> [12, 13, 14]
    // Cons(8, Cons(9, Cons(10, Nil))).addAmount(4);
    //
    // amount: 4
    // head: 8
    // tail: Cons(9, Cons(10, Nil))
    // this: Cons(8, Cons(9, Cons(10, Nil)))
    // return value: Cons(12, Cons(13, Cons(14, Nil)))
    // return value: [12, 13, 14]
    public ImmutableList addAmount(int amount) {
        ImmutableList rest = tail.addAmount(amount);
        // rest: Cons(13, Cons(14, Nil))
        // rest: [13, 14]

        // wanted: stitch one element on front
        // needs to be something that gives you a list
        int newHeadAmount = amount + head;
        // newHeadAmount: 12

        return new Cons(newHeadAmount, rest); // Cons(12, Cons(13, Cons(14, Nil)))
    }

    // as a one-liner
    public ImmutableList addAmount(int amount) {
        return new Cons(amount + head, tail.addAmount(amount));
    }
    
    // [8, 9, 10].drop(2);   // returns [10]
    //   Cons(8, Cons(9, Cons(10, Nil))).drop(2)  // returns Cons(10, Nil)
    //
    // number: 2
    // head: 8
    // tail: Cons(9, Cons(10, Nil))
    // this: Cons(8, Cons(9, Cons(10, Nil)))
    //
    // Cons(8, Cons(9, Cons(10, Nil))).drop(2) ==>
    //   Cons(9, Cons(10, Nil)).drop(1) ==>
    //     Cons(10, Nil).drop(0) ==>
    //       Cons(10, Nil)
    //
    // [9, 10].drop(1) ==> [10] ==> Cons(10, Nil)
    public ImmutableList drop(int number) {
        if (number <= 0) {
            return this;
        } else {
            // what if number is 0?
            ImmutableList rest = tail.drop(number - 1);
            // [9, 10].drop(1) ==> [10] ==> Cons(10, Nil)
            // rest: [10] // Cons(10, Nil)
            return rest;
        }
    }
} // Cons
