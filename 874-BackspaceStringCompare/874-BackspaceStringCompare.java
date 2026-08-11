// Last updated: 8/11/2026, 4:01:59 PM
class Solution {
    public String as(String a){
     
        StringBuilder sc=new StringBuilder();
        int c =0;
        for(int i=a.length()-1;i>=0;i--){     //c
            if(a.charAt(i)=='#')
                c++;//c=1 
            else if(c>0)
                c--;
            else
                sc.append(a.charAt(i));
        }
        return sc.toString();
}
    public boolean backspaceCompare(String s, String t) {
    
       

        return as(s).equals(as(t));

    }
}