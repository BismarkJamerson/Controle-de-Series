package Classes;

public class fk_Series_Categorias {

    public int fk_Series;
    public int fk_Categorias;

    public fk_Series_Categorias() {
    }

    public fk_Series_Categorias(int fk_Series, int fk_Categorias) {
        this.fk_Series = fk_Series;
        this.fk_Categorias = fk_Categorias;
    } 

    public int getFk_Series() {
        return fk_Series;
    }

    public void setFk_Series(int fk_Series) {
        this.fk_Series = fk_Series;
    }

    public int getFk_Categorias() {
        return fk_Categorias;
    }

    public void setFk_Categorias(int fk_Categorias) {
        this.fk_Categorias = fk_Categorias;
    }

    
    
    
}
