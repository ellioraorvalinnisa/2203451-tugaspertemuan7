/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ellioraorvalinnisa_2203451.stopwatch;

/**
 *
 * @author Elliora Orva Linnisa
 */
  public class StopWatch {
    private long startTime;
    private long endTime;

  public StopWatch() {
      this.startTime = System.currentTimeMillis();
  }

  public void start() {
      this.startTime = System.currentTimeMillis();
  }

  public void stop() {
      this.endTime = System.currentTimeMillis();
  }

  public long getElapsedTime() {
      return this.endTime - this.startTime;
  }

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
  }
  
  public static void main(String[] args) {
      int[] numbers = new int[100000];

      for (int i = 0; i < numbers.length; i++) {
          numbers[i] = (int)(Math.random() * 100000);
      }

      StopWatch stopwatch = new StopWatch(); 
      selectionSort(numbers);
      stopwatch.stop();

      System.out.println("Waktu eksekusi pengurutan 100.000 angka adalah: " 
                         + stopwatch.getElapsedTime() + " milidetik.");
  }
}