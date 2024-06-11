//Program to Define Child Class Word with Advance Feature :
package MultilevelInheritance.Texteditor;

public class Word extends Wordpad 
{
    private boolean spellCheckEnabled;

    public Word ( )
    {
        super ( );
        this.spellCheckEnabled = true;
    }

    public void spellCheck ( )
    {
        if (spellCheckEnabled) 
        {
            System.out.println("Running spell check...");
            // Simulate Spell Check Logic here
        } 
        else 
        {
            System.out.println("Spell check is disabled.");
        }
    }
    public void enableSpellCheck(boolean enable) 
    {
        spellCheckEnabled = enable;
    }
}