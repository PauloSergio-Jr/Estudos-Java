package fase1;

public class SorteioFrutas {
    public static void main(String[] args) {

        String[] frutas = { "abacaxi", "abacate", "açai", "acerola", "ameixa", "amora", "banana", "cacau", "caqui",
                "carambola", "cereja", "coco", "cupuaçu", "figo", "framboesa", "goiaba", "guaraná", "jabuticaba",
                "kiwi", "laranja", "lichia", "limão", "maça", "mamão", "manga", "maracuja", "melancia", "melão",
                "morango", "nectarina", "pera", "pêssego", "pitanga", "romã", "uva" };
        int indice = (int) (Math.random() * frutas.length);

        String frutaSorteada = frutas[indice];

        System.out.println("A fruta sorteada é: " + frutaSorteada);
    }
}
