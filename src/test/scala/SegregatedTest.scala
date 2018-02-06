
import org.scalatest.FunSuite
import org.scalatest.Matchers._

import com.scalalearning.array.ArrayAlgorithms

class SegregatedTest extends FunSuite {

  test("Array(0) -> Array(0)") {
    assert( new ArrayAlgorithms().segregateArray( Array(0) ).deep == Array(0).deep)
    new ArrayAlgorithms().segregateArray( Array(0) ) should equal (Array(0))
  }

  test("Array(1) -> Array(1)") {
    assert( new ArrayAlgorithms().segregateArray( Array(1) ).deep == Array(1).deep)
  }

  test("Array(0,1) -> Array(0,1)") {
    assert( new ArrayAlgorithms().segregateArray( Array(0,1) ).deep == Array(0,1).deep)
  }

  test("Array(1,0) -> Array(0,1)") {
    assert( new ArrayAlgorithms().segregateArray( Array(1,0) ).deep == Array(0,1).deep)
  }

  test("Array(0,0,0,0,1,1,0,1,0) -> Array(0,0,0,0,0,0,1,1,1)") {
    assert( new ArrayAlgorithms().segregateArray( Array(0,0,0,0,1,1,0,1,0) ).deep == Array(0,0,0,0,0,0,1,1,1).deep)
  }

  test("Array(0,0,1,0,1,1,0,1,0) -> Array(0,0,0,0,0,1,1,1,1)") {
    assert( new ArrayAlgorithms().segregateArray( Array(0,0,1,0,1,1,0,1,0) ).deep == Array(0,0,0,0,0,1,1,1,1).deep)
  }

  test("Array(1,0,0,0,1,1,0,1,0) -> Array(0,0,0,0,0,1,1,1,1)") {
    assert( new ArrayAlgorithms().segregateArray( Array(1,0,0,0,1,1,0,1,0) ).deep == Array(0,0,0,0,0,1,1,1,1).deep)
  }

  test("Array(0,1,0,0,1,1,0,1,1) -> Array(0,0,0,0,1,1,1,1,1)") {
    assert( new ArrayAlgorithms().segregateArray( Array(0,1,0,0,1,1,0,1,1) ).deep == Array(0,0,0,0,1,1,1,1,1).deep)
  }

}
