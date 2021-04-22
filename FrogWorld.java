import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Roadway for the Frog Jump game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrogWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FrogWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        makeGround();
        addCars();
        addTrucks();
        addObject( new Frog(), 370, 510);
    }
    
    public void makeGround()
    {
        //Bottom safe ground row
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 570);
        }
        
        //Next safe ground row
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 510);
            addObject( new Ground(), 10 + 60*i, 270);
            addObject( new Ground(), 10 + 60*i, 20);
        }
        
        //Add random grass
        for(int i = 0; i < 10; i++)
        {
            int x = Greenfoot.getRandomNumber(700) + 50;
            int y = Greenfoot.getRandomNumber(100) + 500; 
            addObject( new Grass(), x, y);
        }
        
        //Add another safe Ground zone, y = 270
        
        
        
        //Add the top safe Ground zone, y = 30
        
        
        
        
    }
    
    public void addCars()
    {
        //first row of Cars, all y = 450, speed of 5
        addObject( new Car (5), 30, 450);
        addObject( new Car (5), 500, 450);
        //second row of Cars, all y = 390, speed of 5
        addObject( new Car (5), 30, 390);
        addObject( new Car (5), 700, 390);
        //third row of Cars, all y = 330, speed of 7
        addObject( new Car (5), 30, 330);
        addObject( new Car (5), 600, 330);
    }
    
    public void addTrucks()
    {
        //first row of Trucks, all y = 210, speed of -8
        addObject( new Truck (5), 30, 210);
        addObject( new Truck (5), 700, 210);
        addObject( new Truck (5), 300, 210);
        //second row of Trucks, all y = 150, speed of -8
        addObject( new Truck (5), 30, 150); 
        addObject( new Truck (5), 900, 150); 

        //third row of Trucks, all y = 90, speed of 10
        addObject( new Truck (5), 30, 90);
        addObject( new Truck (5), 500, 90);
        
    }
}
