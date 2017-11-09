import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelican here.
 * 
 * @author Rikard Karlsson  
 * @version 2017-11-09
 */
public class Pelican extends Actor
{
    private int score = 0;
    /**
     * Act - do whatever the Pelican wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tryMove(2);
        eat();
    }    
    private void tryMove(int amount)
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - amount);
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + amount);
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - amount, getY());
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + amount, getY());
        }
    }
    private void eat()
    {
        if (isTouching(Butterfly.class))
        {
            removeTouching(Butterfly.class);
            score = score - 3;
            showScore();
        }
        if (isTouching(Cherries.class))
        {
            removeTouching(Cherries.class);
            score = score + 1;
            showScore();
        }
    }
    private void showScore()
    {
        getWorld().showText("score: " + score, 100, 20);
    }
}
