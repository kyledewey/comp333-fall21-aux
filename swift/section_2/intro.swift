// Classically, functional languages were academic
// Classically, type inference was academic

// Statically-typed language, but type-inferred

var myVariable = 5 // myVariable inferred to be type Int
// myVariable = "foo" // myVariable is of type Int, can't be a String
// print(myVariable)

// public static int multiply_two(int first, int second) { ... }
func multiply_two(_ first: Int, second: Int) -> Int {
    return first * second
}

let temp: Character = "a"
//print(temp)
//print("alpha")

// semicolon inference

var result = multiply_two(3, second: 4)
result = 42
//print(result)

func sub(_ a: Int, _ b: Int) -> Int {
	return a - b
}

//print(sub(4, 5))

let tempFunction: (Int, Int) -> Int = sub;
print(tempFunction(3, 4))

// let tempFunction2 = (a, b) => a + b; // JavaScript equivalent
let tempFunction2: (Int, Int) -> Int = { (a, b) in a + b };
print(tempFunction2(5, 6));
