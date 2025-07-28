class MyQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(s2.size()!=0){
            s1.push(s2.pop());
        }
        s2.push(x);
        while(s1.size()!=0){
            s2.push(s1.pop());
        }
        
    }
    
    public int pop() {
        return s2.pop();
        
    }
    
    public int peek() {
        return s2.peek();
        
    }
    
    public boolean empty() {
        return s2.isEmpty();
        
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