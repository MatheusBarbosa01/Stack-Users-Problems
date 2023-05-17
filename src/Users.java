public class Users {

    private String name;

    Stack <Action> stack = new Stack<>();

    public void addActions(String acao){
        Action action = new Action(acao);
        stack.push(action);
    }

    public void DelActions(int quantidade){
        if(quantidade <= stack.size() && quantidade>0 ){
            if(quantidade<=16){
                for(int i=0; i < quantidade; i++){
                    stack.pop();
                }
            }else {
                throw new IndexOutOfBoundsException();
            }
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public Users(String name) {
        this.name = name;
    }

    public void showActions(){
        System.out.println(stack);
    }

}
