
//Completare i metodi della classe e consegnare il link di gitHub.

package matrici;

import java.io.FileWriter;

/**
 *
 * @author Corneti
 */
public class Matrice {
     FileWriter fw;
    int[][] theMatrix;
    
    
    
    
    // costruttore uno
    public Matrice(int x, int y) {
        theMatrix = new int[x][y];
    }
    
    // costruttore due
    public Matrice(int[][] m) {
        theMatrix = m;
    }
    
    public void fillRandom() {
        for(int i= 0; i < theMatrix.length; i++){
            for(int j = 0; j< theMatrix[i].length; j++){
                theMatrix[i][j] = (int)(Math.random()*10);
                
            }
       
        }
    }

    @Override
    public String toString() {
        String tabella = "";
        for(int i= 0; i < theMatrix.length; i++){
            for(int j = 0; j< theMatrix[i].length; j++){
                
                
                    tabella = tabella + "["+i+"]"+"["+j+"] =" + theMatrix[i][j] + "\t";
                }
                tabella += "\n";
            }
       
        
        return tabella;
    }

    public void toFile( String filename ) {
        try{
            fw = new FileWriter(filename);
            for(int i= 0; i < theMatrix.length; i++){
                for(int j = 0; j< theMatrix[i].length; j++){
                      fw.write("["+i+"]"+"["+j+"] =" + theMatrix[i][j] + "\t");                   
                
                }
                fw.write("\n");
            }
            fw.close();
        }
        catch(Exception ex){
            System.out.println("Errore: " + ex.getMessage());
        }
    }

    public void fromFile( String filename ) {
        
    }
    
}

