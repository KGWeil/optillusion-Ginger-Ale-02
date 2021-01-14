
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2v1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2v1 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    } 
    int green = 0xff33cc33;
    int weiß = 255;
    public void zeichneQuadrate()
    {   
       for (int g=0; g<=6; g++)
        {   
           for(int h=0;h<=6; h++)
           {
               fill(weiß);
               stroke(weiß);
               square(0 + 100*g, 0 + 100*h, 50);               
               fill(green);
               stroke(green);
               square(5 + 100*g, 5 + 100*h, 40);
               square(55 + 100*g, 55 + 100*h, 40);  
        }
        }
       for (int i=0; i<=6; i++)
        {
            for(int j=0;j<=6; j++)
            {
                fill(green);
                stroke(green);
                square(50 + 100*i,0 + 100*j, 50);
                square(0 + 100*i,50 + 100*j, 50);
                fill(weiß);
                stroke(weiß);
                square(55 + 100*i,5 + 100*j, 40);
                square(5 + 100*i,55 + 100*j, 40);
            }
        }
    
      
    }
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        zeichneQuadrate();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2v1.class.getName() });
    }

}
