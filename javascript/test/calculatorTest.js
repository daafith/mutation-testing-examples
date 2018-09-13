const assert = require('assert');
const calculator = require('../app/unsophisticatedCalculator')

describe('Calculator', function () {
    it('gives the square root of a positive number', function () {
        assert.equal(calculator.squareRoot(16), 4);
    });

    it('gives the square root of zero', function () {
        assert.equal(calculator.squareRoot(0), 0);
    });

    it('rejects a negative number', function () {
        assert.throws(() => {
            calculator.squareRoot(-1)
        }, (err) => err === 'I only deal with positive numbers');
    });
});