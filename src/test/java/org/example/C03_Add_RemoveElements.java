package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C03_Add_RemoveElements extends C00_Base{

    @Test(priority = 1)
    public void AddRemove(){

        driver.findElement(By.cssSelector("a[href=\"/add_remove_elements/\"]")).click();


    }
}
