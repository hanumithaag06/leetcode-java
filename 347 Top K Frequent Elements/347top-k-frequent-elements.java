class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> map = new HashMap<>();

    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    } 

    PriorityQueue<Integer> maxheap = new PriorityQueue<>(
        (a,b)->map.get(b)-map.get(a)
    );

    for(int key : map.keySet()){
        maxheap.offer(key);
    }

    int arr[] = new int[k];
    for(int i=0;i<k;i++){
           arr[i]=maxheap.poll();
    }
 
        return arr;

        
    }
}