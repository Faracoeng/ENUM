package poo;

public enum Cor {
    Preto(0),
    Vermelho(1),
    Verde(2),
    Amarelo(3),
    Azul(4),
    Roxo(5),
    Ciano(6),
    Branco(7);
    public final int codigo;

    Cor(int c){
            this.codigo = c;
    };
    public static Cor getByCodigo(int c){
        for(Cor e: Cor.values()){
            if(c == e.codigo){
                return e;
            }
        }
        //return null;
        throw new IllegalArgumentException("CÓDIGO INVÁLIDO");
    }
}
