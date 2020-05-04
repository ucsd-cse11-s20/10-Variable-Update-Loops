import tester.*;
class LoopsExamples {

  String[] fruit = {"apple", "banana", "cucumber"};
  String[] letters = {"b", "e", "a", "r"};

  // Returns the sum of the lengths of the strings in strs
  // for ANY length array that is given to us.
  int sumOfLengths(String[] strs) {
    // We need a way to do the sum for all the elements, no matter how many there are
    int sum = 0;
    for(String s: strs) {
      sum = sum + s.length();
    }
    return sum;
  }

  boolean testSumOfLengths(Tester t) {
    return t.checkExpect(this.sumOfLengths(fruit), 19) &&
            t.checkExpect(this.sumOfLengths(letters), 4);
  }


  // Write a method product that takes an array of int and returns
  // the product (multiplication) of those numbers
  int product(int[] nums) {
    int total = 1;
    for(int n: nums) {
      total = total * n;
      // total *= n; works too!
    }
    return total;
  }

  int[] nums1 = {2, 4, 6}; // 48
  int[] nums2 = {5, 3, 1, 2, 1}; // 30
  
  boolean testProduct(Tester t) {
    return t.checkExpect(this.product(nums1), 48) &&
           t.checkExpect(this.product(nums2), 30);
  }


  // average: take an array of double and return a double representing the
  // average (mean)
  // What should we do if doubles is an empty array?
  double average(double[] doubles) {
    if(doubles.length == 0.0) { return 0; }
    double total = 0.0;
    // int count = 0;
    for(double d: doubles) {
      total = total + d;
      // count = count + 1;
    }
    return total / doubles.length;
  }

  double[] ds1 = {2.0, 4.0, 1.0}; /// 7/3 
  double[] ds2 = {5.0, 1.0, 3.0, 6.0}; // 15/4
  double[] empty = {};

  boolean testAverage(Tester t) {
    return t.checkExpect(this.average(ds1), 7.0 / 3.0) &&
           t.checkExpect(this.average(ds2), 15.0 / 4.0) &&
           t.checkExpect(this.average(empty), 0.0);
  }


  int max(int[] nums) {
    int largest = nums[0];
    for(int n: nums) {
      if(n > largest) { largest = n; }
    }
    return largest;
  }

  void testMax(Tester t) {
    int[] max1 = {1, -1, 5, 6};
    int[] max2 = {1, 3, 55, 6, 50};
    t.checkExpect(max(max1), 6);
    t.checkExpect(max(max2), 55);
  }

  // write sumEvens Try writing sumEvens, which takes an array of ints and
  // returns the sum of just the even ones
  // {1, 2, 7, 4} -> 6      Give me another test!
  // {4, 2, 4, 5} -> 10 
  // {0, -2, 7, 4, 8} -> 10
  int sumEvent(int[] arr) {
    int sum = 0;
    for(int i: arr) {
      if(i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }


  int sumAllButFirst(int[] arr) {
    boolean pastFirst = false;
    int total = 0;
    for(int n: arr) {
      if(pastFirst) { total += n; }
      else { pastFirst = true; }
    }
    return total;
  }

  void testAllButFirst(Tester t) {
    int[] abf1 = {1, 9, 100};
    int[] abf2 = {1};
    int[] abf3 = {1, 2, 3, 4, 5, 6};
    t.checkExpect(sumAllButFirst(abf1), 109);
    t.checkExpect(sumAllButFirst(abf2), 0);
    t.checkExpect(sumAllButFirst(abf3), 20);
  }
}