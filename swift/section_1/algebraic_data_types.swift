// Make invalid states unrepresentable.
//
// public class TrafficLightColor {
//   public boolean isRed;
//   public boolean isYellow;
//   public boolean isGreen;
//
//   public TrafficLightColor() {
//     isRed = false;
//     isYellow = false;
//     isGreen = false;
//   }
// }
enum TrafficLightColor {
    case Red
    case Yellow
    case Green
}

let c1: TrafficLightColor = TrafficLightColor.Red
let c2: TrafficLightColor = .Yellow
let c3: TrafficLightColor = .Green

func colorAsString(_ c: TrafficLightColor) -> String {
    // pattern matching
    switch c {
    case TrafficLightColor.Red: return "Red"
    case TrafficLightColor.Yellow:
        return "Yellow"
    case .Green:
        return "Green"
    }
}

let s = colorAsString(c2)
//print(s)

func doSomething(_ c: TrafficLightColor) {
    switch c {
    case .Red:
        print("It's red")
    case .Yellow:
        print("It's yellow")
    case .Green:
        print("It's green")
    }
}

doSomething(TrafficLightColor.Red)

enum TrafficLightColorWithDuration {
    case RedDur(Int)
    case YellowDur(Int)
    case GreenDur(Int)
}

let d1 = TrafficLightColorWithDuration.RedDur(5)
let d2 = TrafficLightColorWithDuration.RedDur(12)
let d3 = TrafficLightColorWithDuration.YellowDur(4)
let d4: TrafficLightColorWithDuration = TrafficLightColorWithDuration.RedDur(1)

func printColorWithDuration(_ c: TrafficLightColorWithDuration) {
    switch c {
    case .RedDur(let d):
        print("it's red: " + String(d))
    case .YellowDur(let someValue):
        print("it's yellow: " + String(someValue))
    case .GreenDur(let d):
        print("it's green: " + String(d))
    }
}

printColorWithDuration(d4)

// Binary Tree:
//   -Internal node, holding a left tree, a value, and a right tree
//   -Leaf a node, holding nothing
//
//   3
//  / \
// X   X

indirect enum BinaryTree {
    case InternalNode(BinaryTree, Int, BinaryTree)
    case Leaf
}

let tree = BinaryTree.InternalNode(BinaryTree.Leaf,
                                   3,
                                   BinaryTree.Leaf)

func sum(_ tree: BinaryTree) -> Int {
    switch tree {
    case .Leaf:
        return 0
    case .InternalNode(let leftTree, let value, let rightTree):
        return sum(leftTree) + value + sum(rightTree)
    }
}
