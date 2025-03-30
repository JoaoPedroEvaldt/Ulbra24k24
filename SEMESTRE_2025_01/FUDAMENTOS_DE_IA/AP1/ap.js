// Importa os dados de treinamento do aula5.js
const { arrayTreinamento } = require('./aula5.js');

console.log("Dados de treinamento carregados:", arrayTreinamento.length, "exemplos");

// Classe da Rede Neural
class RedeNeural {
    constructor(tamanhoEntrada, tamanhoOculto, tamanhoSaida) {
        this.tamanhoEntrada = tamanhoEntrada;
        this.tamanhoOculto = tamanhoOculto;
        this.tamanhoSaida = tamanhoSaida;

        this.pesosEntradaOculto = this.inicializaPesos(tamanhoEntrada, tamanhoOculto);
        this.pesosOcultoSaida = this.inicializaPesos(tamanhoOculto, tamanhoSaida);
    }

    inicializaPesos(linhas, colunas) {
        return Array.from({ length: linhas }, () =>
            Array.from({ length: colunas }, () => Math.random() * 2 - 1)
        );
    }

    sigmoide(x) {
        return 1 / (1 + Math.exp(-x));
    }

    derivadaSigmoide(x) {
        return x * (1 - x);
    }

    multiplicaMatriz(vetor, matriz) {
        return matriz[0].map((_, i) =>
            vetor.reduce((sum, val, j) => sum + val * matriz[j][i], 0)
        ).map(this.sigmoide);
    }

    propagation(entrada) {
        this.entrada = entrada;
        this.saidaOculta = this.multiplicaMatriz(entrada, this.pesosEntradaOculto);
        this.saidaFinal = this.multiplicaMatriz(this.saidaOculta, this.pesosOcultoSaida);
        return this.saidaFinal;
    }

    treinar(entrada, saidaEsperada, taxaAprendizagem = 0.1) {
        let saidaFinal = this.propagation(entrada);
        let erroSaida = saidaEsperada.map((val, i) => val - saidaFinal[i]);
        let gradienteSaida = erroSaida.map((erro, i) => erro * this.derivadaSigmoide(saidaFinal[i]));

        let erroOculto = new Array(this.tamanhoOculto).fill(0);
        for (let i = 0; i < this.tamanhoSaida; i++) {
            for (let j = 0; j < this.tamanhoOculto; j++) {
                erroOculto[j] += gradienteSaida[i] * this.pesosOcultoSaida[j][i];
            }
        }
        let gradienteOculto = erroOculto.map((erro, i) => erro * this.derivadaSigmoide(this.saidaOculta[i]));

        for (let i = 0; i < this.tamanhoOculto; i++) {
            for (let j = 0; j < this.tamanhoSaida; j++) {
                this.pesosOcultoSaida[i][j] += this.saidaOculta[i] * gradienteSaida[j] * taxaAprendizagem;
            }
        }

        for (let i = 0; i < this.tamanhoEntrada; i++) {
            for (let j = 0; j < this.tamanhoOculto; j++) {
                this.pesosEntradaOculto[i][j] += entrada[i] * gradienteOculto[j] * taxaAprendizagem;
            }
        }
    }
}

// Inicializa a rede neural
let redeNeural = new RedeNeural(35, 100, 10);

// Treina a rede neural
for (let index = 0; index < 10000; index++) {
    for (let numero = 0; numero < arrayTreinamento.length; numero++) {
        let dados = arrayTreinamento[numero];
        redeNeural.treinar(dados.entrada.flat(), dados.saidaEsperada);
    }
}

// Teste com um número desconhecido
let numeroParaTestar = [
    [1,1,1,1,1],
    [1,0,0,0,1],
    [1,0,0,0,1],
    [0,1,1,1,1],
    [0,0,0,0,1],
    [0,0,0,0,1],
    [1,1,1,1,0],
];

let resultado = redeNeural.propagation(numeroParaTestar.flat());
let numeroReconhecido = resultado.indexOf(Math.max(...resultado));
console.log("Número reconhecido:", numeroReconhecido);
