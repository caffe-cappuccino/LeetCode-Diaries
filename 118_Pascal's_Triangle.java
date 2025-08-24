class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalAns = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            long temp = 1;
            for (int i = 1; i < row; i++) {
                temp *= (row - i);
                temp /= i;
                ans.add((int) temp);
            }
            finalAns.add(ans);
        }
        return finalAns;
    }
}
