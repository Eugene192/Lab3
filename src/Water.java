import java.util.Objects;

public class Water extends AbstractObj {
    private Status status;


    public Water(String name) {
        this.name = name;
        System.out.println("Объект - " + name + " успешно создан!");
    }
    public void doSomeThing(Status status){
        System.out.print(super.name+"");
        if (status == Status.Starting){
            System.out.println(" началось");
        }else if (status == Status.Ending){
            System.out.println(" закончилось");
        }

    }
    public Status getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Объект по имени " + this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Water obj = (Water) o;
        return status == obj.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status);
    }

    @Override
    public String getName() {
        return name;
    }



}