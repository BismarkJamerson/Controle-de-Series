package Controle;

import java.awt.Button;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Convert {

    public static byte[] converterStringParaBytes(String arquivo) throws Exception {
        InputStream input = new FileInputStream(arquivo);
        byte[] buffer = new byte[input.available()];
        input.read(buffer);
        input.close();
        return buffer;
    }

    public static String converterBytesParaString(byte[] bytes) throws Exception {
        BASE64Encoder encoder = new BASE64Encoder();
        String arquivo = encoder.encodeBuffer(bytes);
        return arquivo;
    }

    public static Image converterStringParaImagem(String arquivo) throws Exception {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(arquivo);
        Image imagem = new ImageIcon(bytes).getImage();

        return imagem;
    }

    public static byte[] converterImagemParaByte(String URL) {
        // convert BufferedImage to byte array
        byte[] img = null;
        try {
            File f = new File(URL);
            BufferedImage o=ImageIO.read(f);
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ImageIO.write(o, "jpg", b);
            img = b.toByteArray();
        } catch (IOException ex) {
            Logger.getLogger(Convert.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }
    
    public static ImageIcon getImagem(byte[] ib){
        ImageIcon img = null; 
        try {
            String x = Convert.converterBytesParaString(ib);
            Image i = Convert.converterStringParaImagem(x);
            img = new ImageIcon(i);

        } catch (Exception ex) {
            
        }
    return img;
    }   
    
        public static String caminhoImg() {
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
            file.setFileFilter(filter);
            int i = file.showSaveDialog(null);
            File arquivo = file.getSelectedFile();
            return (arquivo.getPath());
    }
    
}
