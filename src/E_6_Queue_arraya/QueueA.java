package E_6_Queue_arraya;

public class QueueA {
    int front;
    int rear;
    private int[] queueArray;

    QueueA() {
    }

    public void create(int size) {
        this.queueArray = new int[size];
        front = -1;
        rear = -1;
        System.out.println("Queue created successfully");
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("queue overflow");
            return;
        }
        rear = (rear + 1) % queueArray.length;
        queueArray[rear] = data;
        if (front == -1)
            front = 0;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        if (front == rear) {
            int temp = queueArray[front];
            front = -1;
            rear = -1;
            return temp;
        }

        int temp = queueArray[front];
        front = (front + 1) % queueArray.length;
        return temp;
    }

    public boolean isEmpty() {
        return ((front == -1) && (rear == -1));
    }

    public boolean isFull() {
        return (rear + 1) % queueArray.length == front;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return queueArray[front];
        }


    }

    public void print() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {

            int f = front, r = rear;
            while (f != r) {
                System.out.println(queueArray[f]);
                f = (f + 1) % queueArray.length;
            }
            System.out.println(queueArray[rear]);
        }
    }
}
