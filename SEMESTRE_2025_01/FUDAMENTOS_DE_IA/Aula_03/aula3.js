const dadosTreinamento = [
    { entrada: [0, 0], esperado: 0 }, // Pelé -> Futebol
    { entrada: [0, 1], esperado: 0 }, // Zico -> Futebol
    { entrada: [1, 0], esperado: 1 }, // Senna -> Automobilismo
    { entrada: [1, 1], esperado: 1 }  // Piquet -> Automobilismo
];

let w0 = 0, w1 = 0, w2 = 0; // Pesos iniciais
const bias = 1;
let taxaAprendizado = 0.1;
let erro = true;

// Função de ativação (limiar)
function transferencia(valor) {
    return valor >= 0 ? 1 : 0;
}

// Treinamento do Perceptron
while (erro) {
    erro = false;
    dadosTreinamento.forEach(({ entrada, esperado }) => {
        let soma = (entrada[0] * w1) + (entrada[1] * w2) + (bias * w0);
        let saida = transferencia(soma);
        let erroAtual = esperado - saida;

        if (erroAtual !== 0) {
            erro = true;
            w0 += taxaAprendizado * erroAtual * bias;
            w1 += taxaAprendizado * erroAtual * entrada[0];
            w2 += taxaAprendizado * erroAtual * entrada[1];
        }
    });
}

// Teste do Perceptron
function classificar(x1, x2) {
    let soma = (x1 * w1) + (x2 * w2) + (bias * w0);
    return transferencia(soma) === 0 ? "Futebol" : "Automobilismo";
}

// Exemplo de entrada
console.log("Classificação para (0,0):", classificar(0, 0)); // Deve retornar Futebol
console.log("Classificação para (1,0):", classificar(1, 0)); // Deve retornar Automobilismo
