// equivalent to function below
// isLessThanFive = function (e) {
//     return e < 5;
// };

function isLessThanFive(e) {
    return e < 5;
}

// higher-order functions - come from functional programming
//
// higher-order functions / anonymous functions / lambdas / closures
//
// condition: function that takes a list element, returns a boolean value
function printSome(array, condition) {
    // condition = isLessThanFive (AKA, the function)
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (condition(element)) {
            // element = e
            console.log(element);
        }
    }
}

function printAllLessThanFive(array) {
    printSome(array, isLessThanFive);
    
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element < 5) {
    //         console.log(element);
    //     }
    // }
}

function printAllGreaterThan(array, value) {
    printSome(array, element => element > value);

    // equivalent to line above:
    // printSome(array,
    //           function (element) {
    //               return element > value;
    //           });

    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element > value) {
    //         console.log(element);
    //     }
    // }
}

function printAllNotEqual(array, value) {
    printSome(array,
              function (myElement) {
                  return myElement != value;
              });
    
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element != value) {
    //         console.log(element);
    //     }
    // }
}

function printAllWhichHaveLength7(array) {
    printSome(array,
              function (e) {
                  return e.length == 7;
              });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element.length == 7) {
    //         console.log(element);
    //     }
    // }
}

function printSomethingHardCase(array, value1, value2) {
    printSome(array,
              function (element) {
                  return element.someMethod(value1) == value2;
              });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element.someMethod(value1) == value2) {
    //         console.log(element);
    //     }
    // }
}   
