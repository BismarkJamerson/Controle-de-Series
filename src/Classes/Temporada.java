package Classes;

import java.sql.Date;

public class Temporada {
    public int id;
    public int Numero_Temporada;
    public int Total_Episodios;
    public int FK_Serie;
    public Date Data_Lancamento;
    public int FK_Status;

    public Temporada() {
    }

    public Temporada(int id, int Numero_Temporada, int Total_Episodios, int FK_Serie, Date Data_Lancamento, int FK_Status) {
        this.id = id;
        this.Numero_Temporada = Numero_Temporada;
        this.Total_Episodios = Total_Episodios;
        this.FK_Serie = FK_Serie;
        this.Data_Lancamento = Data_Lancamento;
        this.FK_Status = FK_Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_Temporada() {
        return Numero_Temporada;
    }

    public void setNumero_Temporada(int Numero_Temporada) {
        this.Numero_Temporada = Numero_Temporada;
    }

    public int getTotal_Episodios() {
        return Total_Episodios;
    }

    public void setTotal_Episodios(int Total_Episodios) {
        this.Total_Episodios = Total_Episodios;
    }

    public int getFK_Serie() {
        return FK_Serie;
    }

    public void setFK_Serie(int FK_Serie) {
        this.FK_Serie = FK_Serie;
    }

    public Date getData_Lancamento() {
        return Data_Lancamento;
    }

    public void setData_Lancamento(Date Data_Lancamento) {
        this.Data_Lancamento = Data_Lancamento;
    }

    public int getFK_Status() {
        return FK_Status;
    }

    public void setFK_Status(int FK_Status) {
        this.FK_Status = FK_Status;
    }
    
    
    
    
    
}
