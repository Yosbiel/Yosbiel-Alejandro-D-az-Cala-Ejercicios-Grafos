/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafolista;

/**
 *
 * @author Yosbiel A
 */
public class CGrafoLista {
    private GrafoLista grafo;
    
    public CGrafoLista() {
        grafo = new GrafoLista(10, true, true);
    }
    
    public void iniciar() {
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");
        grafo.agregarVertice("F");
        
        grafo.agregarArista(0, 1, 20);
        grafo.agregarArista(0, 3, 50);
        grafo.agregarArista(1, 2, 10);
        grafo.agregarArista(2, 0, 25);
        grafo.agregarArista(2, 5, 45);
        grafo.agregarArista(3, 2, 30);
        grafo.agregarArista(3, 4, 10);
        grafo.agregarArista(4, 5, 5);
        grafo.agregarArista(5, 3, 25);
        grafo.agregarArista(5, 0, 30);
        
        System.out.println("-- EJERCICIO 1: GRAFO DIRIGIDO Y PONDERADO --\n");
        grafo.mostrar();
        
        System.out.println("\nRECORRIDOS: ");
        grafo.bfs(0);
        grafo.dfs(0);
        
        System.out.println("\nGRADOS: ");
        for (int i = 0; i < grafo.cantidadVertices(); i++) {
            System.out.println("Grado de " + grafo.obtenerVertice(i) + ": " + grafo.grado(i));
        }
    }
}

