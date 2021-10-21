// constructor
// Rectangle = function(width, height) { ... }
function Rectangle(width, height) {
    // let this = {}; // happens implicitly
    this.width = width;
    this.height = height;
    this.getArea = function () {
        // in methods: `this` refers to the object we called
        // the method on
        return this.width * this.height;
    };
}
