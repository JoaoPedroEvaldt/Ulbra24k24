const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const arrayPersonalidade = [
    'Tom Cruise',
    'Brad Pitt',
    'Angelina Jolie',
    'Scarlett Johansson'
];

console.log("Escolha uma personalidade da lista abaixo e eu irei adivinhar quem é:");
console.log(arrayPersonalidade);

rl.question("Seu personagem é mulher? (sim/não) ", (resposta) => {
    if (resposta.toLowerCase() === "sim") {
        rl.question("A sua atriz escolhida já interpretou a Viúva Negra? (sim/não) ", (resposta) => {
            if (resposta.toLowerCase() === "sim") {
                console.log("Você escolheu a Scarlett Johansson");
            } else {
                console.log("Você escolheu a Angelina Jolie");
            }
            rl.close();
        });
    } else {
        rl.question("O seu ator escolhido evita usar dublês? (sim/não) ", (resposta) => {
            if (resposta.toLowerCase() === "sim") {
                console.log("Você escolheu o Tom Cruise");
            } else {
                console.log("Você escolheu o Brad Pitt");
            }
            rl.close();
        });
    }
});
