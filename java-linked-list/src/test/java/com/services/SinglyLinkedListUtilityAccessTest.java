package com.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SinglyLinkedListUtilityAccessTest {

    @Test
    void shouldReturnZeroWhenListIsEmpty() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertEquals(0, list.size());
    }

    @Test
    void shouldReturnCorrectSizeWhenListHasMultipleElements() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        assertEquals(3, list.size());
    }

    @Test
    void shouldReturnTrueWhenListIsEmpty() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertTrue(list.isEmpty());
    }

    @Test
    void shouldReturnFalseWhenListHasElements() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);

        assertFalse(list.isEmpty());
    }

    @Test
    void shouldRemoveAllElementsWhenClearIsCalled() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        list.clear();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void shouldReturnElementAtGivenIndex() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    void shouldThrowExceptionWhenGetIndexIsOutOfBounds() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        assertThrows(
                IndexOutOfBoundsException.class,
                () -> list.get(3)
        );
    }

    @Test
    void shouldUpdateElementAtGivenIndex() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        list.set(1, 99);

        assertEquals(99, list.get(1));
    }

    @Test
    void shouldThrowExceptionWhenSetIndexIsOutOfBounds() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        assertThrows(
                IndexOutOfBoundsException.class,
                () -> list.set(3, 99)
        );
    }

    @Test
    void shouldThrowExceptionWhenGetIndexIsNegative() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);

        assertThrows(
                IndexOutOfBoundsException.class,
                () -> list.get(-1)
        );
    }
}