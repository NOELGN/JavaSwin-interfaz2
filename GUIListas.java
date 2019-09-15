import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Stack;// para los metodos de pilas
//import java.io.*;

public class GUIListas extends JFrame{
      private JPanel pnlTitulo;
      private JPanel pnlBotones;
      private JPanel pnlBotonAbajo;
      private JPanel pnlContenedor;
      private JScrollPane scroll;
      private JLabel lblTitulo;
   
      private JButton btnQuitar;
      private JButton btnBuscar;
      private JButton btnBorrarTodo;
      private JButton btnAgregar;
      private JButton btnLimpiar;
      private JButton btnSalir;
      private JButton btnImprimir;

      private ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
      //private ArrayList<Alumno> llistaAlumnos=new ArrayList();
      private JTextArea txtArea;
      
      public GUIListas(){     
            super("Listas");
            setLayout(new BorderLayout());
    
            pnlTitulo=new JPanel();
            pnlTitulo.setLayout(new FlowLayout());
            
            add(pnlTitulo,BorderLayout.NORTH);
            lblTitulo=new JLabel(".:AGENDA ALUMNOS:.");
            pnlTitulo.add(lblTitulo);
          
            pnlContenedor= new JPanel();
            pnlContenedor.setLayout(new GridLayout(1,1));
            add(pnlContenedor,BorderLayout.CENTER);//posicion
            
            txtArea=new JTextArea(5,5);
            scroll=new JScrollPane(txtArea);
            pnlContenedor.add(txtArea);
     
            pnlBotones=new JPanel();
	    pnlBotones.setLayout(new GridLayout(3,1));
	    add(pnlBotones,BorderLayout.EAST);
           
            btnQuitar=new JButton("QUITAR ELEMENTO");
	    pnlBotones.add(btnQuitar);
            

	    btnBuscar=new JButton("BUSCAR ELEMENTO");
	    pnlBotones.add(btnBuscar);
            
	    btnBorrarTodo=new JButton("BORRAR TODO");  
	    pnlBotones.add(btnBorrarTodo);

            pnlBotonAbajo=new JPanel();
	    pnlBotonAbajo.setLayout(new FlowLayout());
	    add(pnlBotonAbajo,BorderLayout.SOUTH);

	    btnLimpiar=new JButton("LIMPIAR");
	    pnlBotonAbajo.add(btnLimpiar);
          

	    btnAgregar=new JButton("AGREGAR");
	    pnlBotonAbajo.add(btnAgregar);
           

       	    btnImprimir=new JButton("Imprimir");
            pnlBotonAbajo.add(btnImprimir);
            
            btnSalir=new JButton("SALIR");
	    pnlBotonAbajo.add(btnSalir);
          
     
            btnAgregar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                 String matricula = JOptionPane.showInputDialog(rootPane,"ingrese matricula");
                 String nombre = JOptionPane.showInputDialog(rootPane,"ingrese nombre");
                 String apellidos=JOptionPane.showInputDialog(rootPane,"ingrese apellidos");
                 byte edad = Byte.parseByte(JOptionPane.showInputDialog(rootPane, "ingrese edad"));
                 String telefono =JOptionPane.showInputDialog(rootPane, "ingrese telefono");
                 String email = JOptionPane.showInputDialog(rootPane,"ingrese email");
             
               //agregamos a la arrayList
                 listaAlumnos.add(new Alumno(matricula,nombre,apellidos,edad,telefono,email));
                 txtArea.setText(String.valueOf(listaAlumnos));
               
                  
                  
                  
   	    }
            });  

            btnSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 System.exit(0);
            }
            });
 
            btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 txtArea.setText(null);
            }
            }); 

            btnQuitar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 if(!(listaAlumnos.isEmpty())){
                 listaAlumnos.remove(listaAlumnos.size()-1);
                     for(int i=0;i<=listaAlumnos.size(); i++){
                     txtArea.setText(String.valueOf(listaAlumnos));
                     }
                 }else{
                 txtArea.setText("la pila esta vacía");
                 JOptionPane.showMessageDialog(rootPane, "La pila esta vacía");
                 }
                 /*
                 if(listaAlumnos.size()==0){
                 JOptionPane.showMessageDialog(rootPane, "La pila esta vacia");*/
                 
                 
            }
            }); 
 
            btnBuscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 int Buscar = Integer.parseInt(JOptionPane.showInputDialog(rootPane,"coloque el numero en el que esta posicionada "));
    
                 if(listaAlumnos.isEmpty()==true){
                      JOptionPane.showMessageDialog(rootPane,"no hay contactos existentes");
                 }else{
                 txtArea.setText(String.valueOf(listaAlumnos.get(Buscar)));
                 }
              
                 
            }
            }); 

            btnBorrarTodo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  
                  listaAlumnos.removeAll(listaAlumnos);
            }
            });
          
            btnImprimir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                 if(listaAlumnos.isEmpty()==true){
                      JOptionPane.showMessageDialog(rootPane,"no hay contactos existentes");
                 }else{
                     for(int i=0;i<=listaAlumnos.size(); i++){
                     //JOptionPane.showMessageDialog(rootPane,listaAlumnos+"\n");
                     txtArea.setText(String.valueOf(listaAlumnos));
                     }
                  }    
            }
            }); 

      pack();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      }         
}            



 
            









 
