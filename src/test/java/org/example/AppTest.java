package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    List<Integer> list=new List<>();
    List<String> stringList=new List<>();

    @Test
    public void add(){
        for(int i=0;i<20;i++){
            list.add(i);
        }
        for(int i=0;i<10;i++){
            stringList.add(i+"R");
        }
    }

    @Test
    public void get(){
        add();
        for(int i=0;i<list.size;i++){
            assertEquals((Object) i,(Object) list.get(i));
        }
        for(int i=0;i<stringList.size;i++){
            assertEquals((Object) i+"R",(Object) stringList.get(i));
        }

        assertNull((Object) stringList.get(15));
        assertNull((Object) list.get(40));
    }

    @Test
    public void display(){
        add();
        list.display();
    }

}
