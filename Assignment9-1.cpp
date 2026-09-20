#include <iostream>
using namespace std;

class Queue {
    private:
        int arr[100];
        int front, rear;
    public:
        Queue() {
            front = 0;
            rear = -1;
        }
        void enqueue(int x) {
            if (rear == 99) {
                cout << "Queue is full!" << endl;
            }
            arr[++rear] = x;
        }
        void dequeue() {
            if (front > rear) {
                cout << "Queue is empty!" << endl;
                return;
            }
            cout << "Dequeued: " << arr[front++] << endl;
        }
        void display() {
            if (front > rear) {
                cout << "Queue is empty!" << endl;
                return;
            }
            cout << "Queue: ";
            for (int i = front; i <= rear; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
        }
};
int main() {
    Queue q;
    q.enqueue(9);
    q.enqueue(6);
    q.enqueue(9);
    
    q.dequeue();
    q.enqueue(12);
    q.dequeue();

    q.display();
    
    return 0;
}