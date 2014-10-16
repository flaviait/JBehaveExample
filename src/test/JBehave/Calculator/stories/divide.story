Narrative: Math divide 2 numbers
    As a Math
    I want to divide two numbers
    In order to get the result

Scenario: First number is greater than second number
Given the first number is twenty
And the second number is five
When the first number is divided by the second number
Then the result should be returned four

Scenario: Second number is zero
Given the first number is twenty
And the second number is zero
When the first number is divided by the second number (zero)
Then the result should be return infinity