/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipostring;

/**
 *
 * @author joaof
 */
public class TipoString {
    public static void main(String[] args) {
        // .charAt(index) -> Pegar a letra dentro da String
        System.out.println("Boa aula pessoal".charAt(4));
        
        String s ="Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        
        // .lengh() -> Comprimento da string
        System.out.println(s.length());
        
        // .starsWith("texto") -> Verifica se começa com "texto"
        System.out.println(s.startsWith("Boa"));
        
        // .endsWith("texto") -> Verifica se termina com "texto"
        System.out.println(s.endsWith("!"));
        
        // .equals('texto') -> Verifica igualdade de conteúdo.
        System.out.println(s.equals("Boa"));
        
        
    }
}
