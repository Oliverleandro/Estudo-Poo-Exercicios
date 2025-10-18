package polimorfismo.polimorfismoTest;

import polimorfismo.dominio.AparelhoDeSom;
import polimorfismo.dominio.AparelhoEletronico;
import polimorfismo.dominio.SmartTv;
import polimorfismo.dominio.VideoGame;

public class PolimorfismoTest {
    public static void main(String[] args) {
        AparelhoEletronico meuSom = new AparelhoDeSom("JBL2025", "JBL", 2025);
        AparelhoEletronico minhaTv = new SmartTv("Samsung Smart 35\'", "Samsung", 2023 );
        AparelhoEletronico videoGame = new VideoGame("Ps5", "Playststion", 2025);

        System.out.println(meuSom.toString());
        System.out.println(minhaTv.toString());
        System.out.println(videoGame.toString());


        meuSom.play();
        minhaTv.play();
        videoGame.play();
    }
}
