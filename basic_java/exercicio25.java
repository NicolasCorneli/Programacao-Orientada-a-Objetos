import java.util.ArrayList;

public class exercicio25{
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        for (int x = 3; x < 560; x++){
            int confirmar_primo = 0;
            for (int y = 2; y < x; y++){
                if (x % y == 0){
                    confirmar_primo = 1;
                    break;
                }
            }
        if (confirmar_primo == 0)
            lista.add(x);
        }
    int piramidais = 0;
    if (lista.size() >= 3){
        for (int x = 1; x < lista.size() - 1; x++){
            piramidais = lista.get(x-1) + lista.get(x) + lista.get(x+1);
            System.out.println(piramidais);
            piramidais = 0;
        }


    }
    }
}
