package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
    float playerX, playerY, playerWidth, playerSpeed;
    float bugX, bugY, bugWidth, bugSpeed;

	public void settings()
	{
		size(500, 500);
	}

    public void setup()
    {
		background(0);

		playerX = 250;
        playerY = 400;
        playerWidth = 50;
        playerSpeed = 10;

        bugX = 250;
        bugY = 100;
        bugWidth = 50;
        bugSpeed = 10;

        smooth();

    }

    public void drawPlayer(float x, float y, float w)
    {
        rect(x, y, 50, w);
        noStroke();
    }

    public void drawBug(float x, float y, float w)
    {
        rect(x, y, 50, w);
        noStroke();
    }

    public void draw()
    {
        if ((frameCount % 60)==0)
        {
            bugX = random(400);
        }
        background(0);
        drawPlayer(playerX, playerY, playerWidth);
        drawBug(bugX, bugY, bugWidth);
    }

    public void keyPressed()
    {
        if(keyCode == LEFT && playerX > 0)
        {
            playerX=playerX-playerSpeed;
            System.out.println("Left arrow pressed");
        }
        if(keyCode == RIGHT && playerX < 500-playerWidth)
        {
            playerX=playerX+playerSpeed;
            System.out.println("Right arrow pressed");
        }
        if(keyCode == ' ')
        {
            stroke(255, 0, 0);
            line(playerX + (playerWidth/2),(playerY-350),playerX+(playerWidth/2),  playerY);
            System.out.println("SPACE arrow pressed");
        }

    }

}