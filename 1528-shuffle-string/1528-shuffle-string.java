class Solution {
    public String restoreString(String s, int[] indices) {
        char str []=new char[indices.length];
        for(int i=0;i<indices.length;i++){
           int num=indices[i];
           str[num]=s.charAt(i);
        }
        String s1=new String(str);
        return s1;
    }
}