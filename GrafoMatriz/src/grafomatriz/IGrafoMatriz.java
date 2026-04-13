/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package grafomatriz;

/**
 *
 * @author Yosbiel A
 */
public interface IGrafoMatriz {
   // void agregarVertice(String v);
   // void agregarArista(int i, int j);
    void bfs(int inicio);
    void dfs(int inicio);
    void mostrar();
    int grado(int vertice);
    int cantidadVertices();
    String obtenerVertice(int pos);
    boolean esVacio();
    boolean esDirigido();
    boolean esPonderado();
}
