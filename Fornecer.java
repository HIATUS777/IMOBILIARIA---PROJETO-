/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiza
 */
public class Fornecer {
    
    private String nome, CPF, uf, code;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
   public String Salvar(){
       
       try{
        BufferedReader bf = new BufferedReader(new FileReader(this.code+"f.txt"));
        Clientes pf = new Clientes();
        pf.setCode(this.code);
         bf.close();
         return "ERROR,SEU CODIGO JÁ FOI CADASTRADO";
        }
       catch(Exception ex){
             Logger.getLogger(Clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
        }
       
       
       try {
      
           //filewriter biblioteca para salvar arquivos de texto
           
           FileWriter fw = new FileWriter(this.code+"f.txt",false);
            //criando o aqrquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           pw.println(this.code);
           pw.println(this.nome);
           pw.println(this.CPF);
           pw.println(this.uf);
           
           pw.flush();//enviar o arquivo
           pw.close();//fechar
           fw.close();//fechar
           return "Cadastro realizado com sucesso!";    
                  
       }
       
       
      catch (IOException ex){
          JOptionPane.showMessageDialog(null, "Cadastro não realizado!"+ex);
          Logger.getLogger(Clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
       return "ERRO!";
   
       
   }
   public String Atualizar(){
       try {
          
           //filewriter biblioteca para salvar arquivos de texto
           
           FileWriter fw = new FileWriter(this.code+"f.txt",false);
            //criando o aqrquivo
            
           PrintWriter pw = new PrintWriter(fw);
           //escrevendo o conteúdo no arquivo e quebra as linhas
           
           pw.println(this.code);
           pw.println(this.nome);
           pw.println(this.CPF);
           pw.println(this.uf);
           
           pw.flush();//enviar o arquivo
           pw.close();//fechar
           fw.close();//fechar
             return "Atualizado com sucesso!";
        
       }
      catch (IOException ex){
          JOptionPane.showMessageDialog(null, "Não foi possível atualizar!"+ex);
          Logger.getLogger(Clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
      return "ERRO!";
       
   }
   public String Deletar(){
       
       
      try{
      BufferedReader bf = new BufferedReader(new FileReader(this.code+"f.txt"));
        Clientes pf = new Clientes();
        pf.setCode(this.code);
         bf.close();
       File arquivo = new File(this.code+"f.txt");
       arquivo.delete();
       
       return "Deletado com sucesso!";
      }
       catch(Exception ex){
          Logger.getLogger(Clientes.class.getName())
                  .log(Level.SEVERE,null,ex);
      }
      
      return "Não possivel deletar";
      
   }

}
