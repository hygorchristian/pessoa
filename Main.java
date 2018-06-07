import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// A classe abaixo foi desenvolvida em Java 8, logo não vai rodar em uma versão anterior do Java.
public class Main {

    public static Random random;

    //método para gerar pessoas aleatórias
    public static Pessoa gerarPessoaAleatoria(){
        random = new Random();
        Pessoa p = new Pessoa();
        p.setNome("Pessoa " + random.nextInt());
        p.setIdade(random.nextInt());
        p.setAltura(random.nextDouble());
        p.setPeso(random.nextDouble());
        return p;
    }

    //Método para ordenar as pessoas dado um determinado parametro
    //Parametros aceitos: nome, idade, altura e peso
    public static void ordernarPessoas(ArrayList<Pessoa> pessoas, String parametro) throws Exception {
        switch (parametro){
            case "nome":
                Collections.sort(pessoas, (o1, o2) -> {
                    if(o1.getNome().equals(o2.getNome())){
                        return 0;
                    }
                    return o1.getNome().compareTo(o2.getNome());
                });
                break;
            case "idade":
                Collections.sort(pessoas, (o1, o2) -> {
                    if(o1.getIdade() == o2.getIdade()){
                        return 0;
                    }
                    return o1.getIdade() < o2.getIdade() ? -1 : 1;
                });
                break;
            case "altura":
                Collections.sort(pessoas, (o1, o2) -> {
                    if(o1.getAltura() == o2.getAltura()){
                        return 0;
                    }
                    return o1.getAltura() < o2.getAltura() ? -1 : 1;
                });
                break;
            case "peso" :
                Collections.sort(pessoas, (o1, o2) -> {
                    if(o1.getPeso() == o2.getPeso()){
                        return 0;
                    }
                    return o1.getPeso() < o2.getPeso() ? -1 : 1;
                });
                break;
            default:
                throw new Exception("Parâmetro inválido");
        }
    }

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa(); //Inicializando uma nova pessoa e definindo apenas 3 dos 4 atributos
        pessoa1.setAltura(1.83);
        pessoa1.setIdade(22);
        pessoa1.setNome("Hygor");

        //Checando se o objeto pessoa está completament preenchido
        System.out.println("pessoa1 está preenchido: " + pessoa1.isPreenchido());

        ///

        // Criando uma lista de 50 pessoas aleatórias
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for(int i = 0; i < 50; i++){
            pessoas.add(gerarPessoaAleatoria());
        }

        // Ordenando a lista de acordo com o parametro
        try {
            ordernarPessoas(pessoas, "peso"); //aqui o parametro pode ser "nome", "idade", "altura" ou "peso"
        } catch (Exception e) {
            System.out.print("Parâmetro inválido"); // caso seja passado um parametro errado é lançada uma exceção e o programa para.
            return;
        }

        //Imprimindo as pessoas da lista
        for(Pessoa p : pessoas){
            System.out.println(p.toString());
        }
    }
}