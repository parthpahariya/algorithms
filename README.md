# java

int[] nums 
1. nums.length
2. nums[0]
3. Arrays.sort(nums)

#Integer num

1. Num1.equals(num2)

#String str

1. str.length();
2. str.charAt(i);
3. str.equalsIgnoreCase(str3)
4. str.substring(i,j) -> both included
5. String.valueOf(s)
6. str.toLowerCase()
7. String[] arrOfStr = str.split("@")
8. char[] arrOfChar = str()
9. str.replaceAll("\\s", ""); 

#List<> nums
1. nums.get(i);
2. nums.size();
3. nums.add(p);

#Stack
1. Stack<Integer> stack = new Stack<Integer>(); 
2. stack.push(i) #void 
3. stack.pop() #return 
4. stack.peek() #peek top element
5. stack.empty() #check empty
#Map
Map<Integer, Integer> map = new HashMap<>();
map.put(key, value); #void
map.get(key) #Integer
map.values() #Collection<Integer>   #to get all value
map.keySet() #Set<Integer>
for(Map.Entry<String,String> entry : map.entrySet()){ entry.getKey() , entry.getValue()}

#PriorityQueue
1. PriorityQueue <Integer> pq = new PriorityQueue<Integer>(); 
2. pq.peek() #peek top element
3. pq.poll() # return head and remove head
