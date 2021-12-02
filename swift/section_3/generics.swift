// type variable on data: generics
//
// introduced type variable
//                   |
indirect enum MyList<A> {
    case Cons(A, MyList<A>)
    case Nil
}

let list1: MyList<Int> = MyList.Cons(1, MyList.Cons(2, MyList.Nil));
let list2: MyList<String> = MyList.Cons("foo", MyList.Cons("bar", MyList.Nil));
print(length(list: list1))
print(length(list: list2))

// type variable on functions: parametric polymorphism (generics)
//
// introduced type variable
//          |
//          |   use type variable
//          |               |
func length<A>(list: MyList<A>) -> Int {
    switch list {
    case .Cons(_, let tail): return 1 + length(list: tail)
    case .Nil: return 0
    }
}

// indirect enum MyListString {
//     case Cons(String, MyListString)
//     case Nil
// }

