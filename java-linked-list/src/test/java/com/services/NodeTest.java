package com.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class NodeTest {

    @Test
    void shouldStoreTheGivenData() {
        Node node = new Node(10);

        assertEquals(10, node.data);
    }

    @Test
    void shouldHaveNullNextWhenCreated() {
        Node node = new Node(10);

        assertNull(node.next);
    }
    @Test
    void shouldConnectToAnotherNode(){
        Node firstNode  = new Node(10);
        Node secondNode = new Node(20);

        firstNode.next=secondNode;
        assertEquals(secondNode, firstNode.next);

    }
}