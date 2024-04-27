package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto pelos musicos da igreja!");
        } else {
            System.out.println(audio.getTitulo() + " é uma das músicas mais curtidas do momento");
        }
    }
}

