indirect enum List<A> {
  case cons(A, List<A>)
  case empty
}

// map is recursive
func map<A, B>(first: List<A>, second: (A) -> B) -> List<B> {
    switch first {
    case .cons(let a, let otherList):
        // recursive case
        // a: A
        // otherList: List<B>
        let rest: List<B> = map(first: otherList, second: second)
        let b: B = second(a) // calls second, uses a
        // b, rest must somehow be in the return value
        return List.cons(b, rest)
    case .empty:
        // base case
        return List.empty
    }
}
