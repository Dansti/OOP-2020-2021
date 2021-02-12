package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    public void draw() {
        background(0);
        noStroke();
        switch (mode)
        {
            case 0:
                fill(50, 255, 255);                    
                if (mouseX < cx)
                {
                    rect(0, 0, cx, height);
                }
                else
                {
                    rect(cx, 0, cx, height);
                }
                break;
            case 1:
                fill(50, 255, 255);                                    
                if (mouseX < cx && mouseY < cy)
                {
                    rect(0, 0, cx, cy);
                }
                else if (mouseX > cx && mouseY < cy)
                {
                    rect(cx, 0, cx, cy);
                }
                else if (mouseX < cx && mouseY > cy)
                {
                    rect(0, cy, cx, cy);
                }
                else
                {
                    rect(cx, cy, cx, cy);
                }
                break;
            case 2:
            {
                int numRects = (int)(mouseX / 10.0f);
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects;
                for(int i = 0 ; i < numRects ; i ++)
                {
                    fill(i * cgap, 255, 255);
                    rect(i * w, 0, w, height);
                }
                break;
            }
            case 3:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    ellipse(w / 2 + (i * w), cy, w, w);
                }
                break;
            }
            case 4:
            {
                int numRects = (int)(10.0f);
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects;
                float down = 50;
                float decrease = 0;
                for(int i = 0 ; i < numRects ; i ++)
                {
                    fill(i * cgap, 255, 255);
                    rect(i * w, decrease, w, down);
                    decrease = decrease + down;
                }
                break;
            }
            case 5:
            {
                int numRects = (int)(10.0f);
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects;
                float down = 50;
                float decrease = 0;
                float decrease1 = 1;
                for(int i = 0 ; i < numRects ; i ++)
                {
                    fill(i * cgap, 255, 255);
                    rect(i * w, decrease, w, down);
                    rect((numRects-decrease1)*w,decrease,w,down);
                    decrease = decrease + down;
                    decrease1++;
                }
                break;
            }
            case 6:
            {
                int numCircles = (int)(mouseX/10.0f);
                float w = width/(float)numCircles,
                    h = height/(float)numCircles, 
                    colour=255/(float)numCircles,
                    sizeW,sizeH;

                for(int i=0;i<numCircles;i++)
                {
                    sizeW = width-(w*i);
                    sizeH = height-(h*i);
                    fill(255-(colour*i)-colour,255,255);
                    ellipse(cx,cy,sizeW,sizeH);
                }
                break;
            }
            case 7:
            {
                int numCircles = (int)(mouseX/10.0f);
                float w = width/(float)numCircles,
                h = height/(float)numCircles,
                colour=255/(float)numCircles,radius=h/2,
                innerC;

                for(int i=0;i<numCircles;i++){
                    innerC=(colour/2)*i;
                    fill(i*colour/2,255,255);
                    ellipse(w/2+(w*i),radius,w,w);
                    for(int j=1; j<numCircles;j++){
                        innerC+=colour/4;
                        fill(innerC,255,255);
                        ellipse(w/2+(w*i),(h*j)+radius,w,w);
                    }
                }
                break;
            }
            case 8:
            {
                int lineAmt=5;
                float r=100, a, inc = TWO_PI/(float)lineAmt;                
                for(int i=0;i<lineAmt;i++){
                    a = inc*i;
                    stroke(100,255,255);
                    line(cx,cy,cx+(sin(a)*r),cy+(cos(a)*r));
                }
                break;
            }
            case 9:
            {

            }
        }
    }
}
