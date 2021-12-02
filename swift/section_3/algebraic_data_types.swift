// algebraic data type definition: enum
// TrafficLightColor is a type
// It can be red, yellow, or green
enum TrafficLightColor {
    case Red(Int)
    case Yellow(Int)
    case Green(Int)
}

let c: TrafficLightColor = TrafficLightColor.Red(5);

// switch: pattern matching
switch c {
case .Yellow(let theInt):
    print("It's yellow: " + String(theInt))
case .Green(let x):
    print("It's green: " + String(x))
case .Red(let theInt):
    print("It's red: " + String(theInt))
}

// Binary Trees
// -Internal node: Two subtrees, a value
// -Leaf node: empty

// class Node {
//   public final Node left;
//   public final int value;
//   public final Node right;
//   ...
// }

indirect enum BinaryTree {
    case InternalNode(BinaryTree, Int, BinaryTree)
    case Leaf
}

//   3
//  / \
// X   X
let tree1 = BinaryTree.InternalNode(BinaryTree.Leaf, 3, BinaryTree.Leaf)

//   3
//  / \
// 2   4
//
let tree2 = BinaryTree.InternalNode(BinaryTree.InternalNode(..., 2, ...),
                                    3,
                                    BinaryTree.InternalNode(..., 4, ...))

tree2.sum()


// Swift code
// switch list {
// case .Cons(_, .Cons(2, _)):
// }
//
// Java equivalent:
// if (list instanceof Cons &&
//     ((Cons)list).tail instanceof Cons &&
//     ((Cons)((Cons)list).tail).head == 2) {
    
    
