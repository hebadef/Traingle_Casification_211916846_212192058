package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;


import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
	public void C1FC2FC3FC4F(){
        int a = 1;
        int b = 2;
        int c=3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	/*@Test
	public void C1FC2FC3FC4T(){
        int a = ;
        int b = ;
        int c=;
        TriangleClassifier.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = TriangleClassifier.get_type().toString();
       assertEquals(expected, result.toString());
    }
	@Test
	public void C1FC2FC3TC4F() {
		int a=;
		int b=;
		int c=;
		triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
	}
	@Test
	  
	public void C1FC2TC3FC4F(){
        int a = ;
        int b = ;
        int c=;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }*/
	@Test
	public void C1TC2FC3FC4F(){
        int a = 3;
        int b = 4;
        int c = 5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void C1TC2FC3FC4T(){
        int a = 5;
        int b = 10;
        int c = 10;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }

	@Test
	public void C1TC2FC3TC4F(){
        int a = 10;
        int b = 5;
        int c = 10;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void C1TC2TC3FC4F(){
        int a = 10;
        int b = 10;
        int c= 5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test 
	public void C1TC2TC3TC4T(){
        int a = 10;
        int b = 10;
        int c = 10;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }

	
}  