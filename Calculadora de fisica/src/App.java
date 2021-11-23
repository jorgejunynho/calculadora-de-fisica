public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        //Força peso
        float peso = 4;
        
        float  massa = 18f;

        float resultado = calculadora.forcaPeso(peso, massa);

        // Velocidade média
        float distanciaFinal = 700;
        float distanciaInicial = 0f;
        short tempoFinal = 17;
        short tempoInicial = 4;
         resultado = calculadora.velocidadeMedia(distanciaFinal, distanciaInicial, tempoFinal, tempoInicial);

         // Impulso 
         float forca = 26f;
          tempoFinal = 2;
          tempoInicial = 7;
        
         resultado = calculadora.Impulso(forca, tempoFinal, tempoInicial);

        // mruv 
         float Velocidade = 30;
         float intervaloTempo =  40 ;
         float aceleracao =  60;
         float posicaoInicial =  56 ;
         
         resultado = calculadora.mruv(posicaoInicial, Velocidade, intervaloTempo, aceleracao);
         
         // forca centripeta
         massa = 900;
         float raio = 200;
         Velocidade = 30;

         resultado = calculadora.forcacentripeta(massa, raio, Velocidade);

         // MU 
            distanciaFinal = 4;
            distanciaInicial = 0;
            Velocidade = 360;
            double tempo = 2.5;
            resultado = calculadora.mu( distanciaFinal, distanciaInicial, Velocidade, tempo);

        // força elastica
        float deformacaoMola =  60 ;
        float constanteElasticaMola =  20 ;

        resultado = calculadora.ForcaElastica(constanteElasticaMola, deformacaoMola);
         

        System.out.println(resultado);
    }
}
