package com.gl.labsession2.trasaction.main;

import java.util.Scanner;

import com.gl.labsession2.trasaction.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("enter the values of array");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("enter the total no of targets that needs to be achieved");
		int numTargets = sc.nextInt();

		TransactionService transactionService = new TransactionService();

		for (int i = 0; i < numTargets; i++) {

			System.out.println("Enter the value of target");
			int target = sc.nextInt();

			int transactionNumber = transactionService.checkTransaction(arr, target);

			if (transactionNumber == -1) {
				System.out.println("Target is not achieved");
			} else {
				System.out.println("Target achieved after " + transactionNumber + " transactions");
			}
		}

		sc.close();

	}

}
