package stack;

//Array implementation of stack
public class stack_implementation {
    //Stack is a last in first out data structure
    //Each new data in added to the top of old data
    static class stack{
      int[] arr;
      int top;
      int size;
      stack(int n) {
          arr = new int[n];
          top = -1;
          size = n;
      }
      void push(int x)
      {
          if(top>=size-1)
          {
              System.out.println("Stack overflow");
          }else{
              arr[++top]=x;

          }
      }
      void pop()
      {
          if(top==-1)
          {
              System.out.println("Stack underflow");
          }else{
              int x=arr[top--];
              System.out.println("Element is popped:"+x);
          }
      }
      void peek()
      {
          if(top==-1)
          {
              System.out.println("underflow");
          }else{
              System.out.println(arr[top]);
          }
      }
      void prinStack()
      {
          for(int i=0;i<top+1;i++)
          {
              System.out.println(arr[i]);
          }
      }

    }

    public static void main(String[] args) {
        stack st=new stack(5);
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(3);
        st.push(45);

        st.pop();
        System.out.println();
        st.peek();
        st.prinStack();

    }
}
