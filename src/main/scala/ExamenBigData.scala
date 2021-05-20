import scala.collection.immutable.List

object ExamenBigData {

  def ma_fonction(ma_liste : List[String]): Unit = List[String]{

    val nouvelle_liste = ma_liste.filter(_.last=='n')
    nouvelle_liste.foreach(f  => println(f))
    return
  }


  def main(args: Array[String]): Unit = {


    val ma_liste : List[String] = List("julien", "Paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")

    ma_fonction(ma_liste)

  }

}
