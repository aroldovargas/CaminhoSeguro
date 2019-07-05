/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrimeVisao;

import Crime.Dominio.Crime;
import javax.swing.JOptionPane;


/**
 *
 * @author harri
 */
public class InputCrime {
    
    public Crime dadosCrime(){
        
        String id = JOptionPane.showInputDialog("Informe o ID do Crime: ");
        String data = JOptionPane.showInputDialog("Informe a data do crime ");
        String hora = JOptionPane.showInputDialog("IInforme a hora do crime: ");
        String tipo_Crime = JOptionPane.showInputDialog("Informe o Tipo do Crime ");
        String vitima = JOptionPane.showInputDialog("Informe o sexo da vitiman: ");
        String idade = JOptionPane.showInputDialog("Informe a idade da vitima "); 
        String cidade = JOptionPane.showInputDialog("Informe a cidade do crime: ");  
        String bairro = JOptionPane.showInputDialog("informe o bairro do crime ");  
        String rua = JOptionPane.showInputDialog("informe a rua do crime: ");
        Crime crime = null;
        try{
            crime = new Crime(id,data,hora, tipo_Crime, vitima, idade,cidade,bairro,rua);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null,"Digite 1 para preencher os dados cadastrais novamente ou pressione qualquer tecla para sair");
            int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - PREENCHER COMENTARIO NOVAMENTE\n0 - PRESSIONE 0 ou QUALQUER TECLA PARA PARA SAIR"));
            if(operacao == 1){
                crime = dadosCrime();
            }
            else{
                return null;
            }
        }
        return crime;
    } 
    
}
