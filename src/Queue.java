/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teel6
 */
public class Queue implements QueueInterface {
     Stack<Object> stack1;
   Stack<Object> stack2;
  
   
    public Queue(){
   stack1=new Stack<>();
   stack2=new Stack<>();
   }
   
     
     @Override
       public void enqueue(Object data){
        
       }
    
         @Override
    public Object dequeue(){
    }
    
     @Override
    public boolean isEmpty(){
    }
    
     @Override
    public void dequeueAll(){
    }
    
     @Override
    public Object peek(){
    }
    
//display all items in the queue:
    public void display(){
        for(int i=0; i < stack1.size(); i++){
            System.out.println(stack1.get(i));
        }
        for(int i=0; i < stack2.size(); i++){
            System.out.println(stack2.get(i));
        }
    }
    
}

