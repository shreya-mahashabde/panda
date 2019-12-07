/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author lenovo
 */
@Component
@Primary
public class Desktop implements Computer 
{

    @Override
    public void features() 
    {
        System.out.println("i7 16gb 2tb");  
        
    }
    

}
