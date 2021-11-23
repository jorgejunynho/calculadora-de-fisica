import java.lang.Math;

public class Versosfisica {
    public float forcaPeso( Float peso, Float massa) {
        return peso * massa;
    }

    public float velocidadeMedia(float distanciaFinal, float distanciaInicial, Short tempoFinal, Short tempoInicial) {
        return  distanciaFinal - distanciaInicial / tempoFinal - tempoInicial;
    }

    public float impulso(float forca, short tempoFinal, short tempoInicial) {
        return forca * (tempoFinal - tempoInicial); 
    }
    

    public float mru(float velocidade, float aceleracao, float tempo) {
        return velocidade * tempo + aceleracao * tempo * tempo /  2 ;
        }


    public float forcacentripeta(float massa, float Velocidade, float raio) {
        return massa * (Velocidade * Velocidade)/ raio;
    }


    public float mruv(float posicaoInicial, float velocidade, float intervaloTempo, float aceleracao) {
        return posicaoInicial + velocidade * (intervaloTempo + aceleracao * (intervaloTempo * intervaloTempo) /  2 );
    }

    public  float ForcaElastica ( float  constanteElasticaMola , float  deformacaoMola ) {
        return constanteElasticaMola * deformacaoMola;
    } 
}
