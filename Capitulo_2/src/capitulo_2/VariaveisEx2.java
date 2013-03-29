/** VARIÁVEIS II**/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_2;

/**
 *
 * @author PGodinho
 */
public class VariaveisEx2 {
    public static void main(String args[]){
       byte b=3;
       short s;
       int i;
       long l;
       float f=3.0f;
       double d;
       char c='a';
       s=b; // short <-- byte
       System.out.println("short=" +s);
       i=s; // int <-- short
       System.out.println("int=" +i);
       i=c; // int <-- chart
       System.out.println("int=" +i);
       l=i; // long <-- int
       System.out.println("long=" +1);
       f=i; // float <-- int
       System.out.println("float=" +f);
       f=l; // float <-- long
       System.out.println("float=" +f);
       d=i; // double <-- int
       System.out.println("double=" +d);
       d=l; // double <-- long
       System.out.println("double=" +d);
       d=f; // double <-- float
       System.out.println("double=" +d);
       
       //Exemplos sem perda de precisão...
       // float+int=float
       float x=f+i;
       System.out.println("f="+x);
       // float+int=int
       int y=(int)f+i;
       System.out.println("i="+y);
       
       //Exemplos com perda de precisão... -->ATENÇÂO!
       i=1677217;
       f=i;
       System.out.println(f); //imprime 1.677216E7 em vez de 1.6777217E
    }
}
