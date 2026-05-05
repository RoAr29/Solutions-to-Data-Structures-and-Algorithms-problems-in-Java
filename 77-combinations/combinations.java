class Solution {
    private void backtracking(int start,List<List<Integer>> ans,List<Integer> ds,int k,int n){
        if(ds.size() == k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = start;i <= n;i++){
            ds.add(i);
            backtracking(i+1,ans,ds,k,n);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtracking(1,ans,ds,k,n);
        return ans;
    }
}