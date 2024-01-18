public class Karlson extends AbstractHuman implements JumpAble{




    public Karlson (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }






     public void meaning(){
             System.out.println(super.name + " был прав");
     }



    public  void jump( int height){
        if (height == 7 || height == 8 || height == 9){
            System.out.println(super.name + " прыгнул в воду и начал купаться");
        }
        if (height == 4 || height == 5 || height == 6) {
            System.out.println(super.name + " зашел в воду по колено");
        }
        if (height == 1 || height == 2 || height == 3){
            System.out.println(super.name + " не может покупаться");
        }
    }

    @Override
    public  void wantToJump(Place a, Place b, int height){
        if (height == 7 || height == 8 || height == 9){
            System.out.println(name + " хотел прыгнуть в воду, которая была в " + a + " и " + b);
        }
        if (height == 1 || height == 2 || height == 3 || height == 4 || height == 5 || height == 6){
            System.out.println(name + " хотел покупаться, если бы было достаточно воды");

        }

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