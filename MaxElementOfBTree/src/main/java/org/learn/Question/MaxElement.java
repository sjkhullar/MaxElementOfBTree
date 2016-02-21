
package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElement {
	public static int maxElement(Node root) {
		if (root == null) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		int max = root.data;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if(max < node.data) {
				max = node.data;
			}
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		System.out.println("Max Element in Binary Tree is : " + max);
		return max;
	}
}
