public class Student {
    private double gpa;
    private int energy;
    private int health;
    private int money;
    private int social;

    public Student() {
        gpa = 4.0;
        energy = 100;
        health = 0;
        money = (int) Math.random()*150 + 50;
        social = (int) (Math.random() * 100);
    }

    public int getEnergy(){ return energy; }

    public int getHealth(){ return health; }

    public int getSocial(){ return social; }

    public double getGpa(){ return gpa; }

    public int getMoney(){ return money; }

    public void changeEnergy(int n) { energy += n;}

    public void changeHealth(int n) { health += n;}

    public void changeSocial(int n) { social += n;}

    public void changeMoney(int n) { money += n;}

    public void changeGpa(double n) { energy += n;}

    public boolean checkStats(){
        if(energy<=0 || health<=0 || social<=0 || gpa<1.0 || money<0){
            return true;
        }
        return false;
    }

    public boolean warning(){
        if(energy<=15 || health<=15 || social <=15 || gpa<2.0){
            return true;
        }
        return false;
    }
}
