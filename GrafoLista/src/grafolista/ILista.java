/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package grafolista;

/**
 *
 * @author Yosbiel A
 */
public interface ILista<X> {
    void add(X element);
    X get(int index);
    int size();
    boolean isEmpty();
}

