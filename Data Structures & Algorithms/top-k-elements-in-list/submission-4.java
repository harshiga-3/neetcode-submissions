class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
for(int n:nums){
    m.put(n,m.getOrDefault(n,0)+1);

}
PriorityQueue<Integer>q=new PriorityQueue<>(
    (a,b) -> m.get(a)-m.get(b)
);

for(int n:m.keySet()){
    q.add(n);
    if(q.size()>k)
    {
        q.poll();
    }
}
int []r=new int[q.size()];
int j=0;
while(!q.isEmpty())
{
    r[j++]=q.poll();
} 

return r;
    }
}
