package com.github.programacao3.atividadejava.Bhaskara;

public class Bhaskara {
    float valorA, valorB, valorC;

    public Bhaskara(float num1, float num2, float num3){
        calcX();
    }

    public float calcDelta(float a, float b, float c){
        return((b*b)*(-4*a*c));
    }

    public String calcX(float a, float b, float c){
        float x1, x2;
        x1 = (-b + calcDelta(a,b,c))/2;
        x2 = (-b - calcDelta(a,b,c))/2;
        return("X linha =" + x1 + "\nX duas linhas = " + x2);
    }

    public String classificacao(float a, float b, float c){
        if (this.calcDelta(a,b,c) < 0){
            return ("A equação do segundo grau não possui raízes reais");
        }
        else if (this.calcDelta(a,b,c) == 0){
            return("A equação do segundo grau possui uma raiz real");
        }
        return("A equação do segundo grau possui duas raízes reais");
    }
}
