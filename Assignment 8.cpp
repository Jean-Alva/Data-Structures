#include <iostream>
using namespace std;

class LinkedList {
    private:
        struct Node {
            int data;
            Node* next;
        };
        Node* head;
    public:
        LinkedList() {
            head = nullptr;
        }
        LinkedList(const LinkedList& other){
            head = nullptr;
            Node* current = other.head;

            while (current != nullptr){
                append(current->data);
                current = current->next;
            }
        }
        ~LinkedList() {
            Node* current = head;
            Node* nextNode;
        
            while (current != nullptr){
                nextNode = current->next;
                delete current;
                current = nextNode;
            }
        }
        void append(int value){
            Node* newNode = new Node{value, nullptr};

            if(!head){
                head = newNode;
            }else{
                Node* temp = head;
                while (temp->next != nullptr){
                    temp = temp->next;
                }
                temp->next = newNode;
            }
        }
        void insert(int value, int position){
            Node* newNode = new Node{value, nullptr};

            if(position == 0){
                newNode->next = head;
                head = newNode;
                return;
            }
            Node* temp = head;
            for (int i = 0; i < position - 1 && temp != nullptr; i++){
                temp = temp->next;
            }
            if (temp == nullptr){
                cout << "Position out of range\n";
                delete newNode;
                return;
            }
            newNode->next = temp->next;
            temp->next = newNode;
        }
        void deleteValue(int value){
            if(!head) return;
            if(head->data == value){
                Node* temp = head;
                head = head->next;
                delete temp;
                return;
            }

            Node* current = head;
            Node* prev = nullptr;

            while (current != nullptr && current->data != value){
                prev = current;
                current = current->next;
            }
            if(current == nullptr){
                cout << "Value not found\n";
                return;
            }
            prev->next = current->next;
            delete current;
        }
        void print() const{
            Node* temp = head;

            while (temp != nullptr){
                cout << temp->data << " -> ";
                temp = temp->next;
            }
            cout << "NULL\n";
        }
    };
    int main(){
        LinkedList list;
        
        list.append(10);
        list.append(20);
        list.append(30);

        cout << "Original List:\n";
        list.print();

        list.insert(15, 1);
        cout << "After Insert (15 at position 1):\n";
        list.print();

        list.deleteValue(20);
        cout << "After Deleting 20:\n";
        list.print();

        LinkedList copyList = list;

        cout << "Copied List:\n";
        copyList.print();

        return 0;
    }