package br.com.profissaodev.modelo;


import static org.testng.Assert.*;
import org.testng.annotations.Test;



public class CampoTeste {
    
    private int linha = 3;
    private int coluna = 3;
    private Campo campo = new Campo(linha,coluna);
    
    
    @Test
    void testeVizinhoEsquerda() {
        Campo vizinhoEsquerda = new Campo(linha, coluna - 1);
        boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
        assertTrue(resultadoEsquerda);
    }
    @Test
    void testeVizinhoDireita() {
        Campo vizinhoDireita = new Campo(linha, coluna + 1);
        boolean resultadoDireita = campo.adicionarVizinho(vizinhoDireita);
        assertTrue(resultadoDireita);
    }
    @Test
    void testeVizinhoCima() {
        Campo vizinhoCima = new Campo(linha - 1, coluna);
        boolean resultadoCima = campo.adicionarVizinho(vizinhoCima);
        assertTrue(resultadoCima);
    }
    @Test
    void testeVizinhoBaixo() {
        Campo vizinhoBaixo = new Campo(linha + 1, coluna);
        boolean resultadoBaixo = campo.adicionarVizinho(vizinhoBaixo);
        assertTrue(resultadoBaixo);
    }
    
    @Test
    void testeVizinhoDiagonalCimaEsquerda() {
        Campo vizinhoCimaEsquerda = new Campo(linha - 1, coluna - 1);
        boolean resultadoCimaEsquerda = campo.adicionarVizinho(vizinhoCimaEsquerda);
        assertTrue(resultadoCimaEsquerda);
    }
    
    @Test
    void testeVizinhoDiagonalCimaDireita() {
        Campo vizinhoCimaDireita = new Campo(linha - 1, coluna + 1);
        boolean resultadoCimaDireita = campo.adicionarVizinho(vizinhoCimaDireita);
        assertTrue(resultadoCimaDireita);
    }
    
    @Test
    void testeVizinhoDiagonalBaixoEsquerda() {
        Campo vizinhoBaixoEsquerda = new Campo(linha + 1, coluna - 1);
        boolean resultadoBaixoEsquerda = campo.adicionarVizinho(vizinhoBaixoEsquerda);
        assertTrue(resultadoBaixoEsquerda);
    }
    
    @Test
    void testeVizinhoDiagonalBaixoDireita() {
        Campo vizinhoBaixoDireita = new Campo(linha + 1, coluna + 1);
        boolean resultadoBaixoDireita = campo.adicionarVizinho(vizinhoBaixoDireita);
        assertTrue(resultadoBaixoDireita);
    }
    
    @Test
    void testeMarcacao() {
        assertFalse(campo.isMarcado());
    }
    
    @Test
    void testeAlternarMarcacao() {
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }
    
    @Test
    void testeAlternarMarcacaoDuasVezes() {
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }
    
    @Test
    void testeAbrirNaoMinadoNaoMarcado() {
        assertTrue(campo.abrir());
    }
    
    @Test
    void testeAbrirNaoMinadoMarcado() {
        assertFalse(campo.abrir());
    }
    
    @Test
    void testeAbrirMinadoMarcado() {
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoMarcado() {
        campo.minar();
        assertFalse(campo.abrir());
    }
    
    
}
