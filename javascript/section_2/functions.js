// head of higher-order functions / anonymous functions / lambdas / closures: hit yes

// comparison: function
function printSome(array, comparison) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (comparison(element)) {
            console.log(element);
        }
    }
}

function printAllLessThanFive(array) {
    // e => e < 5 does the same thing as:
    // function (e) {
    //   return e < 5;
    // }
    
    printSome(array, e => e < 5);
    
    // printSome(array,
    //           function (e) {
    //               return e < 5;
    //           });

    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element < 5) {
    //         console.log(element);
    //     }
    // }
}

function printAllGreaterThan(array, value) {
    printSome(array,
              function (currentElement) {
                  return currentElement > value;
              });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element > value) {
    //         console.log(element);
    //     }
    // }
}

function printAllNotEqual(array, value) {
    printSome(array,
              function (element) {
                  return element != value;
              });
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     if (element != value) {
    //         console.log(element);
    //     }
    // }
}
