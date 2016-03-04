# CSC 200 Work
Assignments and work for Kamal Kamal CSC 200 (Copy at your own risk!)
Taught at Northern Virginia Community College Alexandria Campus.

##Assignment # 2
Write a Java program to convert degrees Celsius to Fahrenheit, and also convert degrees Fahrenjeit to Celsius. Use data type double for your input and output data.

##Assignment # 3
A movie theater charges its customers for each film in accordance with the following rules:
If the age entered is 12 or under, the program should display “Charge = $10.00”
If the age entered is 13 or older, the program should display “Charge = $25.00”
Seniors (age 65 or older) are given a 25% discount.
However, if the time is earlier than 5, the charge should be $10.00 regardless of age.
One exception: If the movie is part of a film festival, the charge will be $15.00 per seat regardless of age or time (hint: use a Boolean variable for this).
Write a Java program that will allow the user to enter the values for integer variables age and time. An additional Boolean variable will be required to indicate if the movie in question is part of a film festival. The program should contain logic that will process the input and print (display) the correct output (i.e., the amount to be charged):

##Assignment # 4
Develop and test a Java program as follows:
Present the user with a menu to convert the following:
1. Ounces  to grams 
2. grams to ounces
3. pounds to kilograms
4. kilograms to pounds
5. feet to meters
6. meters to feet
7. miles to kilometers
8. kilometers to miles

Use a Java switch statement to determine the user's input and perform the conversion according to the conversion factors shown below. The program should display each instance (input data and output string).
Use int data type for the menu selections. use double data types for the conversion units.
* 1 ounce = 28.375 grams
* 1 gram = 0.035 ounces
* 1 pound = 0.454 kilograms
* 1 kilogram = 2.204 grams
* 1 mile = 1.6 kilometers
* 1 kilometer = 0.6 miles
* 1 foot = 0.3 meters
* 1 meter = 3.3 feet

##Assignment # 5 (Looping)
(a) Write and run a Java program using a while repetition structure that will add a series of numbers (integers) with the following parameters:
Starting number is the variable FIRST (inclusive)
Ending number is the variable LAST (inclusive or exclusive, depending on DELTA))
Interval between numbers is the variable DELTA (integer)
Sum of the integers is SUM (integer)
Assume all integers are positive and LAST > FIRST.

Test your program with the following data:
* FIRST     LAST      DELTA
* 1         100         1
* 0         100         2
* 0         10          5

(b)  Write a second Java program for the above problem using a for loop

##Assignment 6
[This assignment is a variation on Assignment 4]
Develop and test a Java program as follows:
Present the user with a menu to convert the following:
1. Ounces  to grams 
2. grams to ounces
3. pounds to kilograms
4. kilograms to pounds
5. feet to meters
6. meters to feet
7. miles to kilometers
8. kilometers to miles
Use a Java switch statement to determine the user's input and perform the conversion according to the conversion factors shown below. The program should display each instance (input data and output string). Add a do ... while structure around the switch structure allowing the user to repeat the program as many times as needed. Allow for a menu item (usually the last menu item) for the user to exit the program.
Use int data type for the menu selections. use double data types for the conversion units.
* 1 ounce = 28.375 grams
* 1 gram = 0.035 ounces
* 1 pound = 0.454 kilograms
* 1 kilogram = 2.204 grams
* 1 mile = 1.6 kilometers
* 1 kilometer = 0.6 miles
* 1 foot = 0.3 meters
* 1 meter = 3.3 feet

##Assignment # 7
Develop and run a Java program to satisfy the following requirement:
A landscaping company sends employees to various sites (e.g. parks, school grounds, golf courses, etc). These sites will contain a variable number of land segments (plots) having one of 4 shapes:  Square, rectangle, triangle, or circle. There may be more than one plot of the same shape, and the plots vary in size. Employees will need to run a program (the one you are writing) on a portable computer as they survey the site and perform determine the total area of all the plots at the site. The result will be used to determine the amount of soil, mulch, grass seed, and other landscaping materials that will be needed to maintain the site.  The program should adhere to the following characteristics:
Use individual methods throughout to compute areas of the different shapes
The user should be presented with a menu of choices (including an exit)
The user should be prompted to input the necessary dimensions of the respective geometric shape in question.
Present the source code and evidence of output.

##Assignment #8 (Two Programs)
Program A. Develop a program containing 4 separate Java methods to perform the following on a one-dimensional integer array LIST of dimension N:
* Determine (i.e. “return”) the highest value in LIST.
* Determine (i.e. “return”) the lowest value in LIST.
* Determine (i.e. “return”) the sum of all the items in LIST.
* Determine (i.e. “return”) the average of the values in LIST after eliminating the lowest and the highest values. This method should invoke some or all of the other 3 methods.
Program B.  Develop a Java program that will add the corresponding elements of two 1-dimensional arrays X and Y to produce the 1-dimensional array Z.  Arrays X, Y, Z have the same dimension [M].              
NOTE: In the above programs, you will need to have the user input the dimensions of the respective arrays before execution of the methods. Also, output the results of all computations.

##Assignment # 9
Develop a program to perform a binary search on a one-dimensional integer array LIST of dimension N. You should develop an independent search method (call it BinSearch), and write your program so that the BinSearch method is invoked from your main program or another method. The BinSearch method should accept a search key parameter and return a Boolean value (Success). Maintain a count of the number of comparisons attempted during the execution of the method. Assume the array is already sorted in ascending order, and that there are no duplicate entries. Use a while loop for the binary search.
Repeat the above assignment using a recursive method for the binary search instead of the while loop.
Repeat the above to perform a sequential search on the same array.
In each of the above cases, maintain a count of the number of iterations needed to perform the different search functions on the same array.
I all cases, remember to include the condition when a search key is NOT found in the array.

##Assignment # 10
Develop a Java program containing 2 methods (other than main) to perform a sort on a one-dimensional integer array myArray of dimension N:
* Method 1. Using a simple selection sort
* Method 2. Using a bubble sort.   
In each of the above cases, maintain a count of the number of passes needed to perform the different sorts on the same array.
Bonus: Find a sort that is more efficient (i.e. requires less passes on average) than the above sort algorithms, and write a method to perform the sort on myArray.
