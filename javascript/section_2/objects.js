// JavaScript - prototype-based inheritance
//  look ma, no classes!
// much more expressive model than classes

// Constructors
// constructors make an object
// create objects with new, i.e., let r1 = new Rectangle(3, 4)

let getAreaMethod = function() {
    // for a method:
    // this - refers to the object the method is called on
    return this.width * this.height;
};

let rectanglePrototype = { 'getArea': getAreaMethod };

function Rectangle(width, height) {
    // for a constructor:
    // this - refers to the object being constructed
    this.width = width;
    this.height = height;
    this.__proto__ = rectanglePrototype;
    // this.getArea = function () {
    //     return this.width * this.height;
    // };
}

function doSomething() {
    for (x = 0; x < 3; x++) {
        console.log("hello");
    }
}
