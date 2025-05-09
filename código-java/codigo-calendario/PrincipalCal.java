public class PrincipalCal {
    public static void main(String[] args) {
    
        Calendario cld1 = new Calendario(10, 10, 2022);
        Calendario cld2 = new Calendario(19, 2, 2008);

        cld1.mostrarData();
        cld2.anoBissexto();
        System.out.println(); 
        cld1.mostrarData();
        cld2.anoBissexto();
        
        
    }
}