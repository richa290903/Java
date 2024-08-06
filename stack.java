import java.util.Scanner;
class stack {
      private int maxsize;
      private int[] a;
      private int top;
      public int size;
      public stack(){
            maxsize=size;
            a=new int[maxsize];
            top=-1;
      }
      public void push(int value){
            if(!isfull()){
                  a[++top]=value;
                  System.out.println(value+" is pushed to the stack");
            }
            else{
                  System.out.println("stack is full,connot push"+value);
            }
      }
      public int pop(){
            if(!isempty())
            {
                  int temp=a[top--];
                  System.out.println(temp+" is popped from the stack");
                  return temp;
            }
            else{
                  System.out.println("stack is empty,nothing to pop");
                  return -1;
            }
      }
      public int search(int value){
            for(int i=top;i>=0;i++){
                  if(a[i]==value){
                        return top-i+1;
                  }
            }
            return -1;
      }
      public void display(){
            if(!isempty()){
                  System.out.println("stack :");
                  for(int i=top;i>=0;i--){
                        System.out.println(a[i]+"\t");
                  }
                  System.out.println();
            }
            else{
                  System.out.println("stack is empty");
            }
      }
      public boolean isfull(){
            return top==maxsize-1;
      }
      public boolean isempty(){
            return top==-1;
      }
      public static void main(String args[]) {
            Scanner s1=new Scanner(System.in);
            stack s=new stack();
            System.out.println("Enter the size of stack :");
            int size=s1.nextInt();
            while(true){
                  System.out.println("\n1.Push\n2.Pop\n3.search\n4.Display\n5.Exit");
                  System.out.println("Enter your choice :");
                  int choice=s1.nextInt();
                  switch(choice){
                        case 1:
                              System.out.println("Enter the value to push :");
                              int value=s1.nextInt();
                              break;
                        case 2:
                              s.pop();
                              break;
                        case 3:
                              System.out.println("Enter the value to search :");
                              value=s1.nextInt();
                              int pos=s.search(value);
                              if(pos!=-1){
                                    System.out.println(value+ " is found at position"+pos+" from the top of the stack");
                              }
                              else{
                                    System.out.println(value + "is not found in the stack");
                              }
                              break;
                        case 4:
                              s.display();
                              break;
                        case 5:
                              System.exit(0);
                              break;
                        default:
                              System.out.println("Invalid choice,try again");

                  }            
            }
      }

}
