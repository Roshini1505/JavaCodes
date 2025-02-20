import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
public class InterviewBit
{
    public static List<Integer> nextGreaterElement(int[] arr){
        //Integer Array that stores the answer.
        List<Integer> ans = new ArrayList<>();
        
        //Using a stack for finding the solution.
    	Stack<Integer> stack = new Stack<>();
    	
    	for(int i = 0; i < arr.length; i++){
    	    //Pushing element onto the stack either stack is empty or element is less than stack top. 
            if(stack.isEmpty() || arr[i] < stack.peek()) {
        		stack.push(arr[i]);
        	}else{
        	    
        	    //If found the element greater than stack top then that is the next greater element so we need to add it to the answer list.
        		while(!stack.isEmpty() && stack.peek() < arr[i]){
        			ans.add(arr[i]);
        			stack.pop();
        	    }
        	    //Pushing that greater element in stack for next cycle
        		stack.push(arr[i]);
        	}
        }
        //Adding the 0 to the answer array if no greater element exists.
        while(!stack.isEmpty()){
        	ans.add(0);
        	stack.pop();
        }
        return ans;
    }
	public static void main(String[] args) {
		System.out.println(nextGreaterElement(new int[]{4,5,3,7,2,11}));
	}
} 
