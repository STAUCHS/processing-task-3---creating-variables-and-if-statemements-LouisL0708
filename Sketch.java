import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
  
  //variable

	int intHeight;
  int intWidth;
  int intHour;
  int intMin;
	
  public void settings() { 

    size(400, 400);
  } 

  public void setup() {

    background(117, 128, 0);
    Random myRandom = new Random();

    intHeight = myRandom.nextInt(height/2);
    intWidth = myRandom.nextInt(width/2);

    intHour = hour();
    intMin = minute();

    faceX = random(0,width);
    faceY = random(0,height);

    // turns background color depending on position of object
    if(intWidth>100){
      background(2,255,100);
    } else{
      background(255,255,0);
    }
  }

    float faceX;
    float faceY;

  public void draw() {
    
    // shows current time
    
    text(intHour, 100, 100);
    text(": ", 115, 100);
    text(intMin, 120, 100);
  
  
    noStroke();
    fill(255,204,51);
    circle(200 - intWidth, 215 - intHeight,100);
 
    //right eye 

    fill(0,0,0);
    circle(218 - intWidth,203 - intHeight, 14); 

    //left eye

    fill(0,0,0);
    circle(182 - intWidth,203 - intHeight, 14);

    //mouth 

    fill(0,0,0);
    ellipse(200 - intWidth, 223 - intHeight, 16, 19);

    }
    
  }