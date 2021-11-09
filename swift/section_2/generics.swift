// generics
// know what generics are - hit yes in reactions
indirect enum List {
    case Nil
    case Cons(Int, List)
}

indirect enum StringList {
    case StringNil
    case StringCons(String, StringList)
}

func length(_ list: List) -> Int {
    switch list {
    case .Nil:
        return 0
    case .Cons(_, let tail):
        let tailLength = length(tail)
        return 1 + tailLength
    }
}

func length(_ list: StringList) -> Int {
    switch list {
    case .StringNil:
        return 0
    case .StringCons(_, let tail):
        let tailLength = length(tail)
        return 1 + tailLength
    }
}

let list1 = List.Cons(3, List.Cons(4, List.Cons(5, List.Nil)));
print(length(list1))

let list2 = StringList.StringCons("foo", StringList.StringCons("bar", StringList.StringNil));
print(length(list2))
