
public class Fraction {

	public Fraction(int a,int b)
    {
      this.numerateur = a;
      this.denominateur = b;
    }
    
    public int get_LeNumerateur()
    {
        return this.numerateur;
    }
    public int get_LeDenominateur()
    {
        return this.denominateur;
    }
    public void setNumerateur(int a)
    {
        this.numerateur = a;
    }
    public void setDenominateur(int b)
    {
        this.denominateur = b;
    }
    public int get_pgcd()
    {
        return this.Lepgcd;
    }
   
       public String Affichage()
    {
        return "Fraction = " + this.numerateur + " / " + this.denominateur + " Numerateur = " + this.numerateur + " Denominateur = " + this.denominateur + " PGCD = "+ this.LePgcd();
    }
    public boolean compare(Fraction Frac){
       
        if (this.numerateur == Frac.numerateur && this.denominateur == Frac.denominateur){
            return true;
          
        }
        else{
            return false;
     
        }
    }
    private int numerateur;
    private int denominateur;
}
