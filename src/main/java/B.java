import java.util.LinkedList;
import java.util.List;

public class B {
    private final List<Integer> integers;
    public final Integer id;
    public B(){
        integers = new LinkedList<>();
        id = 0;
    }
    public List<Integer> getIntegers() {
        return integers;
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
    public boolean equals(B other){
        if (other==null){
            return false;
        } else if(!this.id.equals(other.id)){
            return false;
        }
        return this.getIntegers().equals(other.getIntegers());
    }
}
