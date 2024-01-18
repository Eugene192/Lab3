import java.util.Objects;

public abstract class AbstractObj {
    public String name;

    public AbstractObj(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractObj that = (AbstractObj) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName(){
        return name;
    }
}