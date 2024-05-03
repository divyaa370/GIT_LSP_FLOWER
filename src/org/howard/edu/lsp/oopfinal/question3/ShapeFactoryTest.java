package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeFactoryTest {
    ShapeFactory factory = new ShapeFactory();

    @Test
    public void testCreateCircle() {
        Shape shape = factory.getShape("CIRCLE");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape shape = factory.getShape("RECTANGLE");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    public void testNullShape() {
        Shape shape = factory.getShape(null);
        assertNull(shape);
    }

    @Test
    public void testUnknownShape() {
        Shape shape = factory.getShape("UNKNOWN");
        assertNull(shape);
    }
}
