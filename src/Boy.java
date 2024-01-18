public class Boy extends AbstractHuman implements OpenAble {

    public Boy (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }

   @Override
    public void open(Place e) {
        System.out.println(super.name + " распахнул дверь в " + e);
    }


    @Override
    public String toString() {
        return "Человека по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }


}