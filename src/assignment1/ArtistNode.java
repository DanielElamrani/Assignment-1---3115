
package assignment1;


//Artist node
public class ArtistNode {
    protected String name;
    protected ArtistNode next;


    //no arg constructor
    public ArtistNode(){
    
    }
    
    //arg constructor
    public ArtistNode (String name){

        this.name = name;
        this.next = null;
    }
    
    public String toString(){
        
        return name;
        
        
    }
    
    
    
    
}