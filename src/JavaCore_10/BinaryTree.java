package JavaCore_10;

public class BinaryTree {
    Node root;

    public void crate(int value) {
        Node node = new Node();
        node.value = value;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node prev = null;
            while (true) {
                prev = current;
                if (value < prev.value) {
                    current = current.left;
                    if (current == null) {
                        prev.left = node;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        prev.right = node;
                        return;
                    }
                }
            }
        }
        return;
    }

    public Node find(int value) {
        Node current = root;
        while (current.value != value) {
            if (current.value < value) {

                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void print(Node startNode, int level) {
        if(startNode!=null){
            print(startNode.right, level+1);
            System.out.println("");
            if(startNode==root)
                System.out.print("Root-> ");
            for(int i=0;i<level&&startNode!=root;i++)
                System.out.print("       ");
            System.out.print(startNode.value+"< ");
            print(startNode.left, level+1);
        }
     }
}


