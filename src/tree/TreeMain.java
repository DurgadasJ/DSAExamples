package tree;

class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val = val;
    }
}
public class TreeMain {
    public static void main(String[] args){

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(11);
        System.out.print("In-order Traversal: ");
        inOrderTraversal(root);

        boolean finalStatus = bstCheck(root,Long.MIN_VALUE,Long.MAX_VALUE);

        System.out.println("final Status : "+ finalStatus);
    }

    private static boolean bstCheck(TreeNode root, long min, long max){
        if(root==null) return true;

        if(root.val <=min || root.val>=max) return false;

        return bstCheck(root.left,min,root.val) && bstCheck(root.right,root.val,max);
    }
    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

}
