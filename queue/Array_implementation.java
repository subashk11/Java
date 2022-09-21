package queue;

public class Array_implementation{
    public static void main(String[] args) {
        Queue queue=new Queue(1000);

        int i=1;
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);



        //To get the front of the queue
        System.out.println("\nThe front of the queue is : "+queue.front());

        //To get the rear of the queue
        System.out.println("\nThe rear of the queue is : "+queue.rear);

        //To dequeue
        System.out.println("\n"+queue.dequeue()+" Dequeued from the queue ");

    }
}
class Queue{

    //Declare the front,rear and size variable for the queue
    int front,rear,size;

    //Declare the capacity of the queue
    int capacity;

    //Create an array to store the items of the queue
    int array[];


    //Create a function to store the values
    public Queue(int capacity)
    {
        this.capacity=capacity;
        front=this.size-0;
        rear=capacity-1;
        array=new int[this.capacity];
    }

    //To check the queue is full
    boolean isFull(Queue queue)
    {
        return (queue.size==queue.capacity);
    }

    //To check the queue is empty
    boolean isEmpty(Queue queue)
    {
        return (queue.size==0);
    }

    //To add an item to the queue
    void enqueue(int item)
    {
        if(isFull(this)) return;
        this.rear=(this.rear+1)%this.capacity;
        this.array[this.rear]=item;
        this.size=this.size+1;

        System.out.println(item+" The item is enqueued to the queue");
    }

    //To get the first item in a queue
    int dequeue()
    {
        if (isEmpty(this)) return Integer.MIN_VALUE;

        int item=this.array[this.front];
        this.front=(this.front+1)%this.capacity;
        this.size=this.size-1;
        return item;
    }

    //To get the front of the queue
    int front(){
        if (isEmpty(this)) return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    //To get the last or rear of the queue
    int rear()
    {
        if(isEmpty(this)) return Integer.MIN_VALUE;

        return this.array[this.rear];
    }
}