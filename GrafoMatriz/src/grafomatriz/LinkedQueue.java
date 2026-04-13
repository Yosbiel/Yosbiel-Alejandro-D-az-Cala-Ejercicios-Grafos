/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafomatriz;

/**
 *
 * @author Yosbiel A
 */
public class LinkedQueue<X> implements IQueue<X> {
    private NodeQueue<X> first;
    private NodeQueue<X> last;
    
    public LinkedQueue() {
        this.first = null;
        this.last = null;
    }
    
    @Override
    public boolean isEmpty() {
        return first == null;
    }
    
    @Override
    public void add(X item) {
        NodeQueue<X> n = new NodeQueue<>(item);
        if (isEmpty()) {
            last = n;
            first = n;
        } else {
            last.setNext(n);
            last = n;
        }
    }
    
    @Override
    public X peek() {
        if (isEmpty()) return null;
        return first.getInfo();
    }
    
    @Override
    public X poll() {
        if (isEmpty()) return null;
        X item = first.getInfo();
        first = first.getNext();
        return item;
    }
}
