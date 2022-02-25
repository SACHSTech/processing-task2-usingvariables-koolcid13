import processing.core.PApplet;

/**
* A program Sketch.java that sketches a simple drawing including a background, a foreground, and multiple shapes that scales proportionally with changes in width and height.
* @author: Avin A.
*
*/

public class Sketch extends PApplet {

  // change these values to your preference
  double dblScreenWid = 790;
  double dblScreenHgt = 400;
  
  public void settings() {
    // uses the preferred values for height and width of the screen
    size((int) dblScreenWid, (int) dblScreenHgt);
  }

  public void setup() {
    background(170, 207, 235);
  }

  public void draw() {
    // White Guy
    stroke(255);
    fill(170, 200, 235);
    // white guy head
    ellipse((int) (dblScreenWid * 140.0 / 400.0), (int) (dblScreenHgt * 30.0 / 400.0), (int) (dblScreenWid * 42.0 / 400.0), (int) (dblScreenHgt * 42.0 / 400.0));
    // white guy body
    line((int) (dblScreenWid * 137.0 / 400.0), (int) (dblScreenHgt * 50.0 / 400.0), (int) (dblScreenWid * 120.0 / 400.0), (int) (dblScreenHgt * 104.0 / 400.0));
    // white guy left bicep
    line((int) (dblScreenWid * 130.0 / 400.0), (int) (dblScreenHgt * 74.0 / 400.0), (int) (dblScreenWid * 105.0 / 400.0), (int) (dblScreenHgt * 38.0 / 400.0));
    // white guy left forearm
    line((int) (dblScreenWid * 105.0 / 400.0), (int) (dblScreenHgt * 38.0 / 400.0), (int) (dblScreenWid * 120.0 / 400.0), (int) (dblScreenHgt * 0.0 / 400.0));
    // white guy upper leg
    line((int) (dblScreenWid * 120.0 / 400.0), (int) (dblScreenHgt * 104.0 / 400.0), (int) (dblScreenWid * 150.0 / 400.0), (int) (dblScreenHgt * 145.0 / 400.0));
    // white guy lower leg
    line((int) (dblScreenWid * 120.0 / 400.0), (int) (dblScreenHgt * 104.0 / 400.0), (int) (dblScreenWid * 140.0 / 400.0), (int) (dblScreenHgt * 150.0 / 400.0));
    // white guy left eye
    line((int) (dblScreenWid * 137.0 / 400.0), (int) (dblScreenHgt * 30.0 / 400.0), (int) (dblScreenWid * 136.0 / 400.0), (int) (dblScreenHgt * 20.0 / 400.0));
    // white guy right eye
    line((int) (dblScreenWid * 145.0 / 400.0), (int) (dblScreenHgt * 30.0 / 400.0), (int) (dblScreenWid * 145.0 / 400.0), (int) (dblScreenHgt * 20.0 / 400.0));
    // white guy left half of smile
    line((int) (dblScreenWid * 140.0 / 400.0), (int) (dblScreenHgt * 44.0 / 400.0), (int) (dblScreenWid * 130.0 / 400.0), (int) (dblScreenHgt * 33.0 / 400.0));
    // white guy right half of smile
    line((int) (dblScreenWid * 140.0 / 400.0), (int) (dblScreenHgt * 44.0 / 400.0), (int) (dblScreenWid * 149.0 / 400.0), (int) (dblScreenHgt * 35.0 / 400.0));
    // white guy right arm
    line((int) (dblScreenWid * 130.0 / 400.0), (int) (dblScreenHgt * 74.0 / 400.0), (int) (dblScreenWid * 160.0 / 400.0), (int) (dblScreenHgt * 94.0 / 400.0));

    // Gray Guy Head System
    stroke(120);
    fill(170, 200, 235);
    // gray guy head
    ellipse((int) (dblScreenWid * 164.0 / 400.0), (int) (dblScreenHgt * 102.0 / 400.0), (int) (dblScreenWid * 28.0 / 400.0), (int) (dblScreenHgt * 28.0 / 400.0));
    // gray guy left eye
    line((int) (dblScreenWid * 155.0 / 400.0), (int) (dblScreenHgt * 100.0 / 400.0), (int) (dblScreenWid * 161.0 / 400.0), (int) (dblScreenHgt * 94.0 / 400.0));
    line((int) (dblScreenWid * 155.0 / 400.0), (int) (dblScreenHgt * 94.0 / 400.0), (int) (dblScreenWid * 161.0 / 400.0), (int) (dblScreenHgt * 100.0 / 400.0));
    // gray guy right eye
    line((int) (dblScreenWid * 166.0 / 400.0), (int) (dblScreenHgt * 100.0 / 400.0), (int) (dblScreenWid * 172.0 / 400.0), (int) (dblScreenHgt * 94.0 / 400.0));
    line((int) (dblScreenWid * 166.0 / 400.0), (int) (dblScreenHgt * 94.0 / 400.0), (int) (dblScreenWid * 172.0 / 400.0), (int) (dblScreenHgt * 100.0 / 400.0));
    // gray guy mouth
    line((int) (dblScreenWid * 156.0 / 400.0), (int) (dblScreenHgt * 106.0 / 400.0), (int) (dblScreenWid * 172.0 / 400.0), (int) (dblScreenHgt * 106.0 / 400.0));

    // Gray Guy Hat
    stroke(219, 15, 155);
    fill(201, 20, 145);
    // hat base
    triangle ((int) (dblScreenWid * 151.0 / 400.0), (int) (dblScreenHgt * 87.0 / 400.0), (int) (dblScreenWid * 177.0 / 400.0), (int) (dblScreenHgt * 87.0 / 400.0), (int) (dblScreenWid * 164.0 / 400.0), (int) (dblScreenHgt * 57.0 / 400.0));
    // hat decor
    stroke(20, 201, 83);
    line((int) (dblScreenWid * 153.0 / 400.0), (int) (dblScreenHgt * 82.0 / 400.0), (int) (dblScreenWid * 173.0 / 400.0), (int) (dblScreenHgt * 78.0 / 400.0));
    line((int) (dblScreenWid * 158.0 / 400.0), (int) (dblScreenHgt * 70.0 / 400.0), (int) (dblScreenWid * 169.0 / 400.0), (int) (dblScreenHgt * 67.0 / 400.0));
    stroke(233, 237, 7);
    line((int) (dblScreenWid * 155.0 / 400.0), (int) (dblScreenHgt * 76.0 / 400.0), (int) (dblScreenWid * 171.0 / 400.0), (int) (dblScreenHgt * 72.0 / 400.0));
    // hat star
    stroke (233, 237, 7);
    line((int) (dblScreenWid * 164.0 / 400.0), (int) (dblScreenHgt * 57.0 / 400.0), (int) (dblScreenWid * 164.0 / 400.0), (int) (dblScreenHgt * 45.0 / 400.0));
    line((int) (dblScreenWid * 160.0 / 400.0), (int) (dblScreenHgt * 54.0 / 400.0), (int) (dblScreenWid * 168.0 / 400.0), (int) (dblScreenHgt * 48.0 / 400.0));
    line((int) (dblScreenWid * 160.0 / 400.0), (int) (dblScreenHgt * 48.0 / 400.0), (int) (dblScreenWid * 168.0 / 400.0), (int) (dblScreenHgt * 54.0 / 400.0));

    // Stairs
    stroke(153, 7, 237);
    fill (153, 7, 237);
    rect((int) (dblScreenWid * 200.0 / 400.0), (int) (dblScreenHgt * 370.0 / 400.0), (int) (dblScreenWid * 160.0 / 400.0), (int) (dblScreenHgt * 30.0 / 400.0));
    rect((int) (dblScreenWid * 200.0 / 400.0), (int) (dblScreenHgt * 340.0 / 400.0), (int) (dblScreenWid * 120.0 / 400.0), (int) (dblScreenHgt * 30.0 / 400.0));
    rect((int) (dblScreenWid * 200.0 / 400.0), (int) (dblScreenHgt * 310.0 / 400.0), (int) (dblScreenWid * 80.0 / 400.0), (int) (dblScreenHgt * 30.0 / 400.0));
    rect((int) (dblScreenWid * 200.0 / 400.0), (int) (dblScreenHgt * 280.0 / 400.0), (int) (dblScreenWid * 40.0 / 400.0), (int) (dblScreenHgt * 30.0 / 400.0));

    // Gray Guy Lower Body
    stroke(120);
    // gray guy left leg
    line((int) (dblScreenWid * 201.0 / 400.0), (int) (dblScreenHgt * 280.0 / 400.0), (int) (dblScreenWid * 214.0 / 400.0), (int) (dblScreenHgt * 250.0 / 400.0));
    // gray guy right leg
    line((int) (dblScreenWid * 227.0 / 400.0), (int) (dblScreenHgt * 280.0 / 400.0), (int) (dblScreenWid * 214.0 / 400.0), (int) (dblScreenHgt * 250.0 / 400.0));
    // gray guy body
    line((int) (dblScreenWid * 214.0 / 400.0), (int) (dblScreenHgt * 250.0 / 400.0), (int) (dblScreenWid * 214.0 / 400.0), (int) (dblScreenHgt * 210.0 / 400.0));
    // gray guy lower hand
    line((int) (dblScreenWid * 214.0 / 400.0), (int) (dblScreenHgt * 226.0 / 400.0), (int) (dblScreenWid * 194.0 / 400.0), (int) (dblScreenHgt * 195.0 / 400.0));
    // gray guy upper hand
    line((int) (dblScreenWid * 214.0 / 400.0), (int) (dblScreenHgt * 224.0 / 400.0), (int) (dblScreenWid * 198.0 / 400.0), (int) (dblScreenHgt * 186.0 / 400.0));

    // Ladder
    stroke(115, 57, 25);
    line((int) (dblScreenWid * 350.0 / 400.0), (int) (dblScreenHgt * 0.0 / 400.0), (int) (dblScreenWid * 320.0 / 400.0), (int) (dblScreenHgt * 115.0 / 400.0));
    line((int) (dblScreenWid * 326.0 / 400.0), (int) (dblScreenHgt * 0.0 / 400.0), (int) (dblScreenWid * 296.0 / 400.0), (int) (dblScreenHgt *115.0 / 400.0));
    line((int) (dblScreenWid * 300.0 / 400.0), (int) (dblScreenHgt * 94.0 / 400.0), (int) (dblScreenWid * 325.0 / 400.0), (int) (dblScreenHgt * 92.0 / 400.0));
    line((int) (dblScreenWid * 305.0 / 400.0), (int) (dblScreenHgt * 74.0 / 400.0), (int) (dblScreenWid * 330.0 / 400.0), (int) (dblScreenHgt * 72.0 / 400.0));
    line((int) (dblScreenWid * 310.0 / 400.0), (int) (dblScreenHgt * 54.0 / 400.0), (int) (dblScreenWid * 335.0 / 400.0), (int) (dblScreenHgt * 52.0 / 400.0));
    line((int) (dblScreenWid * 315.0 / 400.0), (int) (dblScreenHgt * 34.0 / 400.0), (int) (dblScreenWid * 340.0 / 400.0), (int) (dblScreenHgt * 32.0 / 400.0));
    line((int) (dblScreenWid * 320.0 / 400.0), (int) (dblScreenHgt * 14.0 / 400.0), (int) (dblScreenWid * 345.0 / 400.0), (int) (dblScreenHgt * 12.0 / 400.0));

    // Blue Guy
    stroke(57, 132, 212);
    // blue guy right leg
    line((int) (dblScreenWid * 280.0 / 400.0), (int) (dblScreenHgt * 115.0 / 400.0), (int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 95.0 / 400.0));
    // blue guy left leg
    line((int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 95.0 / 400.0), (int) (dblScreenWid * 266.0 / 400.0), (int) (dblScreenHgt * 115.0 / 400.0));
    // blue guy body
    line((int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 95.0 / 400.0), (int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 70.0 / 400.0));
    // blue guy left arm
    line((int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 79.0 / 400.0), (int) (dblScreenWid * 257.0 / 400.0), (int) (dblScreenHgt * 63.0 / 400.0));
    // blue guy right bicep
    line((int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 79.0 / 400.0), (int) (dblScreenWid * 280.0 / 400.0), (int) (dblScreenHgt * 85.0 / 400.0));
    // blue guy right forearm
    line((int) (dblScreenWid * 280.0 / 400.0), (int) (dblScreenHgt * 85.0 / 400.0), (int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 93.0 / 400.0));
    // blue guy head
    fill(170, 200, 235);
    ellipse((int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 60.0 / 400.0), (int) (dblScreenWid * 20.0 / 400.0), (int) (dblScreenHgt * 20.0 / 400.0));
    // blue guy eyes
    ellipse((int) (dblScreenWid * 269.0 / 400.0), (int) (dblScreenHgt * 57.0 / 400.0), (int) (dblScreenWid * 1.0 / 400.0), (int) (dblScreenHgt * 1.0 / 400.0));
    ellipse((int) (dblScreenWid * 275.0 / 400.0), (int) (dblScreenHgt * 57.0 / 400.0), (int) (dblScreenWid * 1.0 / 400.0), (int) (dblScreenHgt * 1.0 / 400.0));
    // blue guy smile
    line((int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 65.0 / 400.0), (int) (dblScreenWid * 266.0 / 400.0), (int) (dblScreenHgt * 60.0 / 400.0));
    line((int) (dblScreenWid * 272.0 / 400.0), (int) (dblScreenHgt * 65.0 / 400.0), (int) (dblScreenWid * 278.0 / 400.0), (int) (dblScreenHgt * 60.0 / 400.0));
  }
}