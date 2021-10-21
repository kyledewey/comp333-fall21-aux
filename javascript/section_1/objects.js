// functions
// higher-order functions
// methods
// constructors
//
// only distinction between these four things: context
// functions (or higher-order functions): called like: myFunction(1, 2)
// methods: obj.myFunction(...)
// constructors: new myFunction(...)

function add(first, second) {
    return first + second;
}

// let rectanglePrototype = {
//     'getArea': function() {
//         return this.width * this.height;
//     }
// };

function Shape() {}

// Rectangle.prototype = {}; // Implicitly happens
function Rectangle(width, height) {
    // this.__proto__ = Rectangle.prototype; // Implicitly happens
    this.width = width;
    this.height = height;
    // this.__proto__ = rectanglePrototype;
}
Rectangle.prototype = new Shape();
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
}

// prototype-based inheritance, in contrast to class-based inheritance
            
