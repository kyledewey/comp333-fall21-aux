// function filterLike(array) {
//     for (let index = 0; index < array.length; index++) {
//         let element = array[index];
//         if (<<some condition involving element>>) { // element > 5
//             // do something with the element
//         }
//     }
// }

// function mapLike(array) {
//     for (let index = 0; index < array.length; index++) {
//         let element = array[index];
//         let newElement = <<some expression involving element>>;
//     }
// }

// accumulator = total
// operation: function that takes the current accumulator,
//            and the current array element, returns the new
//            accumulator
function myReduce(array, operation, accumulator) {
    for (let index = 0; index < array.length; index++) {
        accumulator = operation(accumulator, array[index]);
    }
    return accumulator;
}

// adds all array elements together
function sum(array) {
    let func = function (accum, element) {
        return accum + element;
    };
    return myReduce(array, func, 0);

    //return myReduce(array, (accum, element) => accum + element, 0);

    // let total = 0;
    // for (let index = 0; index < array.length; index++) {
    //     total = total + array[index];
    // }
    // return total;
}

// multiplies all array elements together
function product(array) {
    return myReduce(array, (accum, element) => accum * element, 1);
    
    // let total = 1;
    // for (let index = 0; index < array.length; index++) {
    //     total = total * array[index];
    // }
    // return total;
}
