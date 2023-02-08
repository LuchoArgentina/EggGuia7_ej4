/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lucho
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    public int calculaSuperficie(int base, int altura){
        
        int sup;
        
        sup = base * altura;
                
       return sup;      
        
    }
    
    
    public int calculaPerimetro(int base, int altura){
        
        int per;
        
        per = (base + altura)*2;
                
       return per;      
        
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
    
}
