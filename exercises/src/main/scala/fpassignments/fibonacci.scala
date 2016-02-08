package fpassignments

/**
  * simple program to compute the Nth fibonacci number
  * in the FP way :)
  */
object fibonacci {
  def fib(n: Int) : Int = {

    def fibRec(curr: Int,prev:Int, i: Int) : Int ={
      if(i!=n) {
        if (i == 0)
          fibRec(1, 0, i + 1)
        else if (i == 1)
          fibRec(1, 1, i + 1)
        else
          fibRec(curr + prev, curr,i + 1)
      }
      else curr

    }

    fibRec(0,0,0)
  }

  def main(args: Array[String]): Unit = {

    println(fib(9))
  }

}
