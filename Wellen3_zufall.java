
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen3_zufall.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen3_zufall extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(900,900);
    } 
    int weiß = 255;
    int schwarz = 0;
    int[] xpositionen = {2, 42, 62, 102, 122, 162};
    
    public void zeichneGroßeQuadrate()
    {
        for (int a=0; a<=15; a++)
        {   
            for (int b = 0; b < 15; b++)
            {   
                fill(0);
                square(0 + a * 120, 0 + b * 120, 60);
                square(60 + a * 120, 60 + b * 120, 60);
            }
        }
    }
    public void zeichneKleineQuadrate()
    {
        for (int c=0; c<=30; c++)
        {   
            for (int d = 0; d < 15; d++)
            {   
                
                square(xpositionen[round(random(1, 5))] , 2 ,16);
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
        zeichneGroßeQuadrate();
        zeichneKleineQuadrate();
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
        PApplet.main(new String[] {Wellen3_zufall.class.getName() });
    }

}
