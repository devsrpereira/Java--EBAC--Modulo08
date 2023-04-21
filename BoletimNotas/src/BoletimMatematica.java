
public class BoletimMatematica {
    private static double avaliacao1;
    private static double avaliacao2;
    private static double trabalhoInd;
    private static double trabalhoGrp;

//Sets da variavel de classe
    public void setAvaliacao1(double avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public void setAvaliacao2(double avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    public void setTrabalhoInd(double trabalhoInd) {
        this.trabalhoInd = trabalhoInd;
    }

    public void setTrabalhoGrp(double trabalhoGrp) {
        this.trabalhoGrp = trabalhoGrp;
    }

    public static double mediaNotas(){
        double nota1 = avaliacao1;
        double nota2 = avaliacao2;
        double nota3 = trabalhoGrp;
        double nota4 = trabalhoInd;

        double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        return mediaFinal;
    }

    public static String resultado(){
        String resultadoFinal;

        if (mediaNotas() > 6){
            resultadoFinal = "O aluno foi APROVADO!";
        }else {
            resultadoFinal = "O aluno foi REPROVADO!";
        }

        return resultadoFinal;

    }


//Metodo de calculo de notas

    public static void main(String[] args) {
        BoletimMatematica nota = new BoletimMatematica();
        nota.setAvaliacao1(avaliacao1=5.5);
        nota.setAvaliacao2(avaliacao2=2.0);
        nota.setTrabalhoGrp(trabalhoGrp = 3.0);
        nota.setTrabalhoInd(trabalhoInd=6.5);

        System.out.println("Conforme os resultados obtidos nas 4 atividades, a média final é: "+ mediaNotas());
        System.out.println(resultado());


    }
}