// Rectangle.prototype = {}; // happens implicitly
function Rectangle(width, height) {
    // this.__proto__ = Rectangle.prototype; // happens implicitly
    this.width = width;
    this.height = height;
}
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
}
