package assignment1;

//Artist class
public class Artist {
    protected String name="";
    protected int counter=1;
    protected boolean alreadyIn=false;
    
    
    
    //constructor
    public Artist (String nameOfArtist){
        
        this.name=nameOfArtist;
        
    }
    
    //increases counter by 1
    public void uptick(){
        
        this.counter++;
        
    }
    
    //sets already in to true
    public void alreadyIn(){
        
        this.alreadyIn = true;
    }
    
    @Override
    public String toString(){
        
        return name + " appeared " + counter + " times.";
        
    }
    
}