public class AVLTree{
    private Node root;
    
    public AVLTree(){
        root = null;
    }
    
    //Node class for AVL tree
    class Node{
        private Node leftChild;
        private Node rightChild;
        int num;
        int height;
        int balance;
        
        public Node(int num){
            leftChild = null;
            rightChild = null;
            this.num = num;
            height = 1;
            balance = 0;
        }
    }
    
    //Inserts a number into the AVL tree and potentially rebalances it. Will not add number if it is already in tree.
     public Node insert(Node a, int num){
        if (a == null){
            return new Node(num);
        }
        
        if(num < a.num){
            a.leftChild = insert(a.leftChild,num);
        }
        else if(num > a.num){
            a.rightChild = insert(a.rightChild,num);
        }
        else
            return a;
            
        a.height = 1 + Math.max(getHeight(a.leftChild),getHeight(a.rightChild));        
        a.balance = getBalance(a);
        
        if (a.balance > 1 && num < a.leftChild.num){
            return rotateRight(a);
        }
        
        if (a.balance > 1 && num > a.leftChild.num){
            a.leftChild = rotateLeft(a.leftChild);
            return rotateRight(a);
        }
        
        if (a.balance < -1 && num > a.rightChild.num){
            return rotateLeft(a);
        }
        
        if (a.balance < -1 && num < a.rightChild.num){
            a.rightChild = rotateRight(a.rightChild);
            return rotateLeft(a);
        }
        
        return a;
    }
    
    //Deletes a number from the AVL tree and potentially rebalances it.
    public Node delete(Node a, int num){
        if (a == null){
            return a;
        }
        
        if (num < a.num){
            a.leftChild = delete(a.leftChild,num);
        }
        
        else if (num > a.num){
            a.rightChild = delete(a.rightChild,num);
        }
        
        else{
            if (a.leftChild != null && a.rightChild != null){
                Node b = minNode(a.rightChild);
                a.num = b.num;
                a.rightChild = delete(a.rightChild,b.num);
            }
            else if (a.leftChild == null && a.rightChild != null){
                a = a.rightChild;
            }
            else if (a.leftChild != null && a.rightChild == null){
                a = a.leftChild;
            }
            else if(a.leftChild == null && a.rightChild == null){
                a = null;
            }
        }
        
        if (a == null)
            return a;
            
        a.height = Math.max(getHeight(a.leftChild),getHeight(a.rightChild));
        a.balance = getBalance(a);
        
        if(a.rightChild != null)
            a.rightChild.balance = getBalance(a.rightChild);
            
        if (a.leftChild != null)
            a.leftChild.balance = getBalance(a.leftChild);
        
        if (a.balance > 1 && a.leftChild.balance >= 0){
            return rotateRight(a);
        }
        
        if (a.balance > 1 && a.leftChild.balance < 0){
            a.leftChild = rotateLeft(a.leftChild);
            return rotateRight(a);
        }
        
        if (a.balance < -1 && a.rightChild.balance <= 0){
            return rotateLeft(a);
        }
        
        if (a.balance < -1 && a.rightChild.balance > 0){
            a.rightChild = rotateRight(a.rightChild);
            return rotateLeft(a);
        }
        
        return a;
    }
    
    //Returns the minimum node in the tree
    public Node minNode(Node a){
        Node temp = a;
        while(temp.leftChild!= null){
            temp = temp.leftChild;
        }
        return temp;
    }
    
    //Rotates a tree to the right
    public Node rotateRight(Node a){
        Node b = a.leftChild;
        a.leftChild = b.rightChild;
        b.rightChild = a;
        a.height = 1 + Math.max(getHeight(a.leftChild),getHeight(a.rightChild));
        b.height = 1 + Math.max(getHeight(b.leftChild),getHeight(b.rightChild));
        return b;
    }
    
    //Rotates a tree to the left
    public Node rotateLeft(Node a){
        Node b = a.rightChild;
        a.rightChild = b.leftChild;
        b.leftChild = a;
        a.height = 1 + Math.max(getHeight(a.leftChild),getHeight(a.rightChild));
        b.height = 1 + Math.max(getHeight(b.leftChild),getHeight(b.rightChild));
        return b;
    }
    
    //Returns the balance of a tree
    public int getBalance(Node a){
        if (a == null){
            return 0;
        }
        
        return getHeight(a.leftChild) - getHeight(a.rightChild);
    }
   
    //Performs an in order traversal and prints the number on each node visit.
    public void inOrderTraversal(Node a){
        if (a == null)
            return;
        
        inOrderTraversal(a.leftChild);
        System.out.print(a.num + " ");
        inOrderTraversal(a.rightChild);
    }
    
    //Returns the node with the number. Will return null if it is not in the tree.
    public Node lookup(int num, Node a){
        if (a == null)
            return null;
        if (a.num == num){
            return a;
        }
        else if (num < a.num){
            return lookup(num,a.leftChild);
        }
        else {
            return lookup(num,a.rightChild);
        }
    }
    
    //Prints all nodes in the tree
    public void print(Node a){
        if (a == null){
            return;
        }
        
        System.out.println("(" + a + ", " + a.num + ", " + a.leftChild + ", " + a.rightChild + ")");
        print(a.leftChild);
        print(a.rightChild);
    }
    
    //Returns the height of a tree
    public int getHeight(Node a){
        if (a == null)
            return 0;
        return a.height;
    }
    
    //Returns the root of the tree
    public Node getRoot(){
        return root;
    }
    
    //Sets the root of the tree
    public void setRoot(Node a){
        root = a;
    }
}

