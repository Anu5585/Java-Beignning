package lambda;
@FunctionalInterface
public interface Selectable {
    void select();
    default String boo(){
        return "boo";
    }
}
