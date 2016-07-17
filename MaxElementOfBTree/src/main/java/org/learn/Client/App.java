package org.learn.Client;

import org.learn.Question.MaxElement;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(50);
		// Level 1
		Node B = Node.createNode(25);
		Node C = Node.createNode(30);
		// Level 2
		Node D = Node.createNode(40);
		Node E = Node.createNode(10);
		Node F = Node.createNode(30);
		Node G = Node.createNode(60);
		
		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		// connect level 2 and level 3
		MaxElement.maxElement(A);

	}
}
