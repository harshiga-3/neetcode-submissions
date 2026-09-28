class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>m=new HashMap<>();
        for(String s:strs)
        {
            char []l=s.toCharArray();
            Arrays.sort(l);
            String ch=new String(l);
            if(!m.containsKey(ch))
            {
                m.put(ch,new ArrayList<>());
            }
            m.get(ch).add(s);


        }

        return  new ArrayList<>(m.values());
    }
}
