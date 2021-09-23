// semicolon inference
function indirectWhile(func1, func2) {
    if(func1()) { 
	func2()
	indirectWhile(func1, func2)
    }
}

// func wrapAdd(func1: (Int) -> Int, num1: Int) -> ((Int) -> Int) { ... }
function wrapAdd(func1, num1) {
    let temp = newParam => {
        let param = newParam + num1
        return func1(param)
    }
    return temp
}

// from problem
// function returnParam(param) { return param; } 

// let f = wrapAdd(returnParam, 5); 
// let x = f(2); // x = 7 
// let y = f(3); // y = 8

function doFilter(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        if (<<something is true about the element>>) {
            // do something with the element
        }
    }
}

function doMap(array) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        let newElement = <<do something with element>>;
    }
}

// adds all elements in the array together
function sum(array) {
    return doReduce(array, 0, (accum, element) => accum + element);
    
    // let total = 0;
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     total = total + element;
    // }
    // return total;
}

// multiplies all elements in the array together
function product(array) {
    return doReduce(array, 1, (accum, element) => accum * element);
    
    // let total = 1;
    // for (let index = 0; index < array.length; index++) {
    //     let element = array[index];
    //     total = total * element;
    // }
    // return total;
}

function doReduce(array, accumulator, operation) {
    for (let index = 0; index < array.length; index++) {
        let element = array[index];
        accumulator = operation(accumulator, element);
    }
    return accumulator;
}
