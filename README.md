# Assignment-1---3115
Assignment 1 for 3115 

My code is well commented and explains all implementaion details so in this README I will explain some of the design decisions and my reasoning. Firstly, the CSV file contained data that with commas, this presented a significant problem as the delimiter for CSV files is a comma. Being that that data contained within the CSV files was so short, I found the most effective way of remedying this issue was to edit the CSV file to remove any commas. Now, on a larger scale this solution may take more effort but with the project at hand I found manually editing the file to be optimal as there were only about 7 commas that had to be removed. 


My program starts off by reading in the CSV file and putting everything into a 2D array, essentially recreating the excel grid in my array. 
From there I isolated the Artist column and extracted the values and created Artist objects that had a counter as an instance variable.
I placed all the artists and the amount of times they appeared into a 1D array.
To solve the problem of getting the data into alphabetical order, I then inserted my array of artists into an arraylist and called a sort method which sorted my artists alphabetically ignoring case.

Lastly I implemented my own linked list and added the data from my sorted array list to the linked list I coded. 
I printed out to the console one report which consisted of the artists names and how many times they appeared
I then also printed out the linked list.

