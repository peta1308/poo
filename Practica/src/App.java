public class App {
    public static void main(String[] args) throws Exception {
        Persona [] persona = {new Estudiante(), new Profesor()};

        for(Persona p: persona){
            p.saludar();
        }
        
    
    }
}
