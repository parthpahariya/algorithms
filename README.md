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
8. char[] arrOfChar = str.toCharArray()
9. str.replaceAll("\\s", "");

#List<> list
1. List<T> list = new ArrayList<T>()
1. list.get(i);
2. list.size();
3. list.add(p);
4. list.remove(index) # remove at index #O(n)
5. list.add(index, element); # add value at index

#Queue
1. Dequeue<Integer> queue = new ArrayDeque<Integer>();
2. queue.addFirst(i) #void 
3. queue.addLast(i) #void 
4. queue.pollFirst() #return and remove from First
5. queue.pollLast() #return and remove from Last
6. queue.isEmpty() #check empty

#Stack
1. Stack<Integer> stack = new Stack<Integer>(); 
2. stack.push(i) #void 
3. stack.pop() #return 
4. stack.peek() #peek top element
5. stack.empty() #check empty

#Map (Time complexity is O(1) for all)
1. Map<Integer, Integer> map = new HashMap<>();
2. map.put(key, value); #void
3. map.get(key) #Integer
4. map.values() #Collection<Integer>   #to get all value
5. map.keySet() #Set<Integer>
6. map.remove(key) # remove key
7. for(Map.Entry<String,String> entry : map.entrySet()){ entry.getKey() , entry.getValue()}

#PriorityQueue
1. PriorityQueue <Integer> pq = new PriorityQueue<Integer>(); 
2. pq.peek() #peek top element
3. pq.poll() # return head and remove head
4. Iterator value = queue.iterator(); while (value.hasNext()) { System.out.println(value.next()); } 
