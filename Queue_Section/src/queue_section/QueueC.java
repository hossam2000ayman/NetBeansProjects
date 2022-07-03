/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_section;

/**
 *
 * @author hp
 */
public class QueueC {

    private int arr[];
    private int maxsize;
    private int front;
    private int rear;

    public QueueC(int s) {
        maxsize = s;
        arr = new int[maxsize];
        rear = front = -1;
    }

    public boolean IsEmpty() {
        return (rear == -1 && front == -1);
//        if((front == -1) && (rear == -1)){
//            return true;
//        } else{
//            return false;
//        }
    }

    public boolean IsFull() {
        return (rear == maxsize - 1);
//        if(rear == maxsize-1){
//            return true;
//        } else{
//            return false;
//        }        

       // return ((rear+1)%maxsize ==front);  //in case of circular queue
        
    }

    public void Enqueue(int x) {
        //first must check if the queue is full
        if (IsFull()) {
            System.out.println("the queue is full cannot add another element");
        } else {
            if (front == -1) {
                front++; // that help me when to remove it //first output
                
                //front = 0;  only write in case od circular queue
            } else {
                rear++;// make input  increment by one 
                arr[rear] = x; //assign the value withthe first input
                
                //rear = (rear+1)%maxsize; //in case of circular queue
                //arr[rear] = x;
            }
        }
    }

    public void Dequeue() {
        if (IsEmpty()) {
            System.out.println("the queue is empty nothing to remove ");
        } else if (rear == front) {
            rear = front = -1;

        } else {                                                                 //dequeue()
            front++;//ignore the element and go to the next element ==> //  1,2,3,4,5,6          //nothing as it was remove
                                                                                  // ^          //^
                                                                                   //|          //|
                                                                               //old front   //new front
                                                                                          //front ++;
     //front = (front+1)%maxsize;
        }
    }
    public int front(){
        if(IsEmpty()){
           return  -1; 
        }else{
            return arr[front];
        }
    }
    
    
     public void displayqueue(){
         //make in normal queue
            if(IsEmpty()){  
               System.out.println("the queue is empty");
            }else{
                for(int i = front;i<=rear;i++){
                    System.out.println("element at "+i+" is: "+arr[i]);
                }
            }
         
         //make in circular queue
//        int i;
//        if(front <=rear){//normal
//            for(i = front;i<=rear;i++){
//                System.out.println(arr[i]);  //5aly balak ya hossam ana b3red msh 3ayez 2a7arak front wala rear 
//            }
//        }else{
//            //front>rear
//            i=front;
//            while(i<maxsize){
//                System.out.println(arr[i]);
//            i++;
//            }//case 1 from front to max size
//        
//            while(i<=rear){
//                System.out.println(arr[i]);
//            }//case 2 from zero to rear
//        }
            
        }
}
