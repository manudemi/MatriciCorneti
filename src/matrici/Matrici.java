
package matrici;

/**
 *
 * @author Corneti
 */
public class Matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matrice m = new Matrice(2, 10);
        
        m.fillRandom();
        System.out.println(m);
      
        m.toFile("data/matrice.txt");
      
    }
    
}
