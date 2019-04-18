package com.java.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Lambda3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()-> "Response 1");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()-> "Response 2");
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()-> "Response 3");
		CompletableFuture<String> combined = CompletableFuture.allOf(future1,future2,future3).thenApply(x->combine(future1.join(),future2.join(),future3.join()));
		System.out.println(combined.get());
		CompletableFuture<String> c = future1.thenCombine(future2, (x,y)->x+y).thenCombine(future3, (xy,z)-> xy+z);
		System.out.println(c.get());
		Integer[] n = {6,5};
		System.out.println(Arrays.asList(twoSum(n,11)).toString());
	}

	private static String combine(String join, String join2, String join3) {
		return join+join2+join3;
	}
	
public static Integer[] twoSum(Integer[] numbers, int target) {
        
        if(numbers.length>=2)
        {
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            for(int i=0; i<numbers.length; i++){
                if(!h.isEmpty() && h.containsKey(target-numbers[i]))
                {
                    Integer[] k = {h.get(target-numbers[i])+1,i+1};
                    return k;
                }
                
                h.put(numbers[i],i);
            }
        }
        
        Integer[] k = {-1,-1};
        return k;
    }

}
