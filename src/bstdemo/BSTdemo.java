package bstdemo;

public class BSTdemo {    
    public static void main(String[] args) {
        BST bst = new BST();
        
        // Insert values into the BST
        int[] valuesToInsert = {20, 15, 25, 12, 18, 30, 10, 14, 19, 27, 35, 13};
        for (int val : valuesToInsert) {
            bst.insertNode(val);
        }
        
        System.out.println("\n========================================\n");
        System.out.println("MAX Item = " + bst.findMax(bst.root));
        System.out.println("MIN Item = " + bst.findMin(bst.root));
        
        
        
        System.out.println("\n========================================\n");
        System.out.println("In-Order : ");
        
        //Print inOrder before Deleting
        bst.inOrder();
       
        System.out.print("\nSearching for '27': ");
        // Serach for the Node "27"
        bst.searchNode(27);
        
        System.out.println("\n========================================\n");
    
        
        // Delete the Node "27"
        bst.deleteNode(27);
        
        System.out.println("After Deleting '27' : ");
        System.out.println("\nUpdated In-Order: ");
        
        //Print inOrder after Deleting
        bst.inOrder();
        System.out.print("\nSearching for 27 again: ");

        // Serach AGAIN for the Node "27"
        bst.searchNode(27);
        System.out.println("\n========================================\n");
        
    }
}