/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        double Area;

        try {
            System.out.printf("Inserte la base de Triangulo.....:");
            double Base = SCN.nextDouble();
            System.out.printf("Inserte la altura de Triangulo...:");
            //El área de un triángulo rectángulo es igual al producto de los catetos partido por 2 (base * altura / 2)
            double Altura = SCN.nextDouble();
            Area = Base * Altura / 2;           
                                                                
            //Mensaje final                                      
            System.out.printf("Base triangulo...................: %.1f%n", Base);
            System.out.printf("Altura triangulo.................: %.1f%n", Altura);
            System.out.printf("Area triangulo...................: %.1f%n", Area);

        } catch (Exception e) {
            System.out.printf("ERROR: Entrada incorrecta.");

        } finally {
            SCN.nextLine();
        }

    }
}
