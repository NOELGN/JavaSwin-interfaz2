public class Alumno {
      private String matricula;
      private String nombre;
      private String apellidos;
      private String telefono;
      private String email;
      private byte edad;

      public Alumno(String matricula,
                    String nombre,
                    String apellidos,
			    byte edad,
                    String telefono,
                    String email){
                    
      this.matricula=matricula;
      this.nombre=nombre;
      this.apellidos=apellidos;
      this.edad=edad;
      this.telefono=telefono;
      this.email=email;
}
      public String toString(){
           return "matricula: "+matricula+ "\tnombre: "+ nombre+ "\tapellidos: "+apellidos+"\tedad: "+edad+"\ttelefono: "+telefono+"\temail: "+email+"\n";
      
      }   
}