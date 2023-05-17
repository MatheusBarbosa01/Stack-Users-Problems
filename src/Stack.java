import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


public class Stack <T>{
    private List<T> stack = new ArrayList<T>();

    //empilhar
    public void push(T element){
        stack.add(element);
    }

    //tamanho da pilha
    public int size(){
        return stack.size();
    }

    //desempilhado
    public T pop(){
        if(stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(size()-1);
    }

    //Pilha vazia
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    //mostrar o topo da pilha
    public T top(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(size()-1);
    }

    @Override
    public String toString() {
        if (size() == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();

        for(int i = stack.size()-1; i >= 0; i-- ){
            builder.append(String.format("%s%n",stack.get(i).toString() ));
        }
        String s = builder.toString();
        return s;
    }

}
