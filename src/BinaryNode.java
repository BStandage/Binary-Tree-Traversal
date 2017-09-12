import java.util.function.Consumer;

class BinaryNode<T> {
    private T data;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode(T d, BinaryNode<T> l, BinaryNode<T> r) {
        data = d;
        left = l;
        right = r;
    }

    public void preorder(Consumer<T> f) {

        if (f != null) {

            f.accept(this.data);

            if (this.left != null)
                this.left.preorder(f);

            if (this.right != null)
                this.right.preorder(f);

        }
    }

    public void inorder(Consumer<T> f) {
        if (f != null) {

            if (this.left != null)
                this.left.inorder(f);

            f.accept(data);

            if (this.right != null)
                this.right.inorder(f);
        }
    }

    public void postorder(Consumer<T> f) {
        if (f != null) {
            if (this.left != null)
                this.left.postorder(f);

            if (this.right != null)
                this.right.postorder(f);

            f.accept(data);
        }
    }

}
