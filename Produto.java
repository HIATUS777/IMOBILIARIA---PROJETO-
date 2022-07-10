/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

/**
 *
 * @author Luiza
 */
public class Produto {
   public String estado;
   public double c_suite,c_banheiro,c_quarto,a_suite,a_banheiro,a_quarto;
   public int quant_q,quant_b,quant_s;
   public double valor,total;
  public  Produto(){
        c_suite = 0;
        c_banheiro =0;
        c_quarto =0;
        a_suite =0;
        a_banheiro =0;
        a_quarto =0;
        estado = null;
        valor = 0;
        total = 0;
        quant_q = 0;
        quant_b = 0;
        quant_s = 0;
             
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getC_suite() {
        return c_suite;
    }

    public void setC_suite(double c_suite) {
        this.c_suite = c_suite;
    }

    public double getC_banheiro() {
        return c_banheiro;
    }

    public void setC_banheiro(double c_banheiro) {
        this.c_banheiro = c_banheiro;
    }

    public double getC_quarto() {
        return c_quarto;
    }

    public void setC_quarto(double c_quarto) {
        this.c_quarto = c_quarto;
    }

    public double getA_suite() {
        return a_suite;
    }

    public void setA_suite(double a_suite) {
        this.a_suite = a_suite;
    }

    public double getA_banheiro() {
        return a_banheiro;
    }

    public void setA_banheiro(double a_banheiro) {
        this.a_banheiro = a_banheiro;
    }

    public double getA_quarto() {
        return a_quarto;
    }

    public void setA_quarto(double a_quarto) {
        this.a_quarto = a_quarto;
    }

    public int getQuant_q() {
        return quant_q;
    }

    public void setQuant_q(int quant_q) {
        this.quant_q = quant_q;
    }

    public int getQuant_b() {
        return quant_b;
    }

    public void setQuant_b(int quant_b) {
        this.quant_b = quant_b;
    }

    public int getQuant_s() {
        return quant_s;
    }

    public void setQuant_s(int quant_s) {
        this.quant_s = quant_s;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    
   
    
    public double CalcTotal(){
        
        if(this.estado == "Mansão"){
            c_suite = 23 *quant_s;
            c_quarto = 43* quant_q;
            c_banheiro = 32* quant_b;
            valor = 1000000;
            total = valor + c_suite + c_quarto +c_banheiro;
            
        }
        if(this.estado == "Apartamento"){
            c_suite = 21 * quant_s;
            c_quarto = 34 * quant_q;
            c_banheiro = 22 * quant_b;
            valor = 120000;
            total = valor + c_suite + c_quarto +c_banheiro;
            
        }
          if(this.estado == "Duplex"){
            c_suite = 44 * quant_s;
            c_quarto = 33 * quant_q;
            c_banheiro = 22 * quant_b;
            valor = 100000;
            total = valor + c_suite + c_quarto +c_banheiro;
            
        }
              if(this.estado == "Kitnet"){
            c_suite = 45 * quant_s;
            c_quarto = 34 * quant_q;
            c_banheiro = 25 * quant_b;
            valor = 50000;
            total = valor + c_suite + c_quarto +c_banheiro;
            
        }
               if(this.estado == "Predio"){
            c_suite = 45 * quant_s;
            c_quarto = 24 * quant_q;
            c_banheiro = 15 * quant_b;
            valor = 250000;
            total = valor + c_suite + c_quarto +c_banheiro;
            
        }
                   if(this.estado == "Cobertura"){
            c_suite = 23 * quant_s;
            c_quarto = 43 * quant_q;
            c_banheiro = 43 * quant_b;
            valor = 200000;
            total = valor + c_suite + c_quarto +c_banheiro;
            
        }
                   
            if(this.estado == "Condominio"){
            c_suite = 23 * quant_s;
            c_quarto = 43 * quant_q;
            c_banheiro = 43 * quant_b;
            valor = 500000;
            total = valor + c_suite + c_quarto +c_banheiro;
            
        }
        
        
        
        
        
        return total;
    }
    public double CalcAlugar(){
        
        if(this.estado == "Mansão"){
            a_suite = 23 *quant_s;
            a_quarto = 43* quant_q;
            a_banheiro = 32* quant_b;
            valor = 100000;
            total = valor + a_suite + a_quarto +a_banheiro;
            
        }
        if(this.estado == "Apartamento"){
            a_suite = 21 * quant_s;
            a_quarto = 34 * quant_q;
            a_banheiro = 22 * quant_b;
            valor = 12000;
              total = valor + a_suite + a_quarto +a_banheiro;
            
        }
          if(this.estado == "Duplex"){
            a_suite = 44 * quant_s;
            a_quarto = 33 * quant_q;
            a_banheiro = 22 * quant_b;
            valor = 10000;
            total = valor + a_suite + a_quarto +a_banheiro;
            
        }
              if(this.estado == "Kitnet"){
            a_suite = 45 * quant_s;
            a_quarto = 34 * quant_q;
            a_banheiro = 25 * quant_b;
            valor = 500;
        total = valor + a_suite + a_quarto +a_banheiro;  
        }
               if(this.estado == "Predio"){
            a_suite = 45 * quant_s;
            a_quarto = 24 * quant_q;
            a_banheiro = 15 * quant_b;
            valor = 2500;
               total = valor + a_suite + a_quarto +a_banheiro;
            
        }
                   if(this.estado == "Cobertura"){
            a_suite = 23 * quant_s;
            a_quarto = 43 * quant_q;
            a_banheiro = 43 * quant_b;
            valor = 1500;
              total = valor + a_suite + a_quarto +a_banheiro;
            
        }
                   
            if(this.estado == "Condominio"){
            a_suite = 23 * quant_s;
            a_quarto = 43 * quant_q;
            a_banheiro = 43 * quant_b;
            valor = 750;
             total = valor + a_suite + a_quarto +a_banheiro;
            
        }
        
        
        
        
        
        return total;
    }
    
}
