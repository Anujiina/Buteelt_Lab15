package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void testAsciiString() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    void testUnicodeString() {
        assertEquals("ном", StringUtils.reverse("мон"));
    }

    @Test
    void testIsBlankWithNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void testIsBlankWithSpaces() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    void testIsBlankWithText() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    @Test
    void testCapitalizeNormal() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    void testCapitalizeBlank() {
        assertEquals("", StringUtils.capitalize(""));
    }
}