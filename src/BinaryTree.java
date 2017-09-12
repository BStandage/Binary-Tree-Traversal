import java.util.function.Consumer;

public class BinaryTree<T> {
    private BinaryNode<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(BinaryNode<T> r) {
        root = r;
    }

    public void preorder(Consumer<T> f) {
        if (root != null) {
            root.preorder(f);
        }
    }

    public void inorder(Consumer<T> f) {
        if (root != null) {
            root.inorder(f);
        }
    }

    public void postorder(Consumer<T> f) {
        if (root != null) {
            root.postorder(f);
        }
    }
}