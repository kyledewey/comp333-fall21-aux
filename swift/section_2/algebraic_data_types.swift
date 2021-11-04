enum MyBoolean { // type
    case MyTrue  // constructor
    case MyFalse // constructor
}

let temp = MyBoolean.MyFalse;

// pattern matching
switch temp {
case .MyTrue:
    print("It's true")
case .MyFalse:
    print("It's false")
}

enum TrafficLightConfiguration {
    case Red(Int)
    case Yellow(Int)
    case Green(Int)
    case SomethingElse(Int, Int, MyBoolean)
}

let config = TrafficLightConfiguration.SomethingElse(3, 4, MyBoolean.MyTrue)
switch config {
case .Red(let time) where time < 30:
    print("Red time less than 30: " + String(time))
case .Red(let time):
    print("Amount of time for red: " + String(time))
case .SomethingElse(_, _, _):
    print("SOMETHING ELSE")
case _:
    print("Something else")
// case .Yellow(let time):
//     print("Amount of time for yellow: " + String(time))
// case .Green(let time):
//     print("Amount of time for green: " + String(time))
}

indirect enum BinaryTree {
    case Leaf
    case InternalNode(BinaryTree, Int, BinaryTree)
}
