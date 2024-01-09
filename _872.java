import java.util.ArrayList;
import java.util.Objects;

public class _872 {

    public void rec(TreeNode n, ArrayList<Integer> l) {
        if (n == null) {
            return;
        }
        if ((n.left == null) && (n.right == null)) {
            l.add(n.val);
            return;
        }
        rec(n.left, l);
        rec(n.right, l);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean res = true;

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        rec(root1, l1);
        rec(root2, l2);

        l1.add(-1);
        l2.add(-1);

        for (int i = 0; i < Math.min(l1.size(), l2.size()); i++) {
            if (!Objects.equals(l1.get(i), l2.get(i))) {
                res = false;
                break;
            }
        }

        return res;
    }
}