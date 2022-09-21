package Dequeue;

public class Array_implementation {
    static class dequeue{
        int arr[];
        int size,capacity;
        dequeue(int d)
        {
            arr=new int[d];
            size=0;
            capacity=d;
        }

        boolean isFull()
        {
            if(size==capacity) return true;
            else return false;
        }

        boolean isEmpty()
        {
            if(size==0) return true;
            else return false;
        }

        void insertRear(int d)
        {
            if(isFull()) return ;
            arr[size]=d;
            size++;
        }

        void deleteRear()
        {
            if(isEmpty()) return;
            size--;
        }

        void insertBegin(int d)
        {
            if (isFull()) return ;
            for(int i=size-1;i>=0;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[0]=d;
            size++;
        }

        void deleteBegin()
        {
            if (isEmpty()) return ;
            for (int i = 0; i < size-1; i++) {
                arr[i]=arr[i+1];
            }
            size--;
        }

        void getFront()
        {
            System.out.println(arr[0]);
        }

        void getRear()
        {
            System.out.println(arr[size-1]);
        }

        void printDequeue()
        {
            System.out.println("The array is :");
            for(int i=0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        dequeue dq=new dequeue(6);
        dq.insertBegin(5);
        dq.insertBegin(4);
        dq.insertRear(6);
        dq.insertRear(8);
        dq.insertRear(7);
        dq.getFront();
        dq.getRear();
        dq.deleteRear();
        dq.deleteBegin();
        dq.printDequeue();
    }

}
