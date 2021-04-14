package funcoes;

public class FuncaoAltaOrdem {

    //Recebe por parametro ou fucao
    //Ou retorna uma funcao

    public static void main(String[] args) {
        Calculo calculo = (a, b) -> a + b;
        System.out.println(somarValores(calculo,2, 2));
    }

    public static int somarValores(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);
}
