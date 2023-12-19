/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.lang.model.SourceVersion;

/**
 *
 * @author Alunos
 */
public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando... ");
        animal.emiteSom();
    }
}