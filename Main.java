import java.util.*;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}
class BinaryTree{
    Node root;

    Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        } else{
            root.right = insert(root.right, data);
        }
        return root;
    }
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return search(root.left, key);
        }
        else{
             return search(root.right, key);
        }
    }
    int minValue(Node root){
        int minv = root.data;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    Node delete(Node root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = delete(root.left, key);
        } else if(key > root.data){
            root.right = delete(root.right, key);
        } else{
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    void display(Node root, int level){
        if(root == null) return;

            display(root.right, level + 1);

            System.out.println(root.data);
            for(int i = 0; i < level; i++){
                System.out.print("    ");
            }
            display(root.left, level + 1);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        if(n < 8){
            System.out.println("Please enter at least 8 nodes.");
            return;
        }

        System.out.println("Enter the nodes:");
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            tree.root = tree.insert(tree.root, data);
        }
        System.out.println("\n123Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);

        System.out.println("\nEnter a key to search:");
        int key = sc.nextInt();

        if(tree.search(tree.root, key)){
            System.out.println("Key found in the tree.");
        } else{
            System.out.println("Key not found in the tree.");
        }
        System.out.println("Enter a key to delete:");
        int insertValue = sc.nextInt();
        tree.root = tree.delete(tree.root, insertValue);

        System.out.println("Tree after deletion:");
        tree.display(tree.root, 0);

        sc.close();
    }
}