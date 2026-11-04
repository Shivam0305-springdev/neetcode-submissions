class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
 
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
 
        PriorityQueue<Integer> p = new PriorityQueue<>((x, y) -> map.get(x) - map.get(y));
 
        for (int num : map.keySet()) {
            p.offer(num);
 
            if (p.size() > k) {
                p.poll();
            }
        }
        int[] output = new int[k];
        for (int i=0; i<k; i++) {
            output[i] = p.poll();
        }
        return output;
    }
}
 
 