package fpassignments

/**
  * Simple class to demonstrate higher order functions via sorting
  */
object Sorting {

  def isSorted[A](as:Array[A], ordered:(A,A) => Boolean) : Boolean = {

    def loop(n:Int): Boolean = {
      if(n+1 < as.length)
        if(ordered(as(n),as(n+1)))
          loop(n+1)
        else false

      else
        true
    }


    loop(0)
  }

  def orderingFunc[A](a: A, b:A): Boolean ={
    if( a.hashCode() < b.hashCode()) true
    else false
  }

  def main(args: Array[String]): Unit = {

    println(isSorted(Array(1,2,3,5),orderingFunc))
  }

}
