import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Enemy(){
        //setRotation(180);
    }
    
    public Enemy(int speed){
        setRotation(180);
        this.speed = speed;
    }
    
    public int speed = 3;
    public void act()
    {
        moveEnemy();
        removeEnemy();
        enemyWeapon();
    }
    
    public void moveEnemy(){
        move(speed);
        getX();
        getY();
        setLocation(getX()-speed,getY());
    }
    
    public void removeEnemy(){
        if (getX()==0){
            getWorld().removeObject(this);
        }
    }
    
     int durationWeapon = 0;
    protected void enemyWeapon(){
        if (durationWeapon==20){
            getWorld().addObject(new WeaponEnemy(), getX()+10, getY());
            durationWeapon = 0;
        }else{
            durationWeapon++;
        }
    }
}
