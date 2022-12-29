import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WeaponEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeaponEnemy extends Actor
{
    /**
     * Act - do whatever the WeaponEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WeaponEnemy ()
    {
        setRotation(180);
    }
    public void act()
    {
        move(10);
        weaponSet();
    }
    int weaponDuration = 0;
    protected void weaponSet()
    {
        if(isTouching(Hero.class)){
            getWorld().addObject(new Bang(), getX(), getY());
            removeTouching(Hero.class);
            getWorld().addObject(new Hero(), 61, 205);
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
            weaponDuration++;
        }
    }
}
