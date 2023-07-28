package fundamentos;

public class MultiplasNotas {
    public static void main(String[] args) {
        int rs = somar(4,5,6,8,3,2,1);
        System.out.println("O resultado da soma é: " + rs);
    }
    public static int somar (int... valores) {
        int resultado = 0;
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultado += valor;
        }
        return resultado;
    }

}
