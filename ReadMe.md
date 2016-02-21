Let us define the problem statement:

We are given the Binary Tree, we need to find the maximum element in the Binary Tree. Suppose we have following tree, As per the problem statement we have to iterate over the binary tree and find the maximum element in the binary tree.

As an example, consider the tree:
	
		   100   ------Level 0
		  /  \
		50    150 -----Level 1
		/ \    \
	    25  80  160 ---Level 2
				 
							  
					  

As shown in Binary Tree Node with Value 160 is the maximum element in the Binary.

	
We can go through the complete code. We have created 3 packages

1.) org.learn.PrepareTree : Under this package we are creating the tree (This tree we will Traverse to find max element).

2.) org.learn.Question: Under this question package,we will have MaxElement class which is responsible for traversing the tree using level order traversal to calculate the maximum element in binary tree,

3.) org.learn.Client: Under this package we have main function, where we are constructing the tree and then we are traversing the whole tree using level order traversal.
