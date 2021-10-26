function Rectangle(width, height) {
    this.width = width;
    this.height = height;
}
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
}
