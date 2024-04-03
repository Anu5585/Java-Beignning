package org.example.constructor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class JavaBeansTest {
//    @DisplayName("Object belong to the same class")
//    @Test
//    void shouldBelongToSameClass() {
//        //String expects = "Hello Blank";
//        Class<Person> expects = Person.class;
//        Person personWithName = new Person("Zubair");
//        assertEquals(Person.class, personWithName.getClass());
//    }

    @DisplayName("create an object")
    @Test
    void Should_ReturnObjectPerson_When_GivenName () {
        //String expects = "Hello Blank";
        Class<Person> expects = Person.class;
        Person personWithName = new Person("Zubair");
        assertEquals(Person.class, personWithName.getClass());
    }
//    @DisplayName("test whether you are able to get parent's field value with child object's reference")
//    @Test
//    public void testChildClassConstructor() {
//        // Arrange
//        String parentField = "Zubair";
//        double childField = 12.50;
//
//        // Act
//        Employee childInstance = new Employee(parentField, childField);
//
//        // Assert
//        // Check if the ParentClass constructor was called properly
//        assertEquals(parentField, childInstance.getName());
//    }

    @DisplayName("check whether getters and setters are written properly or not")
    @Test
    public void testGettersAndSettersExist() {
        // Arrange
        Class<?> personClass = Person.class;

        // Act / Assert
        assertGetterExists(personClass, "name");
        assertSetterExists(personClass, "name");
    }

    private void assertGetterExists(Class<?> clazz, String propertyName) {
        try {
            // Check if the getter method exists
            clazz.getMethod("get" + capitalize(propertyName));
        } catch (NoSuchMethodException e) {
            fail("Getter method does not exist for property: " + propertyName);
        }
    }

    private void assertSetterExists(Class<?> clazz, String propertyName) {
        try {
            // Check if the setter method exists
            clazz.getMethod("set" + capitalize(propertyName), String.class);
        } catch (NoSuchMethodException e) {
            fail("Setter method does not exist for property: " + propertyName);
        }
    }

    private String capitalize(String str) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }

    @DisplayName("check whether toString is overridden or not")
    @Test
    public void testToStringMethod() {
        Person personWithName = new Person("Zubair");
        String toStringResult = personWithName.toString();
        assertNotNull(toStringResult, "toString() should not return null");
        assertTrue(toStringResult.contains("Person{name='Zubair'}"),
                "toString() should contain expected format");
    }
    @DisplayName("check whether field is declared private or not")
    @Test
    public void testPrivateFields() throws NoSuchFieldException {
        // Arrange
        Person personWithName = new Person("Zubair");
        Class<?> myClass = personWithName.getClass();

        // Act
        Field privateField = myClass.getDeclaredField("name");

        // Assert
        assertTrue(Modifier.isPrivate(privateField.getModifiers()), "Field should be private");
    }

}
