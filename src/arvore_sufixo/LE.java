package arvore_sufixo;

/*
 * Pacote de metodos para realizar entrada e saida de dados
 */

import java.io.*;
import javax.swing.JOptionPane;


/*
 * Classe principal
 */
public class LE {
  /*
   * Metodo para exibicao de numeros inteiros
   */

  public static synchronized void show(int num) {
    JOptionPane.showMessageDialog(null, Integer.toString(num), "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
  } // end of method 
  
  /*
   * Metodo para exibicao de numeros reais
   */

  public static synchronized void show(float num) {
    JOptionPane.showMessageDialog(null, Float.toString(num), "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
  } // end of method 

  
  /*
   * Metodo para exibicao de numeros reais
   */

  public static synchronized void show(double num) {
    JOptionPane.showMessageDialog(null, Double.toString(num), "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
  } // end of method 

  /*
   * Metodo para exibicao de strings
   */

  public static synchronized void show(String str) {
    JOptionPane.showMessageDialog(null, str, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
  } // end of method 

  /*
   * Metodo para exibicao de caracter
   */

  public static synchronized void show(char ch) {
    JOptionPane.showMessageDialog(null, ch, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
  } // end of method 

  
  /*
   * Metodo para leitura de numeros inteiros
   */

  public static synchronized int readIntPane(String msg) {
    String info;
    int num = 0;

    try {
      info = JOptionPane.showInputDialog(msg, 0);
      // conversao para "inteiro"
      num = Integer.parseInt(info);
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return num;
  } // end of method 

  
  /*
   * Metodo para leitura de numeros reais
   */
  
  public static synchronized float readFloatPane(String msg) {
    String info;
    float num = 0;

    try {
      info = JOptionPane.showInputDialog(msg, 0.0);
      // conversao para "inteiro"
      num = Float.parseFloat(info);
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return num;
  } // end of method 

  
  public static synchronized double readDoublePane(String msg) {
    
    double num = 0.0;
    String info;

    try {
      info = JOptionPane.showInputDialog(msg, 0.0);
      // conversao para "inteiro"
      num = Double.parseDouble(info);
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return num;
  } // end of method
  
  /*
   * Metodo para leitura de strings
   */
  public static synchronized String readStringPane(String msg) {
    String info ="";

    try {
      info = JOptionPane.showInputDialog(msg, "");
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return info;
  } // end of method
  
  /*
   * Metodo para leitura de caracteres
   */
  public static synchronized char readCharPane(String msg) {
    String info ="";
    char ch = '\0';

    try {
      info = JOptionPane.showInputDialog(msg, "");
      // conversao para caracter
      ch = info.charAt(0);
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return ch;
  } // end of method readChar
  
//------------------------------------------------
  /*
   * Metodo para leitura de numeros inteiros
   */
  public static synchronized int readInt(String msg) {
    BufferedReader br;
    int num = 0;

    try {
      System.out.print(msg);
      br = new BufferedReader(new InputStreamReader(System.in));
      // conversao para "inteiro"
      num = Integer.parseInt(br.readLine());
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return num;
  } // end of method readInt

  /* 
   * Metodo para leitura de numeros reais
   */
  public static synchronized float readFloat(String msg) {
    BufferedReader br;
    float num = 0;

    try {
      System.out.print(msg);
      br = new BufferedReader(new InputStreamReader(System.in));
      // conversao para "real"
      num = Float.parseFloat(br.readLine());
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return num;
  } // end of method readFloat

  
  /* 
   * Metodo para leitura de numeros reais
   */
  public static synchronized double readDouble(String msg) {
    BufferedReader br;
    double num = 0.0;

    try {
      System.out.print(msg);
      br = new BufferedReader(new InputStreamReader(System.in));
      // conversao para "real"
      num = Double.parseDouble(br.readLine());
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return num;
  } // end of method readDouble

  /*
   * Metodo para leitura de strings
   */
  public static synchronized String readString(String msg) {
    BufferedReader br;
    String str = "";

    try {
      System.out.print(msg);
      br = new BufferedReader(new InputStreamReader(System.in));
      // conversao para "real"
      str = br.readLine().toString();
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return str;
  } // end of method readString

  /*
   * Metodo para leitura de caracteres
   */
  public static synchronized char readChar(String msg) {
    BufferedReader br;
    char ch = '\0';

    try {
      System.out.print(msg);
      br = new BufferedReader(new InputStreamReader(System.in));
      // conversao para "real"
      ch = br.readLine().charAt(0);
    } catch (Exception e) {
      System.out.println("Erro na execucao do algoritmo");
      System.out.print(e.getMessage());
    }
    return ch;
  } // end of method readChar
} // end of class LE
