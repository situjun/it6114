Pengjun Tao  800934811

instructers:
java Isort test.txt

I code this program on Windows 10 with jdk 8.Using jGrasp to compile the source file.

This program implement insertion sort algorithm.It need to read the data from txt file through command line,store and sort the numbers .
Then output the numbers into another file.
I create a InsertionSort function,it could sort float number and return them to main function.
Insertion sort is a stable algorithm.The algorithm will remove one element form the data collection,then find the location it belongs
within sorted collection and insert the number in target location.The algorithm will repeat the process many times until no orginal number remain.
There are two loops in it.The outer loop will run over all the numbers except the first,and the inner loop will be used to find the correct location. 

If the all of the input is reverse sorted,it will be worst case.The complexity will be жи(n*n).
If the all of the input is sorted,it will be best case,because the input data don't need to slide.The complexity will be жи(n).
And on average,the complexity is жи(n*n).We will find some sort algorithm will faster than it.

Because i couldn't predict the length of the array,so i use ArrayList to store the input numbers.
Using FileReader,BufferedReader to read data from txt file,using FileWriter to output the data into txt file.
I use split function to get all of the numbers(line.split(";")).What's more,try and catch block is necessary to avoid error.

My program is very easy to read and understand.The algorithm will have a good performance if the input list is small.Because it's 
a in-place algorithm,so the space requirements is minimal than others.But the performance of program may down quickly 
if the input list is huge,the average complexity is not good.

In this program,i use ArrayList and array to store/deal with the numbers.Because i don't know the size of input list,so ArrayList is a better choice.
In InsertionSort function,array is easier to operate than ArrayList.The algorithm need to loop through all the 
input and exchange the location,i could complete them easily when use array.