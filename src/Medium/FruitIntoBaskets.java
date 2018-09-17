package Medium;

public class FruitIntoBaskets {
	public static int totalFruit(int[] tree) {
		int firstNumber = 0, secondNumber = 0, leftPtr = 0, rightPtr = 1, maxFruits = 0,
				fruits = 0; // or 1
		while (tree[leftPtr] == 0) {
			leftPtr++;
		}
		firstNumber = tree[leftPtr];
		fruits++;
		while(tree[rightPtr] == firstNumber) {
			rightPtr++;
		}
		secondNumber = tree[rightPtr];
		while (rightPtr < tree.length) {
			if (tree[rightPtr] == firstNumber) {
				fruits++;
				rightPtr++;
			} 
			else if(tree[rightPtr] == secondNumber){
				rightPtr++;
				fruits++;
			}
			else if (tree[rightPtr] != secondNumber) {
				if (tree[rightPtr] == 0) {
					maxFruits = Math.max(fruits, maxFruits);
					break;
				}
				else {
					while(tree[leftPtr+1] == tree[leftPtr]) {
						leftPtr++;
						continue;
					}
					leftPtr++;
					rightPtr = leftPtr + 1;
					firstNumber = tree[leftPtr];
					maxFruits = Math.max(fruits, maxFruits);
					fruits = 0;
				}
			}
		}
		return maxFruits;
	}

	public static void main(String[] args) {
		System.out.println(totalFruit(new int[] { 1, 2, 1}));
	}
}
