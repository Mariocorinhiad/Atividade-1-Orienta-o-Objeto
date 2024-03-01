/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.carro;

/**
 *
 * @author Admin
 */
public class AtividadeCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Veiculo carro = new Veiculo(2024," Onix "," Branco ");
        Veiculo carro2 = new Veiculo(2023, " Cruze ", " Azul "); 
        
        System.out.println(Veiculo.Marca + carro.Modelo + carro.ano + carro.Cor);
        System.out.println(Veiculo.Marca + carro2.Modelo + carro2.ano + carro2.Cor);
        
    }
    
}
