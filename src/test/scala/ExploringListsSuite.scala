import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExploringListsSuite extends FunSuite {
  test("head of list") {
    assert(List(1, 2, 3, 4).head == 1)
  }

  test("tail of list") {
    assert(List(1, 2, 3, 4).tail == List(2,3,4))
  }

  test("Cons a list") {
    assert(1 :: List(2,3,4) == List(1,2,3,4))
  }

  test("Concatenate two lists") {
    assert(List(1,2) ::: List(3,4) == List(1,2,3,4))
  }

  test("Drop first two elements") {
    assert(List(1,2,3,4).drop(2) == List(3,4))
  }

  test("Drop last two elements") {
    assert(List(1,2,3,4).dropRight(2) == List(1,2))
  }

  test("Get distinct elements") {
    assert(List(1,2,2,3).distinct == List(1,2,3))
  }

  test("filter out odd numbers") {
    assert(List(1,2,3,4).filter(n => n % 2 == 0) == List(2,4))
  }

  test("Multiply everything by 2") {
    assert(List(1,2,3,4).map(x => x * 2) == List(2,4,6,8))
  }
}
