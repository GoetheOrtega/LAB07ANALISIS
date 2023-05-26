public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);

        System.out.println("Number of nodes: " + bst.numberOfNodes());
        System.out.println("Depth of the tree: " + bst.getDepth(bst.getRoot()));
        System.out.println("Is BST? " + bst.isBST(bst.getRoot()));
        System.out.println("Minimum key: " + bst.getMin(bst.getRoot()).getKey());
        System.out.println("Maximum key: " + bst.getMax(bst.getRoot()).getKey());

        System.out.println("\nDeleting keys 2 and 9...");
        int[] keysToDelete = {2, 9};
        bst.deleteNodesWithKeys(keysToDelete);
        System.out.println("Number of nodes: " + bst.numberOfNodes());
        System.out.println("Depth of the tree: " + bst.getDepth(bst.getRoot()));
        System.out.println("Is BST? " + bst.isBST(bst.getRoot()));
        System.out.println("Minimum key: " + bst.getMin(bst.getRoot()).getKey());
        System.out.println("Maximum key: " + bst.getMax(bst.getRoot()).getKey());
    }
}
