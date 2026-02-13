// Last updated: 2/13/2026, 9:48:01 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        
        if(l1 != l2)
        return false;
        int arr1[]= new int [256];
        int arr2[]=new int[256];
        for (int i =0;i< l1;i++){
            char a=s.charAt(i);
            char b =t.charAt(i);
            if( arr1 [a] == 0 && arr2 [b] == 0){
                arr1[a]=b;
                arr2[b]=a;
            }
            else{
                if( arr1[a]!=b || arr2[b]!=a)
                return false;
            }
        }
    
    return true;

    }
}