function filterLike(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (<<some condition involving element>>) {
            // do something
        }
    }
}

function sum(array) {
    return myReduce(array, 0, (accum, element) => accum + element);
    // let total = 0;
    // for (let index = 0; index < array.length; index++) {
    //     total = total + array[index];
    // }
    // return total;
}

function product(array) {
    return myReduce(array, 1, (accum, element) => accum * element);
    
    // let total = 1;
    // for (let index = 0; index < array.length; index++) {
    //     total = total * array[index];
    // }
    // return total;
}

function myReduce(array, accumulator, operation) {
    for (let index = 0; index < array.length; index++) {
        accumulator = operation(accumulator, array[index]);
    }
    return accumulator;
}
