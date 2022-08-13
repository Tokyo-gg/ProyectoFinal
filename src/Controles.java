import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class Controles {
    @FXML
    private TextField nombre;
    @FXML
    private TextField telefono;
    @FXML
    private TextField email;
    @FXML
    private TextField titulo;
    @FXML
    private TextField institucion;
    @FXML
    private DatePicker fechaInicio;
    @FXML
    private DatePicker fechaFinalizacion;
    @FXML
    private TextField empresa;
    @FXML
    private TextField cargo;
    @FXML
    private DatePicker fechaInicio2;
    @FXML
    private DatePicker fechaFinalizacion2;
    @FXML
    private TextField logros;

    public void Foto(ActionEvent e) throws Exception{
        FileChooser fc = new FileChooser();//Permite elegir una foto y guardarla en un archivo que se usa al generar la hoja de vida
        File selectedFile = fc.showOpenDialog(null);
        FileWriter fw = new FileWriter("Path de foto.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(selectedFile.getAbsolutePath());
        bw.close();
        fw.close();
               
    
 }

    public void Generar(ActionEvent e) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("Path de foto.txt"));//Se establecen las variables a usar y la ruta o path de la foto
        String path = br.readLine();
        String nombre = this.nombre.getText();
        String telefono = this.telefono.getText();
        String email = this.email.getText();
        String titulo = this.titulo.getText();
        String institucion = this.institucion.getText();
        Date fechaInicio = Date.valueOf(this.fechaInicio.getValue());
        Date fechaFinalizacion = Date.valueOf(this.fechaFinalizacion.getValue());
        String empresa = this.empresa.getText();
        String cargo = this.cargo.getText();
        Date fechaInicio2 = Date.valueOf(this.fechaInicio2.getValue());
        Date fechaFinalizacion2 = Date.valueOf(this.fechaFinalizacion2.getValue());
        String logros = this.logros.getText();

    FileWriter fw = new FileWriter("hojaDeVida.html");//Crear el escritor
    BufferedWriter bw = new BufferedWriter(fw);//Crear el buffer
    bw.write("<!DOCTYPE html>\n");//Escribir el html
    bw.write("<html>\n");
    bw.write("<head>\n");
    bw.write("<title>Hoja de vida</title>\n");
    bw.write("</head>\n");
    bw.write("<body>\n");
    bw.write("<h1><center>Hoja de vida</center></h1>\n");
    bw.write("<p><img src= \" "+path+"\" alt= \"Foto Hoja de Vida\" width=\"200\" height=\"200\"</p>\n");
    bw.write("<h2>Datos basicos</h2>\n");
    bw.write("<p>Nombre: "+nombre+"</p>\n");
    bw.write("<p>Telefono: "+telefono+"</p>\n");
    bw.write("<p>Email: "+email+"</p>\n");
    bw.write("<h2>Estudios</h2>\n");
    bw.write("<p>Titulo: "+titulo+"</p>\n");
    bw.write("<p>Institucion: "+institucion+"</p>\n");
    bw.write("<p>Fecha de inicio: "+fechaInicio+"</p>\n");
    bw.write("<p>Fecha de finalizacion: "+fechaFinalizacion+"</p>\n");
    bw.write("<h2>Experiencia Laboral</h2>\n");
    bw.write("<p>Empresa: "+empresa+"</p>\n");
    bw.write("<p>Cargo: "+cargo+"</p>\n");
    bw.write("<p>Fecha de inicio: "+fechaInicio2+"</p>\n");
    bw.write("<p>Fecha de finalizacion: "+fechaFinalizacion2+"</p>\n");
    bw.write("<p>Logros/Descripcion del trabajo: "+logros+"</p>\n");
    bw.write("</body>\n");
    bw.write("</html>");
    bw.close();//Cerrar el buffer
    br.close();//Cerrar el pathfinder




    }



        
        

    
}
