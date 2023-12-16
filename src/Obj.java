import javax.swing.*;
import java.util.Objects;

public class Obj extends AbstractObj {


    public Obj(String name) {
        this.name = name;
        System.out.println("Объект - " + name + " успешно создан!");
    }
    public void doSomeThing(Status status){
        System.out.print(super.name+"");
        if (status == Status.Open){
            System.out.println(" теперь открыта");

        }else if (status == Status.Close){
            System.out.println(" теперь закрыта");
        }else if (status == Status.Starting){
            System.out.println(" началось");
        }else if (status == Status.Ending){
            System.out.println(" закончилось");
        }

    }

    @Override
    public String toString() {
        return "Объект по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }



}