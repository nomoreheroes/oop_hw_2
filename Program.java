import java.util.Random;

public class Program {
    public Cat[] cats = new Cat[10];
    public Plate plate;

    public static void main(String[] args) {
        Cat[] cats = generateCats(10);
        Plate plate = createPlate();
        for(Cat cat:cats)
        {   
            cat.eat(plate);
            if (cat.isFull())
            {
                System.out.printf("Котик %s сыт, в тарелке осталось %s еды\n",cat.name, plate.getFood());
            } else {
                System.out.printf("Котику %s не хватило еды!\n",cat.name);
            } 
            if(!cat.isFull())
            {
                plate.addFood(100);
                System.out.println("Добавим немножко еды");
                cat.eat(plate);
            }

        }
        
    }

    public static Cat[] generateCats(int len)
    {
        Cat[] cats = new Cat[len];
        String[] names = new String[] {"Барсик","Мурзик","Дымок","Снежок","Уголек"};
        String[] catnames = new String[len];
        for(int i=0;i<len;i++)
        {
            int nameind = new Random().nextInt(names.length);
            String name = String.format("%s%s",names[nameind],i);
            int appetite = new Random().nextInt(200);
            catnames[i] = name;
            cats[i] = new Cat(name, appetite);
        }
        System.out.printf("Ого, у нас %s котиков: %s!\n",len,String.join(", ",catnames));
        return cats;
    }

    public static Plate createPlate()
    {
        Plate plate = new Plate(new Random().nextInt(1000));
        System.out.printf("Ура, в тарелке %s еды\n",plate.getFood());
        return plate;
    }
}
