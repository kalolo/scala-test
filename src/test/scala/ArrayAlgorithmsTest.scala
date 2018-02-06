import java.lang.String

import org.scalatest._
import com.scalalearning.array._;

class ArrayAlgorithmsTest extends FlatSpec {

  "The verifyString " should "return a String value" in {
    val instance = new ArrayAlgorithms
    println("Returned: " + instance.verifyString())
    assert( new ArrayAlgorithms().verifyString().isInstanceOf[String] )
  }

  it should "not be empty" in {
    assert(! new ArrayAlgorithms().verifyString().isEmpty )
  }

  "Segregated array" should "Array(0,0,0,0,1,1,0,1,0) -> Array(0,0,0,0,0,0,1,1,1)" in {
    val instance = new ArrayAlgorithms
    assert( instance.segregateArray(Array(1,0,0,0,1,1,0,1,0)).deep == Array(0,0,0,0,0,1,1,1,1).deep )
    assert( instance.segregateArray(Array(0,1,0,0,1,1,0,1,1)).deep == Array(0,0,0,0,1,1,1,1,1).deep )
  }
}
