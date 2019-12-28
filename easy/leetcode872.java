class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();
        bfs(lista, root1);
        bfs(listb, root2);
        // System.out.println(lista.toString());
        // System.out.println(listb.toString());
        return lista.equals(listb);
    }

    public void bfs(List<Integer> list, TreeNode root) {
        if (root.left != null) {
            bfs(list, root.left);
        } 
        if (root.right != null) {
            bfs(list, root.right);
        } 
        if (root.right == null && root.left==null) {
            list.add(root.val);
        }
    }
}