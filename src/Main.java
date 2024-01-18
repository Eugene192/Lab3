public class Main {
    public static int Time = 1;
    public static int TimeLimit = 10;

    public static void main(String[] args){
        System.out.println();


        //Введение персонажей и места действий
        Boy boy = new Boy("Малыш");
        System.out.println();

        Karlson karlson = new Karlson("Карлсон");
        System.out.println();

        Place locatioun1 = new Place("Прихожая");
        locatioun1.setType(Places.Hallway);
        System.out.println();

        Place locatioun2 = new Place("Ванная");
        locatioun2.setType(Places.Bathroom);
        System.out.println();

        Door door = new Door("Дверь");
        System.out.println();

        Water water = new Water("Наводнение");
        System.out.println();


        //Действия
        boy.open(locatioun1);
        door.doSomeThing(Status.Open);
        karlson.meaning();
        water.doSomeThing(Status.Starting);
        System.out.println();

        while (Time != TimeLimit){
            locatioun1.levelOfWater(locatioun2, (Time));
            karlson.wantToJump(locatioun1, locatioun2, Time);
            karlson.jump(Time);
            if (Time == (TimeLimit-1)){
                System.out.println("Уровень воды заполнен");
                water.doSomeThing(Status.Ending);
            }
            else{
                System.out.println("Уровень воды возрастает");
            }
            System.out.println(" ");
            Time++;
        }
    }
}