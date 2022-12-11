package jnbc.sys.etl.ifnoicon;

public class TestaDirIcone {

    public static String retornoCaminhoSeEcontrado;

    public static String TestaDirIcone(String dirPadrao, String novoCaminhoIcone) {
        String stringNull = null;
        try {
            if (novoCaminhoIcone == stringNull || novoCaminhoIcone.isEmpty()) {
                retornoCaminhoSeEcontrado = dirPadrao;
            } else if (novoCaminhoIcone != stringNull || !novoCaminhoIcone.isEmpty()) {
                retornoCaminhoSeEcontrado = novoCaminhoIcone;
            }
        } 
        catch (Exception e) {
        }
        return retornoCaminhoSeEcontrado;

    }
}
