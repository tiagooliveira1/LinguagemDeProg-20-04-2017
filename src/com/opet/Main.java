package com.opet;

public class Main
{

    public static void main(String[] args)
    {
        int i = 0;
        Aluno []listaAluno = new Aluno[5];
        listaAluno[0] = new Aluno("Tiago", 037710, "M");
        listaAluno[1] = new Aluno("Matheus", 1234596, "M");
        listaAluno[2] = new Aluno("Luah", 14725836, "F");
        listaAluno[3] = new Aluno("Mariah", 5432112, "F");
        listaAluno[4] = new Aluno("Luan", 8732115, "M");

        listaAluno[0].Nota1 = 5.9;
        listaAluno[0].Nota2 = 3.9;

        listaAluno[1].Nota1 = 8.3;
        listaAluno[1].Nota2 = 3.9;

        listaAluno[2].Nota1 = 7.7;
        listaAluno[2].Nota2 = 3.5;

        listaAluno[3].Nota1 = 6.3;
        listaAluno[3].Nota2 = 8.9;

        listaAluno[4].Nota1 = 8.5;
        listaAluno[4].Nota2 = 8.9;

        //listaAluno[4].setNota(3.5);

        for(i=0;i<listaAluno.length;i++) {
            if(listaAluno[i].Aprovado())
                System.out.println("Aluno "+listaAluno[i].nome+" Aprovado");
            else
                System.out.println("Aluno "+listaAluno[i].nome+" Reprovado!");

        }



    }

}
