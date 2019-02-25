/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teel6
 */
public class QueueTest {
    public static void main(String[] args){
      Queue q=new Queue();
      //add 10 customers to the queue and show the items of the queue
      //e.g., q.enqueue("Maria");
      q.enqueue("Allen");
      q.enqueue("Bob");
      q.enqueue("Carl");
      q.enqueue("Dan");
      q.enqueue("Eddy");
      q.enqueue("Fred");
      q.enqueue("George");
      q.enqueue("Harvey");
      q.enqueue("Isabelle");
      q.enqueue("Jack");
      //dequeue three times  and show the items of the queue
      for(int i=0; i < 2; i++){
          q.dequeue();
          System.out.println(q);
      }
      //dequeue all and show the items of the queue
      
    }

}
