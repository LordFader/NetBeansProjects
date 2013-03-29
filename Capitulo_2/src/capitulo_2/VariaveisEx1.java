/** VARIÁVEIS I**/

/* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_2;

/**
 *
 * @author PGodinho
 */
public class VariaveisEx1 {
    public static void main(String args[]){
      int a, b, h, o;
      String s;
      a=2;
      b=2;
      h=0x00D; //Hexadecimal 13
      o=011; //Octal 9
      System.out.println("h ="+h+"   o="+o);
      // em binário 13...
      System.out.println("h (em binário)=" + Integer.toBinaryString(h));
      
      s="TOTAL=";
      System.out.println(s+(a+b));
      
      float f=2.14f; //f indica que é float
      double d=3e10; //notação científica
      char c='a'; //limita char
      System.out.println("float="+f);
      System.out.println("double="+d);
      System.out.println("char="+c);
    }
}
