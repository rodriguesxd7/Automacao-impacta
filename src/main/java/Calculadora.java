public class Calculadora {

    public int somarPositivo(int valor1 , int valor2) {
        int res = valor1 + valor2;
        if (res > 0) {
            System.out.println(res);
        } else {
            System.out.println("Não pode somar valores negativos");
            return 0;
        }
        return res;

    }

    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }


    public int subtrair(int valor1 , int valor2) {
        return valor1 - valor2;
    }

    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public int dividir(int valor1, int valor2) {return valor1 / valor2; }

    /*public int condicao(int valor) {
        int res = valor;
        if (valor < 0) {
            res = -valor;
        }
        System.out.println(res);
        return res;
    }*/
}


