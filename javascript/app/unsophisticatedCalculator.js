function squareRoot(number) {
    if (number < 0) {
        throw 'I only deal with positive numbers';
    }
    return Math.sqrt(number);
}

module.exports.squareRoot = squareRoot;