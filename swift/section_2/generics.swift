// generics
// know what generics are - hit yes in reactions
//
// type variables on data: generics
// type variable: variable that holds a type
//
//                 introduces the type variable (puts it in scope)
//                 |
indirect enum List<A> { // List is parameterized by A
    case Nil
    //        uses the the type variable
    //        |
    case Cons(A, List)
}

// type variables on functions: parametric polymorphism (generics)
// 
//          introduces the type variable (puts it in scope)
//          |
//          |               uses the type variable
//          |               |
func length<B>(_ list: List<B>) -> Int {
    switch list {
    case .Nil:
        return 0
    case .Cons(_, let tail):
        let tailLength = length(tail)
        return 1 + tailLength
    }
}

let list1: List<Int> = List.Cons(3, List.Cons(4, List.Cons(5, List.Nil)));
//print(length(list1))

let list2: List<String> = List.Cons("foo", List.Cons("bar", List.Nil));
//print(length(list2))

let myTuple: (String, Int) = ("foo", 17)
print(myTuple)

// arrays: mutable (can be immutable), homogeneous types, size fixed at runtime
// int myVariable = userInput();
// int[] array = new int[myVariable];

// tuples: immutable, hetrogeneous types, size fixed at compile time
let myOtherTuple: (String, Bool, Int) = ("bar", true, 2)
let anotherTuple: (String, String) = ("baz", "blah")

let (a, b, c) = myOtherTuple;
print(myOtherTuple.0);
print(myOtherTuple.1);
print(myOtherTuple.2);
