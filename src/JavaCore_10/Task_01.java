package JavaCore_10;

public class Task_01 {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.crate(20);
        binaryTree.crate(14);
        binaryTree.crate(23);
        binaryTree.crate(11);
        binaryTree.crate(16);
        binaryTree.crate(22);
        binaryTree.crate(27);
        binaryTree.crate(5);
        binaryTree.crate(15);
        binaryTree.crate(18);
        binaryTree.crate(24);
        binaryTree.crate(150);
        binaryTree.crate(8);

        //Node node = new Node();
        Node find = binaryTree.find(20);
        //find.printNode(find.value);
        binaryTree.print(find, 1);
    }


}

