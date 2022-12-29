import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        act();
    }
    
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,61,205);
    }
    int enemyCount = 0;
    public void act(){
        enemyCount++;
        if (enemyCount==120){
            addenemy();
            enemyCount = 0;
        }
    }

    public void addenemy(){
        int enemyY = Greenfoot.getRandomNumber(getWidth());
        Enemy enemy = new Enemy(Greenfoot.getRandomNumber(4) + 1);
        addObject(enemy,600,enemyY);
    }
}
