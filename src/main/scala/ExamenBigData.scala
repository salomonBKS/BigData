import scala.collection.immutable.List

object ExamenBigData {

  def ma_fonction(ma_liste : List[String]): Unit = List[String]{

    val nouvelle_liste = ma_liste.filter(_.last=='n')
    nouvelle_liste.foreach(f  => println(f))
    return
  }

  def liste_double(): Unit ={



    val mon_tableau = Array(Array("ecommercemag.fr",
                                  "https://wwww.journalducm.com/contact/",
                                    "https://wwww.zatsaz.com/",
                                  "https://wwww.lerevenu.com/","https://wwww.cadre-dirigfant-magazine.com/",
                                  "https://wwww.silicon.fr/services/contact#annoncer","https://wwww.channelbiz.fr/nous-cntacter/",
                                  "https://wwww.itespresso.fr", "https://wwww.industrie-mag.com/article4.html", "https://wwww.jesuisundev.com/article-invite",
                                  "https://wwww.numerama.com"),
                          Array(None,"Payant",None, None, "Payant","Payant", None, None,"invite","invite",None));
    val ma_liste = List(mon_tableau)

    val nouveau_tableau = Array(Array("ecommercemag.fr",
                                    "journalducm.com",
                                    "zatsaz.com/","lerevenu.com",
                                    "cadre-dirigfant-magazine.com/",
                                    "silicon.fr","channelbiz.fr",
                                    "itespresso.fr", "industrie-mag.com", "jesuisundev.com",
                                    "numerama.com"),
                              Array(None,"Payant",None, None, "Payant","Payant", None, None,"invite","invite",None));

    val nouvelle_liste = List(nouveau_tableau)



    println("la premiere liste ")



    ma_liste.foreach(f  => {

      for(ligne <- f) //pour chaque ligne de la matrice
      {
        for(elt <- ligne) //pour chaque élément de la ligne
          print(elt + ", ");
        println;
      }

    })

    println("\nla deuxième liste ")

    nouvelle_liste.foreach(t  =>{

      for(ma_ligne <- t) //pour chaque ligne de la matrice
      {
        for(eltt <- ma_ligne) //pour chaque élément de la ligne
          print(eltt + ", ");
        println;
      }

    })




  }


  def main(args: Array[String]): Unit = {


    val ma_liste : List[String] = List("julien", "Paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")

    ma_fonction(ma_liste)
    liste_double()

  }

}
