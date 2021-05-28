package controller;

import javax.swing.*;
import java.io.*;

public class ArquivosController implements IArquivosControllerr {

    public ArquivosController() {
        super();
    }
    @Override
    public void readFile(String path, String nome) throws IOException {
        File arq = new File(path, nome);
        if (arq.exists() && arq.isFile()) {
            FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);
            String linha = buffer.readLine();
            while (linha != null) { //Procura o EOF
                System.out.printf(linha);
                linha = buffer.readLine();
            }
            buffer.close();
            leitor.close();
            fluxo.close();
        } else {
            throw new IOException("Arquivo Invalido");
        }
    }

//    @Override
//    public void readDir(String path) throws IOException {
//        File dir = new File (path);
//        if (dir.exists() && dir.isDirectory()){
//            File[] files = dir.listFiles();
//            for (File f : files){
//                if (f.isFile()){
//                    System.out.println("     \t" + f.getName());
//                }else{
//                    System.out.println("<DIR>\t" + f.getName());
//                }
//            }
//        }else{
//            throw new IOException("Diretório inválido");
//        }
//
//    @Override
//    public void createFile(String path, String nome) throws IOException {
//        File dir = new File(path);
//        File arq = new File(path, nome + ".txt");
//        if (dir.exists() && dir.isDirectory()) {
//            boolean existe = false;
//            if (arq.exists()) {
//                existe = true;
//            }
//            String conteudo = geraTxt();
//            FileWriter fileWriter = new FileWriter(arq, existe);
//            PrintWriter print = new PrintWriter(fileWriter);
//            print.write(conteudo);
//            print.flush();
//            print.close();
//            fileWriter.close();
//        } else {
//            throw new IOException("Diretorio Invalido");
//        }
//    }
//        private String geraTxt(){
//            StringBuffer buffer = new StringBuffer();
//            String linha = "";
//            while (!linha.equalsIgnoreCase("fim")) {
//                linha = JOptionPane.showInputDialog(null, "Digite uma frase: ",
//                        "Entrada de texto", JOptionPane.INFORMATION_MESSAGE);
//                if (!linha.equalsIgnoreCase("fim")) {
//                    buffer.append(linha+"\n");
//                }
//            }
//            return buffer.toString();
//        }
//    }

//
//    @Override
//    public void openFile(String path, String nome) throws IOException {
//    }

}