public class App {
    public static void main(final String[] args) {

        final String primeiroNome = "Talysson";
        final String SegundoNome = "Amorim";
    
        final String nomeCompleto = nomeCompleto (primeiroNome, SegundoNome);
        System.out.println(nomeCompleto);
       }
       public static String nomeCompleto(final String primeiroNome, final String segundoNome) {
          return primeiroNome.concat(" ").concat(segundoNome);
       }
    }
}
