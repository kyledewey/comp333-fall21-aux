//Rectangle = function (width, height) {
function Rectangle(width, height) {
    //this.__proto__ = Rectangle.prototype; // automatically done for you
    this.width = width;
    this.height = height;
}
//Rectangle.prototype = {}; // automatically done for you

Rectangle.prototype.getArea = function () {
    return this.width * this.height;
};

