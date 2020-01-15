import java.util.ArrayList;

public class moimeme {
    public static void main (String [] args) {
        ArrayList<String> funcionarios = new ArrayList< String>();
        funcionarios.add( "jeffer");
        funcionarios.add("allayye");
        funcionarios.add("gabriel");
        funcionarios.add("jude");
        funcionarios.add("mariam");
        funcionarios.add("fantim");

        for (String funcionario :funcionarios){
            System.out.println(funcionario);
        }
    }
}
