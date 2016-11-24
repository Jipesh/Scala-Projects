/**
 * A simple int class whcih is capable of doing pre and post increment and decrement
 * 
 * @author jipesh
 */
import scala.language.postfixOps //otherwise it will throw warning when trying to do num++

type int = SpecialInt

class SpecialInt(value: Int) {

  var mValue = value

  //post-increment
  def ++(): int = {

    val toReturn = new int(mValue)
    mValue += 1
    return toReturn
  }

  //post-decrement
  def --(): int = {

    val toReturn = new int(mValue)
    mValue -= 1
    return toReturn
  }

  //a readable toString
  override def toString(): String = {
    return mValue.toString
  }
}

object SpecialInt{

  //pre-increment
  def ++(n: int): int = {
    n.mValue += 1
    return n;
  }

  //pre-decrement
  def --(n: int): int = {
    n.mValue -= 1
    return n;
  }

  //Something to get normal Int
  def *(n: int): Int = {
    return n.mValue
  }
}