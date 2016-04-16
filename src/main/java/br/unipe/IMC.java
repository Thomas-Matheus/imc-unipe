package br.unipe;

import java.util.Scanner;

public class IMC 
{
    public double CalcularIMC( double peso, double altura )
    {
		return peso / (altura * altura);
	}
}