/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafomatriz;

/**
 *
 * @author Yosbiel A
 */
public class CGrafoMatriz {
    private GrafoMatriz grafo;
    
    public CGrafoMatriz() {
        String[] etiquetas = {"A", "B", "C", "D", "E", "F", "G"};
        int[][] matrizAdy = {
            {0, 1, 1, 1, 0, 0, 0},
            {1, 0, 1, 0, 1, 0, 1},
            {1, 1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 1, 1},
            {0, 0, 1, 0, 1, 0, 1},
            {0, 1, 0, 1, 1, 1, 0}
        };
        grafo = new GrafoMatriz(etiquetas, matrizAdy);
    }
    
    public void iniciar() {
        System.out.println("-- EJERCICIO 2: GRAFO NO DIRIGIDO --\n");
        grafo.mostrar();
        
        System.out.println("\nRECORRIDOS:");
        grafo.bfs(0);
        grafo.dfs(0);
        
        System.out.println("\nGRADOS:");
        for (int i = 0; i < grafo.cantidadVertices(); i++) {
            System.out.println("Grado de " + grafo.obtenerVertice(i) + ": " + grafo.grado(i));
        }
    }
}
