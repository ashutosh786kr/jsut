import java.util.Scanner;

class FullStackException extends Exception {
    public FullStackException(String message) {
        super(message);
    }
}

class EmptyStackException extends Exception {
    public EmptyStackException(String message) {
        super(message);
    }
}

class Stack {
    private int[] elements;
    private int top;
    private int size;

    public Stack(int size) {
        this.elements = new int[size];
        this.top = -1;
        this.size = size;
    }

    public void push(int element) throws StackFullException {
        if (top == size - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = element;
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return elements[top--];
    }
}

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}

public class p5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack(5);
        int y , c;
        do{
            System.out.println("1 . to push\n2. to pop");
            c = sc.nextInt();

            switch(c){
                case 1 :
                try{
                    
                }
            }



        }while(y == 1 );
        
    }
}