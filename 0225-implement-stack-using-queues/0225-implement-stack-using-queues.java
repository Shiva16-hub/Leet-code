class MyStack {
    Queue<Integer> q1 = new LinkedList<Integer>();
     Queue<Integer> q2 = new LinkedList<Integer>();
    int size;
    int top;
    public MyStack() {
        size = 0;
    }
    
    public void push(int x) {
        q2.add(x);
        top = x;
        top++;
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
     return q1.remove();
        
    }
    
    public int top() {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
    
    public boolean empty() {
       if(!q1.isEmpty()){
            return false;
        }
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */