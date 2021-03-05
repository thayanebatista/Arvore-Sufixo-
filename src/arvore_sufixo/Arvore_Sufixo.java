package arvore_sufixo;
import java.util.ArrayList;
import java.util.List;

/**
 * cria uma string que vai receber a palavra (string)
 * um array list com as novas strings geradas apartir da palavra
 * @author Thayane
 */
public class Arvore_Sufixo {
    private static class Node {
        String sub = "";                       
        List<Integer> ch = new ArrayList<>();  
    }
 
    /**
     * usando um for a gente cria uma nova string
     * apartir da palavra inserida
     * 
     */
    private static class ArvoreSufixo {
        private List<Node> no = new ArrayList<>();
 
        public ArvoreSufixo(String str) {
            no.add(new Node());
            for (int i = 0; i < str.length(); ++i) {
                inserir(str.substring(i));
            }
        }
 
        private void inserir(String suf) {
            int n = 0;
            int i = 0;
            while (i < suf.length()) {
                char b = suf.charAt(i);
                List<Integer> filho = no.get(n).ch;//pega a posição n do arraylist
                int x2 = 0;
                int n2;
                while (true) {
                    if (x2 == filho.size()) {
                        // se não tem nenhum filho que corresponde, os resto se torna um novo nó
                        n2 = no.size();//n2 vai ter o mesmo tamanho de no 
                        Node temp = new Node();
                        temp.sub = suf.substring(i);//aqui a variavel vai receber cada parte da palavra, a função substring de acordo como o avanço de i vai desmembrar a palavra
                        no.add(temp);//adiciona como um nó a palabvra que temp recebeu 
                        filho.add(n2);// 
                        return;
                    }
                    n2 = filho.get(x2);
                    if (no.get(n2).sub.charAt(0) == b) break;
                    x2++;
                }
                // find prefix of remaining suffix in common with child
                //aqui ele vai encontrar se existe alguma palvra que tenha a mesma semelhança com outra
                //por exemplo palavras que comecem com as mesmas letras, silabas, etc
                String sub2 = no.get(n2).sub;
                int j = 0;
                while (j < sub2.length()) {
                    if (suf.charAt(i + j) != sub2.charAt(j)) {
                        
                        int n3 = n2;
                        // novo no para parte em comum
                        n2 = no.size();
                        Node temp = new Node();
                        temp.sub = sub2.substring(0, j);
                        temp.ch.add(n3);
                        no.add(temp);
                        no.get(n3).sub = sub2.substring(j);  // old node loses the part in common
                        no.get(n).ch.set(x2, n2);
                        break;  
                    }
                    j++;
                }
                i += j;  // avança a parte em comum, i recebe i + j
                n = n2;  // desce na arvore
            }
        }
 
        /**
         * funções para vizualização da tree
         * concebida com ajuda de algoritmos prontos da internet
         * para implementação visual da arvore de sufixo
         */
        public void visualizar() {
            if (no.isEmpty()) {
                System.out.println("<empty>");
                return;
            }
            visualizar_f(0, "");
        }
 
        private void visualizar_f(int n, String pre) {
            List<Integer> children = no.get(n).ch;
            if (children.isEmpty()) {
                System.out.println("- " + no.get(n).sub);
                return;
            }
            System.out.println("┐ " + no.get(n).sub);
            for (int i = 0; i < children.size() - 1; i++) {
                Integer c = children.get(i);
                System.out.print(pre + "├─");
                visualizar_f(c, pre + "│ ");
            }
            System.out.print(pre + "└─");
            visualizar_f(children.get(children.size() - 1), pre + "  ");
        }
    }
 
        public static void main(String[] args) {
        //new SuffixTree("thayane$").visualize();
        //LE.readStringPane("Digite uma palavra com o $ no final: ");
        
        ArvoreSufixo sf = new ArvoreSufixo(LE.readStringPane("Digite uma palavra com o $ no final: "));
        sf.visualizar();
        
    }
}
    
