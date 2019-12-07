/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusko1;


import org.springframework.stereotype.Component;

/**
 *
 * @author lenovo
 */
@Component

public class Laptop implements Computer
{

    @Override
    public void features() {
        System.out.println("i3 2gb 500 hd");
    }


    
}
