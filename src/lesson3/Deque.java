package lesson3;

import java.util.Stack;

//deque (двухсторонняя очередь)
public class Deque {
    private Stack<Object> stack = new Stack<>();
    public void insertRight(Object obj){this.stack.push(obj);}
    public void insertLeft(Object obj){
        Stack<Object> updated = new Stack<>();
        updated.push(obj);
        for(Object o : this.stack){
            updated.push(o);
        }
        this.stack = updated;
    }
    public void removeRight(){this.stack.pop();}
    public void removeLeft(){
        if(this.stack.isEmpty())return;
        Stack<Object> updated = new Stack<>();
        for(int i = 1; i < this.stack.size(); i++){
            updated.push(this.stack.elementAt(i));
        }
        this.stack = updated;
    }
    @Override
    public String toString(){
        String buf = "";
        for(Object obj : this.stack) buf += obj;
        return buf;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.insertLeft("abc");
        deque.insertLeft(",");
        deque.insertRight("123");
        deque.insertRight(",");
        deque.insertLeft("def");
        deque.insertRight("456");

        System.out.println(deque);
        deque.removeLeft();
        System.out.println(deque);
        deque.removeRight();
        System.out.println(deque);
    }
}
