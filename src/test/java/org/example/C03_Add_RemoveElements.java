package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_Add_RemoveElements extends C00_Base{

    @Test(priority = 1)
    public void AddRemove(){

        driver.findElement(By.cssSelector("a[href=\"/add_remove_elements/\"]")).click();

        int min = 0; // Minimum value of range
        int max = 5; // Maximum value of range
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        for (int x = 0; x<random_int; x++){

            driver.findElement(By.cssSelector("button[onclick=\"addElement()\"]")).click();
        }

        int count = driver.findElements(By.cssSelector("button[onclick=\"deleteElement()\"]")).size();
        Assert.assertEquals(count, random_int);


    }
}
