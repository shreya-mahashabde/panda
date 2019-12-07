/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko1;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 * @author lenovo
 */
@Component

public class Alien {
    @Autowired
    
    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    
    
public void show()
{
    System.out.println("Hello Aaditya");
    comp.features();


}
}
