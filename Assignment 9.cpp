#include <iostream>
using namespace std;

class Stack {
    private:
        int arr[100];
        int top;
    public:
    Stack(){
        top = -1;
    }
    void push(int value){
        if(top == 99){
            cout << "Stack Overflow\n";
            return;
        }
        arr[++top] = value;
    }
    void pop(){
        if (top == -1){
            cout << "Stack Underflow\n";
            return;
        }
        cout << "Stack elements: ";
        for (int i = 0; i <= top; i++){
            cout << arr[i] << " ";
        }
        cout << endl; 
    }
    void display(){
        if(top == -1){
            cout << "Stack is empty\n";
            return;
        }
        cout << "Stack elements: ";
        for(int i = 0; i <= top; i++){
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};
int main(){
    Stack s;

    s.push(5);
    s.push(10);
    s.push(15);

    s.pop();
    s.push(20);
    s.pop();

    s.display();

    return 0;
}