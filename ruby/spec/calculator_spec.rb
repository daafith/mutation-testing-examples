require "calculator"

describe Calculator do

  describe ".squareRoot" do
    context "given a positive number" do
      it "returns the square root" do
        expect(Calculator.squareRoot(16.0)).to eql(4.0)
      end
    end

    context "given a zero" do
      it "returns the square root" do
        expect(Calculator.squareRoot(0.0)).to eql(0.0)
      end
    end
  
    context "given a negative number" do
      it "raises an error" do
        expect { Calculator.squareRoot(-1.0) }.to raise_error("I only deal with positive numbers")
      end
    end
  end

end
