package br.com.pfalves.sample4;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double v, r;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do Raio: ");
        r = Double.parseDouble(leitor.nextLine());
        //calcular
        v = 4/3.0 * Math.PI * Math.pow(r, 3.0);
        System.out.println("Volume = " + v);

    }
}
