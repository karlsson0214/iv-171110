import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butterfly here.
 * 
 * @author Rikard Karlsson  
 * @version 2017-11-09
 */
public class Butterfly extends Actor
{
    private int speed = 5;

    public Butterfly()
    {
        int angle = Greenfoot.getRandomNumber(360);
        setRotation(angle);
    }
    
    public void act()
    {
        changeSpeed();
        move(speed);
        turn();
        eat();
    }

    private void changeSpeed()
    {
        int deltaSpeed = Greenfoot.getRandomNumber(3) - 1; 
        speed = speed + deltaSpeed;
        if (speed < 2)
        {
            speed = 2;
        }
        else if (speed > 7)
        {
            speed = 7;
        }
    }

    private void turn()
    {
        int randomNumber = Greenfoot.getRandomNumber(100);
        if (randomNumber < 20)
        {
            int angle = Greenfoot.getRandomNumber(31) - 15;
            turn(angle);
        }
        if (isAtEdge())
        {
            turn(120);
        }
    }
    private void eat()
    {
        if (isTouching(Cherries.class))
        {
            removeTouching(Cherries.class);
        }
    }

}
