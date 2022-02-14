class Solution {
    public String getPermutation(int n, int k) {
        int factorial = 1;
        List<Integer> numbers = new ArrayList();
        for (int i = 1; i < n; ++i) {
            factorial *= i;
            numbers.add(i);
        }
        numbers.add(n);
        --k;
        
        StringBuffer ans = new StringBuffer();
        while (true) {
            ans.append(numbers.get(k / factorial));
            numbers.remove(k / factorial);
            
            if (numbers.size() == 0)
                break;
            
            k = k % factorial;
            factorial /= numbers.size();
        }
        
        return ans.toString();
    }
}