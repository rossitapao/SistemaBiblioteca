/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.sistemadebiblioteca;
import ec.edu.ups.sistemadebiblioteca.clases.Autor;
import ec.edu.ups.sistemadebiblioteca.clases.Bibliotecario;
import ec.edu.ups.sistemadebiblioteca.clases.Estudiante;
import ec.edu.ups.sistemadebiblioteca.clases.Libro;
import ec.edu.ups.sistemadebiblioteca.clases.Multa;
import ec.edu.ups.sistemadebiblioteca.clases.Prestamo;
import ec.edu.ups.sistemadebiblioteca.clases.Usuario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author USER
 */
public class SistemaDeBiblioteca {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        
        int opcion;
        
        do{
            
            System.out.println("\n    SISTEMA DE PRESTAMO BIBLIOTECA    ");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Agregar bibliotecario");
            System.out.println("3. Agregar libro");
            System.out.println("4. Registrar prestamo");
            System.out.println("5. Registrar devolucion");
            System.out.println("6. Mostrar usuarios");
            System.out.println("7. Mostrar libros");
            System.out.println("8. Mostrar prestamos");
            System.out.println("9. Salir");
            System.out.println("Escoga una opcion(1-9): ");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion){
            
            case 1:
                
                System.out.println("Ingrese su nombre: ");
                String nombreEstudiante = sc.nextLine();
                
                System.out.println("Ingrese su codigo: ");
                int codigoEstudiante = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Ingrese en que carrera esta: ");
                String carrera = sc.nextLine();
                
                Estudiante estudiante = new Estudiante(nombreEstudiante, codigoEstudiante, carrera);
                
                usuarios.add(estudiante);
                
                System.out.println("Se agrego un estudiante ^o^");
                
                break;
            
            case 2:
                
                System.out.println("Ingrese su nombre: ");
                String nombreBibliotecario = sc.nextLine();
                
                System.out.println("Ingrese su codigo: ");
                int codigoBibliotecario = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Que rol cumple: ");
                String rol = sc.nextLine();
                
                Bibliotecario bibliotecario = new Bibliotecario(nombreBibliotecario, codigoBibliotecario, rol);
                
                usuarios.add(bibliotecario);
                
                System.out.println("Se agrego un bibliotecario");
                break;
                
            case 3:
                
                System.out.println("Ingrese el titulo del libro: ");
                String tituloUno = sc.nextLine();
                
                System.out.println("Ingrese el nombre del autor: ");
                String nombreAutor = sc.nextLine();
                
                System.out.println("Ingrese la nacionalidad del autor: ");
                String nacionalidad = sc.nextLine();
                
                System.out.println("Ingrese el genero del libro: ");
                String generoUno = sc.nextLine();
                
                System.out.println("Ingrese el ISBN del libro: ");
                String isbn = sc.nextLine();
                
                System.out.println("Ingrese el año de publicacion: ");
                int publicacion = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Ingrese la editorial: ");
                String editora = sc.nextLine();
                
                Autor autorUno = new Autor(nombreAutor, nacionalidad);
                
                Libro libro = new Libro(tituloUno, autorUno, generoUno, true, isbn, publicacion, editora);
                
                libros.add(libro);
                
                System.out.println("Se a agregado un libro");
                
                break;
                
            case 4:
                
                if(usuarios.isEmpty()){
                    
                    System.out.println("No hay usuarios");
                    
                    break;
                }
                
                System.out.println("   USUARIOS   ");
                
                for(int i = 0; i < usuarios.size(); i++){
                    
                    System.out.println(i + ". " + usuarios.get(i));
                }
                
                System.out.println("Seleccione un usuario: ");
                int indiceUsuario = sc.nextInt();
                
                System.out.println("   LIBROS   ");
                
                for (int i = 0; i < libros.size(); i++){
                    
                    System.out.println(i + ". " + libros.get(i));
                }
                
                System.out.println("Seleccione un libro: ");
                int indiceLibro = sc.nextInt();
                
                Libro libroPrestado = libros.get(indiceLibro);
                
                if(libroPrestado.isDisponible()){
                    
                    libroPrestado.prestarLibro();
                    
                    Prestamo prestamo = new Prestamo(new Date(), null, usuarios.get(indiceUsuario), libroPrestado, null);
                    
                    prestamos.add(prestamo);
                    
                    System.out.println("Se registro el prestamo");
                    
                }else{
                    
                    System.out.println("Libro no disponible");
                }
                
                break;
                
            case 5:
                
                if(prestamos.isEmpty()){
                    
                    System.out.println("No hay prestamos");
                    
                    break;
                }
                
                System.out.println("   PRESTAMOS   ");
                
                for (int i = 0; i < prestamos.size(); i++){
                    
                    System.out.println(i + ". " + prestamos.get(i));
                }
                
                System.out.println("Selecione un prestamo: ");
                int indicePrestamo = sc.nextInt();
                sc.nextLine();
                
                Prestamo prestamoDevuelto = prestamos.get(indicePrestamo);
                
                prestamoDevuelto.getLibro().devolverLibro();
                
                prestamoDevuelto.setFechaDevolucion(new Date());
                
                int opcionMulta;
                
                do{
                    
                    System.out.println("Existe multa?");
                    System.out.println("1. si");
                    System.out.println("2. no");
                    System.out.println("escoga una opcion(1-2): ");
                
                    opcionMulta = sc.nextInt();
                    sc.nextLine();
                    
                    if(opcionMulta != 1 && opcionMulta != 2){
                        
                        System.out.println("Opcion no valida");
                    }
                }while(opcionMulta != 1 && opcionMulta != 2);
                
                if(opcionMulta == 1){
                    
                    System.out.println("Monto de la multa: ");
                    double monto = sc.nextDouble();
                    sc.nextLine();
                    
                    System.out.println("Cual es el motivo: ");
                    String motivo = sc.nextLine();
                    
                    Multa multa = new Multa(monto, motivo);
                    
                    prestamoDevuelto.setMulta(multa);
                    
                    System.out.println("Se registro la multa correctamente");
                            
                }
                
                System.out.println("El libro fue devuelto");
                
                break;
            
            case 6:
                
                if(usuarios.isEmpty()){
                    
                    System.out.println("No hay usuarios");
                    
                }else{
                    
                    for(Usuario u : usuarios){
                        
                        System.out.println(u);
                    }
                }
                
                break;
                
            case 7:
                
                if(libros.isEmpty()){
                    
                    System.out.println("No hay libros");
                    
                }else{
                    
                    for(Libro l : libros){
                    
                    System.out.println(l);
                }
                }
                break;
                
            case 8:
                
                if(prestamos.isEmpty()){
                    
                    System.out.println("No hay prestamos");
                    
                }else{
                    
                    for(Prestamo p : prestamos){
                        
                        System.out.println(p);
                    }
                }
                break;
                
            case 9:
                
                System.out.println("Cerrando programa...");
                
                break;
                
            default:
                
                System.out.println("Opcion no valida");
        }
      }while(opcion != 9);
        
      
      sc.close();
       
    }
}
