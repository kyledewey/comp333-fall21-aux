// let rectanglePrototype = {
//     'getArea' : function() {
//         return this.width * this.height;
//     }
// };

// // constructor - need to call with new
// function Rectangle(width, height) {
//     // this: {}
//     this.width = width;
//     this.height = height;
//     this.__proto__ = rectanglePrototype;
// }

// Functions are objects
//
// Rectangle.prototype = {}; // done implicitly

function Shape() {}

function Rectangle(width, height) {
    // this.__proto__ = Rectangle.prototype; // done implicitly
    this.width = width;
    this.height = height;
}
Rectangle.prototype = new Shape();
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
}
Rectangle.prototype.getWidth = function() {
    return this.width;
}
