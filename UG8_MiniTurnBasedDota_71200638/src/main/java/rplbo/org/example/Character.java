package rplbo.org.example;

public abstract class Character implements ObjectAttack {
    protected abstract int damage();
    protected abstract String name();
    protected abstract int health();

    public void Character(String name,int damage,int health){
        name =name;
        damage = damage;
        health= health;


    }
    public void showCharacterInfo() {
        System.out.println("name "+ name());
        System.out.println("health"+ health());
        System.out.println("damage"+ damage());
    }
    public boolean isDie(){
        if (health() <= 0){
            return  true;
        }
        return false;


    }

    public abstract void PhysicalCharacter (String name,int damage,int health);
    public abstract void MagicCharacter (String name,int damage,int health);
















}
