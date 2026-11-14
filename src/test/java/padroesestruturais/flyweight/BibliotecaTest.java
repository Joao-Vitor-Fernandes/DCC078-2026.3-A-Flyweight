package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarLivros() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Memorias Postumas de Bras Cubas", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Vidas Secas", "Record", "Brasil");
        biblioteca.cadastrar("Clean Code", "Prentice Hall", "Estados Unidos");

        List<String> saida = Arrays.asList(
                "Livro{titulo='Dom Casmurro', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Memorias Postumas de Bras Cubas', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Vidas Secas', editora='Record', pais='Brasil'}",
                "Livro{titulo='Clean Code', editora='Prentice Hall', pais='Estados Unidos'}");

        assertEquals(saida, biblioteca.obterLivros());
    }

    @Test
    void deveRetornarTotalEditoras() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Memorias Postumas de Bras Cubas", "Companhia das Letras", "Brasil");
        biblioteca.cadastrar("Vidas Secas", "Record", "Brasil");
        biblioteca.cadastrar("Clean Code", "Prentice Hall", "Estados Unidos");

        assertEquals(3, EditoraFactory.getTotalEditoras());
    }
}
