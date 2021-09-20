package MyStack;

import java.util.ArrayList;
import java.util.Objects;

public class Stack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public Stack() {
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize() {
         return list.size();
         }

         public Object peek() {
         return list.get(getSize()-1);
         }

         public Object pop() {
         Object o = list.get(getSize()-1);
         list.remove(getSize()-1);
         return o;
         }

         public void push(Object o) {
         list.add(o);
         }
        public Object clone(){
            try {
                Stack newStack=(Stack) super.clone();
                newStack.list=(java.util.ArrayList)list.clone();
                return newStack;
                }
            catch (CloneNotSupportedException e){
                return null;
                }
        }

    public static void main(String[] args) {

        Stack s1=new Stack();
        s1.push(2);
         Stack s2=(Stack) s1.clone();
         s2.push(5);
        System.out.println(s1.peek());
        System.out.println(s2.peek());

    }
}
