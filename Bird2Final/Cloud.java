import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Props
{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cloud(){
        Random rnd = new Random();
        this.setImage("Cloud"+rnd.nextInt(6)+".png");
        
        GreenfootImage img = this.getImage();
        img.scale(200,180);
        this.setImage(img);
    }
    public void act()
    {
        this.setLocation(this.getX()-1,getY());
        if (this.getX() <= 0) {
            World wrld = this.getWorld();
            wrld.addObject(new Cloud(), wrld.getWidth()-1, new Random().nextInt(wrld.getHeight()-1));
            wrld.removeObject(this);
        }
    }
}
