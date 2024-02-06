import java.util.LinkedList;
import java.util.List;

public class B {
    private final List<Integer> integers;
    public final Integer id;
//    public final Integer id2;
    public B(){
        integers = new LinkedList<>();
        id = 0;
//        id2 = 2;
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

    @Override
    public boolean equals(Object other){
        if (other==null){
            return false;
        }
        if (!(other instanceof B o)) {
            return false;
        }
        if(!this.id.equals(o.id)){
            return false;
        }
        return this.getIntegers().equals(o.getIntegers());
    }
}
