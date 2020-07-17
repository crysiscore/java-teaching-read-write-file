import java.util.ArrayList;
import java.util.List;



public class Task1 {


    //Lista dos possiveis Localizacao do logFile
    //final static List<String> logFileLocations = new ArrayList<>();
    // Esta classe vai ler e escrever um logFile  com os detalhe das excecpiotns que podem ocorrer
    // durante o processo de uniao de nids. O ficheiro deve ser criado na pasta de instalacao do idart que pode ser
    // C:\\idart ou C:\\Program Files\\idart ou C:\\Program Files (x86)\\idart.
    ReadWriteTextFile rwTextFile = new ReadWriteTextFile();

    final static String ficheiro_gravado = "/home/agnaldo/Documents/ficheiro_teste.txt";
    // definir uma lista de frutas
    List <String> frutas;
    List<String> frutas_favoritas;
    //construtor
     Task1(){
         
        // Inicializar a lista de frutas
        frutas = new ArrayList<>();
     }

     public void AdicionarFruta( final String nomeFruta) {
        // adicionar uma fruta a lista de frutas
        frutas.add(nomeFruta);

        rwTextFile.writeSmallTextFile(frutas, ficheiro_gravado);
     }

     public List<String> LerFrutasFavoritas(final String loction) {

         try{
            frutas_favoritas = rwTextFile.readSmallTextFile(ficheiro_gravado);
         } catch (Exception e) {
            System.out.println("Ficheiro nao encontrado");
         }
         if(frutas_favoritas.size()==0){
           
            System.out.println("Vazio");
         }

         return frutas_favoritas;
     }

    
}