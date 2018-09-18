class Calculator
  def self.squareRoot(input)
    if (input.to_s.start_with?('-'))
      raise 'I only deal with positive numbers'
    end
    Math.sqrt(input)
  end
end
