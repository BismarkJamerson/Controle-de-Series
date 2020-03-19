
package Classes;


public class Historico_Series {
   int FK_Historico;
   int FK_Serie;

    public Historico_Series() {
    }

    public int getFK_Historico() {
        return FK_Historico;
    }

    public void setFK_Historico(int FK_Historico) {
        this.FK_Historico = FK_Historico;
    }

    public int getFK_Serie() {
        return FK_Serie;
    }

    public void setFK_Serie(int FK_Serie) {
        this.FK_Serie = FK_Serie;
    }

    public Historico_Series(int FK_Historico, int FK_Serie) {
        this.FK_Historico = FK_Historico;
        this.FK_Serie = FK_Serie;
    }
   
   
   
   
}
