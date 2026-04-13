/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafomatriz;

/**
 *
 * @author Yosbiel A
 */
public class GrafoMatriz implements IGrafoMatriz {
    private Vertice[] vertices;
    private int[][] matriz;
    private int size;
    
    // Constructor que recibe la matriz de adyacencia (Recomendación del ejercicio)
    public GrafoMatriz(String[] etiquetas, int[][] matrizAdyacencia) {
        this.size = etiquetas.length;
        this.vertices = new Vertice[size];
        this.matriz = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            vertices[i] = new Vertice(etiquetas[i]);
            for (int j = 0; j < size; j++) {
                matriz[i][j] = matrizAdyacencia[i][j];
            }
        }
    }
    
    @Override
    public void bfs(int inicio) {
        if (esVacio()) {
            System.out.println("El grafo está vacío");
            return;
        }
        
        boolean[] visitado = new boolean[size];
        LinkedQueue<Integer> cola = new LinkedQueue<>();
        
        System.out.print("BFS: ");
        visitado[inicio] = true;
        cola.add(inicio);
        
        while (!cola.isEmpty()) {
            int v = cola.poll();
            System.out.print(vertices[v] + " ");
            
            for (int i = 0; i < size; i++) {
                if (matriz[v][i] == 1 && !visitado[i]) {
                    visitado[i] = true;
                    cola.add(i);
                }
            }
        }
        System.out.println();
    }
    
    @Override
    public void dfs(int inicio) {
        if (esVacio()) {
            System.out.println("El grafo está vacío");
            return;
        }
        
        boolean[] visitado = new boolean[size];
        System.out.print("DFS: ");
        dfsRecursivo(inicio, visitado);
        System.out.println();
    }
    
    private void dfsRecursivo(int v, boolean[] visitado) {
        visitado[v] = true;
        System.out.print(vertices[v] + " ");
        
        for (int i = 0; i < size; i++) {
            if (matriz[v][i] == 1 && !visitado[i]) {
                dfsRecursivo(i, visitado);
            }
        }
    }
    
    @Override
    public void mostrar() {
        System.out.println("\nLISTA DE ADYACENCIA:");
        for (int i = 0; i < size; i++) {
            System.out.print(vertices[i] + ": ");
            for (int j = 0; j < size; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print(vertices[j] + " ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nMATRIZ DE ADYACENCIA:");
        System.out.print("   ");
        for (int i = 0; i < size; i++) {
            System.out.print(vertices[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < size; i++) {
            System.out.print(vertices[i] + "  ");
            for (int j = 0; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    @Override
    public int grado(int vertice) {
        int cont = 0;
        for (int i = 0; i < size; i++) {
            if (matriz[vertice][i] == 1) cont++;
        }
        return cont;
    }
    
    @Override
    public int cantidadVertices() {
        return size;
    }
    
    @Override
    public String obtenerVertice(int pos) {
        if (pos < 0 || pos >= size) return null;
        return vertices[pos].toString();
    }
    
    @Override
    public boolean esVacio() {
        return size == 0;
    }
    
    @Override
    public boolean esDirigido() {
        return false;
    }
    
    @Override
    public boolean esPonderado() {
        return false;
    }
}
