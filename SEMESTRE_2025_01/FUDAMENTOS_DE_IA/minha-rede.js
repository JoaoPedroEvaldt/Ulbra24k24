let x11 = 0, x12 = 0, resultado1 = 0;
let x21 = 0, x22 = 1, resultado2 = 0;
let x31 = 1, x32 = 0, resultado3 = 1;
let x41 = 1, x42 = 1, resultado4 = 1;

let p1 = -1, p2 = -1;

let soma, ajustes = 0, quantidadeAjustesTotais = 0, repeticoes = 0;
let y;  // Declaração explícita da variável y 

do {
    ajustes = 0;
    
    soma = somar(x11, x12);
    y = transferencia(soma);

    if (y != resultado1) {
        ajustar(x11, x12, y, resultado1);
        ajustes++;
        quantidadeAjustesTotais++;
    }
    
    soma = somar(x21, x22);
    y = transferencia(soma);

    if (y != resultado2) {
        ajustar(x21, x22, y, resultado2);
        ajustes++;
        quantidadeAjustesTotais++;
    }

    soma = somar(x31, x32);
    y = transferencia(soma);

    if (y != resultado3) {
        ajustar(x31, x32, y, resultado3);
        ajustes++;
        quantidadeAjustesTotais++;
    }

    soma = somar(x41, x42);
    y = transferencia(soma);

    if (y != resultado4) {
        ajustar(x41, x42, y, resultado4);
        ajustes++;
        quantidadeAjustesTotais++;
    }

} while (ajustes != 0);

console.log("Teste de aprendizagem com rede neural");
console.log("\nPeso 1: " + p1);
console.log("\nPeso 2: " + p2);
console.log("\nForam necessários " + quantidadeAjustesTotais + " ajustes para treinar a rede");

function somar(x1, x2) {
    return (x1 * p1) + (x2 * p2);
}

function transferencia(soma) {
    return soma <= 0 ? 0 : 1;
}

function ajustar(entrada1, entrada2, resultadoEsperado, resultadoObtido) {
    p1 = p1 + (resultadoEsperado - resultadoObtido) * entrada1;
    p2 = p2 + (resultadoEsperado - resultadoObtido) * entrada2;
}
