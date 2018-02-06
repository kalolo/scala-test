package com.scalalearning.array

class ArrayAlgorithms {

  def verifyInt() : Int = 2 * 2;

  def verifyString() : String = {
    val name = "Carlos Lopez";
    return name;
  }

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

  def segregateArray2(arr: Array[Int]): Array[Int] = {

    var end = arr.length - 1;

    for (i <- 0 to ( arr.length - 1) ) {

      if ( arr(i) != 0) {

        arr(i) = switch(arr, i, end)

      }


    }

    arr
  }

  def switch(arr: Array[Int], current: Int, end: Int): Int ={

    if ( arr(current) == 0 ) return 0;

    //return current(end)
    end

  }



}
