import java.lang.String

import org.scalatest._
import com.scalalearning.array._;
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

class ArrayAlgorithmsTest extends FlatSpec {

  "Segregated array" should "Array(0,0,0,0,1,1,0,1,0) -> Array(0,0,0,0,0,0,1,1,1)" in {
    val instance = new ArrayAlgorithms;

    val arrayTable = Table(
      ("array", "segregated"),
      (Array(0), Array(0)),
      (Array(1), Array(1)),
      (Array(1,0), Array(0,1)),
      (Array(0,0,0,0,1,1,0,1,0), Array(0,0,0,0,0,0,1,1,1)),
      (Array(0,0,1,0,1,1,0,1,0), Array(0,0,0,0,0,1,1,1,1)),
      (Array(1,0,0,0,1,1,0,1,0), Array(0,0,0,0,0,1,1,1,1)),
      (Array(0,1,0,0,1,1,0,1,1), Array(0,0,0,0,1,1,1,1,1))
    )

    forAll (arrayTable) { (array, segregated) =>
      //println( array.mkString(",") + " -> " + segregated.mkString(",") + " ? " + instance.segregateArray(array).mkString(",") )
      instance.segregateArray(array) should equal (segregated)
    }
  }

  "equilibriumIndex" should "[-7, 1, 5, 2, -4, 3, 0] -> 3" in {

    val instance = new ArrayAlgorithms;

    val tableData = Table(
      ("array", "index"),
      (Array(-7, 1, 5, 2, -4, 3, 0), 3),
      (Array(-7, 1, 5, 2, -4, 1, 0), 4),
      (Array(-7, 1, 5, 2, -4, 231, 0), -1)
    )

    forAll (tableData) { (array, index) =>
      instance.equilibriumIndex(array) should equal (index)
    }

  }
}
