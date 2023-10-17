import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Player
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Bird(){
        this.setImage(new GreenfootImage("Bird1.png"));
    }
    {
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    
    int lastnameNo = 1;
    int animationDelay = 10;
    void animate(){
        if(animationDelay <10 ){
            animationDelay++;
            return;
        }
        animationDelay=0;
        
        if(lastnameNo == 3){
            lastnameNo = 1;
        }else{
            lastnameNo ++;
        }
        this.setImage (new GreenfootImage("Bird"+ lastnameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    public void act()
    {
        animate();
        super.act();
    }
}

