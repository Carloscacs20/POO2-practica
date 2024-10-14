
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
    //Automovil bmw = new Automovil(); //instanciar y Automoviles() esto es el constructor
    Automovil bmw = new Automovil("BMW", "1340D", "Negro", 3);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String marca = JOptionPane.showInputDialog("Marca :");
    JOptionPane.showMessageDialog(null, "Piola la marca");
        /*bmw.setMarca("BMW");  // set asigna
        bmw.setModelo("1350W");
        bmw.setColor("Negro");
        bmw.setCilindraje(3.2); */

        String var1;
        System.out.println("Modelo : ");
        var1 = br.readLine();
        System.out.println("");
        bmw.setModelo(var1);
        System.out.println("bmw.getModelo() " + var1);

        int var2;
        System.out.println("Cilindraje : ");
        var2 = Integer.parseInt(br.readLine());
        System.out.println("");
        bmw.setModelo(String.valueOf(String.valueOf(var2)));
        System.out.println("bmw.getCilindraje = " + var2);

        String var3;
        System.out.println("Color");
        System.out.println("Color :");
        var3 = br.readLine();
        bmw.setColor(var3);
        JOptionPane.showMessageDialog( null, "El color es : " + var3);


    System.out.println("bmw = " + bmw.getMarca());
    System.out.println("bmw.verDetalle" + bmw.verDetalle());
    System.out.println("bmw.acelerar() = " + bmw.acelerar());
    System.out.println("bmw.frenar() = " + bmw.frenar(80));
    System.out.println("bmw.capacidadTanque(cap 48, pconsumo 0.7f) = " + bmw.capacidadTanque(48, 0.7f)); // 0.7f cuando es nativo el java no sabe identificar y toca avisarle q tipo es
    System.out.println("bmw.capacidadTanque(48, 70) = " + bmw.capacidadTanque(48, 7f));
    }
}

// si le pongo variables al constructor cuando llamo con el get toma la informacion que esta en el cosntructor
// si pongo un atributo que sea provado o publico tengo que acceder al atributo
// cuando creo un atributo que quiero que no cambia el valor le declaro en estatico
// static es una constante
// se puede leer el static si se puede pero no se puede asignar
// public static