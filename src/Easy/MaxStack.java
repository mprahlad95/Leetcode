package Easy;

import java.util.*;

public class MaxStack {
	Stack<Integer> mainStack;
	Queue<Integer> maxStack;

	public MaxStack() {
		mainStack = new Stack<>();
		maxStack = new PriorityQueue<>(1000, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return Integer.compare(i2, i1);
			}
		});
	}

	public void push(int x) {
		mainStack.push(x);
		maxStack.add(x);
	}

	public int pop() {
		int top = mainStack.pop();
		maxStack.remove(top);
		return top;
	}

	public int top() {
		return mainStack.peek();
	}

	public int peekMax() {
		return maxStack.peek();
	}

	public int popMax() {
		int max = maxStack.remove();

		// Create new stack and add numbers temporarily
		Stack<Integer> temp = new Stack<>();
		while (mainStack.peek() != max) {
			temp.push(mainStack.pop());
		}
		mainStack.pop();
		while (!temp.isEmpty()) {
			mainStack.push(temp.pop());
		}
		return max;
	}
}
