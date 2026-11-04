package com.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTraversalTest {

    @Test
    void shouldReturnNullWhenListIsEmpty() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertEquals("null", list.toString());
    }

    @Test
    void shouldReturnSingleNodeWhenListHasOneElement() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(10);

        assertEquals("10 -> null", list.toString());
    }

    @Test
    void shouldReturnAllNodesWhenListHasMultipleElements() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);

        assertEquals("10 -> 20 -> 30 -> null", list.toString());
    }
}