class Calculator
  # Assumes that -0.0 is equal to 0.0, which is mathematically true
  def self.squareRoot(input)
    if (input < 0)
      raise 'I only deal with positive numbers'
    end
    Math.sqrt(input)
  end
end
