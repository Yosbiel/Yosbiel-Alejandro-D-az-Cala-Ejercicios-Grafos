/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafomatriz;

/**
 *
 * @author Yosbiel A
 */
public class Vertice {
    private String info;
    
    public Vertice(String info) {
        this.info = info;
    }
    
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    
    @Override
    public String toString() {
        return info;
    }
}
