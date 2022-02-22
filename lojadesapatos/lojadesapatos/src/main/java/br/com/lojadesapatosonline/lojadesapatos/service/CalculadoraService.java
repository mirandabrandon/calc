package br.com.lojadesapatosonline.lojadesapatos.service;

import br.com.lojadesapatosonline.lojadesapatos.form.CalculadoraForm;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class CalculadoraService {

    public String calculadora(CalculadoraForm valor) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String linha = br.readLine();
        String[] dinheiro = new String[2];
        dinheiro = linha.split("\\.");
        int notas = Integer.parseInt(dinheiro[0]);
        int moedas = Integer.parseInt(dinheiro[1]);

        int restoNotas = 0;

        int notasCem = notas/100;
        restoNotas -= notasCem*100;
        int notasCinquenta = restoNotas/50;
        restoNotas -= notasCinquenta*50;
        int notasVinte = restoNotas/20;
        restoNotas -= notasVinte*20;
        int notasDez = restoNotas/10;
        restoNotas -= notasDez*10;
        int notasCinco = restoNotas/5;
        restoNotas -= notasCinco*5;
        int notasDois = restoNotas/2;
        restoNotas -= notasDois*2;
        int notasUm = restoNotas;

        int restoMoedas = 0;

        int moedasCinquenta = moedas/50;
        restoMoedas = (moedas-moedasCinquenta*50);
        int moedasVinteECinco = restoMoedas/25;
        restoMoedas -= moedasVinteECinco*25;
        int moedasDez = restoMoedas/10;
        restoMoedas -= moedasDez*10;
        int moedasCinco = restoMoedas/5;
        restoMoedas -= moedasCinco*5;
        int moedasUm = restoMoedas;


        sb.append("NOTAS: ");
        sb.append(notasCem + " nota(s) de R$ 100.00, ");
        sb.append(notasCinquenta + " nota(s) de R$ 50.00, ");
        sb.append(notasVinte + " nota(s) de R$ 20.00, ");
        sb.append(notasDez + " nota(s) de R$ 10.00, ");
        sb.append(notasCinco + " nota(s) de R$ 5.00, ");
        sb.append(notasDois + " nota(s) de R$ 2.00 ");
        sb.append("     ");
        sb.append("MOEDAS: ");
        sb.append(notasUm + " moeda(s) de R$ 1.00, ");
        sb.append(moedasCinquenta + " moeda(s) de R$ 0.50, ");
        sb.append(moedasVinteECinco + " moeda(s) de R$ 0.25, ");
        sb.append(moedasDez + " moeda(s) de R$ 0.10, ");
        sb.append(moedasCinco + " moeda(s) de R$ 0.05, ");
        sb.append(moedasUm + " moeda(s) de R$ 0.01");




        return sb.toString();


    }






}
