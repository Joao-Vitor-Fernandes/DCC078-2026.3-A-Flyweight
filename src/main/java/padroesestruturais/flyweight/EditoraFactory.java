package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EditoraFactory {
    private static Map<String, Editora> editoras = new HashMap<>();

    public static Editora getEditora(String nome, String pais) {
        String chave = nome + "|" + pais;
        Editora editora = editoras.get(chave);
        if (editora == null) {
            editora = new Editora(nome, pais);
            editoras.put(chave, editora);
        }
        return editora;
    }

    public static int getTotalEditoras() {
        return editoras.size();
    }

    public static void limpar() {
        editoras.clear();
    }

}