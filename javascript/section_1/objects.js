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

let rectanglePrototype = {
    'getArea': function() {
        return this.width * this.height;
    }
};

function Rectangle(width, height) {
    // this: {}
    // in context of a constructor: `this` refers to the object
    // being constructed
    this.width = width;
    this.height = height;
    // this.getArea = function() {
    //     // in context of a method: `this` refers to the object
    //     // you called the method on
    //     return this.width * this.height;
    // };
    this.__proto__ = rectanglePrototype;
}

// prototype-based inheritance, in contrast to class-based inheritance
