class Solution {
    public String defangIPaddr(String address) {
        char[] arr = address.toCharArray();
        
        StringBuilder sb= new StringBuilder();
        
        for(char ch : arr)
        {
            if(ch=='.')
            {
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }
            else
                sb.append(ch);
        }
        
        
        return  sb.toString();
        
    }
}