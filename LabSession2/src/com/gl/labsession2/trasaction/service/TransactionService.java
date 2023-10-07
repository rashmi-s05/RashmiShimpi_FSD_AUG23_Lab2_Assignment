package com.gl.labsession2.trasaction.service;

public class TransactionService {

	public int checkTransaction(int[] arr, int targetNo) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum >= targetNo) {
				return i + 1;
			}
		}
		return -1;
	}

}
