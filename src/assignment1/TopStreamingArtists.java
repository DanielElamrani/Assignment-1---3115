/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Admin
 */
public class TopStreamingArtists {
    protected ArtistNode head;
    
    
    
    
    public void insert(String name){
        
        //we create a node and call its constructor, basically this is just holding the information for us
        ArtistNode node = new ArtistNode(name);
        
        //if head is null then we know our list is empty and we set the newly created node as our first node
        if(head==null){
            head = node;
        }
        
        //if the list is not empty and our first node has a value then we enter the else statement
        else{
            
            //we create a temporary node and set it equal to the firt node
            ArtistNode traverseNode = head;
            
            //we now traverse the list by entering a while loop that keeps iterating if the next node is not null
            while(traverseNode.next!=null){
                
                //we set our temp node to equal the next node only stopping when temp node gets a value of null. Once we get null, we know that we are at the last node
                //in the linked list and can exit the while loop.
                traverseNode = traverseNode.next;
            }
            
            //We have exited the while loop because tempNode.next returned null. We want our information to be stored in that location so we say the node that we first created
            //and its information is now going to be stored at the location. Traverse node hit the end of the list and said hey I know where the null is, im going to now point to the
            //the new node instead and the new node can then point to null because it wont have a next value
            traverseNode.next=node;
            
        }
        
        
    }
    
    
    public void displayList(){
        
        //We create a node to traverse our linked list, starting with the first node
        ArtistNode node = head;
        
        //while the next node isnt null, we print out the node
        while(node.next!=null){
            
            System.out.println(node);
            
            //once we've printed out the current node, we set our node equal to the next node.
            node=node.next;
            
        }
        
        //We need this because it stops printing when node.next has a null value which the end node will always have a null value so we must print the last node
        //after the while loop ends
        System.out.println(node);
        
        
    }
    
    public TopStreamingArtists(){
      head = null;
    }
    
    
    public boolean isEmpty(){
     return (head == null);
    }
    
    
    
}
