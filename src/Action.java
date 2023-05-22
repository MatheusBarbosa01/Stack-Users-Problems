public class Action {

    private String act;

    public Action(String act) {
        this.act = act;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    @Override
    public String toString() {
        return "Action{" +
                "acao='" + act + '\'' +
                '}';
    }
}
