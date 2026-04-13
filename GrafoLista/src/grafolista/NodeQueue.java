/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafolista;

/**
 *
 * @author Yosbiel A
 */
public class NodeQueue<X> {
    protected X info;
    protected NodeQueue<X> next;
    
    public NodeQueue(X info) {
        this.info = info;
        this.next = null;
    }
    
    public X getInfo() {
        return info;
    }
    
    public void setInfo(X info) {
        this.info = info;
    }
    
    public NodeQueue<X> getNext() {
        return next;
    }
    
    public void setNext(NodeQueue<X> next) {
        this.next = next;
    }
}
