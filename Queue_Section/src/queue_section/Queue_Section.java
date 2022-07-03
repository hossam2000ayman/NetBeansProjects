/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_section;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Queue_Section {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        QueueC QC = new QueueC(6);

      QC.Enqueue(12);
      QC.Enqueue(13);
      QC.Enqueue(14);
      QC.Enqueue(15);
      QC.Enqueue(16);
      QC.Enqueue(17);
      
      QC.displayqueue();
      
      System.out.println("/////////////////////////////////////////");
      QC.Enqueue(19);
      QC.Dequeue();
      QC.Dequeue();
      QC.Dequeue();
      System.out.println("after enqueue 19 and dequeue 3 times the queue is as follow");
      QC.displayqueue();
      
      
      
    }

}
