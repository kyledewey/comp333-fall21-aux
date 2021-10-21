// constructor
// Rectangle = function(width, height) { ... }

let rectanglePrototype = {
    'getArea': function () {
        return this.width * this.height;
    }
};

function Rectangle(width, height) {
    // let this = {}; // happens implicitly
    this.width = width;
    this.height = height;
    this.__proto__ = rectanglePrototype;
    // this.getArea = function () {
    //     // in methods: `this` refers to the object we called
    //     // the method on
    //     return this.width * this.height;
    // };
}
