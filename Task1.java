import java.util.ArrayList;
import java.util.List;



public class Task1 {


    //Lista dos possiveis Localizacao do logFile
    //final static List<String> logFileLocations = new ArrayList<>();
    // Esta classe vai ler e escrever um logFile  com os detalhe das excecpiotns que podem ocorrer
    // durante o processo de uniao de nids. O ficheiro deve ser criado na pasta de instalacao do idart que pode ser
    // C:\\idart ou C:\\Program Files\\idart ou C:\\Program Files (x86)\\idart.
    ReadWriteTextFile rwTextFile = new ReadWriteTextFile();

    final static String logFileName = "/home/agnaldo/Documents/ficheiro_teste.txt";
    // definir uma lista de frutas
    List <String> frutas;

    //construtor
     Task1(){
         
        // Inicializar a lista de frutas
        frutas = new ArrayList<>();
     }

     public void AdicionarFruta( String nomeFruta){
        // adicionar uma fruta a lista de frutas
        frutas.add(nomeFruta);

        rwTextFile.writeSmallTextFile(frutas, logFileName );
     }
    
}