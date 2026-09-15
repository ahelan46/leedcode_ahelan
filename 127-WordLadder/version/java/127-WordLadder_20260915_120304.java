// Last updated: 9/15/2026, 12:03:04 PM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> list) {
3        Queue<String> q=new LinkedList<>();
4        HashSet<String> set=new HashSet<>(list);
5        if(!set.contains(endWord)){
6            return 0;
7        }
8        q.add(beginWord);
9        int count=1;
10        while(!q.isEmpty()){
11            int s=q.size();
12            for(int i=0;i< s;i++){
13                String word=q.poll();
14                char[] arr=word.toCharArray();
15                for(int j=0;j<arr.length;j++){
16                    char old=arr[j];
17                    for(char k='a';k<='z';k++){
18                        arr[j]=k;
19                        String w=new String(arr);
20                        if(w.equals(endWord)){
21                            return count+1;
22                        }
23                        else{
24
25                         if(set.contains(w)){
26                            q.add(w);
27                            set.remove(w);
28                         }
29                        }
30                    }
31                    arr[j]=old;
32                }
33            }
34            count++;
35        }
36        return 0;
37    }
38}