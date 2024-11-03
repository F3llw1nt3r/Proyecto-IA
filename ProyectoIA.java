package proyectoia;

import java.util.Scanner;

public class ProyectoIA {

    /*Integrantes del equipo:
      Marín Hernández Levi
      Rodriguez Gonzalez Sergio Abraham
      Rodriguez Trejo Diego
      Tercero Andrade Eduardo Giovanni
     */
    //Declaración del método main
    public static void main(String[] args) {
        //Declaración del teclado
        Scanner teclado = new Scanner(System.in);
        //Preguntar al alumno que carrera cursa
        System.out.println("¿A qué carrera pertences?: "
                + "\n 1. Ingeniería Eléctrica Electrónica"
                + "\n 2. Ingeniería Civil"
                + "\n 3. Ingeniería Mecánica"
                + "\n 4. Ingeniería Industria"
                + "\n 5. Ingeniería En Computación");
        //Método para obtener su carrera
        int Carrera;
        Carrera = teclado.nextInt();
        switch (Carrera) {
            //Preguntas De Ingeniería Eléctrica Electrónica
            case 1:
                System.out.println("1. Ingeniería Eléctrica Electrónica");
                //Declaración del contador de la especialidad electronica de potencia
                int electronicaPotencia = 0;
                //Preguntas de la especialidad de electronica de potencia
                System.out.println("Responde con sinceridad a las preguntas");
                System.out.println("¿Me gusta trabajar con componentes que ocupan una gran demanda energética?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r1;
                r1 = teclado.nextInt();
                switch (r1) {
                    case 1:
                        electronicaPotencia = electronicaPotencia + 2;
                        break;
                    case 2:
                        electronicaPotencia = electronicaPotencia + 1;
                        break;
                    case 3:
                        electronicaPotencia = electronicaPotencia + 0;
                        break;
                    case 4:
                        electronicaPotencia = electronicaPotencia - 1;
                        break;
                    case 5:
                        electronicaPotencia = electronicaPotencia - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés por diseñar instalaciones eléctricas a gran escala?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r2;
                r2 = teclado.nextInt();
                switch (r2) {
                    case 1:
                        electronicaPotencia = electronicaPotencia + 2;
                        break;
                    case 2:
                        electronicaPotencia = electronicaPotencia + 1;
                        break;
                    case 3:
                        electronicaPotencia = electronicaPotencia + 0;
                        break;
                    case 4:
                        electronicaPotencia = electronicaPotencia - 1;
                        break;
                    case 5:
                        electronicaPotencia = electronicaPotencia - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me gusta relacionarme con otras áreas de la construcción como estructuras?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r3;
                r3 = teclado.nextInt();
                switch (r3) {
                    case 1:
                        electronicaPotencia = electronicaPotencia + 2;
                        break;
                    case 2:
                        electronicaPotencia = electronicaPotencia + 1;
                        break;
                    case 3:
                        electronicaPotencia = electronicaPotencia + 0;
                        break;
                    case 4:
                        electronicaPotencia = electronicaPotencia - 1;
                        break;
                    case 5:
                        electronicaPotencia = electronicaPotencia - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración dell contador de la especialidad de telecomunicaciones
                int telecomunicaciones = 0;
                //Preguntas de la especialidad de telecomunicaciones
                System.out.println("¿Me gusta saber cómo funcionan los dispositivos de telecomunicaciones modernos, \n"
                        + " desde smartphones hasta satélites? ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r4;
                r4 = teclado.nextInt();
                switch (r4) {
                    case 1:
                        telecomunicaciones = telecomunicaciones + 2;
                        break;
                    case 2:
                        telecomunicaciones = telecomunicaciones + 1;
                        break;
                    case 3:
                        telecomunicaciones = telecomunicaciones + 0;
                        break;
                    case 4:
                        telecomunicaciones = telecomunicaciones - 1;
                        break;
                    case 5:
                        telecomunicaciones = telecomunicaciones - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés por el cálculo, la estadística y las ecuaciones diferenciales?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r5;
                r5 = teclado.nextInt();
                switch (r5) {
                    case 1:
                        telecomunicaciones = telecomunicaciones + 2;
                        break;
                    case 2:
                        telecomunicaciones = telecomunicaciones + 1;
                        break;
                    case 3:
                        telecomunicaciones = telecomunicaciones + 0;
                        break;
                    case 4:
                        telecomunicaciones = telecomunicaciones - 1;
                        break;
                    case 5:
                        telecomunicaciones = telecomunicaciones - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Es importante para mi conocer los protocolos de comunicación \n "
                        + "de los distintos dispositivos que uso? ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r6;
                r6 = teclado.nextInt();
                switch (r6) {
                    case 1:
                        telecomunicaciones = telecomunicaciones + 2;
                        break;
                    case 2:
                        telecomunicaciones = telecomunicaciones + 1;
                        break;
                    case 3:
                        telecomunicaciones = telecomunicaciones + 0;
                        break;
                    case 4:
                        telecomunicaciones = telecomunicaciones - 1;
                        break;
                    case 5:
                        telecomunicaciones = telecomunicaciones - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de sistemas de control
                int control = 0;
                //Preguntas de la especialidad de sistemas de control
                System.out.println("¿Me gusta automatizar tareas de producción o manufactura de productos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r7;
                r7 = teclado.nextInt();
                switch (r7) {
                    case 1:
                        control = control + 2;
                        break;
                    case 2:
                        control = control + 1;
                        break;
                    case 3:
                        control = control + 0;
                        break;
                    case 4:
                        control = control - 1;
                        break;
                    case 5:
                        control = control - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Siento interés por los sistemas embebidos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r8;
                r8 = teclado.nextInt();
                switch (r8) {
                    case 1:
                        control = control + 2;
                        break;
                    case 2:
                        control = control + 1;
                        break;
                    case 3:
                        control = control + 0;
                        break;
                    case 4:
                        control = control - 1;
                        break;
                    case 5:
                        control = control - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me interesa saber cómo se automatizan tareas?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r9;
                r9 = teclado.nextInt();
                switch (r9) {
                    case 1:
                        control = control + 2;
                        break;
                    case 2:
                        control = control + 1;
                        break;
                    case 3:
                        control = control + 0;
                        break;
                    case 4:
                        control = control - 1;
                        break;
                    case 5:
                        control = control - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de electronica
                int electronica = 0;
                //Preguntas de la especialidad de electronica
                System.out.println("¿Me interesa saber el funcionamiento\n"
                        + " de los microprocesadores y microcontroladores?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r10;
                r10 = teclado.nextInt();
                switch (r10) {
                    case 1:
                        electronica = electronica + 2;
                        break;
                    case 2:
                        electronica = electronica + 1;
                        break;
                    case 3:
                        electronica = electronica + 0;
                        break;
                    case 4:
                        electronica = electronica - 1;
                        break;
                    case 5:
                        electronica = electronica - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Creo que tecnologías como Arduino o las FPGA son revolucionarias y útiles?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r11;
                r11 = teclado.nextInt();
                switch (r11) {
                    case 1:
                        electronica = electronica + 2;
                        break;
                    case 2:
                        electronica = electronica + 1;
                        break;
                    case 3:
                        electronica = electronica + 0;
                        break;
                    case 4:
                        electronica = electronica - 1;
                        break;
                    case 5:
                        electronica = electronica - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Siento interés por resolver problemas de la vida cotidiana\n"
                        + " a través de soluciones de hardware?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r12;
                r12 = teclado.nextInt();
                switch (r12) {
                    case 1:
                        electronica = electronica + 2;
                        break;
                    case 2:
                        electronica = electronica + 1;
                        break;
                    case 3:
                        electronica = electronica + 0;
                        break;
                    case 4:
                        electronica = electronica - 1;
                        break;
                    case 5:
                        electronica = electronica - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }

                //Declaración del contador de rendimiento para la especialidad de eléctronica potencia
                int rPotencia = 0;

                //Pregunta del rendimiento para la especialidad de eléctronica de potencia
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Transformadores y Motores de Inducción, Sistemas Eléctricos de Potencia 1 y 2,\n"
                        + " Instalaciones Eléctricas Industriales, Protección de Sistemas Eléctricos y Plantas Generadoras.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r13;
                r13 = teclado.nextInt();
                switch (r13) {
                    case 1:
                        rPotencia = rPotencia + 2;
                        break;
                    case 2:
                        rPotencia = rPotencia + 1;
                        break;
                    case 3:
                        rPotencia = rPotencia + 0;
                        break;
                    case 4:
                        rPotencia = rPotencia - 1;
                        break;
                    case 5:
                        rPotencia = rPotencia - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento de la especialidad de telecomunicaciones
                int rTel = 0;
                //Pregunta del rendimiento de la especialidad de telecomunicaciones 
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Filtrado y Modulación (L), Comunicaciones Digitales (L), Procesamiento Digital de Señales,\n"
                        + " Sistemas de Comunicaciones 1 y 2, Audio y Video,\n"
                        + " Circuitos Para Comunicaciones y Radio Microondas y Satélites. ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r14;
                r14 = teclado.nextInt();
                switch (r14) {
                    case 1:
                        rTel = rTel + 2;
                        break;
                    case 2:
                        rTel = rTel + 1;
                        break;
                    case 3:
                        rTel = rTel + 0;
                        break;
                    case 4:
                        rTel = rTel - 1;
                        break;
                    case 5:
                        rTel = rTel - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de sistemas de control
                int rCon = 0;
                //Pregunta del rendimiento de la especialidad de sistemas de control
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Sistemas de Control (L), Microprocesadores y Microcontroladores (L),\n"
                        + " Automatización Industrial, Instrumentación de Procesos Industriales (L),\n"
                        + " Instrumentación Electrónica y Sistemas de Control Programable.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r15;
                r15 = teclado.nextInt();
                switch (r15) {
                    case 1:
                        rCon = rCon + 2;
                        break;
                    case 2:
                        rCon = rCon + 1;
                        break;
                    case 3:
                        rCon = rCon + 0;
                        break;
                    case 4:
                        rCon = rCon - 1;
                        break;
                    case 5:
                        rCon = rCon - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de electrónica
                int rElec = 0;
                //Pregunta del rendimiento de la especialidad de electrónica
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Dispositivos Electrónicos (L), Diseño de Sistemas Digitales (L),\n"
                        + "  Amplificadores Electronicos (L), Circuitos Digitales,\n"
                        + " Diseño de Sistemas con Microprocesadores,\n"
                        + " Sistemas Electrónicos de Potencia  y Sistemas Analógicos.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r16;
                r16 = teclado.nextInt();
                switch (r16) {
                    case 1:
                        rElec = rElec + 2;
                        break;
                    case 2:
                        rElec = rElec + 1;
                        break;
                    case 3:
                        rElec = rElec + 0;
                        break;
                    case 4:
                        rElec = rElec - 1;
                        break;
                    case 5:
                        rElec = rElec - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Obtener el valor máximo por afinidad
                int maxAfinidadElect = maxElectricaAfinidad(electronicaPotencia, telecomunicaciones, control, electronica);
                //Obtener el valor máximo y generar la recomendación por afinidad
                // Determina cuál especialidad tiene el valor máximo y muestra el mensaje correspondiente
                if (maxAfinidadElect == electronicaPotencia) {
                    System.out.println("Recomendación por Afinidad: Electrónica de Potencia\n"
                            + "Se enfoca en el diseño y control de sistemas que manejan grandes cantidades\n"
                            + "de energía, como instalaciones industriales,\n"
                            + "redes eléctricas y sistemas de energía renovable.\n"
                            + "Incluye el desarrollo de convertidores de potencia,\n"
                            + "controladores y soluciones para la eficiencia energética.");
                } else if (maxAfinidadElect == telecomunicaciones) {
                    System.out.println("Recomendación por Afinidad: Telecomunicaciones\n"
                            + "Se dedica al estudio de los sistemas de comunicación modernos,\n"
                            + "como redes móviles, satelitales y de fibra óptica.\n"
                            + "Los especialistas en esta área entienden,\n"
                            + "mantienen y mejoran estos sistemas,\n"
                            + "asegurando la transmisión eficiente y segura de datos.");
                } else if (maxAfinidadElect == control) {
                    System.out.println("Recomendación por Afinidad: Control\n"
                            + "Los ingenieros en esta área diseñan y optimizan sistemas de control\n"
                            + "automáticos y semiautomáticos para procesos industriales.\n"
                            + "Trabajan en la automatización de maquinaria y procesos productivos,\n "
                            + "implementando controladores como PLCs y sistemas SCADA.");
                } else if (maxAfinidadElect == electronica) {
                    System.out.println("Recomendación por Afinidad: Electrónica\n"
                            + "Se especializan en el diseño y desarrollo de circuitos\n"
                            + "integrados y sistemas embebidos que son\n"
                            + "fundamentales en la tecnología moderna. Estos especialistas crean\n"
                            + "microcontroladores y sistemas digitales que se utilizan en computadoras,\n"
                            + "dispositivos móviles y electrodomésticos.");
                } else {
                    System.out.println("No se encontró una especialidad destacada por afinidad.");
                }
                //Obtener el valor máximo por rendimiento
                int maxRendimientoElect = maxElectricaRendimiento(rPotencia, rTel, rCon, rElec);
                if (maxRendimientoElect == rPotencia) {
                    System.out.println("Recomendación por Rendimiento: Electrónica De Potencia");
                } else if (maxRendimientoElect == rTel) {
                    System.out.println("Recomendación por Rendimiento: Telecomunicaciones");
                } else if (maxRendimientoElect == rCon) {
                    System.out.println("Recomendación por Rendimiento: Sistemas De Control");
                } else if (maxRendimientoElect == rElec) {
                    System.out.println("Recomendación por Rendimiento: Electrónica");
                } else {
                    System.out.println("No se encontro recomendación por rendimiento");
                }
                break;

            //Preguntas de Ingeniería Civil
            case 2:
                System.out.println("2. Ingeniería Civil");
                //Declaración del contador de la especialidad construcción
                int construc = 0;
                //Preguntas de la especialidad de construcción
                System.out.println("Responde con sinceridad a las preguntas");
                System.out.println("¿Me gusta la construcción y la ejecución de obra?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r17;
                r17 = teclado.nextInt();
                switch (r17) {
                    case 1:
                        construc = construc + 2;
                        break;
                    case 2:
                        construc = construc + 1;
                        break;
                    case 3:
                        construc = construc + 0;
                        break;
                    case 4:
                        construc = construc - 1;
                        break;
                    case 5:
                        construc = construc - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Siento interés en el proceso que va desde el diseño de un edificio,\n"
                        + " pasando por sus requerimientos y su posterior construcción?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r18;
                r18 = teclado.nextInt();
                switch (r18) {
                    case 1:
                        construc = construc + 2;
                        break;
                    case 2:
                        construc = construc + 1;
                        break;
                    case 3:
                        construc = construc + 0;
                        break;
                    case 4:
                        construc = construc - 1;
                        break;
                    case 5:
                        construc = construc - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println(" ¿Me gusta trabajar en diversos terrenos y estar al aire libre?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r19;
                r19 = teclado.nextInt();
                switch (r19) {
                    case 1:
                        construc = construc + 2;
                        break;
                    case 2:
                        construc = construc + 1;
                        break;
                    case 3:
                        construc = construc + 0;
                        break;
                    case 4:
                        construc = construc - 1;
                        break;
                    case 5:
                        construc = construc - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración dell contador de la especialidad de estructuras
                int estr = 0;
                //Preguntas de la especialidad de estructuras
                System.out.println("¿Tengo interés por conocer cómo se diseñan las arquitecturas\n"
                        + " dentro de cada edificio?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r20;
                r20 = teclado.nextInt();
                switch (r20) {
                    case 1:
                        estr = estr + 2;
                        break;
                    case 2:
                        estr = estr + 1;
                        break;
                    case 3:
                        estr = estr + 0;
                        break;
                    case 4:
                        estr = estr - 1;
                        break;
                    case 5:
                        estr = estr - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me gusta trabajar en lugares donde se requiera usar equipo de protección?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r21;
                r21 = teclado.nextInt();
                switch (r21) {
                    case 1:
                        estr = estr + 2;
                        break;
                    case 2:
                        estr = estr + 1;
                        break;
                    case 3:
                        estr = estr + 0;
                        break;
                    case 4:
                        estr = estr - 1;
                        break;
                    case 5:
                        estr = estr - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés por encontrar posibles fallas en estructuras\n"
                        + " para después mejorarlas?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r22;
                r22 = teclado.nextInt();
                switch (r22) {
                    case 1:
                        estr = estr + 2;
                        break;
                    case 2:
                        estr = estr + 1;
                        break;
                    case 3:
                        estr = estr + 0;
                        break;
                    case 4:
                        estr = estr - 1;
                        break;
                    case 5:
                        estr = estr - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de geotecnia
                int geo = 0;
                //Preguntas de la especialidad de sistemas de geotecnia
                System.out.println("¿Tengo interés en las energías renovables? ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r23;
                r23 = teclado.nextInt();
                switch (r23) {
                    case 1:
                        geo = geo + 2;
                        break;
                    case 2:
                        geo = geo + 1;
                        break;
                    case 3:
                        geo = geo + 0;
                        break;
                    case 4:
                        geo = geo - 1;
                        break;
                    case 5:
                        geo = geo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me gusta pensar en nuevas formas\n"
                        + " innovadoras y amigables con el ambiente, para construir?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r24;
                r24 = teclado.nextInt();
                switch (r24) {
                    case 1:
                        geo = geo + 2;
                        break;
                    case 2:
                        geo = geo + 1;
                        break;
                    case 3:
                        geo = geo + 0;
                        break;
                    case 4:
                        geo = geo - 1;
                        break;
                    case 5:
                        geo = geo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo curiosidad por cómo aprovechar el terreno disponible?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r25;
                r25 = teclado.nextInt();
                switch (r25) {
                    case 1:
                        geo = geo + 2;
                        break;
                    case 2:
                        geo = geo + 1;
                        break;
                    case 3:
                        geo = geo + 0;
                        break;
                    case 4:
                        geo = geo - 1;
                        break;
                    case 5:
                        geo = geo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de hidráulica
                int hidro = 0;
                //Preguntas de la especialidad de hidráulica
                System.out.println("¿Me gusta el cálculo y las ecuaciones diferenciales? ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r26;
                r26 = teclado.nextInt();
                switch (r26) {
                    case 1:
                        hidro = hidro + 2;
                        break;
                    case 2:
                        hidro = hidro + 1;
                        break;
                    case 3:
                        hidro = hidro + 0;
                        break;
                    case 4:
                        hidro = hidro - 1;
                        break;
                    case 5:
                        hidro = hidro - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Siento interés por la mecánica de fluidos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r27;
                r27 = teclado.nextInt();
                switch (r27) {
                    case 1:
                        hidro = hidro + 2;
                        break;
                    case 2:
                        hidro = hidro + 1;
                        break;
                    case 3:
                        hidro = hidro + 0;
                        break;
                    case 4:
                        hidro = hidro - 1;
                        break;
                    case 5:
                        hidro = hidro - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿A menudo pienso en cómo mejorar el sistema de drenaje?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r28;
                r28 = teclado.nextInt();
                switch (r28) {
                    case 1:
                        hidro = hidro + 2;
                        break;
                    case 2:
                        hidro = hidro + 1;
                        break;
                    case 3:
                        hidro = hidro + 0;
                        break;
                    case 4:
                        hidro = hidro - 1;
                        break;
                    case 5:
                        hidro = hidro - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }

                //Declaración del contador de rendimiento para la especialidad de construcción
                int rConst = 0;

                //Pregunta del rendimiento para la especialidad de eléctronica de construcción
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Recursos De La Construcción (L), Organización De Obras,\n"
                        + " Instalaciones En Edificación, Gerencia De Proyectos (PR),\n"
                        + " y Temas Especiales De Construcción");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r29;
                r29 = teclado.nextInt();
                switch (r29) {
                    case 1:
                        rConst = rConst + 2;
                        break;
                    case 2:
                        rConst = rConst + 1;
                        break;
                    case 3:
                        rConst = rConst + 0;
                        break;
                    case 4:
                        rConst = rConst - 1;
                        break;
                    case 5:
                        rConst = rConst - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento de la especialidad de estructuras
                int rEst = 0;
                //Pregunta del rendimiento de la especialidad de estructuras 
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Estructuras Isostáticas, Construcción De Estructuras (L),\n"
                        + " Diseño Estructuras, Calidad Del Concreto En Obra (PR),\n"
                        + " Construcción Pesada (PR), Diseño De Estructuras De Acero,\n"
                        + " Estructuras De Concreto (PR), Dinámica Estructural, Estructuras De Madera,\n"
                        + " Estructuras De Mampostería, Estructuras Metálicas (PR),\n"
                        + " Temas Especiales De Estructuras y Teoría General De Las Estructuras");

                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r30;
                r30 = teclado.nextInt();
                switch (r30) {
                    case 1:
                        rEst = rEst + 2;
                        break;
                    case 2:
                        rEst = rEst + 1;
                        break;
                    case 3:
                        rEst = rEst + 0;
                        break;
                    case 4:
                        rEst = rEst - 1;
                        break;
                    case 5:
                        rEst = rEst - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de geotecnia
                int rGeo = 0;
                //Pregunta del rendimiento de la especialidad de geotecnia
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + "Topografía, Geomática y Prac. (P), Quimica En Ingeniería (L),\n"
                        + " Geologia, Comportamiento De Suelos (L), Movimiento De Tierras (L),\n"
                        + " Mecánica De Suelos (L), Mecánica De Rocas (L), Temas Especiales De Ambiental,\n"
                        + " Problemas De Geotecnia (PR) y Temas Especiales De Geotecnia");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r31;
                r31 = teclado.nextInt();
                switch (r31) {
                    case 1:
                        rGeo = rGeo + 2;
                        break;
                    case 2:
                        rGeo = rGeo + 1;
                        break;
                    case 3:
                        rGeo = rGeo + 0;
                        break;
                    case 4:
                        rGeo = rGeo - 1;
                        break;
                    case 5:
                        rGeo = rGeo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de hidráulica
                int rHidro = 0;
                //Pregunta del rendimiento de la especialidad de hidráulica
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Hidráulica Basica (L), Hidráulica De Canales (L),\n"
                        + " Abastecimiento De Agua Potable, Hdrología, Alcantarillado,\n"
                        + " Hidromecánica, Obras Hidráulicas (L y P) , Tratamiento De Aguas Residuales (PR),\n"
                        + " Contaminación Del Agua (PR),Plantas Tratamiento Agua Potable (PR),\n"
                        + " Seminario De Tesis o Tesina Hydraulic, Presas De Almacenamiento y Derivac,\n"
                        + " Ríos y Costas (PR), Sistemas Hidráulicos (PR) y Temas Especiales De Hidráulica");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r32;
                r32 = teclado.nextInt();
                switch (r32) {
                    case 1:
                        rHidro = rHidro + 2;
                        break;
                    case 2:
                        rHidro = rHidro + 1;
                        break;
                    case 3:
                        rHidro = rHidro + 0;
                        break;
                    case 4:
                        rHidro = rHidro - 1;
                        break;
                    case 5:
                        rHidro = rHidro - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Obtener el valor máximo de afinidad para Civil y mostrar el mensaje correspondiente
                int maxAfinidadCivil = maxCivilAfinidad(construc, estr, geo, hidro);
                if (maxAfinidadCivil == construc) {
                    System.out.println("Recomendación por afinidad: Construcción\n"
                            + "Se encargan de la planificación, gestión, supervisión y ejecución de proyectos\n"
                            + "de construcción, asegurándose de que las obras se realicen de acuerdo con los\n"
                            + "plazos, presupuestos y estándares de calidad establecidos.\n"
                            + "Su trabajo abarca todas las etapas de un proyecto,\n"
                            + "desde la concepción y diseño hasta la entrega final de la obra, y su función\n"
                            + "es esencial para garantizar la seguridad y eficiencia de las infraestructuras.");
                } else if (maxAfinidadCivil == estr) {
                    System.out.println("Recomendación por afinidad: Estructuras\n"
                            + "Son profesionales que diseñan, analizan y supervisan la construcción\n"
                            + "de estructuras como edificios, puentes, torres, presas y otras obras\n"
                            + "de infraestructura. Su objetivo principal es garantizar que las estructuras\n"
                            + "sean seguras, estables y capaces de soportar las cargas y las fuerzas\n"
                            + "a las que estarán sometidas a lo largo de su vida útil.");
                } else if (maxAfinidadCivil == geo) {
                    System.out.println("Recomendación por afinidad: Geotecnia\n"
                            + "Se encargan de estudiar el comportamiento de los suelos y rocas,\n"
                            + "y su interacción con las estructuras construidas sobre o dentro de ellos.\n"
                            + "La geotecnia es fundamental en la planificación y diseño de proyectos\n"
                            + "de construcción, ya que garantiza que el terreno pueda soportar\n"
                            + "las estructuras sin problemas de estabilidad o seguridad.");
                } else if (maxAfinidadCivil == hidro) {
                    System.out.println("Recomendación por afinidad: Hidráulica\n"
                            + "Se enfocan en el diseño, análisis y gestión de sistemas relacionados\n"
                            + "con el agua, como redes de abastecimiento, drenaje, canales, presas,\n"
                            + "y obras hidráulicas en general. Su trabajo es fundamental\n"
                            + "para la planificación y ejecución de proyectos que buscan controlar,\n"
                            + "aprovechar y manejar el agua de manera eficiente y sostenible.");
                } else {
                    System.out.println("No se encontró una especialidad destacada por afinidad.");
                }
                //Obtener el valor máxipo por rendimiento
                int maxRendimientoCivil = maxCivilRendimiento(rConst, rEst, rGeo, rHidro);
                if (maxRendimientoCivil == rConst) {
                    System.out.println("Recomendación por Rendimiento: Construcción");
                } else if (maxRendimientoCivil == rEst) {
                    System.out.println("Recomendación por Rendimiento: Estructuras");
                } else if (maxRendimientoCivil == rGeo) {
                    System.out.println("Recomendación por Rendimiento: Geotecnia");
                } else if (maxRendimientoCivil == rHidro) {
                    System.out.println("Recomendación por Rendimiento: Hidráulica");
                } else {
                    System.out.println("No se encontro recomendación por rendimiento");
                }

                break;
            case 3:
                //Preguntas de Ingeniería Mecánica
                System.out.println("3. Ingeniería Mecánica");
                //Declaración del contador de la especialidad mecánica de materiales
                int materiales = 0;
                //Preguntas de la especialidad de mecanica de materiales
                System.out.println("Responde con sinceridad a las preguntas");
                System.out.println("¿Me gusta investigar sobre el desarrollo de nuevos materiales?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r33;
                r33 = teclado.nextInt();
                switch (r33) {
                    case 1:
                        materiales = materiales + 2;
                        break;
                    case 2:
                        materiales = materiales + 1;
                        break;
                    case 3:
                        materiales = materiales + 0;
                        break;
                    case 4:
                        materiales = materiales - 1;
                        break;
                    case 5:
                        materiales = materiales - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Siento interés por la nanotecnología y los materiales inteligentes?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r34;
                r34 = teclado.nextInt();
                switch (r34) {
                    case 1:
                        materiales = materiales + 2;
                        break;
                    case 2:
                        materiales = materiales + 1;
                        break;
                    case 3:
                        materiales = materiales + 0;
                        break;
                    case 4:
                        materiales = materiales - 1;
                        break;
                    case 5:
                        materiales = materiales - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo curiosidad por poner a prueba el rendimiento de los materiales?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r35;
                r35 = teclado.nextInt();
                switch (r35) {
                    case 1:
                        materiales = materiales + 2;
                        break;
                    case 2:
                        materiales = materiales + 1;
                        break;
                    case 3:
                        materiales = materiales + 0;
                        break;
                    case 4:
                        materiales = materiales - 1;
                        break;
                    case 5:
                        materiales = materiales - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración dell contador de la especialidad de termodinámica y sistemas de energía
                int termo = 0;
                //Preguntas de la especialidad de termodinámica y sistemas de energía
                System.out.println("¿Me interesa la física y las ecuaciones diferenciales?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r36;
                r36 = teclado.nextInt();
                switch (r36) {
                    case 1:
                        termo = termo + 2;
                        break;
                    case 2:
                        termo = termo + 1;
                        break;
                    case 3:
                        termo = termo + 0;
                        break;
                    case 4:
                        termo = termo - 1;
                        break;
                    case 5:
                        termo = termo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿A menudo pienso en cómo mejorar la obtención de energía\n"
                        + " sin tener pérdidas de la misma? ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r37;
                r37 = teclado.nextInt();
                switch (r37) {
                    case 1:
                        termo = termo + 2;
                        break;
                    case 2:
                        termo = termo + 1;
                        break;
                    case 3:
                        termo = termo + 0;
                        break;
                    case 4:
                        termo = termo - 1;
                        break;
                    case 5:
                        termo = termo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Siento curiosidad por cómo funcionan aparatos que disminuyen\n"
                        + " la energía térmica o la aumentan?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r38;
                r38 = teclado.nextInt();
                switch (r38) {
                    case 1:
                        termo = termo + 2;
                        break;
                    case 2:
                        termo = termo + 1;
                        break;
                    case 3:
                        termo = termo + 0;
                        break;
                    case 4:
                        termo = termo - 1;
                        break;
                    case 5:
                        termo = termo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de diseño mecánico
                int meca = 0;
                //Preguntas de la especialidad de sistemas de diseño mecánico
                System.out.println("¿Me interesa pensar en mejores diseños para maquinaria de producción?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r39;
                r39 = teclado.nextInt();
                switch (r39) {
                    case 1:
                        meca = meca + 2;
                        break;
                    case 2:
                        meca = meca + 1;
                        break;
                    case 3:
                        meca = meca + 0;
                        break;
                    case 4:
                        meca = meca - 1;
                        break;
                    case 5:
                        meca = meca - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Creo que la eficiencia en un robot de fabrica es importante?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r40;
                r40 = teclado.nextInt();
                switch (r40) {
                    case 1:
                        meca = meca + 2;
                        break;
                    case 2:
                        meca = meca + 1;
                        break;
                    case 3:
                        meca = meca + 0;
                        break;
                    case 4:
                        meca = meca - 1;
                        break;
                    case 5:
                        meca = meca - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me gusta investigar el porqué de cómo están diseñados algunos objetos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r41;
                r41 = teclado.nextInt();
                switch (r41) {
                    case 1:
                        meca = meca + 2;
                        break;
                    case 2:
                        meca = meca + 1;
                        break;
                    case 3:
                        meca = meca + 0;
                        break;
                    case 4:
                        meca = meca - 1;
                        break;
                    case 5:
                        meca = meca - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de mecatrónica
                int mtr = 0;
                //Preguntas de la especialidad de mecatrónica
                System.out.println("¿Me gusta desarmar electrodomésticos para entender cómo funcionan por dentro?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r42;
                r42 = teclado.nextInt();
                switch (r42) {
                    case 1:
                        mtr = mtr + 2;
                        break;
                    case 2:
                        mtr = mtr + 1;
                        break;
                    case 3:
                        mtr = mtr + 0;
                        break;
                    case 4:
                        mtr = mtr - 1;
                        break;
                    case 5:
                        mtr = mtr - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿A menudo pienso que nuestros electrodomésticos pueden ser mejorados?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r43;
                r43 = teclado.nextInt();
                switch (r43) {
                    case 1:
                        mtr = mtr + 2;
                        break;
                    case 2:
                        mtr = mtr + 1;
                        break;
                    case 3:
                        mtr = mtr + 0;
                        break;
                    case 4:
                        mtr = mtr - 1;
                        break;
                    case 5:
                        mtr = mtr - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me gusta diseñar prototipos de nuevas máquinas que facilitan tareas?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r44;
                r44 = teclado.nextInt();
                switch (r44) {
                    case 1:
                        mtr = mtr + 2;
                        break;
                    case 2:
                        mtr = mtr + 1;
                        break;
                    case 3:
                        mtr = mtr + 0;
                        break;
                    case 4:
                        mtr = mtr - 1;
                        break;
                    case 5:
                        mtr = mtr - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }

                //Declaración del contador de rendimiento para la especialidad de mecánica de materiales
                int rMateriales = 0;
                //Pregunta del rendimiento para la especialidad de eléctronica de potencia
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto, Química (L),\n"
                        + " Laboratorio De Ciencia y Tecnología De Materiales (L),\n"
                        + " Ciencia y Tecnología De Materiales (L), Proceso De Conformado De Materiales (L+),\n"
                        + " Proceso De Corte De Materiales (L), y Biomateriales (L+).");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r45;
                r45 = teclado.nextInt();
                switch (r45) {
                    case 1:
                        rMateriales = rMateriales + 2;
                        break;
                    case 2:
                        rMateriales = rMateriales + 1;
                        break;
                    case 3:
                        rMateriales = rMateriales + 0;
                        break;
                    case 4:
                        rMateriales = rMateriales - 1;
                        break;
                    case 5:
                        rMateriales = rMateriales - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento de la especialidad de termodinámica y sistemas de energía
                int rTermo = 0;
                //Pregunta del rendimiento de la especialidad de termodinámica y sistema de energía
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Fisica Experimental (L), Termodinamica (L+), Termodinámica Aplicada (L+),\n"
                        + " Transferencia De Calor (L+), Laboratorio De Máquinas Térmicas (L),\n"
                        + " Plantas Termoeléctricas, Aire Acondicionado y Refrigeración (L+),\n"
                        + " Sistemas De Ahorro De Energía (L) y Turbinas Térmicas. ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r46;
                r46 = teclado.nextInt();
                switch (r46) {
                    case 1:
                        rTermo = rTermo + 2;
                        break;
                    case 2:
                        rTermo = rTermo + 1;
                        break;
                    case 3:
                        rTermo = rTermo + 0;
                        break;
                    case 4:
                        rTermo = rTermo - 1;
                        break;
                    case 5:
                        rTermo = rTermo - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de diseño mecánic
                int rDiseño = 0;
                //Pregunta del rendimiento de la especialidad de diseño mecánico
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Sistemas de Control (L), Microprocesadores y Microcontroladores (L),\n"
                        + " Automatización Industrial, Instrumentación de Procesos Industriales (L),\n"
                        + " Instrumentación Electrónica y Sistemas de Control Programable.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r47;
                r47 = teclado.nextInt();
                switch (r47) {
                    case 1:
                        rDiseño = rDiseño + 2;
                        break;
                    case 2:
                        rDiseño = rDiseño + 1;
                        break;
                    case 3:
                        rDiseño = rDiseño + 0;
                        break;
                    case 4:
                        rDiseño = rDiseño - 1;
                        break;
                    case 5:
                        rDiseño = rDiseño - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de mecatrónica
                int rMtr = 0;
                //Pregunta del rendimiento de la especialidad de mecatrónica
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Fundamentos De Programación (L), Electricidad y Magnetismo (L+),\n"
                        + " Análisis De Circuitos (L+), Electrónica Industrial (L+),\n"
                        + " Automatización De Procesos (L), Biónica,\n"
                        + " Instalaciones Electromecánicas y Electrónica Aplicada (L+) ");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r48;
                r48 = teclado.nextInt();
                switch (r48) {
                    case 1:
                        rMtr = rMtr + 2;
                        break;
                    case 2:
                        rMtr = rMtr + 1;
                        break;
                    case 3:
                        rMtr = rMtr + 0;
                        break;
                    case 4:
                        rMtr = rMtr - 1;
                        break;
                    case 5:
                        rMtr = rMtr - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Obtener el valor máximo de afinidad para Mecánica y mostrar el mensaje correspondiente
                int maxAfinidadMecánica = maxMecánicalAfinidad(materiales, termo, meca, mtr);
                if (maxAfinidadMecánica == materiales) {
                    System.out.println("Recomendación por afinidad: Mecánica de Materiales\n"
                            + "Se dedica al análisis y diseño de componentes y estructuras,\n"
                            + "considerando cómo los materiales se comportan bajo diferentes\n"
                            + "tipos de cargas y condiciones. Este especialista se enfoca en garantizar\n"
                            + "que los materiales seleccionados para una aplicación específica cumplan\n"
                            + "con los requisitos de resistencia, durabilidad y seguridad.");
                } else if (maxAfinidadMecánica == termo) {
                    System.out.println("Recomendación por afinidad: Termodinámica y Sistemas de Energía\n"
                            + "Se enfocan en el análisis, diseño y optimización de sistemas energéticos que involucran\n"
                            + "la conversión, transferencia y uso eficiente de la energía.\n"
                            + "Estos ingenieros son clave en industrias que dependen del manejo eficiente de calor\n"
                            + "y energía, como la generación de electricidad, la climatización de edificios\n"
                            + "la industria automotriz, y la manufactura de maquinaria térmica.");
                } else if (maxAfinidadMecánica == meca) {
                    System.out.println("Recomendación por afinidad: Diseño Mecánico\n"
                            + "Se enfoca en la creación, desarrollo y mejora de componentes y sistemas mecánicos,\n"
                            + "aplicando principios de la mecánica, la física y la ingeniería\n"
                            + "para resolver problemas prácticos. Su trabajo implica el diseño de piezas\n"
                            + "y dispositivos que deben ser funcionales, eficientes y seguros,\n"
                            + "y generalmente utiliza herramientas avanzadas de simulación y\n"
                            + "modelado para asegurar que los diseños sean viables y eficaces.");
                } else if (maxAfinidadMecánica == mtr) {
                    System.out.println("Recomendación por afinidad: Mecatrónica\n"
                            + "Es un profesional altamente capacitado en la integración de sistemas mecánicos,\n"
                            + "electrónicos, de control y computación para diseñar\n"
                            + "y desarrollar sistemas automáticos e inteligentes.\n"
                            + "La mecatrónica es una disciplina interdisciplinaria que combina la ingeniería\n"
                            + "mecánica con la ingeniería electrónica, informática y de control,\n"
                            + "y se aplica principalmente en la automatización de procesos,\n"
                            + "el diseño de robots y la creación de sistemas inteligentes.");
                } else {
                    System.out.println("No se encontró una especialidad destacada por afinidad.");
                }
                //Obtener el valor máxipo por rendimiento
                int maxRendimientoMecánica = maxMecánicaRendimiento(rMateriales, rTermo, rDiseño, rMtr);
                if (maxRendimientoMecánica == rMateriales) {
                    System.out.println("Recomendación por Rendimiento: Mecánica de Materiales");
                } else if (maxRendimientoMecánica == rTermo) {
                    System.out.println("Recomendación por Rendimiento: Termodinámica y Sistemas de Energía");
                } else if (maxRendimientoMecánica == rDiseño) {
                    System.out.println("Recomendación por Rendimiento: Diseño Mecánico");
                } else if (maxRendimientoMecánica == rMtr) {
                    System.out.println("Recomendación por Rendimiento: Mecatrónica");
                } else {
                    System.out.println("No se encontro recomendación por rendimiento");
                }

                break;
            case 4:
                //Preguntas de Ingeniería Industrial
                System.out.println("4. Ingeniería Industrial");
                //Declaración del contador de la especialidad sistemas administrativos
                int sadmin = 0;
                //Preguntas de la especialidad de sistemas administrativos
                System.out.println("Responde con sinceridad a las preguntas");
                System.out.println("¿Me gusta trabajar con la gestión de la logística detrás de los proyectos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r49;
                r49 = teclado.nextInt();
                switch (r49) {
                    case 1:
                        sadmin = sadmin + 2;
                        break;
                    case 2:
                        sadmin = sadmin + 1;
                        break;
                    case 3:
                        sadmin = sadmin + 0;
                        break;
                    case 4:
                        sadmin = sadmin - 1;
                        break;
                    case 5:
                        sadmin = sadmin - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me interesa saber cómo administrar de mejor manera\n"
                        + " los tiempos de trabajo y descanso en una empresa?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r50;
                r50 = teclado.nextInt();
                switch (r50) {
                    case 1:
                        sadmin = sadmin + 2;
                        break;
                    case 2:
                        sadmin = sadmin + 1;
                        break;
                    case 3:
                        sadmin = sadmin + 0;
                        break;
                    case 4:
                        sadmin = sadmin - 1;
                        break;
                    case 5:
                        sadmin = sadmin - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés por desarrollar sistemas que mejoren la salud mental\n"
                        + " de los trabajadores y con ello su desempeño?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r51;
                r51 = teclado.nextInt();
                switch (r51) {
                    case 1:
                        sadmin = sadmin + 2;
                        break;
                    case 2:
                        sadmin = sadmin + 1;
                        break;
                    case 3:
                        sadmin = sadmin + 0;
                        break;
                    case 4:
                        sadmin = sadmin - 1;
                        break;
                    case 5:
                        sadmin = sadmin - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración dell contador de la especialidad de sistemas productivos
                int sprod = 0;
                //Preguntas de la especialidad de sistemas productivos
                System.out.println("¿Siento curiosidad por los sistemas de automatización y su uso para ahorrar tiempo y recursos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r52;
                r52 = teclado.nextInt();
                switch (r52) {
                    case 1:
                        sprod = sprod + 2;
                        break;
                    case 2:
                        sprod = sprod + 1;
                        break;
                    case 3:
                        sprod = sprod + 0;
                        break;
                    case 4:
                        sprod = sprod - 1;
                        break;
                    case 5:
                        sprod = sprod - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me gusta la parte de idear nuevas formas de producción amigables con el ambiente?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r53;
                r53 = teclado.nextInt();
                switch (r53) {
                    case 1:
                        sprod = sprod + 2;
                        break;
                    case 2:
                        sprod = sprod + 1;
                        break;
                    case 3:
                        sprod = sprod + 0;
                        break;
                    case 4:
                        sprod = sprod - 1;
                        break;
                    case 5:
                        sprod = sprod - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés por los problemas éticos que conlleva reemplazar a un trabajadxr por una máquina?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r54;
                r54 = teclado.nextInt();
                switch (r54) {
                    case 1:
                        sprod = sprod + 2;
                        break;
                    case 2:
                        sprod = sprod + 1;
                        break;
                    case 3:
                        sprod = sprod + 0;
                        break;
                    case 4:
                        sprod = sprod - 1;
                        break;
                    case 5:
                        sprod = sprod - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }

                //Declaración del contador de rendimiento para la especialidad de sistemas administrativos
                int rAdmin = 0;
                //Pregunta del rendimiento para la especialidad de sistemas administrativos
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto, Estudio del Trabajo (L),\n"
                        + " Ingeniería Financiera, Logística, Planeación Estratégica, Evaluación de Proyectos,\n"
                        + " Gestión de Empresas, Desarrollo de Habilidades Gerenciales, Sistemas de Comercialización,\n"
                        + " Sistemas de Información,\n"
                        + " Temas Selectos de Equidad de Género y su Perspectiva en la Actualidad\n"
                        + " y Administración del Mantenimiento.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r55;
                r55 = teclado.nextInt();
                switch (r55) {
                    case 1:
                        rAdmin = rAdmin + 2;
                        break;
                    case 2:
                        rAdmin = rAdmin + 1;
                        break;
                    case 3:
                        rAdmin = rAdmin + 0;
                        break;
                    case 4:
                        rAdmin = rAdmin - 1;
                        break;
                    case 5:
                        rAdmin = rAdmin - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento de la especialidad de sistemas productivos
                int rProduc = 0;
                //Pregunta del rendimiento de la especialidad de sistemas productivos
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + "Diseño de Sistemas Productivos, Investigación de Operaciones 1 y 2,\n"
                        + " Calidad, Cadena de Suministros, Ciencia y Tecnología de Materiales,\n"
                        + " Planeación y Control en la Producción, Análisis de Mejora de Procesos,\n"
                        + " Procesos de Manufactura (L), Sustentabilidad y Energía, Ingeniería de Sistemas,\n"
                        + " Automatización, Instrumentación y Control, Manufactura Integrada por Computadora,\n"
                        + " Metrología y Simulación de Sistemas.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r56;
                r56 = teclado.nextInt();
                switch (r56) {
                    case 1:
                        rProduc = rProduc + 2;
                        break;
                    case 2:
                        rProduc = rProduc + 1;
                        break;
                    case 3:
                        rProduc = rProduc + 0;
                        break;
                    case 4:
                        rProduc = rProduc - 1;
                        break;
                    case 5:
                        rProduc = rProduc - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
//Obtener el valor máximo de afinidad para Industrial y mostrar el mensaje correspondiente
                int maxAfinidadIndustrial = maxIndustriallAfinidad(sadmin, sprod);
                if (maxAfinidadIndustrial == sadmin) {
                    System.out.println("Recomendación por afinidad: Sistemas Administrativos\n"
                            + "Los especialistas en esta área optimizan los procesos administrativos,\n"
                            + "centrándose en la logística, gestión de recursos humanos y flujo de información dentro de una empresa.\n"
                            + "Utilizan herramientas de gestión de calidad, lean manufacturing y métodos ágiles para mejorar\n"
                            + "la eficiencia operativa.");
                } else if (maxAfinidadIndustrial == sprod) {
                    System.out.println("Recomendación por afinidad: Sistemas Productivos\n"
                            + "Se enfoca en el análisis y mejora de los procesos de producción en fábricas y empresas.\n"
                            + "Los ingenieros especializados en esta área buscan maximizar la eficiencia,\n"
                            + "minimizar costos y optimizar el uso de recursos, implementando tecnologías como\n"
                            + "la automatización y el control de calidad.");
                } else {
                    System.out.println("No se encontró una especialidad destacada por afinidad.");
                }
                //Obtener el valor máxipo por rendimiento
                int maxRendimientoIndustrial = maxIndustrialRendimiento(rAdmin, rProduc);
                if (maxRendimientoIndustrial == rAdmin) {
                    System.out.println("Recomendación por Rendimiento: Sistemas Administrativos");
                } else if (maxRendimientoIndustrial == rProduc) {
                    System.out.println("Recomendación por Rendimiento: Sistemas Productivos");
                } else {
                    System.out.println("No se encontro recomendación por rendimiento");
                }

                break;
            case 5:
                //Preguntas de Ingeniería En Computación
                System.out.println("5. Ingeniería En Computación");
                //Declaración del contador de la especialidad inteligencia artificial
                int artifcial = 0;
                //Preguntas de la especialidad de inteligencia artificial
                System.out.println("Responde con sinceridad a las preguntas");
                System.out.println("¿Tengo interés por los problemas éticos que implica\n"
                        + " el desarrollo de nuevas herramientas de Inteligencia Artificial?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r57;
                r57 = teclado.nextInt();
                switch (r57) {
                    case 1:
                        artifcial = artifcial + 2;
                        break;
                    case 2:
                        artifcial = artifcial + 1;
                        break;
                    case 3:
                        artifcial = artifcial + 0;
                        break;
                    case 4:
                        artifcial = artifcial - 1;
                        break;
                    case 5:
                        artifcial = artifcial - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me gusta pensar en la naturaleza de lo que significa inteligencia\n"
                        + " y los diversos procesos cognitivos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r58;
                r58 = teclado.nextInt();
                switch (r58) {
                    case 1:
                        artifcial = artifcial + 2;
                        break;
                    case 2:
                        artifcial = artifcial + 1;
                        break;
                    case 3:
                        artifcial = artifcial + 0;
                        break;
                    case 4:
                        artifcial = artifcial - 1;
                        break;
                    case 5:
                        artifcial = artifcial - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés en aplicar las herramientas que brindan las matemáticas\n"
                        + " para abstraer el proceso de toma de decisiones y razonamiento humano?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r59;
                r59 = teclado.nextInt();
                switch (r59) {
                    case 1:
                        artifcial = artifcial + 2;
                        break;
                    case 2:
                        artifcial = artifcial + 1;
                        break;
                    case 3:
                        artifcial = artifcial + 0;
                        break;
                    case 4:
                        artifcial = artifcial - 1;
                        break;
                    case 5:
                        artifcial = artifcial - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración dell contador de la especialidad de ciberseguridad
                int ciber = 0;
                //Preguntas de la especialidad de ciberseguridad
                System.out.println("¿Me interesa saber las vulnerabilidades de los sistemas computacionales?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r60;
                r60 = teclado.nextInt();
                switch (r60) {
                    case 1:
                        ciber = ciber + 2;
                        break;
                    case 2:
                        ciber = ciber + 1;
                        break;
                    case 3:
                        ciber = ciber + 0;
                        break;
                    case 4:
                        ciber = ciber - 1;
                        break;
                    case 5:
                        ciber = ciber - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés en la ingeniería social?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r61;
                r61 = teclado.nextInt();
                switch (r61) {
                    case 1:
                        ciber = ciber + 2;
                        break;
                    case 2:
                        ciber = ciber + 1;
                        break;
                    case 3:
                        ciber = ciber + 0;
                        break;
                    case 4:
                        ciber = ciber - 1;
                        break;
                    case 5:
                        ciber = ciber - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés por proteger a mis dispositivos de ataques cibernéticos?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r62;
                r62 = teclado.nextInt();
                switch (r62) {
                    case 1:
                        ciber = ciber + 2;
                        break;
                    case 2:
                        ciber = ciber + 1;
                        break;
                    case 3:
                        ciber = ciber + 0;
                        break;
                    case 4:
                        ciber = ciber - 1;
                        break;
                    case 5:
                        ciber = ciber - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de desarrollo de software
                int software = 0;
                //Preguntas de la especialidad de desarrollo de software
                System.out.println("¿Disfruto del diseño de páginas web implementando CSS, HTML y JavaScript?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r63;
                r63 = teclado.nextInt();
                switch (r63) {
                    case 1:
                        software = software + 2;
                        break;
                    case 2:
                        software = software + 1;
                        break;
                    case 3:
                        software = software + 0;
                        break;
                    case 4:
                        software = software - 1;
                        break;
                    case 5:
                        software = software - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Me encanta el proceso de diseñar, programar, documentar,\n"
                        + " lanzar al público y dar mantenimiento a una aplicación o servicio?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r64;
                r64 = teclado.nextInt();
                switch (r64) {
                    case 1:
                        software = software + 2;
                        break;
                    case 2:
                        software = software + 1;
                        break;
                    case 3:
                        software = software + 0;
                        break;
                    case 4:
                        software = software - 1;
                        break;
                    case 5:
                        software = software - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Tengo interés por abstraer problemas de la vida cotidiana\n"
                        + " y darles una solución en software?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r65;
                r65 = teclado.nextInt();
                switch (r65) {
                    case 1:
                        software = software + 2;
                        break;
                    case 2:
                        software = software + 1;
                        break;
                    case 3:
                        software = software + 0;
                        break;
                    case 4:
                        software = software - 1;
                        break;
                    case 5:
                        software = software - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de la especialidad de análisis de datos
                int datos = 0;
                //Preguntas de la especialidad de análisis de datos
                System.out.println("¿Me gusta la probabilidad y estadística, el cálculo diferencial e integral\n"
                        + " y el álgebra lineal?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r66;
                r66 = teclado.nextInt();
                switch (r66) {
                    case 1:
                        datos = datos + 2;
                        break;
                    case 2:
                        datos = datos + 1;
                        break;
                    case 3:
                        datos = datos + 0;
                        break;
                    case 4:
                        datos = datos - 1;
                        break;
                    case 5:
                        datos = datos - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Soy capaz de reconocer patrones y tendencias en un conjunto de datos\n"
                        + " y entender sus porqués?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r67;
                r67 = teclado.nextInt();
                switch (r67) {
                    case 1:
                        datos = datos + 2;
                        break;
                    case 2:
                        datos = datos + 1;
                        break;
                    case 3:
                        datos = datos + 0;
                        break;
                    case 4:
                        datos = datos - 1;
                        break;
                    case 5:
                        datos = datos - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                System.out.println("¿Siento interés por entender la información que un conjunto de datos\n"
                        + " puede brindar para aplicar dicha información en beneficio de los demás?");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. Neutro\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r68;
                r68 = teclado.nextInt();
                switch (r68) {
                    case 1:
                        datos = datos + 2;
                        break;
                    case 2:
                        datos = datos + 1;
                        break;
                    case 3:
                        datos = datos + 0;
                        break;
                    case 4:
                        datos = datos - 1;
                        break;
                    case 5:
                        datos = datos - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }

                //Declaración del contador de rendimiento para la especialidad de inteligencia artificial
                int rInteligencia = 0;

                //Pregunta del rendimiento para la especialidad de eléctronica de inteligencia artificial
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Inteligencia Artificial, Sistemas Expertos y Temas Especiales de Computación 1");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r69;
                r69 = teclado.nextInt();
                switch (r69) {
                    case 1:
                        rInteligencia = rInteligencia + 2;
                        break;
                    case 2:
                        rInteligencia = rInteligencia + 1;
                        break;
                    case 3:
                        rInteligencia = rInteligencia + 0;
                        break;
                    case 4:
                        rInteligencia = rInteligencia - 1;
                        break;
                    case 5:
                        rInteligencia = rInteligencia - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento de la especialidad de ciberseguridad
                int rCiber = 0;
                //Pregunta del rendimiento de la especialidad de ciberseguridad
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Redes De Computación 1 y 2, Seguridad Informática, Temas Especiales de Redes\n"
                        + " y Temas Especiales de Seguridad Informática.");

                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r70;
                r70 = teclado.nextInt();
                switch (r70) {
                    case 1:
                        rCiber = rCiber + 2;
                        break;
                    case 2:
                        rCiber = rCiber + 1;
                        break;
                    case 3:
                        rCiber = rCiber + 0;
                        break;
                    case 4:
                        rCiber = rCiber - 1;
                        break;
                    case 5:
                        rCiber = rCiber - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de desarrollo de software
                int rSoftware = 0;
                //Pregunta del rendimiento de la especialidad de desarrollo de software
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto,\n"
                        + " Programación Web 1 y 2, Programación Móvil, Temas Especiales De Programación,\n"
                        + " Ingeniería De Software, Programación De Videojuegos 1 y 2.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r71;
                r71 = teclado.nextInt();
                switch (r71) {
                    case 1:
                        rSoftware = rSoftware + 2;
                        break;
                    case 2:
                        rSoftware = rSoftware + 1;
                        break;
                    case 3:
                        rSoftware = rSoftware + 0;
                        break;
                    case 4:
                        rSoftware = rSoftware - 1;
                        break;
                    case 5:
                        rSoftware = rSoftware - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
                //Declaración del contador de rendimiento para la especialidad de análisis de datos
                int rDatos = 0;
                //Pregunta del rendimiento de la especialidad de análisis de datos
                System.out.println("Mi rendimiento en las siguientes asignaturas es alto, Minería de datos,\n"
                        + " Bases de datos 1 y 2, Temas Especiales de Bases de Datos y Probabilidad y Estadística.");
                System.out.println("1. Totalmente cierto\n"
                        + "2. Parcialmente cierto\n"
                        + "3. No Aplica\n"
                        + "4. Parcialmente falso\n"
                        + "5. Totalmente falso");
                int r72;
                r72 = teclado.nextInt();
                switch (r72) {
                    case 1:
                        rDatos = rDatos + 2;
                        break;
                    case 2:
                        rDatos = rDatos + 1;
                        break;
                    case 3:
                        rDatos = rDatos + 0;
                        break;
                    case 4:
                        rDatos = rDatos - 1;
                        break;
                    case 5:
                        rDatos = rDatos - 2;
                        break;
                    default:
                        System.out.println("Opción No valida");
                        break;
                }
//Obtener el valor máximo de afinidad para Computación y mostrar el mensaje correspondiente
                int maxAfinidadComputación = maxComputaciónlAfinidad(artifcial,ciber,software,datos);
                if (maxAfinidadComputación == artifcial) {
                    System.out.println("Recomendación por afinidad: Inteligencia Artifcial\n"
                            + "El área con más auge en la actualidad,\n"
                            + "los especialistas en inteligencia artificial son fuertes en lógica\n"
                            + "y matemáticas. Tienen interés en replicar procesos cognitivos humanos\n"
                            + "en sistemas computacionales, abordando áreas como el aprendizaje automático,\n"
                            + "el procesamiento del lenguaje natural y la visión por computadora.");
                } else if (maxAfinidadComputación == ciber) {
                    System.out.println("Recomendación por afinidad: Ciberseguridad\n"
                            + "Aquellos que se especializan en esta área tienen un interés por comprender\n"
                            + "los sistemas de comunicación y software, identificando sus vulnerabilidades\n"
                            + "y fortalezas. Su objetivo es mejorar el diseño de estos sistemas para hacerlos\n"
                            + "más eficientes y seguros, abarcando aspectos como la protección de datos,\n"
                            + "la criptografía y la seguridad de redes.");
                } else if (maxAfinidadComputación == software) {
                    System.out.println("Recomendación por afinidad: Desarrollo de Software\n"
                            + "Los interesados en esta área disfrutan de la programación y la creación de aplicaciones\n"
                            + "para diversos dispositivos, desde computadoras hasta dispositivos móviles.\n"
                            + "Se especializan en el diseño, implementación y mantenimiento de software\n"
                            + "utilizando metodologías ágiles, arquitecturas de software\n"
                            + "y lenguajes de programación modernos.");
                } else if (maxAfinidadComputación == datos) {
                    System.out.println("Recomendación por afinidad: Analisís de Datos\n"
                            + "En esta área es fundamental un buen dominio de la estadística\n"
                            + "y el análisis de datos. Los especialistas buscan identificar relaciones,\n"
                            + "patrones y tendencias en grandes conjuntos de datos para predecir resultados\n"
                            + "y tomar decisiones estratégicas. Áreas clave incluyen Big Data,\n"
                            + "minería de datos y aprendizaje automático.");
                } else {
                    System.out.println("No se encontró una especialidad destacada por afinidad.");
                }
                //Obtener el valor máxipo por rendimiento
                int maxRendimientoComputación = maxComputaciónRendimiento(rInteligencia,rCiber,rSoftware,rDatos);
                if (maxRendimientoComputación == rInteligencia) {
                    System.out.println("Recomendación por Rendimiento: Inteligencia Artifcial");
                } else if (maxRendimientoComputación == rCiber) {
                    System.out.println("Recomendación por Rendimiento: Ciberseguridad");
                } else if (maxRendimientoComputación == rSoftware) {
                    System.out.println("Recomendación por Rendimiento: Desarrollo de Software");
                } else if (maxRendimientoComputación == rDatos) {
                    System.out.println("Recomendación por Rendimiento: Analisís de Datos");
                } else {
                    System.out.println("No se encontro recomendación por rendimiento");
                }
                break;
            default:
                System.out.println("Opción No Existente");
                break;
        }
    }

    //Método para comparar el mayor valor por afinidad 
    public static int maxElectricaAfinidad(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    //Método para comparar el mayor valor por rendimiento
    public static int maxElectricaRendimiento(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    //Método para comparar el mayor valor por afinidad
    public static int maxCivilAfinidad(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    //Método para comparar el mayor valor por rendimiento
    public static int maxCivilRendimiento(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    //Método para comparar el mayor valor por afinidad
    public static int maxMecánicalAfinidad(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    //Método para comparar el mayor valor por rendimiento
    public static int maxMecánicaRendimiento(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    //Método para comparar el mayor valor por afinidad
    public static int maxIndustriallAfinidad(int a, int b) {
        return Math.max(a, b);
    }

    //Método para comparar el mayor valor por rendimiento
    public static int maxIndustrialRendimiento(int a, int b) {
        return Math.max(a, b);
    }

    //Método para comparar el mayor valor por afinidad
    public static int maxComputaciónlAfinidad(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    //Método para comparar el mayor valor por rendimiento
    public static int maxComputaciónRendimiento(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }
}
