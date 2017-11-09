import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Rikard Karlsson  
 * @version 2017-11-09
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
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Butterfly butterfly = new Butterfly();
        addObject(butterfly,528,91);
        Butterfly butterfly2 = new Butterfly();
        addObject(butterfly2,109,328);
        Pelican pelican = new Pelican();
        addObject(pelican,368,228);
        Cherries cherries = new Cherries();
        addObject(cherries,76,88);
        Cherries cherries2 = new Cherries();
        addObject(cherries2,282,117);
        Cherries cherries3 = new Cherries();
        addObject(cherries3,223,204);
        Cherries cherries4 = new Cherries();
        addObject(cherries4,60,255);
        Cherries cherries5 = new Cherries();
        addObject(cherries5,434,51);
        Cherries cherries6 = new Cherries();
        addObject(cherries6,541,197);
        Cherries cherries7 = new Cherries();
        addObject(cherries7,500,359);
        Cherries cherries8 = new Cherries();
        addObject(cherries8,382,321);
        Cherries cherries9 = new Cherries();
        addObject(cherries9,227,314);
    }
}
