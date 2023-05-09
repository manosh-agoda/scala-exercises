# scala-exercises
1. Use a trait to define a generic queue of strings with 'put' and 'get' methods, and create a class that implements it using an array. Include tests.
2. Starting from the previous exercise, use a stackable trait to modify the behavior of 'put' so it reverses each string (e.g. hello to olleh) before adding it to the queue. Include tests.
3. Write the ~= operator for comparing doubles. The operator should return true iff 2 doubles are equal up to a small constant. The constant should be configurable but also have a default. (hint: use implicit parameter) Include tests.
4. Implement GCD in Scala (hint: use tail recursion)
5. Write a clause that measures the run time of a block of code and prints it (also needs to return the original output of the block)
6. Given a string containing words separated by space, find:
  <br>a. The longest word
  <br>b. The most common word
  <br>c. The most common letter
  <br>d. Create a map from letter to a set of words it appears in
7. Convert a list of strings to a list of all the characters in all the strings
