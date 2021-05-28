package view;

import controller.ArquivosController;
import controller.IArquivosControllerr;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {

        IArquivosControllerr arqCont = new ArquivosController();
//        String dirWin = "C:\\Windows";
        String path = "C:\\Aula Colevati";
        String nome = "Teste.txt";

        try {
//            arqCont.readDir(dirWin);
//            arqCont.createFile(path, nome);
        arqCont.readFile(path, nome);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
