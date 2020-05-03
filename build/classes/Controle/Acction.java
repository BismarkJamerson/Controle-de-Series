package Controle;

import BancoDeDados.Select_Banco;
import Classes.Series;
import Telas.tela_Serie;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class Acction {
    
    
    public void botao(JButton bt){
        bt.addActionListener(new ActionListener() { 
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            List<Series> lista = new ArrayList();
              Select_Banco Sec = new Select_Banco();
              lista = Sec.Select_SeriesEdit1(bt.getText());
                tela_Serie tela = new tela_Serie(lista);
                tela.setVisible(true);
           
        }

        });
    
    
    }
    
}
