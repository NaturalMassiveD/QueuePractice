/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teel6
 */
public interface QueueInterface {
    public boolean isEmpty();
   public void enqueue(Object obj);
   public Object dequeue();
   public void dequeueAll();
   public Object peek();

}
