import java.util.LinkedList;
import java.util.List;

public class A {
    private B b;
    private final List<Integer> integers;


    public final Integer id;
    public A(B b1){
        this.b = b1;
        integers = new LinkedList<>();
        id = 1;
    }

    public B getB() {
        return b;
    }
    public void setB(B other) {
        this.b = other;
    }

    public void add(Integer element) {
        integers.add(element);
    }

    public boolean remove(Integer element) {
        for (Integer o: this.integers) {
            if(o.equals(element)){
                this.integers.remove(element);
                return true;
            }
        }
        return false;
    }

    public List<Integer> concat(){
        List<Integer> out = new LinkedList<>();
        out.addAll(this.integers);
        out.addAll(this.b.getIntegers());
        return out;
    }

}
