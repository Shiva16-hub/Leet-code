class MyQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
       while(!s1.isEmpty()){
           s2.push(s1.pop());
       }
       s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
       
    }
    
    public int pop() {
        if(s1.isEmpty()){
            return -1;
        }
        int t = s1.peek();
        s1.pop();
        return t;
    }
    
    public int peek() {
       return s1.peek();
        
    }
    
    public boolean empty() {
         if(s1.isEmpty()){
            return true;
        }else{
            return false;
         }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */