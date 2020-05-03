package Classes;

import java.sql.Date;

public class Historico_Usuario {
    public int id;
    public int Episodio_Atual;
    public int Temporada_Atual;
    public String Tempo_Atual;
    public int FK_Usuario;
    public int FK_Serie;
    public Date Ultimo_Dia;
    public int Total_Series;
    public int Total_Episodios;
    public int Total_Temporadas;
    public String Total_Tempo;        
            
            
    public Historico_Usuario() {
    }

    public Historico_Usuario(int id, int Episodio_Atual, int Temporada_Atual, String Tempo_Atual, int FK_Usuario, int FK_Serie, Date Ultimo_Dia, int Total_Series, int Total_Episodios, int Total_Temporadas, String Total_Tempo) {
        this.id = id;
        this.Episodio_Atual = Episodio_Atual;
        this.Temporada_Atual = Temporada_Atual;
        this.Tempo_Atual = Tempo_Atual;
        this.FK_Usuario = FK_Usuario;
        this.FK_Serie = FK_Serie;
        this.Ultimo_Dia = Ultimo_Dia;
        this.Total_Series = Total_Series;
        this.Total_Episodios = Total_Episodios;
        this.Total_Temporadas = Total_Temporadas;
        this.Total_Tempo = Total_Tempo;
    }

    public int getTotal_Series() {
        return Total_Series;
    }

    public void setTotal_Series(int Total_Series) {
        this.Total_Series = Total_Series;
    }

    public int getTotal_Episodios() {
        return Total_Episodios;
    }

    public void setTotal_Episodios(int Total_Episodios) {
        this.Total_Episodios = Total_Episodios;
    }

    public int getTotal_Temporadas() {
        return Total_Temporadas;
    }

    public void setTotal_Temporadas(int Total_Temporadas) {
        this.Total_Temporadas = Total_Temporadas;
    }

    public String getTotal_Tempo() {
        return Total_Tempo;
    }

    public void setTotal_Tempo(String Total_Tempo) {
        this.Total_Tempo = Total_Tempo;
    }

  

    public Date getUltimo_Dia() {
        return Ultimo_Dia;
    }

    public void setUltimo_Dia(Date Ultimo_Dia) {
        this.Ultimo_Dia = Ultimo_Dia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEpisodio_Atual() {
        return Episodio_Atual;
    }

    public void setEpisodio_Atual(int Episodio_Atual) {
        this.Episodio_Atual = Episodio_Atual;
    }

    public int getTemporada_Atual() {
        return Temporada_Atual;
    }

    public void setTemporada_Atual(int Temporada_Atual) {
        this.Temporada_Atual = Temporada_Atual;
    }

    public String getTempo_Atual() {
        return Tempo_Atual;
    }

    public void setTempo_Atual(String Tempo_Atual) {
        this.Tempo_Atual = Tempo_Atual;
    }

    public int getFK_Usuario() {
        return FK_Usuario;
    }

    public void setFK_Usuario(int FK_Usuario) {
        this.FK_Usuario = FK_Usuario;
    }

    public int getFK_Serie() {
        return FK_Serie;
    }

    public void setFK_Serie(int FK_Serie) {
        this.FK_Serie = FK_Serie;
    }
    
    
    
}
