public class Cat {
    public String name;
    private int appetite;
    private boolean bellyful = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isFull()
    {
        return this.bellyful == true;
    }

    public int getAppetite()
    {
        if(!this.bellyful)
        {
            return this.appetite;
        } else {
            return 0;
        }
    }

    public void setAppetite(int appetite)
    {
        this.appetite = appetite;
    }

    public void eat(Plate plate) { 
        System.out.printf("Котик %s подходит к тарелке, у него аппетит %s\n",this.name, this.appetite);
        int rs = plate.getFood() - this.getAppetite();
        if(rs > 0)
        {
            this.bellyful = true;
            plate.setFood(rs);
        } else {
            this.meow();
        }
    }

    public void meow()
    {
        System.out.printf("%s: MEOW!!!!!\n",this.name);
    }
}