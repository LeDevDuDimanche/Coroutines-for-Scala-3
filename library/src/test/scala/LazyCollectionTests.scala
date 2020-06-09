import org.junit.Test
import org.junit.Assert._ 
import coroutines.examples._

class LazyCollectionTests {
    val inpt = Seq(1,2,3,4,5)
    val getIt = () => new LazyFromIterator(inpt.iterator)

    def isExpected[A](lazyCol: LazyCollection[A], expected: Seq[A]): Unit = {
        expected.foreach { x => 
            assertEquals(x, lazyCol.next())
        }
    }

    @Test def filterTest(): Unit = {
        val empty = getIt().filter(_ > 5)
        assert(!empty.hasNext)

        val all = getIt().filter(_ => true)
        isExpected(all, inpt.filter(_ => true))

        val some = getIt().filter(_ > 3)
        isExpected(some, inpt.filter(_ > 3))
    }

    @Test def mapTest(): Unit = {
        
        
        isExpected(getIt().map(x => 2 * x), inpt.map(x => 2 * x))

        isExpected(getIt().filter(_ > 3).map(_ * 2), inpt.filter(_ > 3).map(_ * 2))
    }
}
  