package maparisco;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip_kja6gpn
 */
public class PersistenciaArquivo {

    public void salvarEndereco(Endereco endereco) {

        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Bruno\\enderecos.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append("Endereço: " + endereco.getNomeRua() + ", " + endereco.getNomeBairro() + ", " + endereco.getNomeCidade()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

}