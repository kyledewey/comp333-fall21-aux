// Running code interactively: REPL (read/eval/print/loop)

// higher-order functions: functions are data
// synonyms: anonymous functions

// printSome = function (array, operation) { ... };
// operation: function, takes one parameter, returns boolean value
function printSome(array, operation) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        let functionResult = operation(element);
        if (functionResult) {
            console.log(element);
        }
    }
}

function printAllLessThanFive(array) {
    let myFunction = function (element) {
        return element < 5;
    };
    printSome(array, myFunction);
    
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element < 5) {
    //         // Java: System.out.println(...)
    //         // C++: std::cout << ... << std::endl;
    //         console.log(element);
    //     }
    // }
}

function printAllGreaterThan(array, value) {
    // shorthand for:
    // function (element) {
    //   return element > value;
    // }
    printSome(array, element => element > value);

    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element > value) {
    //         console.log(element);
    //     }
    // }
}

function printAllNotEqual(array, value) {
    // x => x != value    is a synonym for...
    // function (x) {
    //   return x != value;
    // }
    printSome(array, x => x != value);
    
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element != value) {
    //         console.log(element);
    //     }
    // }
}
