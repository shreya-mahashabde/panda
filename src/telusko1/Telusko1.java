/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author lenovo
 */
public class Telusko1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
        Laptop l1=context.getBean(Laptop.class);
        Alien a1=context.getBean(Alien.class);
        a1.setComp(l1);
        a1.show();
        
    }
    
}
