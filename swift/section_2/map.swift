indirect enum Foo<C> { 
    case alpha(C, Foo<C>) 
    case beta 
}

// qwerty is recursive
//   -Base case and recursive case
//   -Conditional execution
//   -A big input should be able to be broken down into a smaller input
func qwerty<A, B>(c: Foo<A>, d: (A) -> B) -> Foo<B> {
    switch c {
    case .alpha(let part1, let part2):
        // alpha is recursive case
        // part1: A
        // part2: Foo<A>
        let rest: Foo<B> = qwerty(c: part2, d: d)
        let b: B = d(part1) // where to use b?

        // let temp: Foo<A> = Foo.alpha(part1, Foo.beta)

        // answer should have rest and b
        // answer: Foo<B>
        // need a value of type Foo<B>, that uses rest (Foo<B>) and b (B)
        return Foo.alpha(b, rest)

        // weird things:
        // - recursive case does no work other than the recursive call
        // - part1 is never used (compiler warning)
        // - d is never called
    case .beta:
        // beta is base case
        return Foo.beta
    }
}
