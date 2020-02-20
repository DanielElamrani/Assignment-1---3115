package assignment1;

import java.io.*;
import java.util.*;


public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //Create file and its pathway
        File inputData = new File("C:\\Users\\Admin\\Desktop\\Random pdf's\\usethisone-regional-global-weekly.csv");
        
        //create scanner
        Scanner sc = new Scanner(inputData);
        
        
        //String that will hold the value from each line of our data.
        String line="";
        
        //This will be used later for the below Artist array
        int artistCountIndex = 0;
        
        
        //This is going to be the array we use to count the number of times artists appear in the data
        Artist[] artistCountArr = new Artist[200];
        
        
        //This is the 2D array we will be putting all of our input data into.
        String[][] allDataArr = new String[200][5]; 
        
        //this will be used in our for loop to place the data into the correct array indices
        int allDataArrRowIndex = 0;
        
        //While loop to read in our data and place into our 2D array
        while (sc.hasNextLine()){
            
            //This String holds a line of our data
            line = sc.nextLine();
            
            
            //This String array will take our line and split it up by the delimiter "," and place everything into between the commas into an array index
            String[] results = line.split(",");
            
            //This for loop takes our String array which has 5 elements, as there are 5 pieces of data in each line separated by commas,
            //and places them into our 2D array in a grid like fashion.
            for (int i = 0; i<5; i++){
                
                allDataArr[allDataArrRowIndex][i] = results[i];
                
            }
            
            //We use this variable to increment the row as we know we have 5 columns of data and only the row will be changing continusouly for each iteration.
            allDataArrRowIndex++;
    
        }//Exit while loop
        
        //This for loop will take our artist column in the 2D array and create Artist Objects
        for (int i = 0; i<200;i++){
            
            //We make a new artist from our artist column
            Artist newArtist = new Artist(allDataArr[i][2]);
            
            //We check our Artist Count Array to see if the new Artist has already been placed on the list, only checking if the Array index has an element
            for(int a=0;a<200;a++){
                
                
                if(artistCountArr[a]!=null){
                
                    //If the artist's name that is in the current index matches the newly created artist object we do not add that artist in again, we just increase the counter
                    //for that artist using the uptick method in the Artis class and the alreadyIn method to set alreadyIn to true.
                    if(artistCountArr[a].name.equalsIgnoreCase(newArtist.name)){
                        artistCountArr[a].uptick();
                        artistCountArr[a].alreadyIn=true;
                        newArtist.alreadyIn=true;
                    }
                    
                }
            }
        
                       
            //if we get here it turns out the new artist object isnt already in the Artist Count Array, alreadyIn will be set to false and we enter this if statement
            if (newArtist.alreadyIn==false){
                
                //We add the new Artist into our Artist Count Array
                artistCountArr[artistCountIndex] = newArtist;
              
                //This variable keeps track of our index for this array.
                artistCountIndex++;
            }
  
        }
        
        
        //Prints out the artists and how many times they appeared
        for (int i = 0;i<200;i++){
            
            if(artistCountArr[i]!=null)
            System.out.println(artistCountArr[i].toString());
            
        }
        
        //putting artists names into array list to sort, then creating linked list and adding from the sorted array list
        ArrayList<String> sortedArrList = new ArrayList<String>();
        
        for (int i = 0;i<artistCountIndex;i++){
            
            sortedArrList.add(artistCountArr[i].name);
            
        }
        
        //This sorts my array list by alphabetical order and ignores the case.
        Collections.sort(sortedArrList, String.CASE_INSENSITIVE_ORDER);
        
        System.out.println();
        System.out.println();
        System.out.println("List sorted in alphabetical order");
        System.out.println();
        
        //instantiate my linked list object
        TopStreamingArtists list = new TopStreamingArtists();
        
        //I call my insert method and insert the items from the array list
        for (int i = 0;i<artistCountIndex;i++){
            
            list.insert(sortedArrList.get(i));
            
            
        }
        
        //I call the display method to print out the artists
        list.displayList();
        
        

            
    }
    
}
