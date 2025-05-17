public class PrincipalCalendario {
    public static void main(String[] args) {
    
        Calendario cld1 = new Calendario(10, 10, 2022);
        Calendario cld2 = new Calendario(15, 5, 2008);

        // Primeira Data
        System.out.println("\nPrimeira Data:");
        cld1.mostrarData();
        cld1.anoBissexto();
    
        // Segunda Data
        System.out.println("\nSegunda Data:");
        cld2.mostrarData();
        cld2.anoBissexto();
        
    }
}