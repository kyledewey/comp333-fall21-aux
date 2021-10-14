// functional programming
//   -No loops - forced to use recursion

// filter operation - grab elements that match a predicate
// predicate: function that takes a parameter and returns a boolean
/*function doFilter(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        // if inside of a for loop - hit yes
        if (<<some condition involving element>>) {
            // do something else
        }
    }
}

function doMap(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        // change element somehow
    }
}*/

function sum(array) {
    return doReduce(array, 0, (total, element) => total + element);
    // let total = 0;
    // for (let index = 0; index < array.length; index++) {
    //     total = total + array[index];
    // }
    // return total;
}

function product(array) {
    return doReduce(array, 1, (total, element) => total * element);
    // let total = 1;
    // for (let index = 0; index < array.length; index++) {
    //     total = total * array[index];
    // }
    // return total;
}

// accumlator: starting value
// operation: function (takes current accumulator and current array element),
//            returns the new accumulator

// > array.reduce((accum, element) => accum + element, 0)
// 28
// > array.reduce((accum, element) => (accum = accum + element), 0)
// 28
// > array.reduce((accum, element) => accum + 1, 0)
// 7
// > array.reduce((accum, element) => accum++, 0)
// 0
// > array.reduce((accum, element) => ++accum, 0)
// 7

function doReduce(array, accumulator, operation) {
    for (let index = 0; index < array.length; index++) {
        accumulator = operation(accumulator, array[index]);
    }
    return accumulator;
}
