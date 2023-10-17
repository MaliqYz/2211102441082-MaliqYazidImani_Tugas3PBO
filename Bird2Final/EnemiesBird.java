import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class EnemiesBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemiesBird extends Enemies
{
    /**
     * Act - do whatever the EnemiesBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public EnemiesBird(){
        GreenfootImage img = this.getImage();
        img.scale(100,150);
        this.setImage(img);
    }
    public void act()
    {
        move(-8);
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}

    

