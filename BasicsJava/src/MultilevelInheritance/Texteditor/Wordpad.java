//Program to Define Child Class Wordpad with Formatting Text Feature :
package MultilevelInheritance.Texteditor;

public class Wordpad extends NotePad 
{
    private boolean isBold;

    public Wordpad ( )
    {
        super ( );
        this.isBold = false;
    }
    public void formatText(boolean bold)
    	{
        if (bold)
        {
            content = "<b>" + content + "</b>";
        }
        isBold = bold;
    }
    public boolean isBold ( )
    {
        return isBold;
    }
}