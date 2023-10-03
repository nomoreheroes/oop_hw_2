public class Plate {
    private int food;

    public Plate(int food) {
        this.setFood(food);    
    }

    public int getFood()
    {
        return this.food;
    }

    public void setFood(int food)
    {
        if (food > 0) 
        {
            this.food = food;
        } else {
            this.food = 0;
        }
    }

    public void addFood(int food)
    {
        this.setFood(this.getFood() + food);
    }

    public boolean isEmpty()
    {
        return this.food == 0;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}