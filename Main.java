import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        AVLTree tree1 = new AVLTree();
        tree1.setRoot(tree1.insert(tree1.getRoot(),0));
        tree1.setRoot(tree1.insert(tree1.getRoot(),1));
        tree1.setRoot(tree1.insert(tree1.getRoot(),2));
        tree1.setRoot(tree1.insert(tree1.getRoot(),3));
        tree1.setRoot(tree1.insert(tree1.getRoot(),4));
        tree1.setRoot(tree1.insert(tree1.getRoot(),5));
        tree1.setRoot(tree1.insert(tree1.getRoot(),6));
        tree1.setRoot(tree1.insert(tree1.getRoot(),7));
        tree1.setRoot(tree1.insert(tree1.getRoot(),8));
        tree1.setRoot(tree1.insert(tree1.getRoot(),9));
        tree1.setRoot(tree1.insert(tree1.getRoot(),10));
        tree1.setRoot(tree1.insert(tree1.getRoot(),11));
        tree1.setRoot(tree1.insert(tree1.getRoot(),12));
        tree1.setRoot(tree1.insert(tree1.getRoot(),13));
        tree1.setRoot(tree1.insert(tree1.getRoot(),14));

        System.out.println("In order traversal for tree 1: ");
        tree1.inOrderTraversal(tree1.getRoot());
        System.out.println("");
        System.out.println("Printing tree 1: ");
        tree1.print(tree1.getRoot());
        
        AVLTree tree2 = new AVLTree();
        tree2.setRoot(tree2.insert(tree2.getRoot(),15));
        tree2.setRoot(tree2.insert(tree2.getRoot(),16));
        tree2.setRoot(tree2.insert(tree2.getRoot(),17));
        tree2.setRoot(tree2.insert(tree2.getRoot(),18));
        tree2.setRoot(tree2.insert(tree2.getRoot(),19));
        tree2.setRoot(tree2.insert(tree2.getRoot(),20));
        tree2.setRoot(tree2.insert(tree2.getRoot(),21));
        tree2.setRoot(tree2.insert(tree2.getRoot(),22));
        tree2.setRoot(tree2.insert(tree2.getRoot(),23));
        tree2.setRoot(tree2.insert(tree2.getRoot(),24));
        tree2.setRoot(tree2.insert(tree2.getRoot(),25));
        tree2.setRoot(tree2.insert(tree2.getRoot(),26));
        tree2.setRoot(tree2.insert(tree2.getRoot(),27));
        tree2.setRoot(tree2.insert(tree2.getRoot(),28));
        tree2.setRoot(tree2.insert(tree2.getRoot(),29));

        System.out.println("In order traversal for tree 2: ");
        tree2.inOrderTraversal(tree2.getRoot());
        System.out.println("");
        System.out.println("Printing tree 2: ");
        tree2.print(tree2.getRoot());
        
        AVLTree tree3 = new AVLTree();
        tree3.setRoot(tree3.insert(tree3.getRoot(),30));
        tree3.setRoot(tree3.insert(tree3.getRoot(),31));
        tree3.setRoot(tree3.insert(tree3.getRoot(),32));
        tree3.setRoot(tree3.insert(tree3.getRoot(),33));
        tree3.setRoot(tree3.insert(tree3.getRoot(),34));
        tree3.setRoot(tree3.insert(tree3.getRoot(),35));
        tree3.setRoot(tree3.insert(tree3.getRoot(),36));
        tree3.setRoot(tree3.insert(tree3.getRoot(),37));
        tree3.setRoot(tree3.insert(tree3.getRoot(),38));
        tree3.setRoot(tree3.insert(tree3.getRoot(),39));
        tree3.setRoot(tree3.insert(tree3.getRoot(),40));
        tree3.setRoot(tree3.insert(tree3.getRoot(),41));
        tree3.setRoot(tree3.insert(tree3.getRoot(),42));
        tree3.setRoot(tree3.insert(tree3.getRoot(),43));
        tree3.setRoot(tree3.insert(tree3.getRoot(),44));

        System.out.println("In order traversal for tree 3: ");
        tree3.inOrderTraversal(tree3.getRoot());
        System.out.println("");
        System.out.println("Printing tree 3: ");
        tree3.print(tree3.getRoot());
        
        AVLTree tree4 = new AVLTree();
        tree4.setRoot(tree4.insert(tree4.getRoot(),45));
        tree4.setRoot(tree4.insert(tree4.getRoot(),46));
        tree4.setRoot(tree4.insert(tree4.getRoot(),47));
        tree4.setRoot(tree4.insert(tree4.getRoot(),48));
        tree4.setRoot(tree4.insert(tree4.getRoot(),49));
        tree4.setRoot(tree4.insert(tree4.getRoot(),50));
        tree4.setRoot(tree4.insert(tree4.getRoot(),51));
        tree4.setRoot(tree4.insert(tree4.getRoot(),52));
        tree4.setRoot(tree4.insert(tree4.getRoot(),53));
        tree4.setRoot(tree4.insert(tree4.getRoot(),54));
        tree4.setRoot(tree4.insert(tree4.getRoot(),55));
        tree4.setRoot(tree4.insert(tree4.getRoot(),56));
        tree4.setRoot(tree4.insert(tree4.getRoot(),57));
        tree4.setRoot(tree4.insert(tree4.getRoot(),58));
        tree4.setRoot(tree4.insert(tree4.getRoot(),59));

        System.out.println("In order traversal for tree 4: ");
        tree4.inOrderTraversal(tree4.getRoot());
        System.out.println("");
        System.out.println("Printing tree 4: ");
        tree4.print(tree4.getRoot());
        
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int number;
        AVLTree tree5 = new AVLTree();
        
        System.out.println("Enter 15 numbers for tree 5: ");
        
        while (size < 15){
            number = sc.nextInt();
            tree5.setRoot(tree5.insert(tree5.getRoot(),number));
            size++;
        }
        
        System.out.println("In order traversal for tree 5: ");
        tree4.inOrderTraversal(tree5.getRoot());
        System.out.println("");
        System.out.println("Printing tree 5: ");
        tree4.print(tree5.getRoot());
    }
}
