import processing.core.PApplet;

/**
* A program Sketch.java that sketches a simple drawing including a background, a foreground, and multiple shapes (task 1 project) that scales proportionally with changes in width and height.
* @author: Avin A.
*
*/

public class Sketch extends PApplet {
  
  public void settings() {
    // uses preferred values for height and width of the screen
    size(200, 400);
  }

  public void setup() {
    background(170, 207, 235);
  }

  public void draw() {
    // White Guy
    stroke(255);
    fill(170, 200, 235);
    // white guy head
    ellipse((int) (width * 140.0 / 400.0), (int) (height * 30.0 / 400.0), (int) (width * 42.0 / 400.0), (int) (height * 42.0 / 400.0));
    // white guy body
    line((int) (width * 137.0 / 400.0), (int) (height * 50.0 / 400.0), (int) (width * 120.0 / 400.0), (int) (height * 104.0 / 400.0));
    // white guy left bicep
    line((int) (width * 130.0 / 400.0), (int) (height * 74.0 / 400.0), (int) (width * 105.0 / 400.0), (int) (height * 38.0 / 400.0));
    // white guy left forearm
    line((int) (width * 105.0 / 400.0), (int) (height * 38.0 / 400.0), (int) (width * 120.0 / 400.0), (int) (height * 0.0 / 400.0));
    // white guy upper leg
    line((int) (width * 120.0 / 400.0), (int) (height * 104.0 / 400.0), (int) (width * 150.0 / 400.0), (int) (height * 145.0 / 400.0));
    // white guy lower leg
    line((int) (width * 120.0 / 400.0), (int) (height * 104.0 / 400.0), (int) (width * 140.0 / 400.0), (int) (height * 150.0 / 400.0));
    // white guy left eye
    line((int) (width * 137.0 / 400.0), (int) (height * 30.0 / 400.0), (int) (width * 136.0 / 400.0), (int) (height * 20.0 / 400.0));
    // white guy right eye
    line((int) (width * 145.0 / 400.0), (int) (height * 30.0 / 400.0), (int) (width * 145.0 / 400.0), (int) (height * 20.0 / 400.0));
    // white guy left half of smile
    line((int) (width * 140.0 / 400.0), (int) (height * 44.0 / 400.0), (int) (width * 130.0 / 400.0), (int) (height * 33.0 / 400.0));
    // white guy right half of smile
    line((int) (width * 140.0 / 400.0), (int) (height * 44.0 / 400.0), (int) (width * 149.0 / 400.0), (int) (height * 35.0 / 400.0));
    // white guy right arm
    line((int) (width * 130.0 / 400.0), (int) (height * 74.0 / 400.0), (int) (width * 160.0 / 400.0), (int) (height * 94.0 / 400.0));

    // Gray Guy Head System
    stroke(120);
    fill(170, 200, 235);
    // gray guy head
    ellipse((int) (width * 164.0 / 400.0), (int) (height * 102.0 / 400.0), (int) (width * 28.0 / 400.0), (int) (height * 28.0 / 400.0));
    // gray guy left eye
    line((int) (width * 155.0 / 400.0), (int) (height * 100.0 / 400.0), (int) (width * 161.0 / 400.0), (int) (height * 94.0 / 400.0));
    line((int) (width * 155.0 / 400.0), (int) (height * 94.0 / 400.0), (int) (width * 161.0 / 400.0), (int) (height * 100.0 / 400.0));
    // gray guy right eye
    line((int) (width * 166.0 / 400.0), (int) (height * 100.0 / 400.0), (int) (width * 172.0 / 400.0), (int) (height * 94.0 / 400.0));
    line((int) (width * 166.0 / 400.0), (int) (height * 94.0 / 400.0), (int) (width * 172.0 / 400.0), (int) (height * 100.0 / 400.0));
    // gray guy mouth
    line((int) (width * 156.0 / 400.0), (int) (height * 106.0 / 400.0), (int) (width * 172.0 / 400.0), (int) (height * 106.0 / 400.0));

    // Gray Guy Hat
    stroke(219, 15, 155);
    fill(201, 20, 145);
    // hat base
    triangle ((int) (width * 151.0 / 400.0), (int) (height * 87.0 / 400.0), (int) (width * 177.0 / 400.0), (int) (height * 87.0 / 400.0), (int) (width * 164.0 / 400.0), (int) (height * 57.0 / 400.0));
    // hat decor
    stroke(20, 201, 83);
    line((int) (width * 153.0 / 400.0), (int) (height * 82.0 / 400.0), (int) (width * 173.0 / 400.0), (int) (height * 78.0 / 400.0));
    line((int) (width * 158.0 / 400.0), (int) (height * 70.0 / 400.0), (int) (width * 169.0 / 400.0), (int) (height * 67.0 / 400.0));
    stroke(233, 237, 7);
    line((int) (width * 155.0 / 400.0), (int) (height * 76.0 / 400.0), (int) (width * 171.0 / 400.0), (int) (height * 72.0 / 400.0));
    // hat star
    stroke (233, 237, 7);
    line((int) (width * 164.0 / 400.0), (int) (height * 57.0 / 400.0), (int) (width * 164.0 / 400.0), (int) (height * 45.0 / 400.0));
    line((int) (width * 160.0 / 400.0), (int) (height * 54.0 / 400.0), (int) (width * 168.0 / 400.0), (int) (height * 48.0 / 400.0));
    line((int) (width * 160.0 / 400.0), (int) (height * 48.0 / 400.0), (int) (width * 168.0 / 400.0), (int) (height * 54.0 / 400.0));

    // Stairs
    stroke(153, 7, 237);
    fill (153, 7, 237);
    rect((int) (width * 200.0 / 400.0), (int) (height * 370.0 / 400.0), (int) (width * 160.0 / 400.0), (int) (height * 30.0 / 400.0));
    rect((int) (width * 200.0 / 400.0), (int) (height * 340.0 / 400.0), (int) (width * 120.0 / 400.0), (int) (height * 30.0 / 400.0));
    rect((int) (width * 200.0 / 400.0), (int) (height * 310.0 / 400.0), (int) (width * 80.0 / 400.0), (int) (height * 30.0 / 400.0));
    rect((int) (width * 200.0 / 400.0), (int) (height * 280.0 / 400.0), (int) (width * 40.0 / 400.0), (int) (height * 30.0 / 400.0));

    // Gray Guy Lower Body
    stroke(120);
    // gray guy left leg
    line((int) (width * 201.0 / 400.0), (int) (height * 280.0 / 400.0), (int) (width * 214.0 / 400.0), (int) (height * 250.0 / 400.0));
    // gray guy right leg
    line((int) (width * 227.0 / 400.0), (int) (height * 280.0 / 400.0), (int) (width * 214.0 / 400.0), (int) (height * 250.0 / 400.0));
    // gray guy body
    line((int) (width * 214.0 / 400.0), (int) (height * 250.0 / 400.0), (int) (width * 214.0 / 400.0), (int) (height * 210.0 / 400.0));
    // gray guy lower hand
    line((int) (width * 214.0 / 400.0), (int) (height * 226.0 / 400.0), (int) (width * 194.0 / 400.0), (int) (height * 195.0 / 400.0));
    // gray guy upper hand
    line((int) (width * 214.0 / 400.0), (int) (height * 224.0 / 400.0), (int) (width * 198.0 / 400.0), (int) (height * 186.0 / 400.0));

    // Ladder
    stroke(115, 57, 25);
    line((int) (width * 350.0 / 400.0), (int) (height * 0.0 / 400.0), (int) (width * 320.0 / 400.0), (int) (height * 115.0 / 400.0));
    line((int) (width * 326.0 / 400.0), (int) (height * 0.0 / 400.0), (int) (width * 296.0 / 400.0), (int) (height *115.0 / 400.0));
    line((int) (width * 300.0 / 400.0), (int) (height * 94.0 / 400.0), (int) (width * 325.0 / 400.0), (int) (height * 92.0 / 400.0));
    line((int) (width * 305.0 / 400.0), (int) (height * 74.0 / 400.0), (int) (width * 330.0 / 400.0), (int) (height * 72.0 / 400.0));
    line((int) (width * 310.0 / 400.0), (int) (height * 54.0 / 400.0), (int) (width * 335.0 / 400.0), (int) (height * 52.0 / 400.0));
    line((int) (width * 315.0 / 400.0), (int) (height * 34.0 / 400.0), (int) (width * 340.0 / 400.0), (int) (height * 32.0 / 400.0));
    line((int) (width * 320.0 / 400.0), (int) (height * 14.0 / 400.0), (int) (width * 345.0 / 400.0), (int) (height * 12.0 / 400.0));

    // Blue Guy
    stroke(57, 132, 212);
    // blue guy right leg
    line((int) (width * 280.0 / 400.0), (int) (height * 115.0 / 400.0), (int) (width * 272.0 / 400.0), (int) (height * 95.0 / 400.0));
    // blue guy left leg
    line((int) (width * 272.0 / 400.0), (int) (height * 95.0 / 400.0), (int) (width * 266.0 / 400.0), (int) (height * 115.0 / 400.0));
    // blue guy body
    line((int) (width * 272.0 / 400.0), (int) (height * 95.0 / 400.0), (int) (width * 272.0 / 400.0), (int) (height * 70.0 / 400.0));
    // blue guy left arm
    line((int) (width * 272.0 / 400.0), (int) (height * 79.0 / 400.0), (int) (width * 257.0 / 400.0), (int) (height * 63.0 / 400.0));
    // blue guy right bicep
    line((int) (width * 272.0 / 400.0), (int) (height * 79.0 / 400.0), (int) (width * 280.0 / 400.0), (int) (height * 85.0 / 400.0));
    // blue guy right forearm
    line((int) (width * 280.0 / 400.0), (int) (height * 85.0 / 400.0), (int) (width * 272.0 / 400.0), (int) (height * 93.0 / 400.0));
    // blue guy head
    fill(170, 200, 235);
    ellipse((int) (width * 272.0 / 400.0), (int) (height * 60.0 / 400.0), (int) (width * 20.0 / 400.0), (int) (height * 20.0 / 400.0));
    // blue guy eyes
    ellipse((int) (width * 269.0 / 400.0), (int) (height * 57.0 / 400.0), (int) (width * 1.0 / 400.0), (int) (height * 1.0 / 400.0));
    ellipse((int) (width * 275.0 / 400.0), (int) (height * 57.0 / 400.0), (int) (width * 1.0 / 400.0), (int) (height * 1.0 / 400.0));
    // blue guy smile
    line((int) (width * 272.0 / 400.0), (int) (height * 65.0 / 400.0), (int) (width * 266.0 / 400.0), (int) (height * 60.0 / 400.0));
    line((int) (width * 272.0 / 400.0), (int) (height * 65.0 / 400.0), (int) (width * 278.0 / 400.0), (int) (height * 60.0 / 400.0));
  }
}