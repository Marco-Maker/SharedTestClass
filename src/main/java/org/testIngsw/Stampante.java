package org.testIngsw;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Stampante
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public void stampa(String s){
        System.out.println(s);
    }

    public boolean conferma(){
        return true;
    }

    public int numero_casuale(){
        Random r = new Random();
        return r.nextInt();
    }

}
