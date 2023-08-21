package ListaEnlazada;

import java.util.Random;

public class ClientesAleatorios {
    
    public static String[] generarNombresAleatorios(int cantidad) {
	String[] nombresAleatorios = new String[cantidad];

	String[] nombresP = {"Andrea", "David", "Joel","Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolome", "Baruc", "Baruj", "Candelaria", "Candida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar", "Sebastian", "Romeo", "Miguel", "Tadeo", "Pepe", "Nicolas", "Jheremy",
                                "Camilo", "Jordy", "Alexa", "Nicolle", "Cesar", "Julieta", "Alessia", "Beto", "Anderson", "Alexis", "José",
                                "Lucas", "Camila", "Leyly", "Micaela", "Andres", "Bernardo", "Xioamara", "Zoila", "Yessenia", "Ramiro"};
                
        String[] nombresS = {"Ildefonso", "Perez", "Mari", "Rita", "Charlie", "Cruz", "Dani", "Jade", "Caro",
				"Francis", "Pau", "Paz", "Uri", "Yael", "Zoel", "Paris", "Sol", "Akira", "Rosa",
				"Andy", "Alai", "Zumar", "Alex", "Loto", "Mesa", "Zar", "Koi"};

	for (int i = 0; i < cantidad; i++) {
            nombresAleatorios[i] = nombresP[(int) (Math.floor(Math.random() * ((nombresP.length - 1) - 0 + 1) + 0))] + " " + nombresS[(int) (Math.floor(Math.random() * ((nombresS.length - 1) - 0 + 1) + 0))];        
	}
                
	return nombresAleatorios;
    }
    
    public static String[] generarApellidosPaternosAleatorios(int cantidad) {
        String[] apellidosPaternosAleatorios = new String[cantidad];
        
        String[] apellidos = {"Gomez", "Guerrero", "Trejo", "Cardiel", "Zapata", "Cardoso", "Cariaga", "Carillo",
				"Ramos", "Castillo", "Castorena", "Vela", "Grande", "Grangenal", "Lopez", "Gonzales", "Espinoza",
				"Amaya", "Garcia", "Gutierrez", "Portman", "Pizarro", "Palma", "Romero", "Gamarra", "Ramirez"};
      
        for (int i = 0; i < cantidad; i++) {
            apellidosPaternosAleatorios[i] = apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
                        
	}
        
        return apellidosPaternosAleatorios;
    }
    
    public static String[] generarApellidosMaternosAleatorios(int cantidad) {
        String[] apellidosMaternosAleatorios = new String[cantidad];
        
        String[] apellidos = {"Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva", "Dorado", "Garrido", "Coca", "Pallares"};
      
        for (int i = 0; i < cantidad; i++) {
            apellidosMaternosAleatorios[i] = apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
                        
	}
        
        return apellidosMaternosAleatorios;
    }
    
    public static String[] generarDNIAleatorios(int cantidad) {
        String[] DNIAleatorios = new String[cantidad];
        
        Random r = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            int DNI = r.nextInt(90000000) + 10000000;
            DNIAleatorios[i] = String.valueOf(DNI);
        }
    
        return DNIAleatorios;
    }
    
    public static String[] generarTelefonosAleatorios(int cantidad) {
        String[] TelefonosAleatorios = new String[cantidad];
        
        Random r = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            int telefono = r.nextInt(900000000) + 100000000;
            TelefonosAleatorios[i] = String.valueOf(telefono);
        }
    
        return TelefonosAleatorios;
    }
    
    public static String[] generarCorreosAleatorios(int cantidad) {
        String[] correosAleatorios = new String[cantidad];
        
        String[] correos = {"@utp.edu.pe", "@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com"};
      
        for (int i = 0; i < cantidad; i++) {
            correosAleatorios[i] = correos[(int) (Math.floor(Math.random() * ((correos.length - 1) - 0 + 1) + 0))];
                        
	}
        return correosAleatorios;
    }
    
    public static String[] generarHabitacionesAleatorias(int cantidad) {
        String[] habitacionAleatorias = new String[cantidad];
        
        String[] habitacion = {"Individual", "Familiar", "Matrimonial"};
      
        for (int i = 0; i < cantidad; i++) {
            habitacionAleatorias[i] = habitacion[(int) (Math.floor(Math.random() * ((habitacion.length - 1) - 0 + 1) + 0))];
                        
	}
        return habitacionAleatorias;
    }
}
