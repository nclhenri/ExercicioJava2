import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
    public String razaoSocial;
    public String cnpj;

    public LocalDate dataNasc;

    public float CalcularImposto(float rendimento){

        if (rendimento <= 3000){
            return rendimento * .03f;
        } else if (rendimento <= 6000) {
            return rendimento * .05f;
        } else if (rendimento <= 10000) {
            return rendimento * .07f;
        }else {
            return rendimento * .09f;
        }
    }
}
