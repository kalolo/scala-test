package com.scalalearning.array

class ArrayAlgorithms {

  def segregateArray(arr: Array[Int]): Array[Int] = {

    var arrSegregated = new Array[Int](arr.length)

    for (i <- 0 to ( arr.length -1 ) ) {
      arrSegregated(i) = 0;
    }

    var end = arr.length - 1;
    for ( x <- arr ) {
      if ( x != 0) {
        arrSegregated(end) = x;
        end -= 1;
      }
    }

    return arrSegregated
  }

  def equilibriumIndex(arr: Array[Int]): Int = {

    0
  }


  def segregateArray2(arr: Array[Int]): Array[Int] = {

    var end = arr.length - 1;

    for (i <- 0 to ( arr.length - 1) ) {

      check(arr, i, end)
      end -=1
    }

    // will continue later...
    arr
  }

  def check(arr: Array[Int], current: Int, end: Int): Array[Int] = {

    var swap = arr(current)
    arr(current) = arr(end)
    arr(end) = swap
    //end -= 1

    if ( arr(current) != 0 ) {
      check(arr, current, end-1 )
    }

    arr
  }

  def switch(arr: Array[Int], current: Int, end: Int): Int ={

    if ( arr(current) == 0 ) return 0;

    //return current(end)
    end

  }



}
