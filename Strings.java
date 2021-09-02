// DNA -> RNA
// G -> C
// C -> G
// T -> A
// A -> U

// Percorrer a string que tem o DNA.
// Analisar caractere a caractere para fazer a conversão:
// for (){
//     ...
// } 

// String s = "GGGCCAT";
// s.charAt(3); // retorna 'C'
// s.length(); // Tamanho da string

public class Strings {
    public static void main(String[] args) {
        String dna = "GGGCCAT";
        String rna = "";

        for (int letra = 0; letra < dna.length(); letra++) {

            if (dna.charAt(letra) == 'C') {
                rna += "G";
            } else if (dna.charAt(letra) == 'G') {
                rna += "C";
            } else if (dna.charAt(letra) == 'T') {
                rna += "A";
            } else {
                rna += "U";
            }
        }

    }
}
